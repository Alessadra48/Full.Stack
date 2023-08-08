
package Entidades;
/**
 *
 * @author Ale y Choy
 */
public class Perro {
   //Atributos
    private String nombre;
    private String raza;
    private int edad;
    private double tamaño;
    //Constructor 
    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }
    //Gatters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    //Tostring

    @Override
    public String toString() {
       
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }
    
}
