import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new
				 Scanner(System.in);
		double area;

		Quadrado quadrado1 = new Quadrado ();
		
		System.out.print("Digite a altura do quadrado 1: ");
		quadrado1.altura = in.nextDouble();
		
		System.out.print("Digite a base do quadrado 2: ");
		quadrado1.base = in.nextDouble();
		
		area = quadrado1.calcularArea();
		
		System.out.println("A area do quadrado 1 é " + area);
		
		
		Quadrado quadrado2 = new Quadrado ();
		
		System.out.print("Digite a altura do quadrado 2: ");
		quadrado2.altura = in.nextDouble();
		
		System.out.print("Digite a base do quadrado 2: ");
		quadrado2.base = in.nextDouble();
		
		area = quadrado2.calcularArea();
		
		System.out.println("A area do quadrado 2 é " + area);
		
	}
}