/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Ale y Choy
 */
public class Ej05 {
    Public static void main(String[] args) {
        Set<String> paises = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        String opcion = "";
        while (!opcion.equals("N")) {
            System.out.print("Introduce un país: ");
            String pais = scanner.nextLine();
            paises.add(pais);
            System.out.print("¿Desea agregar otro país? (S/N): ");
            opcion = scanner.nextLine().toUpperCase();
        }
        
        System.out.println("Países ingresados:");
        for (String pais : paises) {
            System.out.println(pais);
        }
        
        Set<String> paisesOrdenados = new TreeSet<>(paises);
        System.out.println("Países ordenados alfabéticamente:");
        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }
        
        System.out.print("Introduce un país a eliminar: ");
        String paisEliminar = scanner.nextLine();
        Iterator<String> iterador = paises.iterator();
        boolean encontrado = false;
        while (iterador.hasNext()) {
            String pais = iterador.next();
            if (pais.equalsIgnoreCase(paisEliminar)) {
                iterador.remove();
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("País eliminado correctamente");
        } else {
            System.out.println("El país no se encuentra en el conjunto");
        }
        System.out.println("Países restantes:");
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
}
}
