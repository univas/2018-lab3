package br.edu.univas.si3.lab3.conta;


public class ContaSalario extends ContaCorrente {

	public ContaSalario(int numero, String cliente) {
		
		//TODO: discutir qual é a melhor estratégia: tratar ou delegar?
		super(numero, cliente, 0f);
	}
	
}
