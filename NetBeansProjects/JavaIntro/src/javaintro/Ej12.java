//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
//ser X y el último tiene que ser una O. 
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
//especial “&&&&&” marca el final de los envios (llamémosla FDE), y toda secuencia 
//distinta de FDE, que no respete el formato se considera incorrecta. 
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
//e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
//siguientes funciones de Java Substring(), Length(), equals().
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctCount = 0;
        int incorrectCount = 0;

        do {
            System.out.print("Ingrese una cadena (&&&&& para salir): ");
            String cadena = leer.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                System.out.println("Cadena correcta");
                correctCount++;
            } else {
                System.out.println("Cadena incorrecta");
                incorrectCount++;
            }
        } while (true);

        System.out.println("Informe final:");
        System.out.println("Cantidad de lecturas correctas: " + correctCount);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectCount);
    }
}
