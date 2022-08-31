/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package poo.ej001.servicio;

import java.util.Scanner;
import poo.ej001.entidad.Libro;

public class LibroService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        Libro libroNuevo = new Libro();

        System.out.println("Ingrese el ISBN: ");
        libroNuevo.setISBN(sc.nextInt());

        System.out.println("Ingrese el título: ");
        libroNuevo.setTitulo(sc.next());

        System.out.println("Ingrese el autor: ");
        libroNuevo.setAutor(sc.next());

        System.out.println("Ingrese la cantidad de páginas: ");
        libroNuevo.setNumeroPaginas(sc.nextInt());

        return libroNuevo;
    }
    
    public void mostrarLibro(Libro libro){
        System.out.println("Número de ISBN: " + libro.getISBN());
        
        System.out.println("Título del libro: " + libro.getTitulo());
        
        System.out.println("Nombre del autor: " + libro.getAutor());
        
        System.out.println("Cantidad de páginas: " + libro.getNumeroPaginas());
    }

}
