import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("1-Funcionario\n2-Ingresso\n3-Imovel"));
		switch(escolha) {
		case 1:
		
		Tecnico tecnico = new Tecnico(JOptionPane.showInputDialog("Digite o nome"), Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o salario")), Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula")));
		
		Administrativo administrativo = new Administrativo(JOptionPane.showInputDialog("Digite o nome"), Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o salario")), Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula")),JOptionPane.showInputDialog("Digite o turno"));
		
		JOptionPane.showMessageDialog(null, "Nome: "+administrativo.getNome()+" Matricula: "+administrativo.getMatricula()
				+"\nNome: "+tecnico.getNome()+" Matricula: "+tecnico.getMatricula());
		break;
		case 2:
			int tipoingresso =Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de Ingresso?\n1-Normal\n2-Vip"));
			switch (tipoingresso) {
			case 1:
				JOptionPane.showMessageDialog(null, "Ingresso normal selecionado");
				Normal normal = new Normal();
				normal.imprimeValor();
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Ingresso VIP selecionado");
				int tipocamarote =Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de Camarote?\n1-Inferior\n2-Superior"));
				switch(tipocamarote) {
				case 1:
					JOptionPane.showMessageDialog(null, "Camarote inferior selecionado");
					CamaroteInferior inferior = new CamaroteInferior();
					inferior.imprimeValor();
				break;
				case 2:
					JOptionPane.showMessageDialog(null, "Camarote superior selecionado");
					CamaroteSuperior superior = new CamaroteSuperior();
					superior.imprimeValor();
				break;
				default:
				JOptionPane.showMessageDialog(null, "Comando inválido");	
				}
			break;
			default:
			JOptionPane.showMessageDialog(null, "Comando inválido");
			}
		break;
		case 3:
		int tipoimovel =Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de Imovel?\n1-Novo\n2-Velho"));
		
		switch(tipoimovel) {
		case 1:
		Novo novo = new Novo(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do imovel: ")),JOptionPane.showInputDialog("Digite o endereço"));
		JOptionPane.showMessageDialog(null, "Preço: "+novo.getPrecoNovo());
		break;
		case 2:
		Velho velho = new Velho(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do imovel: ")),JOptionPane.showInputDialog("Digite o endereço"));
		JOptionPane.showMessageDialog(null, "Preço: "+velho.getPrecoVelho());
		break;
		default:
		JOptionPane.showMessageDialog(null, "Comando inválido");
		}
		break;
		}
	}

}
