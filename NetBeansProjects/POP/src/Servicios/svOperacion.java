package Servicios;

import java.util.Scanner;
import Entidades.Operacion;

/**
 *
 * @author Ale y Choy
 */
public class svOperacion {
    // Método para crearOperacion()

    public Operacion crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();
        return new Operacion(numero1, numero2);
    }

    // Método sumar()
    public double sumar(double numero1, double numero2) {
        double suma = numero1 + numero2;
        return suma;
    }

    // Método restar()
    public double restar(double numero1, double numero2) {
        double resta = (numero1 - numero2);
        return resta;
    }

    // Método multiplicar()
    public double multiplicar(double numero1, double numero2) {
        double multi = 0;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero." + multi);
        } else {
            multi = numero1 * numero2;
            System.out.println("La miltiplicacion es: " + multi);
        }
        return multi;
    }

    // Método dividir()
    public double dividir(double numero1, double numero2) {
        double division = 0;
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir por cero." + division);
        } else {
            division = numero1 / numero2;
            System.out.println("La division es: " + division);
        }
        return division;
    }
}
