import javax.swing.JOptionPane;


public class CamaroteSuperior extends Vip {
	
	public double valorSuperior = super.ValorVip+200;
	
	public CamaroteSuperior(double valor) {
		super(valor);
		
	}
	
	public CamaroteSuperior() {
		super();
		
	}
	
	public double getValorSuperior() {
		return valorSuperior;
	}

	public void setValorSuperior(double valorSuperior) {
		this.valorSuperior = valorSuperior;
	}
	@Override
	public void imprimeValor() {
		JOptionPane.showMessageDialog(null, valorSuperior+" reais");
	}
}
