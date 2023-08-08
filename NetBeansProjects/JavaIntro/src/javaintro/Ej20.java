//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
//El programa deberá comprobar que los números introducidos son correctos, es decir, 
//están entre el 1 y el 9.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int sumadiagonal1 = 0;
        int sumadiagonal2 = 0;
        int[] sumafila = new int[3];
        int[] sumacolumna = new int[3];
        boolean esMagico = true;

        // Pedir los valores de la matriz por teclado
        System.out.println("Ingrese los valores del cuadrado 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = leer.nextInt();
                // Verificar si el valor ingresado es válido
                if (valor < 1 || valor > 9) {
                    System.out.println("Error: debe ingresar valores entre 1 y 9");
                    return;
                }
                matriz[i][j] = valor;
            }
        }

        // Calcular la suma de cada fila, columna y diagonal
        for (int i = 0; i < 3; i++) {
            sumadiagonal1 += matriz[i][i];
            sumadiagonal2 += matriz[i][2 - i];
            for (int j = 0; j < 3; j++) {
                sumafila[i] += matriz[i][j];
                sumacolumna[j] += matriz[i][j];
            }
        }

        // Verificar si las sumas son iguales
        int sumavalida = sumafila[0];
        if (sumadiagonal1 != sumadiagonal2 || sumadiagonal1 != sumavalida || sumafila[1] != sumavalida
                || sumafila[2] != sumavalida || sumacolumna[1] != sumavalida || sumacolumna[2] != sumavalida) {
            esMagico = false;
        }

        // Mostrar el resultado
        if (esMagico) {
            System.out.println("La matriz ingresada es un cuadrado mágico");
        } else {
            System.out.println("La matriz ingresada NO es un cuadrado mágico");
        }
    }
}

