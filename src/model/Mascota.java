package model;

public class Mascota {

	// atributos
	private int id;
	private static int idCount;
	private String nombre;
	private int edad;
	private Especie especie;
	private String raza;
	private String duenio;


	// metodo constructor
	public Mascota(String nombre, int edad, Especie especie, String raza, String duenio) {
		this.id = ++idCount;
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
		this.raza = raza;
		this.duenio = duenio;
	}

	// setters and getters para cada atributo
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}


	// metodos
	@override
	public String toStringMascota() {
		return
				"\n Nombre de mascota: " + this.nombre +
						"\n Edad: " + this.edad +
						"\n Especie " + this.especie +
						"\n Raza: " + this.raza +
						"\n Dueño: " + this.duenio;
	}

	public void mostrarMascota() {
		System.out.println(toStringMascota());
	}
}
