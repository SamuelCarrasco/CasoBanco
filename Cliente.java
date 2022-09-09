package TareaTaller1;

public class Cliente {
	private String nombre;
	private String rut;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Cliente(String nombre, String rut) {
		throw new UnsupportedOperationException();
	}
}