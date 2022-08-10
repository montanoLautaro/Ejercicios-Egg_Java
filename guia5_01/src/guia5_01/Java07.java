/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseA;
        String fraseB = "eureka";
        
        System.out.println("Ingrese una frase: ");
        fraseA = sc.nextLine();
        
        if(fraseA.equals(fraseB)){
            System.out.println("CORRECTO!! ");
        }
        else{
            System.out.println("INCORRECTO!! ");
        }
        
    }
    
}
