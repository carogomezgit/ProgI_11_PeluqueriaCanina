package model;

public class CargaDatos {
  // crear arrays

  Turno[] arrayTurno = new Turno[10];


  // creamos objetos y agregamos a arrays (recordar la cantidad de argumentos que pide el constructor)
  public static Mascota[] cargarMascotas() {
    Mascota[] mascotas = new Mascota[5];
    mascotas[0] = new Mascota("Mochi", 4, Especie.GATO, "Siamés", "Juli");
    mascotas[1] = new Mascota("Kuki", 6, Especie.GATO, "Persa", "scoops");
    mascotas[2] = new Mascota("Blacky", 3, Especie.PERRO, "Mestizo", "Ara");
    mascotas[3] = new Mascota("Amelia", 7, Especie.PERRO, "Corgi", "María");
    mascotas[4] = new Mascota("Pyon", 2, Especie.PATO, "Pekin", "Miyo");
    return mascotas;
  }

  public static Servicio[] cargarServicios() {
    Servicio[] servicios = new Servicio[5];
    servicios[0] = new Servicio(TipoServicio.BAÑO, "Baño completo", 35, 5000);
    servicios[1] = new Servicio(TipoServicio.CORTEDEPELO, "Corte parejo de pelaje", 20, 4500);
    servicios[2] = new Servicio(TipoServicio.LIMPIEZADEOIDOS, "Limpieza de oídos", 20, 3800);
    servicios[3] = new Servicio(TipoServicio.CORTEDEPELO, "Corte de pelo corto", 18, 4200);
    servicios[4] = new Servicio(TipoServicio.LIMPIEZADEOIDOS, "Limpieza de oídos", 20, 3800);
    return servicios;
  }

  public static Turno[] cargarTurnos(Mascota[] mascotas, Servicio[] servicios) {
    Turno[] turnos = new Turno[10];
    turnos[0] = new Turno(mascotas[0], servicios[0], "5/22/2025 21:00", Estado.REALIZADO);
    turnos[1] = new Turno(mascotas[1], servicios[1], "8/18/2025 21:00", Estado.PROGRAMADO);
    turnos[2] = new Turno(mascotas[2], servicios[2], "6/29/2025 21:00", Estado.PROGRAMADO);
    turnos[3] = new Turno(mascotas[3], servicios[3], "3/14/2025 21:00", Estado.REALIZADO);
    turnos[4] = new Turno(mascotas[4], servicios[4], "5/9/2025 21:00", Estado.CANCELADO);
    turnos[5] = new Turno(mascotas[0], servicios[0], "5/22/2025 21:00", Estado.REALIZADO);
    turnos[6] = new Turno(mascotas[1], servicios[1], "8/18/2025 21:00", Estado.PROGRAMADO);
    turnos[7] = new Turno(mascotas[2], servicios[2], "6/29/2025 21:00", Estado.PROGRAMADO);
    turnos[8] = new Turno(mascotas[3], servicios[3], "3/14/2025 21:00", Estado.REALIZADO);
    turnos[9] = new Turno(mascotas[4], servicios[4], "5/9/2025 21:00", Estado.CANCELADO);
    return turnos;
  }
}
