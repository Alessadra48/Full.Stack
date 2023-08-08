//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
//por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
//primo, sino false.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = input.nextInt();
        input.close();

        boolean esPrimo = esNumeroPrimo(num);

        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }

    public static boolean esNumeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
