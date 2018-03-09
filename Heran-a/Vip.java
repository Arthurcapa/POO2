import javax.swing.JOptionPane;


public class Vip extends Ingresso {
	
	public double ValorVip = super.valor+100;
	
	public Vip(double valor) {
		super(valor);
	}
	
	public Vip() {
		super();
	}
	

	public double getValorVip() {
		return ValorVip;
	}

	public void setValorVip(double valorVip) {
		ValorVip = valorVip;
	}
	@Override
	public void imprimeValor() {
		JOptionPane.showMessageDialog(null, ValorVip+" reais");
	}
}
