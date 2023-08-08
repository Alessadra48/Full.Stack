
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class SvPeli {
    Scanner leer = new Scanner(System.in);
    public ArrayList<Pelicula> crarPelicula(){
    ArrayList<Pelicula> Peliculas = new ArrayList<>(); 
    Pelicula p1 = new Pelicula("Harry Potter", 3.40, 13, "Michael Cormac Newell");
    Peliculas.add(p1);
    Pelicula p2 = new Pelicula("Rapido y Furioso", 1.35, 18, "James Wan");
    Peliculas.add(p2);
    Pelicula p3 = new Pelicula("Avengers", 2.30, 12, "Joe Russo");
    Peliculas.add(p3);
    Pelicula p4 = new Pelicula("50 Sombras de Grey", 2.40, 18, "James Foley");
    Peliculas.add(p4);
    Pelicula p5 = new Pelicula("Relatos Salvajes", 1.32, 2, "Damián Szifron");
    Peliculas.add(p5);
    Pelicula p6 = new Pelicula("Avatar", 4.50, 20, "James Cameron");
    Peliculas.add(p6);
    return Peliculas;
    }
}
