//Crear un programa que dado un numero determine si es par o impar.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par");
        } else {
            System.out.println(numero + " es un número impar");
        }
    }
}

