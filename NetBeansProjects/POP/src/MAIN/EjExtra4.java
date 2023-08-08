package MAIN;

import Entidades.NIF;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra4 {

    public static void main(String[] args) {
        NIF nif = new NIF(12345678);
        System.out.println("NIF inicial: ");
        nif.mostrar();
        nif.setDni(98765432);
        System.out.println("NIF modificado: ");
        nif.mostrar();
        nif.crearNif();
        System.out.println("NIF creado por el usuario: ");
        nif.mostrar();
    }
}
