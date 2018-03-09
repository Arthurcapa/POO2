
public class Tecnico extends Assistente {
	
	public double salarioTecnico = super.salario+100;
	
	public Tecnico() {
		super();
	}

	public Tecnico(String nome, int cpf, double salario, int matricula) {
		super(nome, cpf, salario, matricula);
	}

}
