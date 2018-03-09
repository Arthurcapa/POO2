import javax.swing.JOptionPane;


public class CamaroteInferior extends Vip {
	public String localizacao;
	
	public CamaroteInferior() {
		super();
	}
	
	public CamaroteInferior(double valor, String localizacao) {
		super(valor);
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Localização: "+this.localizacao);
	}
}
