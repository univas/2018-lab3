package br.edu.univas.si3.lab3.pedido;

public class Item {

	private String nome;
	private int preco;
	private int quantidade;

	public Item(String nome, int preco, int qtd) {
		// implementar
		this.nome = nome;
		this.preco = preco;
		this.quantidade = qtd;
	}

	public int calcularPrecoTotal() {
		// implementar
		return preco * quantidade;
	}
}
