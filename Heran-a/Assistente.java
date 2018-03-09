import javax.swing.JOptionPane;


public class Assistente extends Funcionario {
	
	public int matricula;
	
	public Assistente(String nome, int cpf, double salario, int matricula) {
		super(nome, cpf, salario);
		this.matricula = matricula;
	}

	public Assistente() {
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	@Override
	public void exibeDados() {
		JOptionPane.showMessageDialog(null, "Nome: "+nome+" Cpf: "+cpf+" Salário: "+salario+" Matricula: "+matricula); 
	}
}
