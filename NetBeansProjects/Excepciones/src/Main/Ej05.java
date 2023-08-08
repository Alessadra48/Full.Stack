//Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
//carácter fallido como un intento
package Main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej05 {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(500) + 1;
// (int) 8(Math.random() * (vALOR fINAL-1)) + VALOR INICIAL); 
// vALOR INCIAL = 1
//VALOR FINAL = 500
        int intentos = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Adivina el número entre 1 y 500");

        while (true) {
            System.out.print("Introduce un número: ");
            String numero = leer.nextLine();

            try {
                int numeroIngresado = Integer.parseInt(numero);
                intentos++;

                if (numeroIngresado == numeroAleatorio) {
                    System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                    break;
                } else if (numeroIngresado < numeroAleatorio) {
                    System.out.println("El número a adivinar es mayor que " + numeroIngresado);
                } else {
                    System.out.println("El número a adivinar es menor que " + numeroIngresado);
                }
            } catch (NumberFormatException e) {
                System.out.println("Número no válido. Inténtalo de nuevo.");
                intentos++;
            }
        }

    }
}
