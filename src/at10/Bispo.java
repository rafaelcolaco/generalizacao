package at10;

public class Bispo extends Peca {

	public Bispo(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bispo [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
