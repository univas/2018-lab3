
public class Runner {

	public static void main(String[] args) {

		int a;
		float b = (float)3.7;
		long c;
		double d;
		short e = 100;
		char f = 'r';
		
		boolean g; //true ou false
		g = true;
		g = false;
		
		byte h = (byte)1000;
		String i = "Roberto";
		
		System.out.println(h);
		System.out.println(i);
		System.out.println("Olá " + i);
		System.out.println("h = " + h);
		System.out.println("g = " + g);
		System.out.println(e + h);	
		System.out.println("b = " + b);
		
		g = h > 0;
		if(g) {
			System.out.println("h positivo");
		} else {
			System.out.println("h negativo");
		}
		
		a = 5;
		while(a > 0) {
			System.out.println("a = " + a);
			a--;
		}
		
		for(c = 1; c < 7; c++) {
			System.out.print(c + ": ");
		}
		System.out.println();
		
		int [] vet1; //declaração de vetor/array
		vet1 = new int[6]; //aloca um vetor de 6 posições
		
		int [] vet2 = {2, 4, 6, 8};
		
//		vet1 = {2, 4, 6, 8};//erro
		
		for(a = 0; a < 4; a++) {
			System.out.println("vet2[" + a + "] = " + vet2[a]);
		}
		System.out.println(vet1);
		
		vet1[0] = 10;
		vet1[1] = 20;
		vet1[2] = 30;
		vet1[3] = 40;
		vet1[4] = 50;
		
		for(a = 0; a < vet1.length; a++) {
			System.out.println("vet1[" + a + "] = " + vet1[a]);
		}
		
		System.out.println("Tamanho de vet1 = " + vet1.length);
	}

}
