package br.edu.univas.si3.lab3.conta;

import java.util.ArrayList;

public class GerenteContas {

	private ArrayList<Conta> contas;
	
	public GerenteContas() {
		contas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public int getQuantidadeDeContas() {
		return contas.size();
	}
	
	public void removerConta(Conta conta) {
		//Exerc�cio: implementar este m�todo
		//a remo��o deve ser feita baseada no n�mero da conta

		//contas.remove(conta);//assim remove baseado na refer�ncia do objeto
	}
}
