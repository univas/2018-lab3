package br.edu.univas.si3.lab3;

public class Ordena {

	/*
	 * Exercício:
	 * Criar um método que recebe dois vetores de números inteiros 
	 * ordenados de forma crescente e retorne um terceiro vetor contendo
	 * os valores dos dois vetores de forma ordenada.
	 * 
	 * Criar uma classe de teste para verificar se o método está correto.
	 */
	
	public static int [] ordenar(int [] vetor1, int [] vetor2) {
		int quantidade = 0;
		int idx1 = 0;
		int idx2 = 0;

		if(vetor1 == null && vetor2 == null) {
			return new int [0];
		}
		
		if(vetor1 == null) {
			return vetor2;
		}
		if(vetor2 == null) {
			return vetor1;
		}

		quantidade = vetor1.length + vetor2.length;
		int [] vetor3 = new int [quantidade];

		for(int i = 0; i < quantidade; i++) {
			if(idx1 == vetor1.length) {
				vetor3[i] = vetor2[idx2];
				idx2++;
			} else if(idx2 == vetor2.length) {
				vetor3[i] = vetor1[idx1];
				idx1++;
			} else { //não chegou no fim de nenhum vetor 1 ou 2
				if(vetor1[idx1] < vetor2[idx2]) {
					vetor3[i] = vetor1[idx1];
					idx1++;
				} else {
					vetor3[i] = vetor2[idx2];
					idx2++;
				}
			}
		}
		return vetor3;
	}
	
}