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
			fail("Não pode chegar aqui.");
		}
	}

	@Test 
	public void testContaCorrente() {
		try {
			ContaCorrente cc1 = new ContaCorrente(1, "c1", 5);
			cc1.depositar(30);
			cc1.sacar(10);
		} catch( ValorInvalidoException e) {
			//não pode dar erro
			fail("Não pode chegar aqui.");
		} catch(SaldoInsuficienteException e) {
			fail("Não pode chegar aqui.");
		}
		
		try {
			ContaCorrente cc2 = new ContaCorrente(1, "c1", -3);
			//não era para ter continuado
			fail("Não pode chegar aqui.");
		} catch(ValorInvalidoException e) {
			//deu certo
		}
	}
	
	@Test
	public void testPoupanca() {
		ContaPoupanca cp1 = new ContaPoupanca(1, "c1", 10);
		try {
			cp1.atualizarSaldo();
		} catch (ValorInvalidoException e) {
			fail("Não pode chegar aqui.");
		}
		
		try {
			cp1.depositar(30);
			assertEquals(30, cp1.getSaldo(), 0.01);
		} catch (ValorInvalidoException e) {
			fail("Não pode chegar aqui.");
		}
		try {
			cp1.sacar(15);
			assertEquals(15, cp1.getSaldo(), 0.01);
		} catch (SaldoInsuficienteException e) {
			fail("Não pode chegar aqui.");
		} catch (ValorInvalidoException e) {
			fail("Não pode chegar aqui.");
		}
		
		try {
			cp1.sacar(50);
			fail("Não pode chegar aqui.");
		} catch (SaldoInsuficienteException e) {
			//ok
		} catch (ValorInvalidoException e) {
			//ok
		}
		assertEquals(15, cp1.getSaldo(), 0.01);
	}
}
