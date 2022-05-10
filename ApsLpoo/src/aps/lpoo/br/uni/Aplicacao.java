package aps.lpoo.br.uni;

public class Aplicacao {

	public static void main(String[] args) {

		// Declaração dos atacantes
		JogadorAtacante a[] = new JogadorAtacante[4];
		a[0] = new JogadorAtacante("ronny", 20, 10, 10, 9, 10);
		a[1] = new JogadorAtacante("ronny2", 20, 10, 10, 9, 10);
		a[2] = new JogadorAtacante("ronny3", 20, 10, 10, 9, 10);
		a[3] = new JogadorAtacante("ronny4", 20, 10, 10, 9, 10);

		// Declaração dos defensores
		JogadorDefesa d[] = new JogadorDefesa[4];
		d[0] = new JogadorDefesa("rian", 7, 10, 11, 10, 10);
		d[1] = new JogadorDefesa("rian2", 7, 10, 11, 10, 10);
		d[2] = new JogadorDefesa("rian3", 7, 10, 11, 10, 10);
		d[3] = new JogadorDefesa("rian4", 7, 10, 11, 10, 10);

		// Declaração dos goleiros
		// Ordem do construtor: (nome, 
		JogadorGoleiro g[] = new JogadorGoleiro[2];
		g[0] = new JogadorGoleiro("lucildo", 59, 2, 9, 15, 1.69);
		g[1] = new JogadorGoleiro("lucildo2", 59, 2, 9, 15, 1.69);

		// Declaração dos dois times t1 e t2
		Time t1 = new Time("oi");
		t1.instanciarGoleiro(g[0]);
		t1.instanciarAtacantes(a[0], a[1]);
		t1.instanciarDefensores(d[0], d[1]);
		t1.somaVitoria();

		Time t2 = new Time("ola");
		t2.instanciarGoleiro(g[1]);
		t2.instanciarAtacantes(a[2], a[3]);
		t2.instanciarDefensores(d[2], d[3]);

		// Declaração de uma data para o jogo
		// Ordem do construtor: (dd,mm,aa)
		Data dataPartida = new Data(31, 02, 2031);

		// Declaração da partida
		// Ordem do construtor: (objeto Data, Time1, Time2)
		Partida jogo1 = new Partida(dataPartida, t1, t2);
		jogo1.golCasa();
		jogo1.golVisitante();
		System.out.println(jogo1.getPlacar());
		System.out.println(a[0].toString());

	}

}
