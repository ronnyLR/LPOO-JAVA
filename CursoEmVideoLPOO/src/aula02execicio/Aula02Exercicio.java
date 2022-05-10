package aula02execicio;

public class Aula02Exercicio {

	public static void main(String[] args) {
		Celular a1 = new Celular();
		a1.processador = "snapdragon";
		a1.tipoConector = "tipo C";
		a1.armazenamento = 32;
		a1.memoria = 4;
		a1.ligar();
		// a1.caracteristicas();
		// a1.mecher();

		Merenda a2 = new Merenda();
		a2.prato = "Sanduichi";
		a2.ingredientes = "pao, manteiga";
		a2.tempo_fazer = "10 minutos";
		a2.lista();
		a2.nao_pronto();
		a2.devorar();
	}

}
