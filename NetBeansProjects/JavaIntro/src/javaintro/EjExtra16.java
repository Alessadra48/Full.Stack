//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
//las personas ingresadas por teclado e indique si son mayores o menores de edad. 
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese la cantidad de personas: ");
            n = sc.nextInt();
        } while (n <= 0);

        String[] nombres = new String[n];
        int[] edades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = sc.nextInt();

            String mensaje = edades[i] >= 18 ? "mayor" : "menor";
            System.out.println(nombres[i] + " es " + mensaje + " de edad.");

            System.out.print("¿Desea seguir ingresando personas? (Si/No): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("No")) {
                break;
            }
        }

        System.out.println("\nDatos de las personas ingresadas:");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - " + edades[i] + " años");
        }
    }
}

