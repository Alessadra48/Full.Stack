package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class svAlumno {
    public void crearAlumno() {
        Scanner scanner = new Scanner(System.in);
        ArrayList Alumno = new ArrayList<>();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        ArrayList<Integer> notas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            int nota = scanner.nextInt();
            notas.add(nota);
        }
        Alumno alumno = new Alumno(nombre, notas);
        Alumno.add(alumno);
        scanner.nextLine(); // Consumir el salto de línea después del último nextInt()
        System.out.print("¿Desea crear otro alumno? (S/N): ");
        String opcion = scanner.nextLine();
        if (opcion.equalsIgnoreCase("S")) {
            crearAlumno();
        }
    }

    public double notaFinal(String nombre) {
        for (Alumno alumno : Alumno) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                ArrayList<Integer> notas = alumno.getNotas();
                int suma = 0;
                for (int nota : notas) {
                    suma += nota;
                }
                double promedio = (double) suma / notas.size();
                return promedio;
            }
        }
        return -1; // Retornar -1 si el alumno no está en la lista
    }
}
