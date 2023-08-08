//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
//numero de páginas. 
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class Libro {

    //Atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
        // Constructor vacío
    }

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ISBN del libro: ");
        this.ISBN = scanner.nextLine();

        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}
