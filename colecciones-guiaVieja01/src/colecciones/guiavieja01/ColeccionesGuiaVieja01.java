/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package colecciones.guiavieja01;

import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionesGuiaVieja01 {

    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        String respuesta;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        do {
            System.out.println("Ingrese una raza de perro: ");
            perros.add(sc.next());
            System.out.println("Desea ingresar otra raza de perro? (si/no): ");
            respuesta = sc.next();
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.println("La opcion ingresada no es válida.");
                System.out.println("Desea ingresar otra raza de perro? (si/no): ");
                respuesta = sc.next();
            }
        } while (respuesta.equalsIgnoreCase("si"));

        for (String perro : perros) {
            System.out.println(perro);
            
        }

    }

}
