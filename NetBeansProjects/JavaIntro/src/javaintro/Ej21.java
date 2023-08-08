//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 
//que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al 
//menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la 
//columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crear matriz M y matriz P
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];

        // Pedir valores de la matriz M por teclado
        System.out.println("Ingrese los valores de la matriz M de 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = input.nextInt();
            }
        }

        // Pedir valores de la matriz P por teclado
        System.out.println("Ingrese los valores de la matriz P de 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                P[i][j] = input.nextInt();
            }
        }

        // Buscar la submatriz P en la matriz M
        boolean encontrada = false;
        int fila = -1;
        int columna = -1;
        for (int i = 0; i <= 7; i++) { // Recorrer filas de la matriz M
            for (int j = 0; j <= 7; j++) { // Recorrer columnas de la matriz M
                boolean coincide = true;
                for (int k = 0; k < 3; k++) { // Recorrer filas de la matriz P
                    for (int l = 0; l < 3; l++) { // Recorrer columnas de la matriz P
                        if (P[k][l] != M[i + k][j + l]) {
                            coincide = false;
                            break;
                        }
                    }
                    if (!coincide) {
                        break;
                    }
                }
                if (coincide) {
                    encontrada = true;
                    fila = i;
                    columna = j;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        // Mostrar el resultado
        if (encontrada) {
            System.out.println("La matriz P está contenida dentro de la matriz M.");
            System.out.println("La submatriz P comienza en la fila " + (fila + 1) + " y en la columna " + (columna + 1) + " de la matriz M.");
        } else {
            System.out.println("La matriz P NO está contenida dentro de la matriz M.");
        }
    }
}
