package br.edu.univas.si3.lab3.pedido;

import java.util.ArrayList;

public class Pedido {

	private int status;
	private Cartao cartao;
	private Estoque estoque;
	private ArrayList<Item> itens;

	public Pedido(Cartao cartao, Estoque estoque) {
		this.itens = new ArrayList<Item>();
		// implementar
		this.cartao = cartao;
		this.estoque = estoque;
		this.status = 1;
	}

	public boolean adicionarItem(String nome, int qtd) {
		// implementar

		int preco = estoque.retirar(nome, qtd);
		if (preco != -1) {// tem estoque suficiente
			Item novoItem = new Item(nome, preco, qtd);
			itens.add(novoItem);
			this.status = 2;
			return true;
		}
		return false;
	}

	public boolean finalizarCompra() {
		// implementar
		int valorDoPedido = this.calcularValorDoPedido();
		// if(valorDoPedido > this.cartao.getSaldo()) {
		// return false;
		// }
		// this.cartao.pagar(valorDoPedido);

		boolean pagouOk = this.cartao.pagar(valorDoPedido);
		if (pagouOk) {
			this.status = 3;
			return true;
		}
		return false;
	}

	public boolean entregar() {
		// implementar
		if (this.status == 3) {
			this.status = 4;
			return true;
		}
		return false;
	}

	public int getStatus() {
		// implementar
		return this.status;
	}

	public ArrayList<Item> getItens() {
		// implementar
		return itens;
	}

	public int calcularValorDoPedido() {
		// implementar
		int soma = 0;
		for (Item it : itens) {
			soma += it.calcularPrecoTotal();
		}
		return soma;
	}
}
