package br.edu.univas.si3.lab3;

public class Runner {

	public static void main(String[] args) {

		Runner.imprimir(10);
		int idade = 12;
		Runner.imprimir(idade);
		String nome = "Roberto";
		Runner.imprimir(nome);
		
		//chamadas dos m�todos do exerc�cio - parte 1
		int resultadoSoma = Calculadora.somar(2, 3);
		System.out.println("resultadoSoma: " + resultadoSoma);
		float resultadoDivisao = Calculadora.dividir(22, 4);
		System.out.println("resultadoDivisao: " + resultadoDivisao);
		int [] vetor1 = {2,5,6,2,3,4,1};
		int resultadoSomaVetor = Calculadora.somarVetor(vetor1);
		System.out.println("resultadoSomaVetor: " + resultadoSomaVetor);
		
		//TODO: chamadas dos m�todos do exerc�cio - parte 2
		
		//Verificando os resultados
		System.out.println("Iniciando os testes...");
		int resultSoma1 = Calculadora.somar(3, 4);
		if(resultSoma1 == 7) {
			//ok
		} else {
			System.out.println("ERRO na soma.");
		}

		//exerc�cio: fazer o teste com os m�todos: dividir e somarVetor
		int resultSoma2 = Calculadora.somar(-2, 3);
		if(resultSoma2 == 1) {
			//ok
		} else {
			System.out.println("ERRO na soma.");
		}
		
		int resultSoma3 = Calculadora.somar(-2, 0);
		if(resultSoma3 == -2) {
			//ok
		} else {
			System.out.println("ERRO na soma.");
		}

		//usado com int
//		int resultDiv1 = Calculadora.dividir(6, 3);
//		if(resultDiv1 == 2) {
//			//ok
//		} else {
//			System.out.println("ERRO na divis�o.");
//		}
//
//		int resultDiv2 = Calculadora.dividir(0, 3);
//		if(resultDiv2 == 0) {
//			//ok
//		} else {
//			System.out.println("ERRO na divis�o.");
//		}
//		
//		int resultDiv3 = Calculadora.dividir(3, 0);
//		if(resultDiv3 == -1) {
//			//ok
//		} else {
//			System.out.println("ERRO na divis�o.");
//		}
		
}

	//m�todo que imprime um valor inteiro
	public static void imprimir(int valor) {
		System.out.println("valor: " + valor);
	}

	public static void imprimir(String str) {
		System.out.println(str);
	}

	//exerc�cios:
	//1) criar um m�todo que some dois inteiros e retorne o resultado
	//2) criar um m�todo que retorna o resultado da divis�o de dois inteios
	//3) criar um m�todo que retorna a soma dos valores de um vetor
	
}
