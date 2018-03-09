import javax.swing.JOptionPane;


public class Funcionario {
	public String nome;
	public int cpf;
	public double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, int cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;		
	}
	
	public void exibeDados() {
		JOptionPane.showMessageDialog(null, "Nome: "+nome+" Cpf: "+cpf+" Salário: "+salario); 
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
