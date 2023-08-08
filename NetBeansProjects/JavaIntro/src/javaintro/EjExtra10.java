//Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
//utilizar la función Math.random() de Java.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generar dos números aleatorios entre 0 y 10
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);

        int respuesta;

        do {
            // Mostrar la pregunta al usuario
            System.out.print("¿Cuánto es " + num1 + " x " + num2 + "? ");
            respuesta = sc.nextInt();

            // Verificar la respuesta del usuario
            if (respuesta == num1 * num2) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Respuesta incorrecta. Intente de nuevo.");
            }
        } while (respuesta != num1 * num2);

        sc.close();
    }
}
