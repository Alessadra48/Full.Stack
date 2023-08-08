//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
//tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
//que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones: 
//22
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
package Entidades;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Ale y Choy
 */
public class Pelicula {

    //Atributo
    private String titulo;
    private String direccion;
    private double duracion;

    //Constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, String direccion, double duracion) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.duracion = duracion;

    }
    //Getters y Setters 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    //Comparator
    public static Comparator<Pelicula> CompararDuracion Comparator<Pelicula> {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            if (p1.getDuracion().compareTo < p2.getDuracion()) {
                return -1;
            } else if (p1.getDuracion() > p2.getDuracion()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    class TituloComparator implements Comparator<Pelicula> {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    }

    class DirectorComparator implements Comparator<Pelicula> {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    }
}
