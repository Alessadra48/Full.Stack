//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una temperatura en grados Celsius: ");
        double celsius = leer.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(celsius + " grados Celsius son equivalentes a " + fahrenheit + " grados Fahrenheit.");
    }
}
