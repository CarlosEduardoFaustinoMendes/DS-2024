import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		double margemLucroPercentual;
		double margemLucro;
		
		produtos produtores = new produtos();
		
		System.out.print("Digite seu nome: ");
		produtores.setNome(in.nextLine());
		
		System.out.print("Digite o pre�o de custo: ");
		
		produtores.setPrecoCusto(in.nextDouble());
		
		System.out.print("Digite o pre�o de venda: ");
		
		produtores.setPrecoVenda(in.nextDouble());
		
		margemLucroPercentual = produtores.calcularMargemLucroPorcentagem();
		
		margemLucro = produtores.calcularMargemLucro();
		
		if(margemLucro <= 0){
		System.out.println("N�o tem lucro");
		}else{
		System.out.println("A margem de lucro �: "+margemLucro);
		}
		if (margemLucroPercentual < 1){
			
			System.out.print(" ");			
		}else {
			System.out.printf("A porcentagem da margem de lucro �: %.2f", margemLucroPercentual);
		}
		
		

	}

}
