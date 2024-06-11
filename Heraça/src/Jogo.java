
public class Jogo {
	
	private String nome;
	private double preco;
	private String distribuidora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
	
	public void init (String nome, double preco, String distribuidora) {
		this.nome = nome;
		this.preco = preco;
		this.distribuidora = distribuidora;
		
		
	}
	
	
	public void printDetails () {
		System.out.println(nome);
		System.out.println("$"+preco);
		System.out.println(distribuidora);
		}
	public void init(String nome, double preco, String distribuidora, String plataforma, String genero,
			int quantidadeJogadores) {
		// TODO Auto-generated method stub
		
	}

}
