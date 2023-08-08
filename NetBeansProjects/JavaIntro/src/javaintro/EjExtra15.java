//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
//matemática y deben devolver sus resultados para imprimirlos en el main.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir los dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        // Pedir la operación a realizar
        System.out.println("Ingrese la operación a realizar: ");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        int opcion = sc.nextInt();

        // Realizar la operación correspondiente
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        // Mostrar el resultado de la operación
        System.out.println("El resultado de la operación es: " + resultado);

        sc.close();
    }

    // Función para sumar dos números
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Función para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Función para multiplicar dos números
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Función para dividir dos números
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}

