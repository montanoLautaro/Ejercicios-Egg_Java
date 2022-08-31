/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package poo.ej001;

import poo.ej001.entidad.Libro;
import poo.ej001.servicio.LibroService;

public class POOEj001 {

    public static void main(String[] args) {
        LibroService svLibro = new LibroService();
        Libro l1 = svLibro.crearLibro();

        
        svLibro.mostrarLibro(l1);
        
        
    }
    
}
