/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java10 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int limite, suma, numeroIngresado;
       
       suma = 0;
       
       
       System.out.println("Ingrese un limite positivo");
       limite = sc.nextInt();
       
       do{
            System.out.println("Ingrese un numero: ");
            numeroIngresado = sc.nextInt();
            suma = numeroIngresado + suma;
       }while(suma <= limite);
       
       
       
    }
    
}
