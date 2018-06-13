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
		if (valor <= 0f) {
			throw new ValorInvalidoException(//TODO: criar uma exceção compatível
					"Não é permitido sacar um valor negativo.");
		}
		if (valor > saldo) {
			throw new SaldoInsuficienteException(
					"O saldo é insuficiente para o saque: " + getSaldo());
		}
		saldo -= valor;
	}

	//TODO: lançar a exceção ValorInvalidoException quando o valor for inválido
	public boolean depositar(float valor) {
		if (valor <= 0f) {
			return false;
		}
		saldo += valor;
		return true;
	}

	//TODO: implementar o transfefirPara, lançando a exceção ValorInvalidoException
	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}
}
