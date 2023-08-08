//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
//pantalla.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Bienvenido " + nombre);
    }
}
