//Crea una aplicación que a través de una función nos convierta una cantidad de euros 
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
// * 0.86 libras es un 1 €
// * 1.28611 $ es un 1 €
// * 129.852 yenes es un 1 €
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros a convertir: ");
        double euros = leer.nextDouble();
        leer.nextLine(); // Consume la línea vacía después del número

        System.out.print("Introduce la moneda a la que quieres convertir (libras, dolares o yenes): ");
        String moneda = leer.nextLine();

        convertirDivisa(euros, moneda);

        leer.close();
    }

    public static void convertirDivisa(double euros, String moneda) {
        double resultado = 0.0;
        String divisa = "";

        switch (moneda.toLowerCase()) {
            case "libras":
                resultado = euros * 0.86;
                divisa = "libras";
                break;
            case "dolares":
                resultado = euros * 1.28611;
                divisa = "dólares";
                break;
            case "yenes":
                resultado = euros * 129.852;
                divisa = "yenes";
                break;
            default:
                System.out.println("La moneda introducida no es válida");
                return;
        }

        System.out.println(euros + " euros son " + resultado + " " + divisa);
    }
}

