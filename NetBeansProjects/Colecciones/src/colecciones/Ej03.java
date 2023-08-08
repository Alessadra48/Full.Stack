package colecciones;

import Servicios.svAlumno;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej03 {

    public static void main(String[] args) {
        svAlumno servicioAlumno = new svAlumno();
        servicioAlumno.crearAlumno();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombre = scanner.nextLine();
        double notaFinal = servicioAlumno.notaFinal(nombre);
        if (notaFinal != -1) {
            System.out.println("La nota final de " + nombre + " es " + notaFinal);
        } else {
            System.out.println("El alumno no está en la lista");
        }
    }
}

