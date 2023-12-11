package Cinema_Matheus_Carvalho;

public class Lanchonete {
	private Comida lanche;
	private float preco;
	
	Lanchonete() {
		
	}
	Lanchonete(Comida lanche, float preco) {
		this.lanche = lanche;
		this.preco = preco;
	}

	public Comida getLanche() {
		return lanche;
	}

	public void setLanche(Comida lanche) {
		this.lanche = lanche;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void pagarLanche() {
		
	}

}
