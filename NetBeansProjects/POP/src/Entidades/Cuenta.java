//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). 
//Las operaciones asociadas a dicha clase son: 
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
//b) Agregar los métodos getters y setters correspondientes 
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
//y se la sumara a saldo actual. 
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
//pondrá el saldo actual en 0. 
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
//usuario no saque más del 20%. 
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta. 
package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Cuenta {

    //Atributos
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;
    private double interes;

    // Constructor por defecto
    public Cuenta() {
    }

    // Constructor con parámetros
    public Cuenta(long dniCliente, int saldoActual, int numeroCuenta, double interes) {
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
    }

    // Getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
