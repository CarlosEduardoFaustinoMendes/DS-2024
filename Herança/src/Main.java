import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		Carro carro = new Carro ("Honda","Civic","Preto",1999, 4);
		
		System.out.println(carro.mostraResultadoCarro()n\);
		
		Carro carro2 = new Carro ("Mitsubishi","Eclipse","Preto",1999, 4);
		
		System.out.println(carro2.mostraResultadoCarro());
		
		Carro carro3 = new Carro ("Toyota","Supra","Preto",1999, 4);
		
		System.out.println(carro3.mostraResultadoCarro());
		
		
		Moto moto = new Moto("Honda", "CG 160 Titan", "red",2004,162.7);
		
		System.out.println(moto.mostraResultadoMoto());
		
		

	}

}
