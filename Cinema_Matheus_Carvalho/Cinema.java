package Cinema_Matheus_Carvalho;

public class Cinema {
	//atb
	private String nome;
	private String endereco;
	Cinema() {
		
	}
	Cinema(String nm,  String end) {
		this.setNome(nm);
		this.setEndereco(end);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
