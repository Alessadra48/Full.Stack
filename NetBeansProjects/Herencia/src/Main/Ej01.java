package Main;
//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un 
//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo siguiente:
import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
/**
 *
 * @author Ale y Choy
 */
public class Ej01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración del objeto Perro
        System.out.println("Perro");
        Perro perro1 = new Perro("Pinchitas", 6, "carne", "Siberiano");
        System.out.println(perro1.toString());
        perro1.hacerRuido();
        //Declaración de otro objeto Perro
        System.out.println("Perro 2");
        Animal perro2 = new Perro("Manchitas", 2, "Carne", "Coker");
        System.out.println(perro2.toString());
        perro2.hacerRuido();
        //Declaración del objeto Gato
        System.out.println("Gato");
        Animal gato1 = new Gato("Pelusa", 8, "Croquetas", "Siamés");
        System.out.println(gato1.toString());
        gato1.hacerRuido();
        //Declaración del ojeto Caballo
        System.out.println("Caballo");
        Caballo caballo1 = new Caballo("Spark", 7, "Pasto", "Fino");
        caballo1.medirVelocidad();
        System.out.println(caballo1.toString());
        caballo1.hacerRuido();
    }
}
