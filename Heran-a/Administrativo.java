
public class Administrativo extends Assistente{
	
	public String turno;
	public double salarioAdministrativo;
	
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String nome, int cpf, double salario, int matricula, String turno) {
		super(nome, cpf, salario, matricula);
		this.turno = turno;
	} 
	
	{
	
	if (turno == "noturno") {
		salarioAdministrativo = super.salario+100;
		
	} else {
		salarioAdministrativo = super.salario;
	}

}
}