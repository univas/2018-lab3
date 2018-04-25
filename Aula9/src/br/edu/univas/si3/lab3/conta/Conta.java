package br.edu.univas.si3.lab3.conta;

public class Conta {

	private int numero;
	private String cliente;
	private float saldo;
	
	public Conta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public boolean depositar(float valor) {
		if(valor <= 0f) {
			return false;
		}
		saldo += valor;
		return true;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public float getSaldo() {
		return saldo;
	}
}
