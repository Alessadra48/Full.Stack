package Servicios;

import Entidades.Cadena;

/**
 *
 * @author Ale y Choy
 */
public class svCadena {

    public Cadena mostrarVocales() {
        String frase;
        int longitud = frase.length();
        int contadorVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("La frase tiene " + contadorVocales + " vocales.");
        return new Cadena();
    }

    public void invertirFrase() {
        StringBuilder sb = new StringBuilder(frase);
        sb.reverse();
        System.out.println("La frase invertida es: " + sb.toString());
    }

    public void vecesRepetido(String letra) {
        int contador = 0;
        char caracter = letra.charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El carácter '" + caracter + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(String otraFrase) {
        int longitudOtraFrase = otraFrase.length();
        if (longitud > longitudOtraFrase) {
            System.out.println("La frase \"" + frase + "\" es más larga que \"" + otraFrase + "\".");
        } else if (longitud < longitudOtraFrase) {
            System.out.println("La frase \"" + frase + "\" es más corta que \"" + otraFrase + "\".");
        } else {
            System.out.println("La frase \"" + frase + "\" tiene la misma longitud que \"" + otraFrase + "\".");
        }
    }

    public void unirFrases(String otraFrase) {
        System.out.println("La frase resultante es: " + frase + " " + otraFrase);
    }

    public void reemplazar(String letra, String reemplazo) {
        frase = frase.replace(letra.charAt(0), reemplazo.charAt(0));
        System.out.println("La frase resultante es: " + frase);
    }

    public boolean contiene(String letra) {
        char caracter = letra.charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                return true;
            }
        }
        return false;
    }
}
