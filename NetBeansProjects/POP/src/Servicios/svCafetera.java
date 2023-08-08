package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author Ale y Choy
 */
public class svCafetera {
    // Método llenarCafetera
    Cafetera cf = new  Cafetera();
    public void llenarCafetera(int capacidadActual, int capacidadMaxima) {
        int cantidadActual = capacidadMaxima;
    }

    // Método servirTaza
    public void servirTaza(int tamanoTaza) {
        if (cantidadActual >= tamanoTaza) {
            cantidadActual -= tamanoTaza;
            System.out.println("Se ha llenado la taza.");
        } else {
            int cantidadServida = cantidadActual;
            cantidadActual = 0;
            System.out.println("No se ha podido llenar la taza. Quedaron " + (tamanoTaza - cantidadServida) + " ml en la cafetera.");
        }
    }

    // Método vaciarCafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    // Método agregarCafe
    public void agregarCafe(int cantidad) {
        if (cantidadActual + cantidad > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
            System.out.println("No se ha podido agregar toda la cantidad de café. La cafetera está llena.");
        } else {
            cantidadActual += cantidad;
            System.out.println("Se ha agregado " + cantidad + " ml de café a la cafetera.");
        }
    }
}

