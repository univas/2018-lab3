package br.edu.univas.si3.lab3.conta;


public class ContaCorrente extends Conta {
	
	private float manutencaoMensal;
	
	public ContaCorrente(int numero, String cliente, float manutMensal) {
		super(numero, cliente);
		this.manutencaoMensal = manutMensal;
	}
	
	//a assinatura do m�todo deve ser igual a algum m�todo de alguma classe m�e
	@Override
	public void atualizarSaldo() throws SaldoInsuficienteException {
		super.sacar(manutencaoMensal);//pensar na visibilidade do atributo saldo. -> ok
	}
}
