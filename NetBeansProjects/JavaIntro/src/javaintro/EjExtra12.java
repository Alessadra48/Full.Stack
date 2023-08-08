//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
//0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
//Nota: investigar función equals() y como convertir números a String.
package javaintro;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra12 {

    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i == 3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(i + "-");
                    }

                    if (j == 3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(j + "-");
                    }

                    if (k == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(k);
                    }

                    System.out.println();
                }
            }
        }
    }
}
