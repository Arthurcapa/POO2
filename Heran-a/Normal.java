import javax.swing.JOptionPane;


public class Normal extends Ingresso{

	public Normal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Normal(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
		
		public void imprime() {
			JOptionPane.showMessageDialog(null, "Ingresso normal.");
		}
}
