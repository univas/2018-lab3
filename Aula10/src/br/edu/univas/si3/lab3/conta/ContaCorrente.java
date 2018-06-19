package br.edu.univas.si3.lab3.conta;


public class ContaCorrente extends Conta {
	
	private float manutencaoMensal;
	
	public ContaCorrente(int numero, String cliente, float manutMensal) 
			throws ValorInvalidoException {
		super(numero, cliente);
		if(manutMensal < 0) {
			throw new ValorInvalidoException(
					"N�o pode criar uma conta com manuten��o negativa");
		}
		this.manutencaoMensal = manutMensal;
	}
	
	//a assinatura do m�todo deve ser igual a algum m�todo de alguma classe m�e
	@Override
	public void atualizarSaldo() throws SaldoInsuficienteException {
		try {
			super.sacar(manutencaoMensal);//pensar na visibilidade do atributo saldo. -> ok
		} catch(ValorInvalidoException e) {
			//desconsiderar, pois nunca ir� acontecer, pois
			//o construtor j� n�o aceita valores negativos
			e.printStackTrace();
		}
	}
}
