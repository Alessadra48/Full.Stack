//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida 
//al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
//numero y si se encuentra repetido.
package javaintro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        // Pedir al usuario el tamaño del vector
        System.out.print("Introduzca el tamaño del vector: ");
        int n = leer.nextInt();

        // Crear el vector de tamaño n
        int[] vector = new int[n];

        // Rellenar el vector con valores aleatorios entre 1 y 100
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(100) + 1;
        }

        // Mostrar el vector
        System.out.println("El vector es: " + Arrays.toString(vector));

        // Pedir al usuario el número a buscar
        System.out.print("Introduzca el número a buscar: ");
        int num = leer.nextInt();

        // Buscar el número en el vector y mostrar su posición
        boolean encontrado = false;
        int posicion = 0;
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                if (!encontrado) {
                    encontrado = true;
                    posicion = i;
                }
                contador++;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("El número " + num + " se encuentra en la posición " + posicion + " del vector.");
            if (contador > 1) {
                System.out.println("El número " + num + " se repite " + contador + " veces en el vector.");
            }
        } else {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }
}

