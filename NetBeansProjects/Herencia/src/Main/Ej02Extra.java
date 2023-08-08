package Main;

import Entidades.Edificio;
import Entidades.EdificiosOficina;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Ej02Extra {

    public static void main(String[] args) {
        ArrayList<Edificio> Edificios = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Edificios.add(new Polideportivo("Polideportivo1", "Techado", 50, 20, 30));
        Edificios.add(new Polideportivo("Polideportivo2", "Abierto", 40, 25, 35));
        Edificios.add(new EdificiosOficina(5, 10, 4, 15, 10, 20));
        Edificios.add(new EdificiosOficina(10, 8, 6, 20, 15, 30));

        for (Edificio edificio : Edificios) {
            System.out.println("Superficie del " + edificio.getClass().getSimpleName() + ": " + edificio.calcularSuperficie());
            System.out.println("Volumen del " + edificio.getClass().getSimpleName() + ": " + edificio.calcularVolumen());


        }
    }

}
