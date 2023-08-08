//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
//muestre por pantalla en orden descendente.

package javaintro;

import java.util.Arrays;

/**
 *
 * @author Ale y Choy
 */
public class Ej15 {
    public static void main(String[] args) {
    
        int[] vector = new int[100];

     // Rellenar el vector con los primeros 100 números enteros
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }

        // Ordenar el vector en orden descendente
        Arrays.sort(vector);
        int[] reversed = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            reversed[i] = vector[vector.length - 1 - i];
        }
        
        // Mostrar los elementos del vector en orden descendente
        for (int i = 0; i < reversed.length; i++) {
            System.out.println(reversed[i]);
        }
    }
}
     // Crear el vector de tamaño 100 en PYTHON
     //vector = [0] * 100
     // Rellenar el vector con los primeros 100 números enteros
     //for i in range(100):
     //    vector[i] = i + 1
     //Ordenar el vector en orden descendente
     //vector.sort(reverse=True)
     // Mostrar los elementos del vector en orden descendente
     //for num in vector:
     //    print(num)  }
     // Crear el vector de tamaño 100