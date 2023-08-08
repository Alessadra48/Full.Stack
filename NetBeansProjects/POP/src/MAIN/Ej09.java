package MAIN;

import Servicios.svMatematica;
import Entidades.Matematica;

/**
 *
 * @author Ale y Choy
 */
public class Ej09 {

    public static void main(String[] args) {
        double num1 = Math.random() * 100;
        double num2 = Math.random() * 100;
        Matematica mat = new Matematica(num1, num2);
        svMatematica sM = new svMatematica();
        System.out.println("El número mayor es: " + mat.devolverMayor());
        System.out.println("La potencia del mayor elevado al menor es: " + sM.calcularPotencia(num1, num2, num2));
        System.out.println("La raíz cuadrada del menor valor es: " + sM.calcularRaiz(num1, num2));
    }
}
