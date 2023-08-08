package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Hoteles extends Alojamiento {

    //Atributos
    protected int habitaciones;
    protected int camas;
    protected int pisos;
    protected int precio;

    //Constructores
    public Hoteles() {
    }

    public Hoteles(int habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precio = precio;
    }

    //Getters y Setters
    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //TosTring
    @Override
    public String toString() {
        return "Hoteles{" + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", precio=" + precio + '}';
    }
//Métodos

    public void PrecioHabitaciones() {
        habitaciones = 50;
    }

    public void capaccamas() {
        camas = 1;
    }

//    public void pisos() {
//      pisos=
//    }
}
