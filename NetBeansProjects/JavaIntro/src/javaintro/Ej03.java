//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en 
//Java.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.println("La frase en mayuscula es: " + frase.toUpperCase());
        System.out.println("La frase en minuscula es: " + frase.toLowerCase());

    }
}
