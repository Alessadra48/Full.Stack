package MAIN;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra5 {

    public static void main(String[] args) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9]; // el mes secreto es octubre
        Scanner sc = new Scanner(System.in);
        String respuesta;
        boolean acierto = false;

        do {
            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
            respuesta = sc.nextLine();
            if (respuesta.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                acierto = true;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
            }
        } while (!acierto);

        sc.close();
    }

}

