/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import Entidades.Puntos;

/**
 *
 * @author Ale y Choy
 */
public class EjExtra2 {
    public static void main(String[] args) {
        Puntos puntos = new Puntos();

        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();

        System.out.println(
                "La distancia entre los puntos es: " + distancia);
    }
}
