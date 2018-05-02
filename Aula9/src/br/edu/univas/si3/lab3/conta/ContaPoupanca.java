package br.edu.univas.si3.lab3.conta;

public class ContaPoupanca extends Conta {

	private float taxaDeJuros;
	
	public ContaPoupanca(int numero, String cliente, float taxaDeJuros) {
		super(numero, cliente);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizarSaldo() {
		super.depositar(getSaldo() * taxaDeJuros);
	}
}
