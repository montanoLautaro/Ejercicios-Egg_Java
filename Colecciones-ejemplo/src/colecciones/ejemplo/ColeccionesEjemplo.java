/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.ejemplo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hered
 */
public class ColeccionesEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        // LIST -> ArrayList
        // 1.soportan elementos duplicados
        // 2.no estan ordenadas
        
        // instanciar un objeto ArrayList
        ArrayList<String> nombresArrayList = new ArrayList();
        
        // añadir objetos a la ArrayList, la dimension del array aumenta
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        
        System.out.println(nombresArrayList.size());
        
        // eliminar objetos al Arraylist, en este ejemplo cualquier posicion
        // que su contenido sea "Chiquito"
        nombresArrayList.remove("Chiquito");
        
        System.out.println(nombresArrayList.size());
        
        
        // Integer
        System.out.println(Integer.MAX_VALUE); // maxima cantidad de posiciones
        // que puede haber dentro de un array
         */
        
        

        // ITERADORES
        List<String> nombres = new ArrayList();
        
        nombres.add("Lola");
        nombres.add("Rodman");
        nombres.add("Jordan");

        // FOR EACH -> recomendado solo para MOSTRAR elementos
        for (String aux : nombres) {
            System.out.println(aux);
        }
        System.out.println("");
        // otra forma de hacer lo anterior
        nombres.forEach((e) -> System.out.println(e));

        // ELIMINAR un elemento con un for
        for (int i = 0; i < nombres.size(); i++) {
            String m = nombres.get(i);
            if (m.equals("Lola")) {
                nombres.remove(m);
            }
        }
        nombres.forEach((e) -> System.out.println(e));

        // ITERATOR, patron para recorrer distintos tipos de datos
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if(aux.equals("Lola")){
                it.remove();
            }
        }
        //it.hasNext() corrobora si existe un elemento en la siguiente posicion
        //empezando desde la posicion 0
        
        
        
        
    }

}
