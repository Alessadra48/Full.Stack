package Entidades;
//Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
//de rango)

/**
 *
 * @author Ale y Choy
 */
public class Array {

    private int[] arreglo;

    public Array(int tamano) {
        arreglo = new int[tamano];
    }

    public int getElemento(int indice) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= arreglo.length) {
            throw new ArrayIndexOutOfBoundsException("El índice está fuera del rango del arreglo");
        }
        return arreglo[indice];
    }

    public void setElemento(int indice, int valor) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= arreglo.length) {
            throw new ArrayIndexOutOfBoundsException("El índice está fuera del rango del arreglo");
        }
        arreglo[indice] = valor;
    }
}
