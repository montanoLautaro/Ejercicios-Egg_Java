/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:

En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 */
package colecciones.guiavieja04;

import colecciones.guiavieja04.comparadores.Comparador;
import colecciones.guiavieja04.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import servicios.PeliculaServicio;

public class ColeccionesGuiaVieja04 {

    public static void main(String[] args) {
        PeliculaServicio sv = new PeliculaServicio();
        
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        
        sv.cargarEnLista(peliculas);
        
        System.out.println("---PELICULAS---");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("");
        
        System.out.println("---PELICULAS QUE DURAN MÁS DE 1 HORA---");
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getDuracion()>1){
                System.out.println(pelicula.toString());
            }
        }
        
        System.out.println("");
        
        System.out.println("---PELICULAS ORDENADAS POR SU DURACION DE MAYOR A MENOR---");
        Collections.sort(peliculas, Comparador.ordenarDuracionDesc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("");
        
        System.out.println("---PELICULAS ORDENADAS POR SU DURACION DE MENOR A MAYOR---");
        Collections.sort(peliculas, Comparador.ordenarDuracionAsc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("");
        
        System.out.println("---PELICULAS ORDENADAS POR EL TITULO ALFABETICAMENTE");
        Collections.sort(peliculas, Comparador.ordenarPorTituloAsc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("");
        
        System.out.println("---PELICULAS ORDENADAS POR EL DIRECTOR ALFABETICAMENTE");
        Collections.sort(peliculas, Comparador.ordenarPorDirectorAsc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        
    }
    
}
