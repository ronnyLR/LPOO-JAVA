package aula06Exercicio;

import javax.swing.JOptionPane;

public class AplicacaoCliente {

	public static void main(String[] args) {

		Cadas_cliente cd1 = new Cadas_cliente(JOptionPane.showInputDialog("Insira o seu nome:"),
				Integer.parseInt(JOptionPane.showInputDialog("Insira o número do seu RG:")),
				Integer.parseInt(JOptionPane.showInputDialog("Insira o número do seu CPF:")));

		Endereco e1 = new Endereco(JOptionPane.showInputDialog("Insira o nome do seu logradouro:"),
				Integer.parseInt(JOptionPane.showInputDialog("Insira o número da sua casa:")),
				JOptionPane.showInputDialog("Insira o nome do seu bairro:"),
				JOptionPane.showInputDialog("Insira o nome da sua cidade:"),
				JOptionPane.showInputDialog("Insira o nome do seu estado:"));

		Telefone t1 = new Telefone(Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD do seu telefone:")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número do seu telefone:")));

		DataNasc data_nasc = new DataNasc(
				Integer.parseInt(JOptionPane.showInputDialog("Insira o dia do seu nascimento:")),
				Integer.parseInt(JOptionPane.showInputDialog("Insira o mês do seu nascimento:")),
				Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do seu nascimento:")));

		Cliente c1 = new Cliente(cd1, data_nasc, t1, e1);

		System.out.println(c1);

	}

}
