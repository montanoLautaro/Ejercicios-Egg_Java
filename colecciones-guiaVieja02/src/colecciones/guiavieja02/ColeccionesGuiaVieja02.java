/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
 */
package colecciones.guiavieja02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author hered
 */
public class ColeccionesGuiaVieja02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        String respuesta, eliminarPerro;
        boolean resultado = false;
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
        } while (respuesta.equalsIgnoreCase("si") || !respuesta.equalsIgnoreCase("no"));

        for (String perro : perros) {
            System.out.println(perro);
        }

        System.out.println("Ingrese una raza de perro a eliminar de la lista: ");
        eliminarPerro = sc.next();

        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(eliminarPerro)) {
                it.remove();
                resultado = true;
            }
        }
        if (resultado == false) {
            System.out.println("No se encontró la raza ingresada en la lista.");
        }
        Collections.sort(perros);
        
        System.out.println("--LISTA ORDENADA--");
        for (String perro : perros) {
            System.out.println(perro);
        }

    }

}
