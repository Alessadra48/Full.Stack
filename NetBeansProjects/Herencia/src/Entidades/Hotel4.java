package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Hotel4 extends Hoteles {

    //Atributos
    protected String gimnasio;

    protected int restaurante;

    //Constructores

    public Hotel4(String gimnasio, int restaurante) {
        this.gimnasio = gimnasio;
        this.restaurante = restaurante;
    }
     
    
//  Getters y Setters

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public int getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(int restaurante) {
        this.restaurante = restaurante;
    }

   

    //Métodos
    public void restaurante() {
        int totalrest = 0;
//        $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas. 
//• $50 si es mayor de 50.
        if (restaurante < 30) {
            totalrest = 10;
        }
    }

//    public void gimnasio() {
//        int valorGym = 0;
//        if (gimnasio.equals("A") || gimnasio.equals("a")) {
//            valorGym = 50;
//        } else if (gimnasio.equals("b") ||) {
//            
//        }
    }

//}
