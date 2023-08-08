//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
//N, con los valores ingresados por el usuario.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = input.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = input.nextInt();
        }
        input.close();

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}
