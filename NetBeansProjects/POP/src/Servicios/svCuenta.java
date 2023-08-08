package Servicios;

import java.util.Scanner;
import Entidades.Cuenta;

/**
 *
 * @author Ale y Choy
 */
public class svCuenta {

    // Método para crear un objeto Cuenta pidiendo los datos al usuario
    public static Cuenta crearCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = scanner.nextLong();

        System.out.print("Ingrese el saldo actual: ");
        int saldoActual = scanner.nextInt();

        System.out.print("Ingrese el interés: ");
        double interes = scanner.nextDouble();

        return new Cuenta(dniCliente, saldoActual, numeroCuenta, interes);
    }

    // Método para ingresar dinero a la cuenta
    public void ingresar(double ingreso, int saldoActual) {
        saldoActual += ingreso;
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double retiro, int saldoActual) {
        if (retiro <= saldoActual) {
            saldoActual -= retiro;
        } else {
            saldoActual = 0;
        }
    }

    // Método para hacer una extracción rápida
    public void extraccionRapida(int saldoActual) {
        double limiteExtraccion = saldoActual * 0.2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad a retirar (límite " + limiteExtraccion + "): ");
        double retiro = scanner.nextDouble();

        if (retiro <= limiteExtraccion) {
            saldoActual -= retiro;
        } else {
            System.out.println("No puede retirar más del " + (limiteExtraccion * 100 / saldoActual) + "% de su saldo actual");
        }
    }

    // Método para consultar el saldo de la cuenta
    public void consultarSaldo(int saldoActual) {
        System.out.println("El saldo actual es: " + saldoActual);
    }

    // Método para consultar los datos de la cuenta
    public void consultarDatos(int saldoActual, double interes, int numeroCuenta, long dniCliente) {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
        System.out.println("Interés: " + interes);
    }
}
