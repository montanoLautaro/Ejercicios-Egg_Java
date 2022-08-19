/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package guia5.java__extras;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Extra03 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;
        
        System.out.println("Ingrese una vocal: ");
        letra = sc.next();
        
        if(!letra.equalsIgnoreCase("a") && !letra.equalsIgnoreCase("e") && !letra.equalsIgnoreCase("i") && !letra.equalsIgnoreCase("o") && !letra.equalsIgnoreCase("u")){
            System.out.println("No es una vocal.");
        }
        
    }
    
}
