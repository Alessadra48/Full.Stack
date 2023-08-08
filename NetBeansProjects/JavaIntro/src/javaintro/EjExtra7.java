//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
//promedio de n números (n>0). El valor de n se solicitará al principio del programa y los 
//números serán introducidos por el usuario. Realice dos versiones del programa, una 
//usando el bucle “while” y otra con el bucle “do - while”.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = sc.nextInt();

        double numero, suma = 0, maximo = Double.NEGATIVE_INFINITY,
                minimo = Double.POSITIVE_INFINITY;
        int contador = 0;

        while (contador < n) {
            System.out.print("Ingrese un número: ");
            numero = sc.nextDouble();

            suma += numero;

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            contador++;
        }

        double promedio = suma / n;

        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
//    Scanner sc = new Scanner(System.in);
//
//    System.out.print (
//    "Ingrese la cantidad de números a procesar: ");
//        int n = sc.nextInt();
//
//    double numero, suma = 0, maximo = Double.NEGATIVE_INFINITY,
//            minimo = Double.POSITIVE_INFINITY;
//    int contador = 0;
//
//    
//        do {
//            System.out.print("Ingrese un número: ");
//        numero = sc.nextDouble();
//
//        suma += numero;
//
//        if (numero > maximo) {
//            maximo = numero;
//        }
//
//        if (numero < minimo) {
//            minimo = numero;
//        }
//
//        contador++;
//    }
//    while (contador< n
//    );
//        
//        double promedio = suma / n;
//
//    System.out.println (
//
//    "El valor máximo es: " + maximo);
//    System.out.println (
//
//    "El valor mínimo es: " + minimo);
//    System.out.println (
//
//    "El promedio es: " + promedio);
//        
//    sc.close ();
//}

}
