package aula02execicio;

public class Merenda {
	String prato;
	String ingredientes;
	String tempo_fazer;
	boolean comer;

	void lista() {
		System.out.println("Na merenda de hj teremos " + this.prato);
		System.out.println("Os ingredientes necessarios são: " + this.ingredientes);
		System.out.println("O tempo necessario em media pra fazer é de " + this.tempo_fazer);
	}

	void devorar() {
		if (this.comer == true) {
			System.out.println("Esta pronto pode comer");
		} else {
			System.out.println("Aguarde um pouco logo estara pronto!");
		}
	}

	void pronto() {
		this.comer = true;
	}

	void nao_pronto() {
		this.comer = false;
	}
}
