package model;

import java.util.Scanner;

public class Funciones {

  public static final Scanner sc = new Scanner(System.in);

  // funcion para contar mascotas por especie
  public static int contarPorEspecie(Mascota[] mascotas, Especie especie) {
    int contadorEspecies = 0;

    for (Mascota buscarEspecie : mascotas) {
      if (buscarEspecie.getEspecie() == especie) {
        contadorEspecies++;
      }
    }
    return contadorEspecies;
  }

  // funcion para buscar mascota por nombre
  public static void buscarMascotaPorNombre(Mascota[] mascotas) {
    System.out.println("Ingresa el nombre de la mascota a buscar:");
    String busquedaMascota = sc.nextLine();
    boolean encontrado = false;
    for (Mascota mascota : mascotas) {
      if (mascota.getNombre().equalsIgnoreCase(busquedaMascota)) {
        encontrado = true;
        System.out.println("Se ha encontrado la mascota: " + mascota.getNombre());
        mascota.mostrarMascota();
        break;
      }
    }
    if (!encontrado) {
      System.out.println("Mascota no encontrada.");
    }
  }

  // funcion para contar mascotas por especie
  public static void contarMascotasPorEspecie(Mascota[] mascotas) {
    int contadorPerros = 0;
    int contadorGatos = 0;
    int contadorPajaros = 0;
    int contadorConejos = 0;
    int contadorPatos = 0;

    for (int i = 0; i < mascotas.length; i++) {
      if (mascotas[i] != null && mascotas[i].getEspecie() == Especie.PERRO) {
        contadorPerros++;
      } else if (mascotas[i] != null && mascotas[i].getEspecie() == Especie.GATO) {
        contadorGatos++;
      } else if (mascotas[i] != null && mascotas[i].getEspecie() == Especie.PAJARO) {
        contadorPajaros++;
      } else if (mascotas[i] != null && mascotas[i].getEspecie() == Especie.CONEJO) {
        contadorConejos++;
      } else if (mascotas[i] != null && mascotas[i].getEspecie() == Especie.PATO) {
        contadorPatos++;
      }
    }
  }
}
