package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Matematica {

    //Atributos
    private double num1;
    private double num2;

    public Matematica() {
        // Constructor vacío
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor() {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
}
