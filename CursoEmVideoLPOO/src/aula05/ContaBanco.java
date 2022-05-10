package aula05;

public class ContaBanco {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// metodos personalizados
	public void estadoAtual() {
		System.out.println("--------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta do " + this.getDono() + " foi aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out
					.println("A conta do(a) " + this.getDono() + " não pode ser fechada pois ainda ha dinheiro nela.");
		} else if (this.getSaldo() < 0) {
			System.out.println(
					"A conta do(a) " + this.getDono() + " não pode ser fechada enquanto ainda houver debitos.");
		} else {
			this.setStatus(false);
			System.out.println("Conta do(a) " + this.getDono() + " foi fechada com sucesso!");
		}
	}

	public void depositar(double v) {
		if (this.getStatus()) {
			// this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em uma conta fechada!");
		}
	}

	public void sacar(double v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente na conta do(a) " + this.getDono() + " para realizar o saque");
			}

		} else {
			System.out.println("Impossivel realizar saque em uma conta fechada");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;

		} else if (this.getTipo() == "CP") {
			v = 20;

		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade da conta do " + this.getDono() + " foi paga com sucesso!");
		} else {
			System.out.println("Impossivel pagar de uma conta fechada!");
		}

	}

	// construtor, getters e setters

	public ContaBanco() {
		super();
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}