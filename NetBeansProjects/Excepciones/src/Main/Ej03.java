//Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
//una división con los dos numeros y mostrar el resultado.
package Main;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String num1Str = leer.next();
        int num1 = Integer.parseInt(num1Str);

        System.out.print("Ingrese el segundo número: ");
        String num2Str = leer.next();
        int num2 = Integer.parseInt(num2Str);

        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }

     
    }
}
