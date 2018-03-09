import javax.swing.JOptionPane;


public class Ingresso {
	
	public Ingresso(double valor) {
		this.valor = valor;
	}
	
	public Ingresso() {
		
	}
	public double valor=100;
	
	public void imprimeValor() {
		JOptionPane.showMessageDialog(null, valor+" reais");
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
