package aps.lpoo.br.uni;

//Classe Defesa que extende a classe abstrata Jogador
public class JogadorDefesa extends Jogador {
	private int cobertura, desarme;

	// Construtor
	public JogadorDefesa(String nome, int idade, int habilidade, int camisa, int cobertura, int desarme) {
		super(nome, idade, habilidade, camisa);
		this.cobertura = cobertura;
		this.desarme = desarme;
	}

	// Metodos criados a partir da sobreposição dos mesmos, que podem ser encotrados
	// na classe Jogador. Uma das 2 formas de polimorfismo.
	@Override
	public int getHabilidade() {
		habilidade = ((habilidade * 5) + (this.getCobertura() * 3) + (this.getDesarme() * 2));
		habilidade = habilidade / 10;
		return habilidade;
	}

	@Override
	public void somaGol() {
		this.setGols(this.getGols() + 1);

	}

	// To String para poder imprimir os detalhes dos Defensores quando eles forem
	// chamados.
	@Override
	public String toString() {
		return "JogadorDefesa [cobertura=" + cobertura + ", desarme=" + desarme + ", idade=" + idade + ", habilidade="
				+ this.getHabilidade() + ", getNome()=" + getNome() + ", getGols()=" + getGols() + ", getCamisa()="
				+ getCamisa() + "]";
	}

	// Getters and Setters
	public int getCobertura() {
		return cobertura;
	}

	public void setCobertura(int cobertura) {
		this.cobertura = cobertura;
	}

	public int getDesarme() {
		return desarme;
	}

	public void setDesarme(int desarme) {
		this.desarme = desarme;
	}

}
