import javax.swing.JOptionPane;


public class Velho extends Imovel{
	
	public double PrecoVelho = super.preco*0.85;
	public Velho(double preco, String endereco) {
		super(preco, endereco);
	}

	public Velho() {
		super();
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Preço: "+PrecoVelho);
	}
	public double getPrecoVelho() {
		return PrecoVelho;
	}

	public void setPrecoVelho(double precoVelho) {
		PrecoVelho = precoVelho;
	}

}
