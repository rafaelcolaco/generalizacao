package at10;

public class Rei extends Peca {

	public Rei(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rei [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
