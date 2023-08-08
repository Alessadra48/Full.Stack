package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class svPeliculas {

    public ArrayList<Pelicula> crearPelicula() {
        ArrayList<Pelicula> Peli = new ArrayList();
        String opcion = "";
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese el titulo de la pelicula: ");
            String titulo = leer.nextLine();
            System.out.println("Ingrese el director: ");
            String direccion = leer.nextLine();
            System.out.println("Ingrese la duracion: ");
            double duracion = leer.nextDouble();
            Pelicula peliculas = new Pelicula(titulo, direccion, duracion);
            Peli.add(peliculas);
            System.out.println("¿Desea ingresar otra pelicula? S/N");
            opcion = leer.nextLine();
        } while (opcion.equals("N"));

        return Peli;
    }

    public void mostrar(ArrayList<Pelicula>Pelicula) {
        for (Pelicula Pelis : Pelicula) {
            System.out.println(" ");
        }
    }
}
