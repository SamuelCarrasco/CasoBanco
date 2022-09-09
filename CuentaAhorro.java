package TareaTaller1;

import java.util.Date;

public class CuentaAhorro extends CuentaBancaria {

	public String getTipo(){
		return "CuentaAhorro";
	}
	private double reajusteAnual;

	public CuentaAhorro(String numCuenta, double saldo, Date fechaApertura, Cliente cliente) {
		super(numCuenta, saldo, fechaApertura, cliente);
	}

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}
}