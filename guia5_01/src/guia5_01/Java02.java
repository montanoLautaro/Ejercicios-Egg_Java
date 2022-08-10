/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java02 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        
        System.out.println("Su nombre es " + nombre);
    }
    
}
