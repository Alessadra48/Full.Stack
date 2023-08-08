//Simular la división usando solamente restas. Dados dos números enteros mayores que 
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
//Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
//este resultado es el residuo, y el número de restas realizadas es el cociente. 
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada 
//37 – 13 = 24 dos restas realizadas 
//50
//24 – 13 = 11 tres restas realizadas 
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
package javaintro;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra9 {

    public static void main(String[] args) {
        int dividendo = 25;
        int divisor = 4;

        divisionPorRestas(dividendo, divisor);
    }

    public static void divisionPorRestas(int dividendo, int divisor) {

        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + dividendo);
    }
}
