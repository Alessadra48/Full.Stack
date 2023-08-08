//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que 
//una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada 
//de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej19 {

    public static void main(String[] args) {
        // Crear una matriz de ejemplo
        int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}};

        // Comprobar si la matriz es anti simétrica
        boolean esAntiSimetrica = comprobarAntiSimetria(matriz);

        // Mostrar el resultado
        if (esAntiSimetrica) {
            System.out.println("La matriz es anti simétrica");
        } else {
            System.out.println("La matriz NO es anti simétrica");
        }
    }

    // Método para comprobar si una matriz es anti simétrica
    public static boolean comprobarAntiSimetria(int[][] matriz) {
        // Comprobar si la matriz es cuadrada
        if (matriz.length != matriz[0].length) {
            return false;
        }

        // Comprobar si la matriz es igual a su traspuesta cambiada de signo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

}

