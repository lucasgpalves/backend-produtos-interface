package venda;

import java.util.Scanner;

public class Interface {
	
	public static void menu() {
		System.out.println("===================");
		System.out.println("\033[0;33m [1] \033[0m Inserir Produtos");
		System.out.println("\033[0;33m [2] \033[0m Exibir Produtos");
		System.out.println("\033[0;33m [3] \033[0m Total Vendas");
		System.out.println("\033[0;33m [4] \033[0m Maior Venda");
		System.out.println("\033[0;33m [0] \033[0m Sair");
	}

	public static void main(String a[]) {
		Scanner scanner = new Scanner(System.in);
		ListaProduto listas = new ListaProduto(scanner);
		
		while(true) {
			menu();
			
			int opcao = scanner.nextInt();
			switch (opcao) {
			case 0:
				System.out.print("Saindo...");
				scanner.close();
				return;
			case 1:
				listas.inserirProdutos();
				break;
			case 2:
				listas.imprimirLista();
				break;
			case 3:
				System.out.println("Total de vendas: " + listas.totalVendas());
				break;
			case 4:
				listas.maiorVenda();
				break;
			default:
				System.out.println("Digite uma opção válida");
			}
			
		}
	}
	
}
