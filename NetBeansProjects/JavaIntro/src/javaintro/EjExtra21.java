//Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
//adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
//desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por 
//trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
//programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
//52
//desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
//igual al 7 de sus notas del curso.
package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10; // Cantidad de alumnos
        double[] promedios = new double[n];
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Alumno " + (i + 1));
            double nota1 = input.nextDouble();
            double nota2 = input.nextDouble();
            double nota3 = input.nextDouble();
            double nota4 = input.nextDouble();

            // Cálculo del promedio ponderado
            double promedio = nota1 * 0.1 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5;
            promedios[i] = promedio;

            if (promedio >= 7.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        input.close();

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
