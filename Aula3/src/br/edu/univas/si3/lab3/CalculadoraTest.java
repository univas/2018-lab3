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
	public void metodoQualquer() {
		fail("Not yet implemented");
		
//		asfdljfjksadfjksad
	}

	public void outroMetodo() {
		
	}

}
