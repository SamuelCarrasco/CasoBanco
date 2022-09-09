package TareaTaller1;

import java.util.Date;

public class CuentaCorriente extends CuentaBancaria {
	private String lineaSobreGiro;

	public String getTipo(){
		return "CuentaCorriente";
	}

	public CuentaCorriente(String numCuenta, double saldo, Date fechaApertura, Cliente cliente) {
		super(numCuenta, saldo, fechaApertura, cliente);
	}

	public String getLineaSobreGiro() {
		return this.lineaSobreGiro;
	}

	public void setLineaSobreGiro(String lineaSobreGiro) {
		this.lineaSobreGiro = lineaSobreGiro;
	}
}