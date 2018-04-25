package br.edu.univas.si3.lab3.pedido;

public class Cartao {

	private int saldo;

	public Cartao(int saldoInicial) {
		// implementar
		this.saldo = saldoInicial;
	}

	public boolean pagar(int valor) {
		// implementar
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}

	public int getSaldo() {
		// implementar
		return this.saldo;
	}
}
