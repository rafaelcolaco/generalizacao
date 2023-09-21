package at05;

public class Mamifero extends Animal {

	public Mamifero(boolean vertebrado, boolean quadrupede) {
		super(vertebrado);
		setQuadrupede(quadrupede);
	}
	private boolean quadrupede;
	
	public boolean isQuadrupede() {
		return quadrupede;
	}
	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [quadrupede=");
		builder.append(quadrupede);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
