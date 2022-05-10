package aula02execicio;

public class Celular {

	String processador;
	String tipoConector;
	int memoria;
	int armazenamento;
	boolean ligado;

	void caracteristicas() {
		System.out.print("O processador do celular é um " + this.processador);
		System.out.println(" O conector do celular é do tipo " + this.tipoConector);
		System.out.println("A memoria ram do dispositivo é de " + this.memoria + "GB");
		System.out.println("O armazenamento disponivel é de " + this.armazenamento + "GB");
	}

	void mecher() {
		if (this.ligado == true) {
			System.out.println("Esta ligado pode mecher");
		} else {
			System.out.println("ERRO! ligue o celular primeiro anta!");
		}
	}

	void ligar() {
		this.ligado = true;
	}

	void desligar() {
		this.ligado = false;
	}

}
