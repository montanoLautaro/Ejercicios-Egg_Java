/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java16 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, numeroBuscar;
        boolean bandera = false;
        
        
        System.out.println("Ingrese un valor para 'n': ");
        n = sc.nextInt();
        
        System.out.println("Ingrese el valor al numero que desea buscar del 1 al 10: ");
        numeroBuscar = sc.nextInt();
        
        int[] vector = new int[n];
        
        for(i=0; i<n; i++ ){
            vector[i] = (int) (Math.random() * 10);
            if(vector[i] == numeroBuscar && bandera == false){
                System.out.println("El numero se encontro en la posicion " + i);
                bandera = true;
            }
            else{
                if(vector[i] == numeroBuscar){
                    System.out.println("El numero se encontro de nuevo, en la posicion " + i);
                }
            }
        }
        
    }
    
}
