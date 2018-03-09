
public class Imovel {

	public double preco;
	public String endereco;
	
	public Imovel() {
		
	}
	
	public Imovel(double preco, String endereco) {
		super();
		this.preco = preco;
		this.endereco = endereco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
