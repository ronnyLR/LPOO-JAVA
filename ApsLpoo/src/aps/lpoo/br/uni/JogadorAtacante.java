package aps.lpoo.br.uni;

// Classe atacante que extende a classe abstrata Jogador
public class JogadorAtacante extends Jogador {

	private int velocidade, tecnica;

	// Construtor
	public JogadorAtacante(String nome, int idade, int habilidade, int camisa, int velocidade, int tecnica) {
		super(nome, idade, habilidade, camisa);
		this.velocidade = velocidade;
		this.tecnica = tecnica;

	}

	// Metodos criados a partir da sobreposição dos mesmos, que podem ser encotrados
	// na classe Jogador. Uma das 2 formas de polimorfismo.
	@Override
	public int getHabilidade() {
		habilidade = ((habilidade * 5) + (this.getVelocidade() * 2) + (this.getTecnica() * 3));
		habilidade = habilidade / 10;
		return habilidade;
	}

	@Override
	public void somaGol() {
		this.setGols(this.getGols() + 1);

	}

	// To String para poder imprimir os detalhes dos Atacantes quando eles forem
	// chamados.
	@Override
	public String toString() {
		return "JogadorAtacante [Nome: " + getNome() + ", idade=" + idade + ", velocidade=" + velocidade + ", tecnica="
				+ tecnica + ", habilidade=" + this.getHabilidade() + ", Gols=" + getGols() + ", Camisa=" + getCamisa()
				+ "]";
	}

	// Getters and Setters
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getTecnica() {
		return tecnica;
	}

	public void setTecnica(int tecnica) {
		this.tecnica = tecnica;
	}

}
