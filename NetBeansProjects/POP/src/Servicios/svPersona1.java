
package Servicios;

import DateUtil.DateUtil;
import java.util.Date;
import java.util.Scanner;
import Entidades.Persona1;

/**
 *
 * @author Ale y Choy
 */
public class svPersona1 {
    DateUtil dt = new DateUtil();
    public static Persona1 crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento de la persona en formato dd/mm/yyyy:");
        String fechaString = scanner.nextLine();
        Date fechaNacimiento = DateUtil.convertirStringADate(fechaString);

        return new Persona1(nombre, fechaNacimiento);
    }

    public int calcularEdad(Date fechaNacimiento) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        if (fechaNacimiento.getMonth() > fechaActual.getMonth()
                || (fechaNacimiento.getMonth() == fechaActual.getMonth()
                        && fechaNacimiento.getDay() > fechaActual.getDay())) {
            edad--;
        }

        return edad;
    }

    public boolean menorQue(int edad,int calcularEdad) {
     edad = calcularEdad;
    if (edad< edad) {
        return true;
    } else {
        return false;
    }
}
    public void mostrarPersona(String nombre, Date fechaNacimiento, int calcularEdad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + DateUtil.convertirDateAString(fechaNacimiento));
        System.out.println("Edad: " + calcularEdad+ " años");
    }
} 

