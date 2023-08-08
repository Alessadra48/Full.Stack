//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
//por debajo de 1.60 mts. y el promedio de estaturas en general.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, contMenos160 = 0, contTotal = 0;
        double altura, sumaMenos160 = 0, sumaTotal = 0;

        System.out.print("Ingrese la cantidad de personas: ");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la altura de la persona " + i + " en metros: ");
            altura = leer.nextDouble();

            if (altura < 1.60) {
                contMenos160++;
                sumaMenos160 += altura;
            }

            contTotal++;
            sumaTotal += altura;
        }

        double promedioMenos160 = 0, promedioTotal = 0;

        if (contMenos160 > 0) {
            promedioMenos160 = sumaMenos160 / contMenos160;
            System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedioMenos160 + " mts");
        } else {
            System.out.println("No hay personas por debajo de 1.60 mts");
        }

        promedioTotal = sumaTotal / contTotal;
        System.out.println("El promedio de estaturas en general es: " + promedioTotal + " mts");

        leer.close();
    }
}
