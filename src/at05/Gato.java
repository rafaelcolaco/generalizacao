package at05;

public class Gato extends Mamifero {

	public Gato(boolean vertebrado, boolean quadrupede, String mia) {
		super(vertebrado, quadrupede);
		setMia(mia);
	}
	
	private String mia;

	public String getMia() {
		return mia;
	}

	public void setMia(String mia) {
		this.mia = mia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [Late=");
		builder.append(mia);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
