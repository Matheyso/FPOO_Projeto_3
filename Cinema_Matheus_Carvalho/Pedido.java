package Cinema_Matheus_Carvalho;

public class Pedido {
	private String lanche;
	private String pipoca;
	private String doce;
	Pedido() {

	}
	Pedido(String lanche, String pipoca, String doce) {
		this.lanche = lanche;
		this.pipoca = pipoca;
		this.doce = doce;
	}
	public String getLanche() {
		return lanche;
	}
	public void setLanche(String lanche) {
		this.lanche = lanche;
	}
	public String getPipoca() {
		return pipoca;
	}
	public void setPipoca(String pipoca) {
		this.pipoca = pipoca;
	}
	public String getDoce() {
		return doce;
	}
	public void setDoce(String doce) {
		this.doce = doce;
	}
	
	public void somarPrecoTotal(){
		
	}

}
