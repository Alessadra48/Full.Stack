//Escribir un programa que lea un número entero y devuelva el número de dígitos que 
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el 
//operador de división. Nota: recordar que las variables de tipo entero truncan los 
//números o resultados.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Leer un número entero desde el usuario
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();

        // Calcular la cantidad de dígitos
        int cantidadDigitos = 0;
        do {
            cantidadDigitos++;
            numero /= 10;
        } while (numero != 0);

        // Mostrar el resultado al usuario
        System.out.println("Cantidad de dígitos: " + cantidadDigitos);

        leer.close();
    }
}

