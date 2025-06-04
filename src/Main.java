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
		// creamos objetos (recordar la cantidad de argumentos que pide el constructor)
		Mascota mascota1 = new Mascota("Mochi", 4, Especie.GATO, "Siamés", "Juli");
		Mascota mascota2 = new Mascota("Kuki", 6, Especie.GATO, "Persa", "scoops");
		Mascota mascota3 = new Mascota("Blacky", 3, Especie.PERRO, "Mestizo", "Ara");
		Mascota mascota4 = new Mascota("Amelia", 7, Especie.PERRO, "Corgi", "María");
		Mascota mascota5 = new Mascota("Pyon", 2, Especie.PATO, "Pekin", "Miyo");

		Servicio servicio1 = new Servicio(mascota1, TipoServicio.BAÑO, "Baño completo", 35, 5000);
		Servicio servicio2 = new Servicio(mascota2, TipoServicio.CORTEDEPELO, "Corte parejo de pelaje", 20, 4500);
		Servicio servicio3 = new Servicio(mascota3, TipoServicio.LIMPIEZADEOIDOS, "Limpieza de oídos", 20, 3800);
		Servicio servicio4 = new Servicio(mascota4, TipoServicio.CORTEDEPELO, "Corte de pelo corto", 18, 4200);
		Servicio servicio5 = new Servicio(mascota5, TipoServicio.LIMPIEZADEOIDOS, "Limpieza de oídos", 20, 3800);

		Turno turno1 = new Turno(mascota1, servicio1, "5/22/2025 21:00", Estado.REALIZADO);
		Turno turno2 = new Turno(mascota2, servicio2, "8/18/2025 21:00", Estado.PROGRAMADO);
		Turno turno3 = new Turno(mascota3, servicio3, "6/29/2025 21:00", Estado.PROGRAMADO);
		Turno turno4 = new Turno(mascota4, servicio4, "3/14/2025 21:00", Estado.REALIZADO);
		Turno turno5 = new Turno(mascota5, servicio5, "5/9/2025 21:00", Estado.CANCELADO);

		// crear arrays
		Mascota[] arrayMascota = new Mascota[5];
		Turno[] arrayTurno = new Turno[10];

		public String buscarNombreDeMascota(Mascota[] arrayMascota){
			String nombreMascota;

			for(int i=0; i < arrayMascota.length; i++){

			}
			return nombreMascota;
		}

	}
}