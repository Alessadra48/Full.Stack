
package Servicios;

import Entidades.Persona;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class SvPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        System.out.println("DNI: ");
        int dni = leer.nextInt();
       
      return new Persona(nombre, apellido, edad, dni,null);
    }
 
}

