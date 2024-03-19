import java.util.Scanner;

public class ex003 {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int senhaCorreta = 2002;
        int senhaDigitada;

        do {
            System.out.println("Digite a senha: ");
            senhaDigitada = in.nextInt();

            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Inválida");
            }

        } while (true);

    }
}
	

