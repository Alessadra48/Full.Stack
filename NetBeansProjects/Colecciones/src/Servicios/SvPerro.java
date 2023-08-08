package Servicios;

import Entidades.Perros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class SvPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perros crearPerros() {
        ArrayList<String> Perros = new ArrayList();
        System.out.println("Ingrese una raza de perro: ");
        Perros.add(leer.next());
        return new Perros();
    }
}
