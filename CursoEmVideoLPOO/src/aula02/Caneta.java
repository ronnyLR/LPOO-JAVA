package aula02;

public class Caneta {

	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.print("Uma caneta " + this.cor);
		System.out.println(" esta tampada ? " + this.tampada);
		System.out.println("Qual o modelo da caneta ? " + this.modelo);
		System.out.println("Qual a ponts dela ? ponta " + this.ponta);
	}

	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}

}
