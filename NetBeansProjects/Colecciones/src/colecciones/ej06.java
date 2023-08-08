//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
//productos que venderemos y el precio que tendrán. Además, se necesita que la 
//aplicación cuente con las funciones básicas. 
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package colecciones;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ale y Choy
 */
public class ej06 {

    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Introducir un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Introduce el precio del producto: ");
                    Double precio = scanner.nextDouble();
                    productos.put(nombre, precio);
                    System.out.println("Producto añadido correctamente");
                    break;
                case 2:
                    System.out.print("Introduce el nombre del producto que quieres modificar: ");
                    String nombreModificar = scanner.next();
                    if (productos.containsKey(nombreModificar)) {
                        System.out.print("Introduce el nuevo precio del producto: ");
                        Double nuevoPrecio = scanner.nextDouble();
                        productos.put(nombreModificar, nuevoPrecio);
                        System.out.println("Precio modificado correctamente");
                    } else {
                        System.out.println("El producto no existe");
                    }
                    break;
                case 3:
                    System.out.print("Introduce el nombre del producto que quieres eliminar: ");
                    String nombreEliminar = scanner.next();
                    if (productos.containsKey(nombreEliminar)) {
                        productos.remove(nombreEliminar);
                        System.out.println("Producto eliminado correctamente");
                    } else {
                        System.out.println("El producto no existe");
                    }
                    break;
                case 4:
                    System.out.println("Lista de productos:");
                    for (String nombreProducto : productos.keySet()) {
                        Double precioProducto = productos.get(nombreProducto);
                        System.out.println(nombreProducto + " - " + precioProducto);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        }
    }
}
