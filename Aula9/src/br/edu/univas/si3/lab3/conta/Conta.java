package br.edu.univas.si3.lab3.conta;

public class Conta {

	private int numero;
	protected String cliente;
	private float saldo;

	public Conta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public boolean sacar(float valor) {
		if (valor <= 0f) {
			return false;
		}
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}

	public boolean depositar(float valor) {
		if (valor <= 0f) {
			return false;
		}
		saldo += valor;
		return true;
	}

	public void atualizarSaldo() {
		// O que faz este m�todo???
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}
}
