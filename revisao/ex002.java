import java.util.Scanner;

public class ex002 {
	
	 public static void main(String[] args) {
		 
	        Scanner in = new Scanner(System.in);
	        
	        int numero;

	        System.out.print("Digite um número inteiro: ");
	        numero = in.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("O número " + numero + " é par.");
	        } else {
	            System.out.println("O número " + numero + " é ímpar.");
	        }
	    }
	
}
