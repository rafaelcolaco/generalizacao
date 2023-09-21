package at01;

public class Pessoa {
	
	private String Nome;
	private String Endereco;
	
	public Pessoa(String nome,String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		if(nome != null)
			Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco != null)
			Endereco = endereco;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Nome=");
		builder.append(Nome);
		builder.append(", Endereco=");
		builder.append(Endereco);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
