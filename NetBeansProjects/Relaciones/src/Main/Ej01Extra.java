//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros
package Main;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.SvDog;
import Servicios.SvPersona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej01Extra {

    public static void main(String[] args) {
        //Scanner
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Import 

        SvPersona p1 = new SvPersona();
        ArrayList<Persona> Personas = new ArrayList();
        SvDog dog = new SvDog();
        ArrayList<Perro> Perros = dog.crearDog();
        //MENU
        int opción = 0;
        do {
            System.out.println("Bienvenidos al MENU! Escoja una opción: ");
            System.out.println("1: Inscribase para adoptar un DOG: ");
            System.out.println("2: Mostrar razas de DOG: ");
            System.out.println("3: ¿Que raza quiere adoptar?");
            System.out.println("4: Personas que ya adoptaron su cachorro");
            System.out.println("5: SALIR");
            opción = leer.nextInt();
            //Métodos   
            switch (opción) {
                case 1:
                    Personas.add(p1.crearPersona());
                    break;
                case 2:
                    System.out.println(Perros.toString());
                    break;
                case 3:
//             ArrayList<Perro> Perros = new ArrayList<>(); 
                    String raza = leer.next();
                    Iterator<Perro> p = Perros.iterator();
                    boolean encontrado = false;
                    while (p.hasNext()) {
                        Perro perroInterno = p.next();
                        if (perroInterno.getRaza().contains(raza)) {
                            Personas.get(Personas.size() - 1).setPerro(perroInterno);
                            p.remove();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontraron perros de esa raza");
                    }
                case 4:
                    System.out.println(Personas.toString());
                    break;
            }

        } while (opción != 5);

    }
}
