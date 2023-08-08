
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Ale y Choy
 */
public class SvDog {
    
    public ArrayList<Perro> crearDog(){
        ArrayList<Perro> Perros = new ArrayList<>(); 
        Perro p1 = new Perro("Sasha", "Caniche", 1, 1.14);
        Perros.add(p1);
        Perro p2 = new Perro("Manchitas", "Pibut", 2, 1.5);
        Perros.add(p2);
        Perro p3 = new Perro("Beto", "Salchicha", 1, 1.7);
        Perros.add(p3);
        Perro p4 = new Perro("Candela", "Siberiano", 2, 1.8);
        Perros.add(p4);
        Perro p5 = new Perro("Pepino", "Dalmata", 2, 1.9);
        Perros.add(p5);
        return Perros;
    }
}
