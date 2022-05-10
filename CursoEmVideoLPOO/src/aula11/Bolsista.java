package aula11;

public class Bolsista extends Aluno {
	private double bolsa;

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}

	public void renovarBolsa() {
		System.out.println("Renovando bolsa do aluno: " + this.getNome());
	}

	@Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento facilitado");
	}
}
