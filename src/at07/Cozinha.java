package at07;

public class Cozinha extends Ambiente {

	public Cozinha(float area, boolean microondas) {
		super(area);
		setMicroondas(microondas);
		
	}
	
	private boolean microondas;

	public boolean isMicroondas() {
		return microondas;
	}

	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cozinha [microondas=");
		builder.append(microondas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
