package Main;

import Entidades.Array;

/**
 *
 * @author Ale y Choy
 */
public class Ej02 {

    public static void main(String[] args) {
        Array ejemplo = new Array(5);
        try {
            ejemplo.setElemento(0, 10);
            ejemplo.setElemento(1, 20);
            ejemplo.setElemento(2, 30);
            ejemplo.setElemento(3, 40);
            ejemplo.setElemento(4, 50);
            ejemplo.getElemento(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha generado una excepción: " + e.getMessage());
        }
    }
}
