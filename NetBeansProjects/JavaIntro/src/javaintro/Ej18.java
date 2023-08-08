//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se 
//obtiene cambiando sus filas por columnas (o viceversa).
package javaintro;

import java.util.Random;

/**
 *
 * @author Ale y Choy
 */
public class Ej18 {

    public static void main(String[] args) {
        // Crear la matriz de tamaño 4x4
        int[][] matriz = new int[4][4];

        // Rellenar la matriz con valores aleatorios entre 0 y 9
        Random rand = new Random();
        for (int i = 0;
                i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }

        // Mostrar la matriz original
        System.out.println(
                "Matriz original:");
        mostrarMatriz(matriz);

        // Obtener la traspuesta de la matriz
        int[][] traspuesta = obtenerTraspuesta(matriz);

        // Mostrar la matriz traspuesta
        System.out.println(
                "Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }

// Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para obtener la traspuesta de una matriz
    public static int[][] obtenerTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}
