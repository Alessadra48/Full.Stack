//Crear un programa que dibuje una escalera de números, donde cada línea de números 
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
//usuario al comenzar. Ejemplo: si se ingresa el número 3:
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir la altura de la escalera al usuario
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();

        // Dibujar la escalera de números
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        leer.close();
    }
}
