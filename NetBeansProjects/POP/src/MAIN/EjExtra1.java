package MAIN;

import Entidades.Cancion;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra1 {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();

        cancion1.setTitulo(
                "Bohemian Rhapsody");
        cancion1.setAutor(
                "Queen");

        Cancion cancion2 = new Cancion("Stairway to Heaven", "Led Zeppelin");

        System.out.println(
                "Canción 1: " + cancion1.getTitulo() + " - " + cancion1.getAutor());
        System.out.println(
                "Canción 2: " + cancion2.getTitulo() + " - " + cancion2.getAutor());
    }
}
