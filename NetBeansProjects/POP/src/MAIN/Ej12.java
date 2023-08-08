
package MAIN;

import DateUtil.DateUtil;
import Entidades.Persona;
import Entidades.Persona1;

/**
 *
 * @author Ale y Choy
 */
public class Ej12 {
    public static void main(String[] args) {
    Persona per = Persona.crearPersona();
    persona1.mostrarPersona();

    System.out.println();

    Persona1 persona2 = new Persona("Juan Perez", DateUtil.convertirStringADate("20/12/1995"));
    persona2.mostrarPersona();

    System.out.println();

    System.out.println("¿La primera persona es menor que 30 años? " + per.menorQue(30));
    System.out.println("¿La segunda persona es menor que 30 años? " + persona2.menorQue(30));
}

