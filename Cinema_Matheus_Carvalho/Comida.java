package Cinema_Matheus_Carvalho;

public class Comida {
	private String nome;
	private double preco;
	Comida() {
		
	}
	Comida(String nome, double prc) {
		this.preco = prc;
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


}
