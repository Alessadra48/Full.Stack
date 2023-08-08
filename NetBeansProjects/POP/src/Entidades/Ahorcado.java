package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Ahorcado {
    //Atributos
    private String palabra[];
    private int encontradas;
    private int maxIntentos;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int maxIntentos) {
        this.palabra = palabra.toCharArray();
        this.maxIntentos = maxIntentos;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }

    public void setMaxIntentos(int maxIntentos) {
        this.maxIntentos = maxIntentos;
    }
    
}
