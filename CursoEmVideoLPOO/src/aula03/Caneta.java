package aula03;

public class Caneta {

	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.print("Uma caneta " + this.cor);
		System.out.println(" esta tampada ? " + this.tampada);
		System.out.println("Qual o modelo da caneta ? " + this.modelo);
		System.out.println("Qual a ponts dela ? ponta " + this.ponta);
		System.out.println("Carga de " + carga);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

}
