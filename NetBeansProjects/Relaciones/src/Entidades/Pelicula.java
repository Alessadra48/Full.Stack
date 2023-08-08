//Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
//(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
//sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
//el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
//nombre, edad y el dinero que tiene disponible.
//Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son 
//etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en 
//la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta 
//ocupado se muestra una X, sino un espacio vacío.
package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Pelicula {
    //Atributos
   private String titulo;
   private double duracion;
   private int edad;
   private String director;
   //Constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, int edad, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad = edad;
        this.director = director;
    }
   //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
     
}
