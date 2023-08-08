//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
//equivalente en romano.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entre 1 y 10
        System.out.println("Ingrese un número entre 1 y 10:");
        int numero = leer.nextInt();

        // Verificar que el número ingresado está dentro del rango permitido
        if (numero < 1 || numero > 10) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            // Calcular el equivalente en número romano
            String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String romano = unidades[numero];
            System.out.println("El equivalente en número romano es: " + romano);
        }

        leer.close();
    }
}
