/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] vectorA, vectorB;
        boolean comparacion = true;
        
        System.out.println("Ingrese un tamaño para los vectores: ");
        n = sc.nextInt();
        
        vectorA = new int[n];
        vectorB = new int[n];
        
        System.out.println("-Para el primer vector");
        for(int i=0; i<n; i++){
            System.out.println("Ingrese un valor para la posición " + i );
            vectorA[i] = sc.nextInt();
        }
        
        System.out.println("-Para el segundo vector");
        for(int i=0; i<n; i++){
            System.out.println("Ingrese un valor para la posición " + i );
            vectorB[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            if(vectorA[i] != vectorB[i]){
                comparacion = false;
                break;
            }
        }
        
        
        System.out.println("Los dos vectores son iguales: " + comparacion);
        
    }
    
}
