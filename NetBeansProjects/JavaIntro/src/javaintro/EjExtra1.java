//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir el tiempo en minutos al usuario
        System.out.print("Ingrese un tiempo en minutos: ");
        int tiempoMinutos = leer.nextInt();

        // Calcular los días, horas y minutos equivalentes
        int dias = tiempoMinutos / (24 * 60);
        int horas = (tiempoMinutos % (24 * 60)) / 60;
        int minutos = tiempoMinutos % 60;

        // Mostrar el resultado
        System.out.println(tiempoMinutos + " minutos equivalen a:");
        System.out.println(dias + " día(s), " + horas + " hora(s) y " + minutos + " minuto(s).");
    }
}
