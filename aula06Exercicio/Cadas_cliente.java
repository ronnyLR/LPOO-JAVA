package aula06Exercicio;

public class Cadas_cliente {
	private String nome;
	private int rg;
	private int cpf;

	public Cadas_cliente(String nome, int rg, int cpf) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cadas_cliente [nome = " + nome + ", rg = " + rg + ", cpf = " + cpf + "]";
	}
}
