package at04;

public class Veiculo {
	
	public Veiculo(boolean motor) {
		setMotor(motor);
	}
	
	private boolean motor;
	
	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
