package MAIN;

import Entidades.Cafetera;

/**
 *
 * @author Ale y Choy
 */
public class Ej06 {

    public static void main(String[] args) {

        Cafetera cafetera = new Cafetera(500, 250);

        System.out.println("Capacidad máxima: " + cafetera.getCapacidadMaxima() + " ml");
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual() + " ml");

        cafetera.llenarCafetera();
        System.out.println("Cantidad actual después de llenar: " + cafetera.getCantidadActual() + " ml");

        cafetera.servirTaza(200);
        System.out.println("Cantidad actual después de servir taza: " + cafetera.getCantidadActual() + " ml");

        cafetera.vaciarCafetera();
        System.out.println("Cantidad actual después de vaciar: " + cafetera.getCantidadActual() + " ml");

        cafetera.agregarCafe(300);
        System.out.println("Cantidad actual después de agregar café: " + cafetera.getCantidadActual() + " ml");
    }
}
