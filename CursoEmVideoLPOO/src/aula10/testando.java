package aula10;

public class testando extends Professor {
	private boolean comunista;
	

	public boolean isComunista() {
		return comunista;
	}


	public void setComunista(boolean comunista) {
		this.comunista = comunista;
	}


	public void reprovado() {
		this.comunista = true;
	}
}
