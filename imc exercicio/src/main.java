import java.util.Iterator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double result;
		
		 int i, escolha;
		
		System.out.print("Quer calcular o IMC de quantas pessoas? ");
		 escolha = in.nextInt();
		
		 for(i = 0; i < escolha; i++) {
		
		 
		Imc pesoimc = new Imc();
		
		System.out.println(" ");
		
		
		System.out.print("Digite o nome da "+(i+1)+" pessoa:");
		
		pesoimc.nome = in.next();
		
		System.out.print("Insira sua idade: ");
		pesoimc.idade = in.nextInt();
		
		System.out.print("Insira seu peso: ");
		
		pesoimc.peso = in.nextDouble();
		
		System.out.print("Insira sua altura: ");
		
		pesoimc.altura = in.nextDouble();
		System.out.println(" ");
		
		result = pesoimc.calcularImc();
		
		System.out.println("Seu IMC é: "+result);
		
		if(result <= 18.5) {
		System.out.println(pesoimc.nome+", Você está abaixo do peso");
		}else if (result <= 24.9) {
			System.out.println(pesoimc.nome+", Você está com o peso normal");
		}else if (result <= 29.9) {
			System.out.println(pesoimc.nome+", Você está com Sobrepeso");
		}else if (result <=34.9) {
			System.out.println(pesoimc.nome+", Você está com Obesidade Grau 1");
		}else if (result <= 39.9) {
			System.out.println(pesoimc.nome+", Você está com Obesidade Grau 2");
		}else if (result >=40) {
			System.out.println(pesoimc.nome+", Você está com Obesidade Grau 3");
		}
		
	}
	}

}
