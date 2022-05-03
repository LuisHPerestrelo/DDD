package Ex_37;

public class contabancaria {
	private String agencia; 
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private String numero;
	private double saldo;
	
	contabancaria(){
		
	}
	contabancaria(String ag, String num, double sal){
		this.agencia = ag;
		this.numero = num;
		this.saldo = sal;
	}

}
