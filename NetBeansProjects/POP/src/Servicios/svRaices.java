
package Servicios;

import Entidades.Raices;

/**
 *
 * @author Ale y Choy
 */
public class svRaices {
   
    public Raices obtenerRaices() {
        
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(Discriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(Discriminante())) / (2 * a);
            System.out.println("Las soluciones de la ecuación son: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        return new Raices(0, 0, 0);
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("La única solución de la ecuación es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene solución única.");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}

