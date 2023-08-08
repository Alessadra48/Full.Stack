package colecciones;

import Entidades.Perros;
import Servicios.SvPerro;
import java.util.Scanner;
/**
 *
 * @author Ale y Choy
 */
public class Ej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perros p1 = new Perros();
        SvPerro sp = new SvPerro();
        int opcion = 0;
        do {
            System.out.println("Bienvenidos al MENU! Escoja una opción: ");
            System.out.println("1: Ingresa un perro");
            System.out.println("2: SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sp.crearPerros();
                    break;
            }
        } while (opcion != 5);
        System.out.println(sp.toString());
    }
}
