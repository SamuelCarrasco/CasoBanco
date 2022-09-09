package TareaTaller1;

import java.util.ArrayList;
import TareaTaller1.CuentaBancaria;

public   class Sucursal {
	private String codSucursal;
	private String codPostal;

	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public String getCodSucursal() {
		return this.codSucursal;
	}

	public void setCodSucursal(String codSucursal) {
		this.codSucursal = codSucursal;
	}

	public String getCodPostal() {
		return this.codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public Sucursal(String codSucursal, String codPostal) {
		throw new UnsupportedOperationException();
	}

}