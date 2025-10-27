import model.*;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Resolver: Para Peluquería Canina: Modelar las siguientes entidades y sus relaciones en Java.
 * Mascota
 * Debe tener los siguientes atributos privados:
 * nombre, especie (perro, gato, etc.), raza, edad, nombre del dueño
 * <p>
 * Servicio
 * Debe tener los siguientes atributos privados: tipo de servicio (baño, corte de pelo, limpieza de oídos, etc.), descripción, duración estimada (en minutos),precio
 * <p>
 * Turno:
 * Debe tener los siguientes atributos: fecha y hora del turno, estado (Programado, Cancelado, Realizado)
 * Un turno está asociado a una única mascota. Un turno está asociado a un único servicio
 * <p>
 * Requisitos de implementación en Java:
 * Crear constructores en cada clase
 * Implementar métodos toString() y mostrarDatos() para cada clase
 * Crear Setters y Getters para todos los atributos
 * Crear objetos de cada clase desde el método main () de una clase principal (PeluqueriaCaninaApp).
 * Mostrar los datos de cada objeto utilizando el método mostrarDatos().
 * Cada clase tendrá un id que se autoincrementará.
 * Especie , Tipo de servicio y  Estado son Enumeraciones
 */

public class Main {

	public static final Logger log =
			Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
    Mascota[] mascotas = CargaDatos.cargarMascotas();
    Servicio[] servicios = CargaDatos.cargarServicios();
    Turno[] turnos = CargaDatos.cargarTurnos(mascotas, servicios);

  }
}