/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia5_01;
import java.util.Scanner;


/**
 *
 * @author hered
 */
public class Java04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperatura;
        
        
        System.out.println("Ingrese una temperatura en celsius: ");
        temperatura = sc.nextFloat();
        
        temperatura = 32 + (9 * temperatura / 5);
        
        System.out.println("La temperatura ingresada equivale a " + temperatura + " F.");
        
    }
    
}
