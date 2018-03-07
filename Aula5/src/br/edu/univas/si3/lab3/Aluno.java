package br.edu.univas.si3.lab3;

public class Aluno {

	//Exercício 1:
	//Criar uma classe de teste para conferir se o método estaAprovado(...)
	//Observação: Utilizar todas as combinações possíveis

	//Exercício 2:

	public static int NOTA_MINIMA_EXAME = 30;
	public static int NOTA_MINIMA_APROVACAO = 60;
	public static int MINIMO_FALTAS = 20;
	
	public static String estaAprovado(int [] notas, int qtdFaltas) {
		if(notas == null || notas.length == 0) {
			return "Sem dados";
		}
		float soma = 0f;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		float media = soma / notas.length;
		if(media < NOTA_MINIMA_EXAME || qtdFaltas < MINIMO_FALTAS) {
			return "Reprovado";
		} else if(media < NOTA_MINIMA_APROVACAO) {
			return "Em exame";
		} else {
			return "Aprovado";
		}
	}
}
