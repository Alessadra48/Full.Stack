//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
//dos. El programa deberá después mostrar el resultado de la suma
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();
        int suma = numero + numero2;
        System.out.println("La sumas de ambos números es: " + suma);
    }

}
