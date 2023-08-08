package Entidades;
/**
 *
 * @author Ale y Choy
 */
public abstract class Animal {
//Atributos
    protected String nombre;
    protected int edad;
    protected String alimento;
    protected String raza;
    //Constructor 
    public Animal(String nombre, int edad, String alimento, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
        this.raza = raza;
    }
    //Getters y Setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }   
    //Tostring
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", alimento=" + alimento + ", raza=" + raza + '}';
    }
    //Métodos
    public void hacerRuido() {
        System.out.println("El ruido que hace es: ");
    }

  
}
