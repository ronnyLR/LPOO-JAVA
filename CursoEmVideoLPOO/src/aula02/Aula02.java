package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5;
		c1.destampar();
		c1.modelo = "BIC";
		c1.status();
		c1.rabiscar();

		Caneta c2 = new Caneta();
		c2.cor = "preta";
		c2.ponta = 1.0;
		c2.tampar();
		c2.modelo = "Richester";
		c2.status();
		c2.rabiscar();
	}

}
