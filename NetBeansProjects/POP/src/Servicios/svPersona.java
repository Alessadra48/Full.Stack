
package Servicios;

import java.util.Scanner;
import Entidades.Persona;

/**
 *
 * @author Ale y Choy
 */
public class svPersona {
    // Método para crear una persona pidiendo los valores al usuario
    public Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Sexo (H/M/O): ");
        char sexo = scanner.next().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo incorrecto. Introduzca H, M o O: ");
            sexo = scanner.next().charAt(0);
        }
        System.out.print("Peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura en m: ");
        double altura = scanner.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    // Método para calcular el índice de masa corporal
    public int calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1; // por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // peso ideal
        } else {
            return 1; // sobrepeso
        }
    }

    // Método para comprobar si la persona es mayor de edad
    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}

