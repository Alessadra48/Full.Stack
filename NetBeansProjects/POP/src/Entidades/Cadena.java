package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Cadena {
    //Atributo
    private String frase;
    private int longitud;

    public Cadena() {
        frase = "";
        longitud = 0;
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
}
