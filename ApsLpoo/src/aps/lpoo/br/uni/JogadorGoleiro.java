package aps.lpoo.br.uni;

//Classe Goleiro que extende a classe abstrata Jogador
public class JogadorGoleiro extends Jogador {
	private int reflexos;
	private double altura;

	// Construtor
	public JogadorGoleiro(String nome, int idade, int habilidade, int camisa, int reflexos, double altura) {
		super(nome, idade, habilidade, camisa);
		this.reflexos = reflexos;
		this.altura = altura;
	}

	// Metodos criados a partir da sobreposição dos mesmos, que podem ser encotrados
	// na classe Jogador. Uma das 2 formas de polimorfismo.
	@Override
	public int getHabilidade() {
		;
		habilidade = ((habilidade * 5) + (((int) (this.getAltura() * 100)) * 2) + (this.getReflexos() * 3));
		habilidade = habilidade / 10;
		return habilidade;
	}

	@Override
	public void somaGol() {
		this.setGols(this.getGols() + 1);

	}

	// To String para poder imprimir os detalhes dos Goleiros quando eles forem
	// chamados.
	@Override
	public String toString() {
		return "JogadorGoleiro [reflexos=" + reflexos + ", altura=" + altura + ", idade=" + idade + ", habilidade="
				+ this.getHabilidade() + ", getNome()=" + getNome() + ", getGols()=" + getGols() + ", getCamisa()="
				+ getCamisa() + "]";
	}

	// Getters and Setters
	public int getReflexos() {
		return reflexos;
	}

	public void setReflexos(int reflexos) {
		this.reflexos = reflexos;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
