package at07;

public class Ambiente {
	
	public Ambiente(float area) {
		setArea(area);
	}
	
	private float area;

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ambiente [area=");
		builder.append(area);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
