package br.edu.univas.si3.lab3;

public class Calculadora {

	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static float dividir(float a, float b) {
		if(b == 0) {
			return -1;
		}
		return a / b;
	}
	
	public static int somarVetor(int [] vetor) {
		int resultado = 0;
		int i;
		for(i = 0; i < vetor.length; i++) {
			resultado += vetor[i];
		}
		return resultado;
	}

	//exercício para casa:
	//implementar um método para calcular a média dos valores de um vetor
	//implementar um método de teste para testar este novo método
	
	public static float mediaVetor(int [] vetor) {
		
		if(vetor == null) {
			return 0f;
		}
		
		if(vetor.length == 0) {
			return 0f;
		}
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		return soma / vetor.length;
	}
}
