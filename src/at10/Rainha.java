package at10;

public class Rainha extends Peca {

	public Rainha(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rainha [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
