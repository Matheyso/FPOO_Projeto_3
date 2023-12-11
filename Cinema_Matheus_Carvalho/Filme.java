package Cinema_Matheus_Carvalho;

public class Filme {
	private String nome;
	private int classificacao;
	
	Filme() {
		
	}
	Filme(String nome, int classi) {
		this.nome = nome;
		this.classificacao = classi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}


}
