package br.edu.univas.si3.lab3.conta;


public abstract class Conta implements Atualizacao {

	private int numero;
	protected String cliente;
	private float saldo;

	public Conta(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public void sacar(float valor) throws SaldoInsuficienteException {
		if (valor <= 0f) {
			throw new SaldoInsuficienteException(//TODO: criar uma exce��o compat�vel
					"N�o � permitido sacar um valor negativo.");
		}
		if (valor > saldo) {
			throw new SaldoInsuficienteException(
					"O saldo � insuficiente para o saque: " + getSaldo());
		}
		saldo -= valor;
	}

	public boolean depositar(float valor) {
		if (valor <= 0f) {
			return false;
		}
		saldo += valor;
		return true;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}
}
