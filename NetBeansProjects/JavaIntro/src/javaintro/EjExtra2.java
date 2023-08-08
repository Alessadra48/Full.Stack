//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, 
//49
//C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
package javaintro;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra2 {

    public static void main(String[] args) {
        // Declarar e inicializar las variables A, B, C y D con valores diferentes
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;

        // Mostrar los valores iniciales
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);

        // Utilizar la variable auxiliar para intercambiar los valores
        int auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;

        // Mostrar los valores finales
        System.out.println("Valores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    }
}


