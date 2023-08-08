package Entidades;

/**
 *
 * @author Ale y Choy
 */
public  abstract class Edificio {

    //Atributos
    protected double ancho;
    protected double alto;
    protected double largo;

    //Constructores
    public Edificio() {
    }

    public Edificio(float ancho, float alto, float largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    //Getters y Setters
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    //Tostring
    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    //Métodos
    public abstract double calcularSuperficie();

    public abstract double  calcularVolumen();
//2h(a+b)h+2ab

}
