package br.edu.univas.si3.lab3.pedido;

public class Produto {

	private String nome;
	private int quantidade;
	private int preco;

	public Produto(String nome, int qtd, int preco) {
		// implementar
		this.nome = nome;
		quantidade = qtd;
		this.preco = preco;
	}

	public void aumentarQuantidade(int qtd) {
		// implementar
		quantidade += qtd;
	}

	public boolean reduzirQuantidade(int qtd) {
		// implementar
		if (qtd > this.quantidade) {
			return false;
		} else {
			this.quantidade -= qtd;
			return true;
		}
	}

	public String getNome() {
		return this.nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int getPreco() {
		return preco;
	}
}
