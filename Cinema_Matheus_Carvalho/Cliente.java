package Cinema_Matheus_Carvalho;

public class Cliente {
	private String nome;
	private boolean docEst;
	private int idade;
	Cliente() {
		
	}
	Cliente(String nome, boolean docEst, int idd) {
		this.nome = nome;
		this.docEst = docEst;
		this.idade = idd;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isDocEst() {
		return docEst;
	}
	public void setDocEst(boolean docEst) {
		this.docEst = docEst;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void pagar() {
		
	}
	public void assistir() {
		
	}
	public void comer() {
		
	}
}
