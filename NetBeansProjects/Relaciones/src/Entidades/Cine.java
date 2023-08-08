
package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Cine {
  //Atributos
    private Pelicula pelicula;
    private double entrada;
    private Asiento asiento[][];
    //Constructores
    public Cine() {
    }

    public Cine(Pelicula pelicula, int espectadores, double entrada) {
        this.pelicula = pelicula;
        this.entrada = entrada;
    }
    //Getters y Setter
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {   
        this.pelicula = pelicula;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public Asiento[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento[][] asiento) {
        this.asiento = asiento;
    }
  
}
