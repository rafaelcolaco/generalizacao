package at06;

public class Aluno extends Pessoa {

	public Aluno(int codigo, String nome, String endereco, String disciplina) {
		super(codigo, nome, endereco);
		setDisciplina(disciplina);
	}
	
	private String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [disciplina=");
		builder.append(disciplina);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
