
public class JogoFisico extends Jogo{

	private int quantidadeJogadores;
	private double tempoPartida;
	
	public int getQuantidadeJogadores() {
		return quantidadeJogadores;
	}
	public void setQuantidadeJogadores(int quantidadeJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
	}
	public double getTempoPartida() {
		return tempoPartida;
	}
	public void setTempoPartida(double tempoPartida) {
		this.tempoPartida = tempoPartida;
	}
	
	public void init (String nome, double preco, String distribuidora, int quantidadeJogadores,double tempoPartida) {
			super.setNome(nome);
			super.setPreco(preco);
			super.setDistribuidora(distribuidora);
			this.quantidadeJogadores = quantidadeJogadores;
			this.tempoPartida = tempoPartida;
			
	}
			
			public void printDetails () {
				System.out.println(getNome());
				System.out.println("$"+getPreco());
				System.out.println(getDistribuidora());
				System.out.println(quantidadeJogadores);
				System.out.println(tempoPartida+" minutos");
			
			
	}
	
	
	public double calcularTempoTotal (double tempoPartida, int quantidadePartidas) {
		
		return (tempoPartida * quantidadePartidas)/60;
	}
	
}
