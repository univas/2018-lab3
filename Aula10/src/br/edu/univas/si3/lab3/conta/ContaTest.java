package br.edu.univas.si3.lab3.conta;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testContaSalario() {
		
		
		try {
			ContaSalario c1 = new ContaSalario(1, "c1");
			
			assertEquals(0, c1.getSaldo(), 0.01);
			
			c1.depositar(100);
			assertEquals(100, c1.getSaldo(), 0.01);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
			fail("N�o pode chegar aqui.");
		}
	}

	@Test 
	public void testContaCorrente() {
		try {
			ContaCorrente cc1 = new ContaCorrente(1, "c1", 5);
			cc1.depositar(30);
			cc1.sacar(10);
		} catch( ValorInvalidoException e) {
			//n�o pode dar erro
			fail("N�o pode chegar aqui.");
		} catch(SaldoInsuficienteException e) {
			fail("N�o pode chegar aqui.");
		}
		
		try {
			ContaCorrente cc2 = new ContaCorrente(1, "c1", -3);
			//n�o era para ter continuado
			fail("N�o pode chegar aqui.");
		} catch(ValorInvalidoException e) {
			//deu certo
		}
	}
}
