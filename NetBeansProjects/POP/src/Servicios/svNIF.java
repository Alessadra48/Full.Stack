
package Servicios;

import Entidades.NIF;

/**
 *
 * @author Ale y Choy
 */
public class svNIF {
   
     // Método para calcular la letra del DNI
    private NIF calcularLetra(long dni) {
        int resto = (int) (dni % 23);
         Character.toString(LETRAS[resto]);
         return new NIF(dni);
    }

    // Método para pedir el DNI al usuario y calcular la letra correspondiente
    public void crearNif() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        this.dni = sc.nextLong();
        this.letra = calcularLetra(dni);
    }

    // Método para mostrar el NIF completo
    public void mostrar() {
        System.out.printf("%08d-%s\n", dni, letra);
    }
}
}
