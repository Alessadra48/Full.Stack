//Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
//Math.sqrt()
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        System.out.println("El doble de " + numero + " es " + doble);
        System.out.println("El triple de " + numero + " es " + triple);
        System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
    }
}
