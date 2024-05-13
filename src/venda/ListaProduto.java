package venda;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaProduto {

	private ArrayList<Produto> listas = new ArrayList<>();
	private Scanner scanner;
	
	public ListaProduto(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void inserirProdutos() {
		
		while(true) {
			
			System.out.println("Deseja inserir um produto S/N? ");
			scanner.nextLine();
			
			String resposta = scanner.nextLine().toUpperCase();
			
			if(resposta.equals("N")) {
				System.out.println("Voltando");
				return;
			} else if (resposta.equals("S")) {
				addProduto();
			} else {
				System.out.println("Digite um valor válido");
			}// Fim do if
		}
			
	}
	
	public void addProduto() {
		
		System.out.print("Insira o nome do produto: ");
		String nome = scanner.nextLine();
		
		int quantidade = 0;
		boolean quantidadeValida = false;
		
		while(!quantidadeValida) {
			try {
				System.out.print("Insira a quantidade produtos vendidos: ");
				quantidade = scanner.nextInt();
				quantidadeValida = true;
				
			} catch (NumberFormatException e) {
				System.out.print("Insira um número inteiro válido para a quantidade de vendas");
			}
		}
		
		Produto produto = new Produto(nome, quantidade);
		listas.add(produto);
		System.out.println("Produto adicionado com sucesso!");
		
	} // Fim metodo addProduto
	
	public void imprimirLista() {
		Produto[] produtos = listas.toArray(new Produto[listas.size()]); //Converter para um array
		
		for (Produto produto : produtos) {
	        System.out.println("Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade());
	    } //Fim do for
	}
	
	public int totalVendas() {
		
		int total = 0;
		
		for (Produto item : listas) {
			total += item.getQuantidade();
		}
		
		return total;
	}
	
	public void maiorVenda() {
		int maiorVenda = 0;
		String nomeVenda = "";
				
		for (Produto produto : listas) {
			int quantidade = produto.getQuantidade();
			if(quantidade > maiorVenda) {
				maiorVenda = quantidade;
				nomeVenda = produto.getNome();
			}
		}
		
		System.out.println("Nome: " + nomeVenda + ", Quantidade: " + maiorVenda);
	}
}
