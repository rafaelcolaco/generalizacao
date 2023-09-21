package at02;

public class VHS extends Midia {

	public VHS(int codigo, String descricao, String gravadora, float duracao,String titulo) {
		super(codigo, descricao, gravadora, duracao);
		setTitulo(titulo);
	}
	
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
