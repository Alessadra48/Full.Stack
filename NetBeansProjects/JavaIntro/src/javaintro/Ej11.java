//Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
//pantalla el siguiente menú:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
//programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
//seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale 
//del programa, caso contrario se vuelve a mostrar el menú.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir los dos números enteros positivos
        System.out.println("Ingrese el primero número entero positivo: ");
        int n1 = leer.nextInt();
        while (n1 <= 0) {
            System.out.print("El número ingresado no es positivo. Ingrese otro número: ");
            n1 = leer.nextInt();
        }
        System.out.println("Ingrese el segundo número entero positivo: ");
        int n2 = leer.nextInt();
        while (n2 <= 0) {
            System.out.print("El número ingresado no es positivo. Ingrese otro número: ");
            n2 = leer.nextInt();
        }
        // Mostrar el menú y realizar operaciones según la opción elegida
        char opcion;
        do {
            System.out.println("\n*** MENÚ DE OPERACIONES ***");
            System.out.println("1. Sumar los dos números");
            System.out.println("2. Restar el segundo número del primero");
            System.out.println("3. Multiplicar los dos números");
            System.out.println("4. Dividir el primero número por el segundo");
            System.out.println("5. Salir del programa");
            System.out.print("\nElija una opción (1-5): ");
            opcion = leer.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.println("La SUMA de " + n1 + " y " + n2 + " es: " + (n1 + n2));
                    break;
                case '2':
                    System.out.println("La RESTA de " + n1 + " y " + n2 + " es: " + (n1 - n2));
                    break;
                case '3':
                    System.out.println("La MULTIPLICACIÓN de " + n1 + " y " + n2 + " es: " + (n1 * n2));
                    break;
                case '4':
                    System.out.println("La DIVISIÓN de " + n1 + " y " + n2 + " es: " + ((double) n1 / n2));
                    break;
                case '5':
                    System.out.println("¿Está seguro que desea salir del programa (S/N)? ");

                    char confirmacion = leer.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    } else {
                        opcion = '0';
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != '5');
    }
}
