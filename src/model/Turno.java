package model;

import java.util.Date;

public class Turno { // tiene que estar asociado a una sola mascota y a un solo servicio

	// atributos
  private int id;
  private static int idCount;
	private Mascota mascota;
	public Servicio servicio;
	public String fechaHora;
	public Estado estado;

  public static final int MAX_TURNOS_DIARIOS = 10;

	// metodo constructor
	public Turno(Mascota mascota, Servicio servicio, String fechaHora, Estado estado) {
    this.id = ++idCount;
		this.mascota = mascota;
		this.servicio = servicio;
		this.fechaHora = fechaHora;
		this.estado = estado;
	}

	// setters and getters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}


  // metodos
	public String toStringTurno() {
		return
				"\n Nombre de mascota: " + this.mascota +
						"\n Tipo de servicio: " + this.servicio +
						"\n Fecha y hora:" + this.fechaHora +
						"\n Estado: " + this.estado;
	}

	public static double calcularIva(double precio){
		final double  iva=30;
		return (precio*iva)/100;
	}

	public void mostrarTurno() {
		System.out.println(toStringTurno());
	}

  public boolean esTurnoActivo() {
    return this.estado == Estado.PROGRAMADO;
  }

  public static void agruparPorEstado(Turno[] turnos) {
    int programados = 0;
    int realizados = 0;
    int cancelados = 0;

    for (Turno turno : turnos) {
      if (turno != null) {
        switch (turno.getEstado()) {
          case PROGRAMADO:
            programados++;
            break;
          case REALIZADO:
            realizados++;
            break;
          case CANCELADO:
            cancelados++;
            break;
        }
      }
    }
    System.out.println("Cantidad de turnos por estado:" +
                      "\nProgramados: " + programados +
                      "\nRealizados: " + realizados +
                      "\nCancelados: " + cancelados);
  }
}
