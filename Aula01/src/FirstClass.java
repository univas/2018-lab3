
public class FirstClass {

	public static void main(String[] args) {
		
		System.out.println("Hello world!!! :)");
		System.out.println("This is my first Java program...");
		
		int i = 0;
		
		while(i < 10) {
			if(i %2 == 0) {
				System.out.println("par: " + i);
			} else {
				System.out.println("ímpar: " + i);
			}
			i++;
		}
		
		System.out.println(i + 3);
		
		System.out.println("valor do i: " + i);

	}

}
