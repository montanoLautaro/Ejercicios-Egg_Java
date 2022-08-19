/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una variable Scanner que se utiliza para leer datos ingresados por el usuario
        Scanner leer = new Scanner(System.in);
        
        // Se define una variable de tipo string
        String nombre;
        
        // Mostrar mensaje en la consola
        System.out.println("Ingrese su nombre: ");
        
        // Se guarda lo ingresado en el teclado en la variable nombre
        nombre = leer.nextLine();
        
        // Mostramos por consola el valor de la variable nombre
        System.out.println("Hola mundo!, soy " + nombre + " y estoy programando JAVA!.");
        
    }
    
}
