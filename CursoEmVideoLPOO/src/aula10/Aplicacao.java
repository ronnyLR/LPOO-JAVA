package aula10;

public class Aplicacao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		testando p5 = new testando();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		p5.setNome("Boulos");
		
		
		p1.setSexo("M");
		p4.setSexo("F");
		
		p2.setIdade(18);
		
		p2.setCurso("Informatica");
		p3.setSalario(2500.75);
		p4.setSetor("Estoque");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());

	}

}
