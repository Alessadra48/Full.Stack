package Servicios;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class svRectangulo {

    // Método para crear el rectángulo con los datos dados por el usuario
    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
    }

    // Método para calcular la superficie del rectángulo
    public double calcularSuperficie(double base, double altura) {
        double superf = base * altura;
        return superf;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro(double base, double altura) {
        double perim = (base + altura) * 2;
        return perim;
    }

    // Método para dibujar el rectángulo con asteriscos
    public void dibujarRectangulo(double base, double altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
