/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia5_01;
import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Java03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        System.out.println("Frase en mayúsculas: " + frase.toUpperCase()); 
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());
        
    }
    
}
