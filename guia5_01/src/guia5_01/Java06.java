/*
Crear un programa que dado un numero determine si es par o impar.
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un número: ");
        numero = sc.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El numero es par. ");
        }
        else{
            System.out.println("El numero es impar. ");
        }
    }
    
}
