package br.edu.univas.si3.lab3.conta;


public class ContaCorrente extends Conta {
	
	private float manutencaoMensal;
	
	public ContaCorrente(int numero, String cliente, float manutMensal) 
			throws ValorInvalidoException {
		super(numero, cliente);
		if(manutMensal < 0) {
			throw new ValorInvalidoException(
					"Não pode criar uma conta com manutenção negativa");
		}
		this.manutencaoMensal = manutMensal;
	}
	
	//a assinatura do método deve ser igual a algum método de alguma classe mãe
	@Override
	public void atualizarSaldo() throws SaldoInsuficienteException {
		try {
			super.sacar(manutencaoMensal);//pensar na visibilidade do atributo saldo. -> ok
		} catch(ValorInvalidoException e) {
			//desconsiderar, pois nunca irá acontecer, pois
			//o construtor já não aceita valores negativos
			e.printStackTrace();
		}
	}
}
