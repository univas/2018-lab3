package br.edu.univas.si3.lab3.conta;


public class ContaSalario extends ContaCorrente {

	public ContaSalario(int numero, String cliente) throws ValorInvalidoException {
		
		//TODO: discutir qual � a melhor estrat�gia: tratar ou delegar?
		//N�o vai ter jeito.
		//O java n�o aceita colocar try/catch no construtor.
		super(numero, cliente, 0f);
	}
	
}
