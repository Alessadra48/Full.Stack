//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
//y la cantidad de números impares. Al igual que en el ejercicio anterior los números 
//negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contador = 0, pares = 0, impares = 0;

        while (true) {
            System.out.print("Ingrese un número entero (0 para salir): ");
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                continue;
            }

            contador++;

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (num % 5 == 0) {
                break;
            }
        }

        System.out.println("Cantidad de números leídos: " + contador);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
