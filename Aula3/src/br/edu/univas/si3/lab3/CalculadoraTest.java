package br.edu.univas.si3.lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {

		int resultSoma01 = Calculadora.somar(3, 4);
		assertEquals(7, resultSoma01);
			
//		//cópia do main
//		int resultSoma1 = Calculadora.somar(3, 4);
//		if(resultSoma1 == 7) {
//			//ok
//		} else {
//			System.out.println("ERRO na soma.");
//		}
	}

	@Test
	public void testDividir() {
		float resultDiv1 = Calculadora.dividir(6, 3);
		assertEquals(2, resultDiv1, 0.01);

		float resultDiv2 = Calculadora.dividir(0, 3);
		assertEquals(0, resultDiv2, 0.01);
		
		float resultDiv3 = Calculadora.dividir(3, 0);
		assertEquals(-1, resultDiv3, 0.01);
	}

	@Test
	public void testMediaVetor() {
		
		//teste do vetor com alguns valores
		int [] vet01 = {2, 4, 6, 8};
//		float valorEsperado01 = 5;
		float valorObtido01 = Calculadora.mediaVetor(vet01);
		assertEquals(5, valorObtido01, 0.01);
		
		//teste do vetor vazio
		int [] vet02 = {};
		assertEquals(0, Calculadora.mediaVetor(vet02), 0.01);
		
		//teste de vetor nulo
		int [] vet03 = null;
		assertEquals(0, Calculadora.mediaVetor(vet03), 0.01);
	}
	
//	@Test
//	public void metodoQualquer() {
//		fail("Not yet implemented");
//	}

	public void outroMetodo() {
		
	}

}
