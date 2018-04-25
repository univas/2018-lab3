package br.edu.univas.si3.lab3.conta;

public class ContaCorrente extends Conta {
	
	private float manutencaoMensal;
	
	public ContaCorrente(int numero, String cliente, float manutMensal) {
		super(numero, cliente);
		this.manutencaoMensal = manutMensal;
	}
	
	public void atualizarSaldo() {
		saldo -= manutencaoMensal;//pensar na visibilidade do atributo saldo.
	}
}
