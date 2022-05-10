package aps.lpoo.br.uni;

//classe abstrata Jogador
public abstract class Jogador {
	private String nome;
	protected int idade, habilidade;
	private int gols, camisa;

	// Construtor
	public Jogador(String nome, int idade, int habilidade, int camisa) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.habilidade = habilidade;
		this.gols = 0;
		this.camisa = camisa;
	}

	// Metodos especiais
	public abstract void somaGol();

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(int habilidade) {
		this.habilidade = habilidade;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

}
