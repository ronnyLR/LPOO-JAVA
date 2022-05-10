package aps.lpoo.br.uni;

public class Time {
	private String nome;
	private JogadorGoleiro goleiro;
	private JogadorAtacante atacante1, atacante2;
	private JogadorDefesa defesa1, defesa2;
	private int vitorias, derrotas, empates;

	// Construtor
	public Time(String nome) {
		super();
		this.nome = nome;
		this.vitorias = 0;
		this.derrotas = 0;
		this.vitorias = 0;
	}

	// Metodos especiais
	public void instanciarGoleiro(JogadorGoleiro g1) {
		this.goleiro = g1;
	}

	public void instanciarAtacantes(JogadorAtacante a1, JogadorAtacante a2) {
		this.atacante1 = a1;
		this.atacante2 = a2;
	}

	public void instanciarDefensores(JogadorDefesa d1, JogadorDefesa d2) {
		this.defesa1 = d1;
		this.defesa2 = d2;
	}

	public void somaVitoria() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void somaDerrota() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void somaEmpate() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public String getResultados() {
		return "Vitórias: " + this.getVitorias() + " Empates: " + this.getEmpates() + " Derrotas: "
				+ this.getDerrotas();
	}

	public String imprimirJogadores() {
		return "Time [goleiro=" + goleiro + ", atacante1=" + atacante1 + ", atacante2=" + atacante2 + ", defesa1="
				+ defesa1 + ", defesa2=" + defesa2 + "]";
	}

	@Override
	public String toString() {
		return nome;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public JogadorGoleiro getGoleiro() {
		return goleiro;
	}

	public void setGoleiro(JogadorGoleiro goleiro) {
		this.goleiro = goleiro;
	}

	public JogadorAtacante getAtacante1() {
		return atacante1;
	}

	public void setAtacante1(JogadorAtacante atacante1) {
		this.atacante1 = atacante1;
	}

	public JogadorAtacante getAtacante2() {
		return atacante2;
	}

	public void setAtacante2(JogadorAtacante atacante2) {
		this.atacante2 = atacante2;
	}

	public JogadorDefesa getDefesa1() {
		return defesa1;
	}

	public void setDefesa1(JogadorDefesa defesa1) {
		this.defesa1 = defesa1;
	}

	public JogadorDefesa getDefesa2() {
		return defesa2;
	}

	public void setDefesa2(JogadorDefesa defesa2) {
		this.defesa2 = defesa2;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
