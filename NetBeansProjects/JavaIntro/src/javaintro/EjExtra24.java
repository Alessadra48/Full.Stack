package javaintro;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la sucesión de Fibonacci que desea calcular: ");
        int n = sc.nextInt();
        int[] fib = calcularFibonacci(n);
        System.out.println("Los " + n + " primeros números de la sucesión de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }

    public static int[] calcularFibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 1;
        if (n > 1) {
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }

}

