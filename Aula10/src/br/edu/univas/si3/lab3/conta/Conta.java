package br.edu.univas.si3.lab3.conta;


public abstract class Conta implements Atualizacao {

	private int numero;
	protected String cliente;
	private float saldo;

	public Conta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public void sacar(float valor) 
			throws SaldoInsuficienteException, ValorInvalidoException {
		if (valor < 0f) {
			throw new ValorInvalidoException(//TODO: criar uma exce��o compat�vel
					"N�o � permitido sacar um valor negativo.");
		}
		if (valor > saldo) {
			throw new SaldoInsuficienteException(
					"O saldo � insuficiente para o saque: " + getSaldo());
		}
		saldo -= valor;
	}

	//TODO: lan�ar a exce��o ValorInvalidoException quando o valor for inv�lido
	public void depositar(float valor) throws ValorInvalidoException {
		if (valor < 0f) {
			throw new ValorInvalidoException(
					"N�o � permitido depositar um valor negativo.");
		}
		saldo += valor;
	}

	//TODO: implementar o transfefirPara, lan�ando a exce��o ValorInvalidoException
	public void transferirPara(Conta destino, float valor) 
			throws SaldoInsuficienteException, ValorInvalidoException {
		this.sacar(valor);
		this.depositar(valor);
	}
	
	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}
}
