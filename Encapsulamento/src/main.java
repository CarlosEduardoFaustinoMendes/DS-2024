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
		
		System.out.print("Digite o preço de custo: ");
		
		produtores.setPrecoCusto(in.nextDouble());
		
		System.out.print("Digite o preço de venda: ");
		
		produtores.setPrecoVenda(in.nextDouble());
		
		margemLucroPercentual = produtores.calcularMargemLucroPorcentagem();
		
		margemLucro = produtores.calcularMargemLucro();
		
		if(margemLucro <= 0){
		System.out.println("Não tem lucro");
		}else{
		System.out.println("A margem de lucro é: "+margemLucro);
		}
		if (margemLucroPercentual < 1){
			
			System.out.print(" ");			
		}else {
			System.out.printf("A porcentagem da margem de lucro é: %.2f", margemLucroPercentual);
		}
		
		

	}

}
