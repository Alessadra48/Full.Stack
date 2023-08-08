package MAIN;

import Entidades.Persona;

/**
 *
 * @author Ale y Choy
 */
public class Ej07 {

    public static void main(String[] args) {
        // Creamos 4 objetos de tipo Persona
        Persona persona1 = new Persona("Ana", 25, 'M', 60.0, 1.65);
        Persona persona2 = new Persona("Juan", 15, 'H', 70.0, 1.75);
        Persona persona3 = new Persona();
        persona3.crearPersona();
        Persona persona4 = new Persona("María", 35, 'M', 80.0, 1.70);

        // Llamamos a los métodos correspondientes para cada objeto
    }
}