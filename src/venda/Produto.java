package venda;

public class Produto {

	private String nome;
	private int quantidade;
	
	public Produto(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) { 
		this.nome = n;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int q) {
		this.quantidade = q;
	}
}
