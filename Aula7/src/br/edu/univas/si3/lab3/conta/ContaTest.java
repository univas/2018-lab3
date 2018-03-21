package br.edu.univas.si3.lab3.conta;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTest {

	@Test
	public void testBasico() {
		Conta c1 = new Conta(1);
		assertEquals(1, c1.getNumero());
		assertEquals(0, c1.getSaldo());
		
		c1.depositar(100);
		assertEquals(100, c1.getSaldo());
		
		c1.depositar(50);
		assertEquals(150, c1.getSaldo());

		c1.sacar(60);
		assertEquals(90, c1.getSaldo());
		
		c1.sacar(40);
		assertEquals(50, c1.getSaldo());
	}
	
	@Test
	public void testTransferir() {
		Conta c1 = new Conta(1);
		Conta c2 = new Conta(2);
		Conta c3 = new Conta(3);

		c1.depositar(100);
		c1.transferirPara(c2, 30);
		
		assertEquals(70, c1.getSaldo());
		assertEquals(30, c2.getSaldo());
		
		c2.transferirPara(c3, 20);
		assertEquals(10, c2.getSaldo());
		assertEquals(20, c3.getSaldo());
	}
	
	@Test
	public void testAvancado() {
		Conta c1 = new Conta(1);
		c1.depositar(100);
		c1.sacar(200);
		
		assertEquals(100, c1.getSaldo());
		
		Conta c2 = new Conta(2);
		c2.depositar(1000);
		c2.transferirPara(c1, 2000);
		
		assertEquals(100, c1.getSaldo());
		assertEquals(1000, c2.getSaldo());
	}

}