package br.edu.univas.si3.lab3;

public class Runner {

	public static void main(String[] args) {

		//declara��o das vari�veis dos objetos
		Data ptr1;
		Data ptr2;
		Data ptr3;
		
		//alocar os objetos na mem�ria
		ptr1 = new Data(5, 11);
		ptr2 = new Data();
		ptr3 = null;

		//acessar os atributos dos objetos
//		ptr1.dia = 5;
//		ptr1.mes = 11;
//		
//		ptr2.dia = 14;//n�o pode por causa do private
		ptr2.mes = 3;
		
		//imprimindo os atributos
//		System.out.println("Data inicial: " + ptr1.dia + "/" + ptr1.mes);
//		System.out.println("Data final: " + ptr2.dia + "/" + ptr2.mes);
		
		//acessando os m�todos - chamando o m�todo 'imprimir' de cada objeto
		ptr1.imprimir();		
		ptr2.imprimir();
	}
}
