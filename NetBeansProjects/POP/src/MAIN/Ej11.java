package MAIN;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el día de la fecha: ");
        int dia = sc.nextInt();

        System.out.println("Ingrese el mes de la fecha: ");
        int mes = sc.nextInt();

        System.out.println("Ingrese el año de la fecha: ");
        int anio = sc.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();

        System.out.println("La fecha ingresada es: " + fecha);

        long diferenciaEnMillis = fechaActual.getTime() - fecha.getTime();
        long aniosEntreFechas = diferenciaEnMillis / (1000L * 60 * 60 * 24 * 365);

        System.out.println("La cantidad de años entre la fecha ingresada y la fecha actual es: " + aniosEntreFechas);
    }
}
