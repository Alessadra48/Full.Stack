//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
//de 2 dígitos, etcétera (hasta 5 dígitos).
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Pedir al usuario el tamaño del vector
        System.out.print("Introduzca el tamaño del vector: ");
        int n = leer.nextInt();

        // Crear el vector de tamaño n
        int[] vector = new int[n];

        // Rellenar el vector con valores aleatorios entre 1 y 99999
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999) + 1;
        }

        // Mostrar el vector
        System.out.println("El vector es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        // Contabilizar los números de 1, 2, 3, 4 y 5 dígitos
        int[] digitos = new int[6];
        for (int i = 0; i < n; i++) {
            int numDigitos = contarDigitos(vector[i]);
            digitos[numDigitos]++;
        }

        // Mostrar el resultado de la contabilización
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hay " + digitos[i] + " números de " + i + " dígito(s).");
        }
    }

    // Método para contar los dígitos de un número
    public static int contarDigitos(int num) {
        int contador = 0;
        while (num != 0) {
            num /= 10;
            contador++;
        }
        return contador;
    }
}

