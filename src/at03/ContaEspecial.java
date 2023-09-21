package at03;

public class ContaEspecial extends Conta {

	public ContaEspecial(String banco, int agencia, int numeroConta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numeroConta, saldo);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
		
	}
	
	private int diasSemJuros;
	private double limite =  2000;
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
