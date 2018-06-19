package br.edu.univas.si3.lab3.conta;


public class ContaSalario extends ContaCorrente {

	public ContaSalario(int numero, String cliente) throws ValorInvalidoException {
		
		//TODO: discutir qual é a melhor estratégia: tratar ou delegar?
		//Não vai ter jeito.
		//O java não aceita colocar try/catch no construtor, pois
		// se tratar a exceção na filha, a inicialização da 
		// mãe pode ficar inconsistente.
		super(numero, cliente, 0f);
	}
	
}
