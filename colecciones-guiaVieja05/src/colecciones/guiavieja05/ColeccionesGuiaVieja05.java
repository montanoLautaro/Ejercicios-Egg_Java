/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario
 */
package colecciones.guiavieja05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import librerias.Consola;

public class ColeccionesGuiaVieja05 {

    public static void main(String[] args) {
        HashSet<String> paises = new HashSet<String>();
        String respuesta, eliminarPais, p;
        boolean resultado = false;
        
        do{
            paises.add(Consola.leer("Ingrese un país: "));
            respuesta = Consola.leer("Desea agregar otro? (si/no)");
            while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")){
                System.out.println("La opcion ingresada es incorrecta.");
                respuesta = Consola.leer("Desea agregar otro? (si/no)");
            }      
        }while(respuesta.equalsIgnoreCase("si"));
        
        ArrayList<String> paisesLista = new ArrayList<String>(paises);
        
        Collections.sort(paisesLista);
        
        System.out.println("");
        
        System.out.println("---LISTA DE PAISES ORDENADA---");
        for (String aux : paisesLista) {
            System.out.println(aux);
        }
        
        System.out.println("");
        
        eliminarPais = Consola.leer("Ingrese el nombre del país que desea eliminar: ");
        
        Iterator it = paises.iterator();
        while(it.hasNext()){
            p = (String) it.next();
            if(p.equalsIgnoreCase(eliminarPais)){
                it.remove();
                resultado = true;
            }
        }
        
        
        if(resultado == false){
            System.out.println("No se encontró un país con ese nombre dentro de la lista");
        }else{
            System.out.println("---NUEVA LISTA DE PAISES---");
            for (String aux : paises) {
                System.out.println(aux);
            }
        }
        
        System.out.println("ordenamiento pasando el hashset a treeset");
        TreeSet<String> paisesTree = new TreeSet<>(paises);   
        System.out.println("---TREESET---");
            for (String aux : paisesTree) {
                System.out.println(aux);
            }
        
    }
    
}
