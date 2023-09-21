package at05;


public class Repteis extends Animal {

	public Repteis(boolean vertebrado,boolean reproducaoSexuada) {
		super(vertebrado);
		setReproducaoSexuada(reproducaoSexuada);
	}
	
	private boolean reproducaoSexuada;

	public boolean isReproducaoSexuada() {
		return reproducaoSexuada;
	}

	public void setReproducaoSexuada(boolean reproducaoSexuada) {
		this.reproducaoSexuada = reproducaoSexuada;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Repteis [reproducaoSexuada=");
		builder.append(reproducaoSexuada);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
