//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
//tipo real. A continuación, se deben crear los siguientes métodos: 
//a) Método constructor que inicialice el radio pasado como parámetro. 
//b) Métodos get y set para el atributo radio de la clase Circunferencia. 
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
//objeto. 
//d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
//e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Circuferencia {
    //Atributo
    private double radio;

    // Constructor que inicializa el radio pasado como parámetro

    public Circuferencia(double radio) {
        this.radio = radio;
    }
    // Métodos get y set para el atributo radio de la clase Circunferencia
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para crear una circunferencia pidiendo el radio al usuario
    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = sc.nextDouble();
        sc.close();
    }

    // Método para calcular el área de la circunferencia (A = pi * radio^2)
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro de la circunferencia (P = 2 * pi * radio)
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

}
