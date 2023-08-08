package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class NIF {
    //Atributos
    private long dni;
    private String letra;

    // Array de caracteres para el cálculo de la letra
    private static final char[] LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    // Constructor
    public NIF(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }

    // Getters y Setters
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
