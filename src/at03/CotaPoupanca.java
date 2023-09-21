package at03;

public class CotaPoupanca extends Conta {

	public CotaPoupanca(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
		setSaldoPoupanca(saldo);
		
	}
	
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public void depositoPoupanca(double valor) {
		if(valor != 0)
			setSaldoPoupanca(getSaldoPoupanca()+valor);
	}
	
	public void saquePoupanca(double valor) {
		if(valor <= getSaldoPoupanca())
			setSaldoPoupanca(getSaldoPoupanca()-valor);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CotaPoupanca [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", getBanco()=");
		builder.append(getBanco());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroConta()=");
		builder.append(getNumeroConta());
		builder.append("]");
		return builder.toString();
	}
}
