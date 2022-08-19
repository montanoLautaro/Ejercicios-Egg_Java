/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia5.java__extras;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Extra02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, auxiliar;
        
        System.out.println("Ingresar un valor para A: ");
        A = sc.nextInt();
        
        System.out.println("Ingresar un valor para B: ");
        B = sc.nextInt();
        
        System.out.println("Ingresar un valor para C: ");
        C = sc.nextInt();
        
        System.out.println("Ingresar un valor para D: ");
        D = sc.nextInt();
        
        System.out.println("---------------------------------");
        
        System.out.println("Valor de la variable A: " + A);
        System.out.println("Valor de la variable B: " + B);
        System.out.println("Valor de la variable C: " + C);
        System.out.println("Valor de la variable D: " + D);
        
        System.out.println("---------------------------------");
        
        auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;
        
        
        System.out.println("Nuevo valor de la variable A: " + A);
        System.out.println("Nuevo valor de la variable B: " + B);
        System.out.println("Nuevo valor de la variable C: " + C);
        System.out.println("Nuevo valor de la variable D: " + D);
        
        
    }
    
}
