package Entidades;

/**
 *
 * @author Ale y Choy
 */
public final class Lavadora extends Electrodomesticos {
//Atributo

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }
//Getters y Setters

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

}
