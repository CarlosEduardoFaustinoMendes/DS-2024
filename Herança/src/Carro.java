
public class Carro extends Veiculos{
	
	private int quantidadePortas;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	
	

	public Carro(String marca, String modelo, String cor, int ano, int quantidadePortas) {
		super(marca, modelo, cor, ano);
		this.quantidadePortas = quantidadePortas;
	}


	public String mostraResultadoCarro () {
		
		return  getMarca()+ " " + getModelo() + " " + getCor() + " " + getAno() + " "+ getQuantidadePortas() + " " +"Portas";
		
	}

	
	
}
