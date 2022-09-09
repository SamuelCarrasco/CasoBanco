package TareaTaller1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class CuentaBancaria {

	private String numCuenta;
	private double saldo;
	private Date fechaApertura;

	private Cliente cliente;

	public String getNumCuenta() {
		return this.numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public CuentaBancaria(String numCuenta, double saldo, Date fechaApertura, Cliente cliente) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
		this.cliente = cliente;
	}
	public abstract String getTipo();
}