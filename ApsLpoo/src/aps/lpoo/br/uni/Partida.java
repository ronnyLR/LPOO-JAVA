package aps.lpoo.br.uni;

public class Partida {
	private Data data;
	private Time timeCasa, timeVisitante;
	private int placarCasa, placarVisitante;

	// Construtor
	public Partida(Data data, Time timeCasa, Time timeVisitante) {
		super();
		this.data = data;
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
		this.placarCasa = 0;
		this.placarVisitante = 0;
	}

	// Metodos Especiais
	public void golCasa() {
		this.setPlacarCasa(getPlacarCasa() + 1);
	}

	public void golVisitante() {
		this.setPlacarVisitante(getPlacarVisitante() + 1);
	}

	public String getPlacar() {
		return timeCasa + " " + placarCasa + " X " + placarVisitante + " " + timeVisitante;
	}

	// Getters and Setters
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Time getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(Time timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public int getPlacarCasa() {
		return placarCasa;
	}

	public void setPlacarCasa(int placarCasa) {
		this.placarCasa = placarCasa;
	}

	public int getPlacarVisitante() {
		return placarVisitante;
	}

	public void setPlacarVisitante(int placarVisitante) {
		this.placarVisitante = placarVisitante;
	}

}
