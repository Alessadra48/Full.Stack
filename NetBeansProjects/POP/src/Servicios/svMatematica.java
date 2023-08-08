package Servicios;

import Entidades.Matematica;

/**
 *
 * @author Ale y Choy
 */
public class svMatematica {

    Matematica mt = new Matematica();

    public double devolverMayor(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public double calcularPotencia(double num1, double num2, double devolverMayor) {
        double mayor = devolverMayor;
        double menor = (mayor == num1) ? num2 : num1;
        return Math.pow(Math.round(mayor), Math.round(menor));
    }

    public double calcularRaiz(double num1, double num2) {
        double menor = (num1 < num2) ? num1 : num2;
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
