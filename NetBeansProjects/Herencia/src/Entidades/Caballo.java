package Entidades;
 /**
     *
     * @author Ale y Choy
     */
public final class Caballo extends Animal {
   //Atributo
    
    //Constructores
    public Caballo(double velocidad, String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
        this.velocidad = velocidad;
    }private double velocidad; 
    public Caballo(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }
    //Getters y Setters
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    //Métdos
    public void medirVelocidad(){
        double velocidad = 1000;
        System.out.println("1000" + velocidad );
    }
    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Mmm!");
    }
}
