package aula09;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;

	public Pessoa(String nome, String sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
		System.out.println("Feliz aniversario!!!");
		System.out.println("Agora voce tem " + this.getIdade() + "anos");
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}
}
