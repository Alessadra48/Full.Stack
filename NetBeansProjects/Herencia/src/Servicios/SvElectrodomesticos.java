package Servicios;

import Entidades.Electrodomesticos;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class SvElectrodomesticos {

    protected Scanner leer = new Scanner(System.in).useDelimiter("/");

    public char comprobarConsumoEnergetico(char consumo) {
        if (consumo >= 'a' && consumo <= 'f') {
            return consumo;
        } else {
            return 'f';
        }

    }

    public String comprobarColor(String color) {

        if (color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;

        } else {
            return "blanco";
        }
    }

    public Electrodomesticos crearElectrodomestico() {
        System.out.println("Ingrese el peso: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese el color: ");
        String color = leer.next();
        System.out.println("Ingrese consumo: ");
        char consumo = leer.next().charAt(0);
        return new Electrodomesticos(1000, comprobarColor(color), comprobarConsumoEnergetico(consumo), peso);
    }

    public double precioFinal(char consumo, double peso, double precio) {
        switch (consumo) {
            case 'a':
                precio += 1000;
                break;
            case 'b':
                precio += 800;
                break;
            case 'c':
                precio += 600;
                break;
            case 'd':
                precio += 500;
                break;
            case 'e':
                precio += 300;
                break;
            case 'f':
                precio += 100;
                break;
            default:
                break;
        }
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            precio += 800;
        } else if (peso >= 80) {
            precio += 1000;
        }

        return precio;
    }
}
