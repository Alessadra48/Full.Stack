//Una obra social tiene tres clases de socios: 
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
//todos los tipos de tratamientos. 
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
//para los mismos tratamientos que los socios del tipo A. 
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
//tratamientos. 
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
//real que represente el costo del tratamiento (previo al descuento) y determine el 
//importe en efectivo a pagar por dicho socio.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese la clase del socio y el costo del tratamiento
        System.out.println("Ingrese la clase del socio (A, B o C):");
        char clase = leer.next().charAt(0);

        System.out.println("Ingrese el costo del tratamiento:");
        double costo = leer.nextDouble();

        // Calcular el importe en efectivo a pagar por el socio
        double importe = 0.0;
        switch (clase) {
            case 'A':
                importe = costo * 0.5;
                break;
            case 'B':
                importe = costo * 0.65;
                break;
            case 'C':
                importe = costo;
                break;
            default:
                System.out.println("La clase de socio ingresada es inválida.");
                break;
        }

        // Mostrar el importe en efectivo a pagar por el socio
        if (importe > 0.0) {
            System.out.println("El importe en efectivo a pagar es: " + importe);
        }

        leer.close();
    }
}
