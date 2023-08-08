//Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
//muestre la suma de sus elementos.
package javaintro;

import java.util.Random;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra22 {

    public static void main(String[] args) {
        int n = 3; // Cantidad de filas
        int m = 4; // Cantidad de columnas
        int[][] matriz = new int[n][m];

        // Relleno de la matriz con valores aleatorios
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rnd.nextInt(10); // Valores aleatorios entre 0 y 9
            }
        }

        // Cálculo de la suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }

        // Impresión de la matriz y la suma de sus elementos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}
