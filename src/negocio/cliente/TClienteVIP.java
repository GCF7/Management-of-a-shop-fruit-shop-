package negocio.cliente;

public class TClienteVIP extends TCliente {
	
	private int codTarjetaOro;

	public TClienteVIP(int id, String nombre, int telefono, String direccion,
			Boolean activo, String dni, int codTarjetaOro) {
		super(id,nombre,telefono,direccion,activo,dni);
		this.codTarjetaOro = codTarjetaOro;
	}

	public TClienteVIP(String nombre, int telefono, String direccion,
			boolean activo, String dni, int codTarjetaOro) {
		super(nombre,telefono,direccion,activo,dni);
		this.codTarjetaOro = codTarjetaOro;
	}

	public int getCodTarjetaOro() {
		return this.codTarjetaOro;
	}

	public void setCodTarjetaOro(int codTarjetaOro) {
		this.codTarjetaOro = codTarjetaOro;
	}
	
}