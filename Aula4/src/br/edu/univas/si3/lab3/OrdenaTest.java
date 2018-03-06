package br.edu.univas.si3.lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenaTest {

	@Test
	public void testOrdenar() {
		int [] vet1 = {2,4,6,8,10};
		int [] vet2 = {1,3,7,8};
		int [] resultado = {1,2,3,4,6,7,8,8,10};
		int [] obtido = Ordena.ordenar(vet1, vet2);
		
		assertNotNull(obtido);
		assertEquals(9, obtido.length);
		assertArrayEquals(resultado, obtido);
		
		vet1 = new int [] {};
		vet2 = new int [] {1,3,7,8,9};
		resultado = new int [] {1,3,7,8,9};
		obtido = Ordena.ordenar(vet1, vet2);
		
		assertEquals(5, obtido.length);
		assertArrayEquals(resultado, obtido);
		
		vet1 = new int [] {};
		vet2 = new int [] {};
		resultado = new int [] {};
		 
		obtido = Ordena.ordenar(vet1, vet2);
		
		assertEquals(0, obtido.length);

		//teste com null
		vet2 = new int [] {1,3,7,8,9};
		vet1 = new int [] {2,4,6,8};
		obtido = Ordena.ordenar(null, vet2);
		assertEquals(4, obtido.length);

		obtido = Ordena.ordenar(vet1, null);
		assertEquals(5, obtido.length);

		obtido = Ordena.ordenar(null, null);
		assertEquals(0, obtido.length);
	}

}
