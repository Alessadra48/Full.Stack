package MAIN;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ale y Choy
 */
public class Ej10 {

    public static void main(String[] args) {
        // Declaración e inicialización del arreglo A
        double[] A = new double[50];
        Random rand = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextDouble() * 100; // Números aleatorios entre 0 y 100
        }

        // Mostrar el arreglo A sin ordenar
        System.out.println("Arreglo A sin ordenar:");
        System.out.println(Arrays.toString(A));

        // Ordenar el arreglo A de menor a mayor
        Arrays.sort(A);

        // Copiar los primeros 10 elementos de A al arreglo B
        double[] B = Arrays.copyOfRange(A, 0, 10);

        // Rellenar los últimos 10 elementos de B con el valor 0.5
        Arrays.fill(B, 10, B.length, 0.5);

        // Mostrar el arreglo A ordenado y el arreglo B combinado
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(A));
        System.out.println("Arreglo B combinado:");
        System.out.println(Arrays.toString(B));
    }
}
