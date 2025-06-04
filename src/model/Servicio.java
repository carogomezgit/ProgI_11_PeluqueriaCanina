package model;

public class Servicio {

	// atributos
	private Mascota mascota;
	private TipoServicio tipoServicio;
	private String descripcion;
	private double duracion;
	private double precio;

	// metodo constructor
	public Servicio(Mascota mascota, TipoServicio tipoServicio, String descripcion, double duracion, double precio) {
		this.mascota = mascota;
		this.tipoServicio = tipoServicio;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.precio = precio;
	}

	// setters and getters
	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	// metodos
	@override
	public String toStringServicio() {
		return
				"\n Nombre de mascota: " + this.mascota +
						"\n Tipo de servicio: " + this.tipoServicio +
						"\n Descripción: " + this.descripcion +
						"\n Duración: " + this.duracion +
						"\n Precio: $" + this.precio;
	}

	public void mostrarServicio() {
		System.out.println(toStringServicio());
	}

}
