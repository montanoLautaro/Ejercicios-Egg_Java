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
package servicios;

import colecciones.guiavieja04.entidades.Pelicula;
import java.util.ArrayList;
import librerias.Consola;

public class PeliculaServicio {
    
    public Pelicula crearPelicula(){
        Pelicula nuevaPelicula = new Pelicula();
        
        nuevaPelicula.setTitulo(Consola.leer("Ingrese el titulo de la pelicula: "));

        nuevaPelicula.setDirector(Consola.leer("Ingrese el nombre del director: "));
        
        nuevaPelicula.setDuracion(Consola.leerEntero("Ingrese la duracion de la pelicula en horas: "));
        
        return nuevaPelicula;
    }
    
    public void cargarEnLista(ArrayList<Pelicula> lista){
        String respuesta;
        do {
            lista.add(crearPelicula());
            respuesta = Consola.leer("Desea ingresar otra pelicula?(si/no): ");
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.println("La opción ingresada no es válida.");
                respuesta = Consola.leer("Desea ingresar otro alumno?(si/no): ");
            }
        } while (respuesta.equals("si"));
    }
    
    
}
