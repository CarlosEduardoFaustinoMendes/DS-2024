import java.util.Scanner;

public class ex004 {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        char opcao;
	        int anoAtual = 2024;

	        do {

	            System.out.print("Digite o ano de nascimento: ");
	            int anoNascimento = in.nextInt();

	            int idade = anoAtual - anoNascimento;

	            String situacao = (idade >= 18) ? "Maior de idade" : "Menor de idade";

	            System.out.println("A idade é: " + idade + " anos. " + situacao);

	            System.out.print("Deseja calcular a idade de mais uma pessoa? (Sim ou Não): ");
	            opcao = in.next().charAt(0);

	        } while (opcao == 'S' || opcao == 's');

	    }
	}
	

