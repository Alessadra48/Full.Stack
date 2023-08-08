package MAIN;

import Entidades.Circuferencia;

/**
 *
 * @author Ale y Choy
 */
public class Ej02 {
    // Método principal para probar la clase Circunferencia

    public static void main(String[] args) {
        // Creamos una circunferencia con radio 5
        Circuferencia c1 = new Circuferencia(5);

        // Imprimimos el radio, área y perímetro de la circunferencia
        System.out.println("Radio de la circunferencia: " + c1.getRadio());
        System.out.println("Área de la circunferencia: " + c1.area());
        System.out.println("Perímetro de la circunferencia: " + c1.perimetro());

        // Creamos una nueva circunferencia pidiendo el radio al usuario
        Circuferencia c2 = new Circuferencia(0);
        c2.crearCircunferencia();

        // Imprimimos el radio, área y perímetro de la nueva circunferencia
        System.out.println("Radio de la circunferencia: " + c2.getRadio());
        System.out.println("Área de la circunferencia: " + c2.area());
        System.out.println("Perímetro de la circunferencia: " + c2.perimetro());
    }
}
