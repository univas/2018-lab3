package br.edu.univas.si3.lab3.pedido;

import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> produtos;

	public Estoque() {
		produtos = new ArrayList<Produto>();
	}

	public Produto consulta(String nomeProd) {
		// implementar
		for (Produto temp : produtos) { // foreach - simplificado

			// String nome = temp.getNome();
			// boolean test = nome.equals(nomeProd);
			// if(test){
			if (temp.getNome().equals(nomeProd)) {// mesma coisa que as 3 linhas
													// anteriores
				// o equals compara conteúdo
				// o == compara "ponteiro" (referência)
				return temp;
			}
		}
		return null;
	}

	public void incluir(String nomeProd, int qtd, int preco) {
		// implementar
		Produto prod = this.consulta(nomeProd);
		if (prod == null) {
			prod = new Produto(nomeProd, qtd, preco);
			produtos.add(prod);
		} else {
			prod.aumentarQuantidade(qtd);
		}
	}

	public int retirar(String nomeProd, int qtd) {
		// implementar
		Produto prod = this.consulta(nomeProd);
		if (prod == null) {
			return -1;
		} else {
			boolean result = prod.reduzirQuantidade(qtd);
			if (result) { // teve quantidade suficiente
				return prod.getPreco();
			} else { // não teve quantidade suficiente
				return -1;
			}
		}
	}

}
