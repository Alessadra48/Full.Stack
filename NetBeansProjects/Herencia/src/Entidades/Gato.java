package Entidades;
/**
 *
 * @author Ale y Choy
 */
public final class Gato extends Animal {

    public Gato(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }
//Getters y Setters   
//Métodos
    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Miau Miau!");
    }

}
