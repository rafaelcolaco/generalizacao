package at08;

public class MilleniumFalcon extends Apolo11 {

	public MilleniumFalcon(double velocidadeMaxima, String tipoCombustivel,float hiperpropulsor) {
		super(velocidadeMaxima, tipoCombustivel);
		setHiperpropulsor(hiperpropulsor);
	}
	
	private float hiperpropulsor;

	public float getHiperpropulsor() {
		return hiperpropulsor;
	}

	public void setHiperpropulsor(float hiperpropulsor) {
		this.hiperpropulsor = hiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MilleniumFalcon [hiperpropulsor=");
		builder.append(hiperpropulsor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
