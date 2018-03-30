package br.edu.univas.si3.lab3.pedido;

import java.util.ArrayList;

public class Pedido {

	private int status;
	private Cartao cartao;
	private Estoque estoque;
	private ArrayList<Item> itens;
	
	public Pedido(Cartao cartao, Estoque estoque) {
		this.itens = new ArrayList<Item>();
		//implementar
	}
	
	public boolean adicionarItem(String nome, int qtd) {
		//implementar
	}
	
	public boolean finalizarCompra() {
		//implementar
	}
	
	public boolean entregar() {
		//implementar
	}
	
	public int getStatus() {
		//implementar
	}
	
	public ArrayList<Item> getItens() {
		//implementar
	}
	
	public int calcularValorDoPedido() {
		//implementar
	}
}
