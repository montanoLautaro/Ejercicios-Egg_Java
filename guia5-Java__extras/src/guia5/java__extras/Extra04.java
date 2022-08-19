/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package guia5.java__extras;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Extra04 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numeroIngresado;
       
       do{
           System.out.println("Ingrese un número entre el 1 y 10: ");
           numeroIngresado = sc.nextInt();
       }while(numeroIngresado < 1 || numeroIngresado > 10);
       
       switch(numeroIngresado){
           case 1:
               System.out.println("El equivalente en números romanos es I");
               break;
           case 2:
               System.out.println("El equivalente en números romanos es II");
               break;
           case 3:
               System.out.println("El equivalente en números romanos es III");
               break;
           case 4:
               System.out.println("El equivalente en números romanos es IV");
               break;
           case 5:
               System.out.println("El equivalente en números romanos es V");
               break;
           case 6:
               System.out.println("El equivalente en números romanos es VI");
               break;
           case 7:
               System.out.println("El equivalente en números romanos es VII");
               break;
           case 8:
               System.out.println("El equivalente en números romanos es VIII");
               break;
           case 9:
               System.out.println("El equivalente en números romanos es IX");
               break;
           case 10:
               System.out.println("El equivalente en números romanos es X");
               break;
       }
       
    }
    
}
