package br.edu.univas.si3.lab3.conta;

public class ContaSalario extends ContaCorrente implements Cancelavel, Espelhavel {

	public ContaSalario(int numero, String cliente) {
		super(numero, cliente, 0f);
	}
	
	@Override
	public boolean cancelar() {
		if(getSaldo() == 0) {
			return true;
		}
		//TODO: registrar um movimento de cancelamento.
		return false;
	}
	
	@Override
	public void espelhar(ContaSalario destino) {
		float saldoAtual = super.getSaldo();
		super.sacar(saldoAtual);
		destino.depositar(saldoAtual);
		this.cancelar();//não consigo fazer super.cancelar();
	}
	
}
