//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente cuadrado.
package javaintro;

/**
 *
 * @author Ale y Choy
 */
public class Ej13 {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
