package br.edu.univas.si3.lab3.conta;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testContaCorrente() {
		ContaCorrente cc = new ContaCorrente(1, "C1", 10);
		
		assertEquals(0, cc.getSaldo(), 0.01);
		
		cc.depositar(100);
		assertEquals(100, cc.getSaldo(), 0.01);
	}

}
