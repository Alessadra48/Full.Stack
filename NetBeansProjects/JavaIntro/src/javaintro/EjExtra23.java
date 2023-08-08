//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
//que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
//20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
//será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
//rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
//por pantalla la sopa de letras creada.
package javaintro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        char[][] sopa = new char[20][20];
        String[] palabras = new String[5];
        int fila = rnd.nextInt(20); // Fila aleatoria para colocar las palabras
        int col = 0; // Columna inicial para colocar las palabras

        // Lectura de las palabras ingresadas por el usuario
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese palabra " + (i + 1) + ": ");
            palabras[i] = sc.next().toUpperCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.print("Ingrese palabra " + (i + 1) + ": ");
                palabras[i] = sc.next().toUpperCase();
            }
        }

        // Colocación de las palabras en la fila seleccionada aleatoriamente
        for (int i = 0; i < 5; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                sopa[fila][col] = palabra.charAt(j);
                col++;
            }
            // Espacio entre palabras
            col++;
        }

        // Relleno de la sopa de letras con números aleatorios
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (rnd.nextInt(10) + '0');
                }
            }
        }

        // Impresión de la sopa de letras
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}

