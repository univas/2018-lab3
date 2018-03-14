package br.edu.univas.si3.lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlunoTest {

	@Test
	public void testEstaAprovado() {
		
		int qtdFaltas = 5;
		assertEquals("Sem dados", Aluno.estaAprovado(null, qtdFaltas));

		int[] notas = {};
		assertEquals("Sem dados", Aluno.estaAprovado(notas, qtdFaltas));
		
		notas = new int [] {2, 25, 30};
		assertEquals("Reprovado", Aluno.estaAprovado(notas, qtdFaltas));

		qtdFaltas = 30;
		notas = new int [] {60, 75, 80};
		assertEquals("Reprovado", Aluno.estaAprovado(notas, qtdFaltas));
		
		qtdFaltas = 10;
		notas = new int [] {40, 45, 50};
		assertEquals("Em exame", Aluno.estaAprovado(notas, qtdFaltas));
		
		qtdFaltas = 10;
		notas = new int [] {60, 75, 80};
		assertEquals("Aprovado", Aluno.estaAprovado(notas, qtdFaltas));
	}

}
