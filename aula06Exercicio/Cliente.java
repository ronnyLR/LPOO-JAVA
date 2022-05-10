package aula06Exercicio;

public class Cliente {

	Cadas_cliente cliente;
	DataNasc data;
	Telefone tel;
	Endereco end;

	public Cliente(Cadas_cliente cli, DataNasc data, Telefone tel, Endereco end) {
		super();

		this.cliente = cli;
		this.data = data;
		this.tel = tel;
		this.end = end;
	}

	public Cadas_cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cadas_cliente cliente) {
		this.cliente = cliente;
	}

	public DataNasc getData() {
		return data;
	}

	public void setData(DataNasc data) {
		this.data = data;
	}

	public Telefone getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel = tel;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Cliente [cliente = " + cliente + ", data = " + data + ", tel = " + tel + ", end = " + end + "]";
	}

}
