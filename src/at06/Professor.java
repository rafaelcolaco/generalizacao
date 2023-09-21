package at06;

public class Professor extends Pessoa {

	public Professor(int codigo, String nome, String endereco,int matricula) {
		super(codigo, nome, endereco);
		setMatricula(matricula);
		
	}
	
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [matricula=");
		builder.append(matricula);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
