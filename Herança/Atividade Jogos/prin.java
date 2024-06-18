
public class prin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogo jogo = new Jogo();
		jogo.init("Minecraft",1.99,"Mojang");
		
		jogo.printDetails();
		
		System.out.println("-------------------------------------");
		
		JogoEletronico jogoeletronico = new JogoEletronico();
		
		jogoeletronico.init("Supermarket Simulator", 0.99 , "Carrefour","Google", "Dispostivo Móvel" , 0);
		
		
		jogoeletronico.printDetails();
		
		System.out.println(jogoeletronico.jogarOnline());


		System.out.println("-------------------------------------");
		
		JogoFisico jogofisico = new JogoFisico();
		
		jogofisico.init("Monopoly: Rio de janeiro", 1200.0 , "Grow", 5, 20);
		
		jogofisico.printDetails();
		
		
		System.out.printf("%.2f horas", jogofisico.calcularTempoTotal(20, 7));
	
		
		
	}

}
