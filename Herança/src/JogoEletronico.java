
public class JogoEletronico extends Jogo{
	
	private String plataforma;
	private String genero;
	int quantidadeJogadores;
	
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public void init (String nome, double preco, String distribuidora, String plataforma, String genero, int quantidadeJogadores) {
		super.setNome(nome);
		super.setPreco(preco);
		super.setDistribuidora(distribuidora);
		this.plataforma = plataforma;
		this.genero = genero;
		this.quantidadeJogadores = quantidadeJogadores;
		}
	
	public void printDetails () {
		System.out.println(getNome());
		System.out.println("$"+getPreco());
		System.out.println(getDistribuidora());
		System.out.println(plataforma);
		System.out.println(genero);

		
		}

	
	public String jogarOnline () {
		return "Jogando online com "+ quantidadeJogadores +" jogadores";
		
	}
}
