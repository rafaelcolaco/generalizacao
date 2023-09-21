package at05;

public class Animal {
	
	public Animal(boolean vertebrado) {
		setVertebrado(vertebrado);
	}
	
	private boolean vertebrado;

	public boolean isVertebrado() {
		return vertebrado;
	}

	public void setVertebrado(boolean vertebrado) {
		this.vertebrado = vertebrado;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [vertebrado=");
		builder.append(vertebrado);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
