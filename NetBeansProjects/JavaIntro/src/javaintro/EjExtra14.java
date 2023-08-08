//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la 
//cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.

package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la cantidad de familias
        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = sc.nextInt();

        // Inicializar variables de suma
        int totalHijos = 0;

        // Iterar sobre cada familia y sumar la cantidad de hijos
        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = sc.nextInt();
            totalHijos += numHijos;
        }

        // Calcular la media de edad de los hijos
        double mediaEdad = (double) totalHijos / (double) numFamilias;

        // Mostrar la media de edad de los hijos
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);

        sc.close();
    }
}
