package br.edu.univas.si3.lab3.conta;

public class Conta {

	//exercício 1:
	//criar um atributo inteiro para o saldo e para o número da conta
	//criar um construtor para inicializar os atributos
	//criar um método para retornar o saldo
	//criar um método para retornar o número
	//criar um método para depositar
	//criar um método para sacar
	//criar um método para transferir para outra conta
	
	private int saldo;
	private int numero;
	
	public Conta(int numero){
		int saldo = 5;//variável local do método ---> diferente do atributo saldo
		
		//o this é uma referência para o objeto em questão
		this.numero = numero;
		this.saldo = 0;//não precisa, pois quando aloca um objeto, já inicializa com zero
	}
	
	public int getSaldo() {//o nome padrão "get" é muito usado no Java
		return this.saldo;//retorna uma cópia do atributo saldo
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
	
	
	//exercício 2:
	//criar uma classe de teste para verificar se os métodos estão corretos.
	
	//atividade 3:
	//criar uma classe de gerente de contas
	//
}
