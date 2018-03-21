package br.edu.univas.si3.lab3.conta;

public class Conta {

	//exerc�cio 1:
	//criar um atributo inteiro para o saldo e para o n�mero da conta
	//criar um construtor para inicializar os atributos
	//criar um m�todo para retornar o saldo
	//criar um m�todo para retornar o n�mero
	//criar um m�todo para depositar
	//criar um m�todo para sacar
	//criar um m�todo para transferir para outra conta
	
	private int saldo;
	private int numero;
	
	public Conta(int numero){
		int saldo = 5;//vari�vel local do m�todo ---> diferente do atributo saldo
		
		//o this � uma refer�ncia para o objeto em quest�o
		this.numero = numero;
		this.saldo = 0;//n�o precisa, pois quando aloca um objeto, j� inicializa com zero
	}
	
	public int getSaldo() {//o nome padr�o "get" � muito usado no Java
		return this.saldo;//retorna uma c�pia do atributo saldo
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
	
	public void sacar(int valor) {
		this.saldo -= valor;
	}
	
	public void transferirPara(Conta destino, int valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	
	//exerc�cio 2:
	//criar uma classe de teste para verificar se os m�todos est�o corretos.
	
	//atividade 3:
	//criar uma classe de gerente de contas
	//
}
