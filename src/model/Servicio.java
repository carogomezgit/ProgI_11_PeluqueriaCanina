package model;

public class Servicio {

	// atributos
  private int id;
  private static int idCount;
	private TipoServicio tipoServicio;
	private String descripcion;
	private double duracion;
	private double precio;

  public static final double ivaPorcentaje = 0.21;

	// metodo constructor
	public Servicio(TipoServicio tipoServicio, String descripcion, double duracion, double precio) {
    this.id = ++idCount;
		this.tipoServicio = tipoServicio;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.precio = precio;
	}

	// setters and getters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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
	public String toStringServicio() {
		return
        "\n ID Servicio: " + this.id +
            "\n Tipo de servicio: " + this.tipoServicio +
            "\n Descripción: " + this.descripcion +
            "\n Duración: " + this.duracion + " min." +
            "\n Precio: $" + this.precio;
	}

	public void mostrarServicio() {
		System.out.println(toStringServicio());
	}

  public static double calcularPrecioConIva(double precio) {
    return precio * (1 + ivaPorcentaje);
  }

  public boolean esServicioLargo() {
    return this.duracion > 60;
  }
}
