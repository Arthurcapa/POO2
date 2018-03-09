import javax.swing.JOptionPane;


public class Novo extends Imovel{

	public double PrecoNovo = super.preco+1000;
	
	public Novo() {
		super();
	}
	
	public Novo(double preco, String endereco) {
		super(preco, endereco);
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Preço: "+PrecoNovo);
	}
	
	public double getPrecoNovo() {
		return PrecoNovo;
	}

	public void setPrecoNovo(double precoNovo) {
		PrecoNovo = precoNovo;
	}
}
