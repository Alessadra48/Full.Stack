//Escriba un programa en el cual se ingrese un valor limite positivo, y a continuación 
//solicite números al usuario hasta que la suma de los números introducidos supere el 
//limite inicial.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor límite:");
        int limite = leer.nextInt();
        int suma = 0;
        int contador = 0;

        while (suma <= limite) {
            System.out.println("Ingrese un número:");
            int numero = leer.nextInt();
            suma += numero;
            contador++;
        }

        System.out.println("Se ingresaron " + contador + " números para superar el límite de " + limite);
        leer.close();
    }

}
