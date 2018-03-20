package br.edu.univas.si3.lab3;

public class Data {

	//atributos
	private int dia;
	public int mes;
	
	//construtor - se parece com um método, porém não tem tipo de retorno
	//executa apenas inicialização dos atributos
	public Data(int novoValorDoDia, int novoValorDoMes) {
		dia = novoValorDoDia;
		mes = novoValorDoMes;
	}
	
	public Data(int soValorDoMes) {
		mes = soValorDoMes;
	}

	//construtor default
	public Data() {
		
	}
	
	public void imprimir() {
		System.out.println("Data:" + dia + "/" + mes);
	}
}
