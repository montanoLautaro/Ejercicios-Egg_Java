/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un número:");
        numero = sc.nextInt();
        
        System.out.println("El doble del número "+ numero + " es " + numero * 2);
        System.out.println("El triple del número " + numero + " es "  + numero * 3);
        System.out.println("La raíz cuadrada del número " + numero + " es " + Math.sqrt(numero));
        
    }
    
}
