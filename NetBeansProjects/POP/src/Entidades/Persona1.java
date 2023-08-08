package Entidades;

import java.util.Date;

/**
 *
 * @author Ale y Choy
 */
public class Persona1 {

    private String nombre;
    private Date fechaNacimiento;

    public Persona1() {
    }

    public Persona1(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
