package Entidades;

public final class Perro extends Animal {

//Costructores
    public Perro(String nombre, int edad, String alimento, String raza) {  
        super(nombre, edad, alimento, raza);
    }
//Getters y Setters
//Métodos
    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Gua Gua!");
    }

}
