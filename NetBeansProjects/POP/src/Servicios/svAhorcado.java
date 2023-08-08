package Servicios;

import java.util.Scanner;
import Entidades.Ahorcado;

/**
 *
 * @author Ale y Choy
 */
public class svAhorcado {

    public Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = leer.nextLine().toUpperCase();
        
        palabra = palabra.toCharArray();
        int maxIntentos = leer.nextInt();
        int encontradas = 0;
        return new Ahorcado();
    }

    public void longitud() {
        System.out.println("La longitud de la palabra es: " + palabra.length);
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontrada = true;
                encontradas++;
            }
        }
        if (encontrada) {
            System.out.println("La letra " + letra + " está en la palabra.");
        } else {
            System.out.println("La letra " + letra + " no está en la palabra.");
            maxIntentos--;
        }
        return encontrada;
    }

    public void encontradas(char letra) {
        int faltan = palabra.length - encontradas;
        System.out.println("Letras encontradas: " + encontradas);
        System.out.println("Letras que faltan: " + faltan);
    }

    public void intentos() {
        System.out.println("Le quedan " + maxIntentos + " intentos.");
    }

    public void juego() {
        Scanner sc = new Scanner(System.in);
        boolean finJuego = false;
        while (!finJuego) {
            System.out.print("Ingrese una letra: ");
            char letra = sc.nextLine().toUpperCase().charAt(0);
            buscar(letra);
            encontradas(letra);
            intentos();
            if (encontradas == palabra.length) {
                System.out.println("¡Felicidades, has ganado!");
                finJuego = true;
            } else if (maxIntentos == 0) {
                System.out.println("Lo siento, has perdido. La palabra era " + String.valueOf(palabra));
                finJuego = true;
            }
        }
    }
}

