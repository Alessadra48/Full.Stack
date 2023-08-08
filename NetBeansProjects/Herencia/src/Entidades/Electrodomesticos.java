/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, 
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
precio. Esta es la lista de precios:
 */
package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Electrodomesticos {

    //Atributos
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
    //Constructor

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

//Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Tostring
    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

}
