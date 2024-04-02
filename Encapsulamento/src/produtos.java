
public class produtos {

	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	

public double getPrecoCusto() {
	return precoCusto;
}

public void setPrecoCusto(double precoCusto) {
	this.precoCusto = precoCusto;
}

public double getPrecoVenda() {
	return precoVenda;
}

public void setPrecoVenda(double precoVenda) {
	
	if (precoVenda < precoCusto) {
		
		System.out.println("O preço de venda é menor que o de custo!");}
	else {
	this.precoVenda = precoVenda;
	}
}

public double getMargemLucro() {
	return margemLucro;
}

public void setMargemLucro(double margemLucro) {
	this.margemLucro = margemLucro;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

	
	public double calcularMargemLucro() {
		
		return  precoVenda - precoCusto;
	}
	
	public double calcularMargemLucroPorcentagem() {
		
	return (precoVenda - precoCusto) / precoVenda * 100;
	}
 
	
	
}
