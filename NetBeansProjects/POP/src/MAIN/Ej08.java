package MAIN;

import java.util.Scanner;
import Entidades.Cadena;

/**
 *
 * @author Ale y Choy
 */
public class Ej08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        Cadena cadena = new Cadena(frase);

        cadena.mostrarVocales();
        cadena.invertirFrase();
        System.out.print("Ingrese un carácter: ");
        String letra = sc.nextLine();
        cadena.ve
    }
}