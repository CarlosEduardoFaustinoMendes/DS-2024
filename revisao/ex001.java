import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numero;
		
		System.out.print("Digite o numero: ");
		numero = in.nextInt();
		
		if (numero>=0){
			System.out.println("O numero é positivo");
		}else {
			System.out.println("O numero é negativo");
		}
	}
}
