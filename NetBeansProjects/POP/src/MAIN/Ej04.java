package MAIN;

import Entidades.Rectangulo;

/**
 *
 * @author Ale y Choy
 */
public class Ej04 {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("Superficie del rectángulo: " + rectangulo.calcularSuperficie());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        System.out.println("Dibujo del rectángulo:");
        rectangulo.dibujarRectangulo();
    }
}
