package aula0708;

public class Lutador {
	// Atributos
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private double altura, peso;

	// Métodos Públicos
	public void apresentar() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("CHEGOU A HOOOOORAAAA!!! Apresentando o Lutador: " + this.getNome());
		System.out.println("Diretamente de: " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " Vitorias");
		System.out.println(this.getDerrotas() + " Derrotas e ");
		System.out.println(this.getEmpates() + " Empates!");
	}

	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " Vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes e ");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	// Meétodos Especiais

	public Lutador(String no, String na, int id, int vi, int de, int em, double al, double pe) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
		this.altura = al;
		this.setPeso(pe);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

}
