//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
//salir, se mostrará todos los perros guardados en el ArrayList
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Ale y Choy
 */
public class Perros {

    //Atributos
    private Perros raza;

    //Constructores
    public Perros() {
    }

    public Perros(Perros raza) {
        this.raza = raza;
    }

    //Getters y Setters
    public void setRaza(Perros raza) {
        this.raza = raza;
    }

    public Perros getRaza() {
        return raza;
    }

    //Tostring
    @Override
    public String toString() {
        return "Perros{" + "raza=" + raza + '}';
    }

}
