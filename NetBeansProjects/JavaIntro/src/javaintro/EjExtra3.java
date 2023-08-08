//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase 
//String.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra3 {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese una letra
        System.out.println("Ingrese una letra:");
        String letra = leer.nextLine();

        // Convertir la letra ingresada a minúscula para simplificar la comparación
        letra = letra.toLowerCase();

        // Verificar si la letra ingresada es una vocal
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }

        leer.close();
    }
} 

