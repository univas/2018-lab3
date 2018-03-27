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
		//Exercício: implementar este método
		//a remoção deve ser feita baseada no número da conta

		//contas.remove(conta);//assim remove baseado na referência do objeto
	}
}
