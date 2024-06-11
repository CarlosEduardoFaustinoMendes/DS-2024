
public class Moto extends Veiculos {
	
	private double cilindradas;

	public double getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public Moto(String marca, String modelo, String cor, int ano, double cilindradas) {
		super(marca, modelo, cor, ano);
		this.cilindradas = cilindradas;
		
	}
		public String mostraResultadoMoto () {
			
			return getMarca() + " " + getModelo() + " " + getCor()+ " " + getAno() + " " + getCilindradas() + " " + "Cilindradas";
		
	}
}
