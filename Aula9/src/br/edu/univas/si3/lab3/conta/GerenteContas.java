package br.edu.univas.si3.lab3.conta;

import java.util.ArrayList;

public class GerenteContas {

	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void adicionar(Conta c) {
		contas.add(c);
	}
	
	public void remover(Conta c) {
		for (int i = 0; i < contas.size()	; i++) {
			
			Conta conta = contas.get(i);
			if(conta.getNumero() == c.getNumero()) {
				contas.remove(i);
			}
		}
	}
	
	public void atualizarTodasContas() {
		for (Conta conta : contas) {
			conta.atualizarSaldo();
		}
	}
}
