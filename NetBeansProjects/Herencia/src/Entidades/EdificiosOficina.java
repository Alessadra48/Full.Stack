package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class EdificiosOficina extends Edificio {

    //Atributos
    protected int oficina;
    protected int personas;
    protected int pisos;
    //Constructores

    public EdificiosOficina(int oficina, int personas, int pisos, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.oficina = oficina;
        this.personas = personas;
        this.pisos = pisos;
    }
    //Getters y Setters

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    //Métodos
    public double calcularSuperficie() {
        double superficie = 2 * (ancho * largo + ancho * alto + largo * alto) * pisos;
        return superficie;
    }

    public double calcularVolumen() {
        double volumen = ancho * alto * largo * pisos;
        return volumen;
    }

//    public int cantPersonas() {
//        int cantPersonas = oficina * personas * pisos;
//        return cantPersonas;
//    }
    public int cantPersonas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántas personas entran en una oficina: ?");
        personas = leer.nextInt();
        System.out.println("¿Cuantas oficinas son?: ");
        oficina = leer.nextInt();
        System.out.println("Ingrese el número de pisos: ");
        pisos = leer.nextInt();
        int cantPersonas = oficina * personas * pisos;
        return cantPersonas;
        
    }
}
