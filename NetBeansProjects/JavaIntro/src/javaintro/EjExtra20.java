//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
package javaintro;

import java.util.Random;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra20 {

    public static void main(String[] args) {
        int n = 10;
        int[] vector = new int[n];
        llenarVectorAleatorio(vector);
        imprimirVector(vector);
    }

    public static void llenarVectorAleatorio(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        }
    }

    public static void imprimirVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

