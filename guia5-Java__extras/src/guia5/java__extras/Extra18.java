/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario..
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numeroIngresado;
        int acumulador = 0;
        int[] vector;
        
        
        System.out.println("Ingrese un tamaño para el vector: ");
        n = sc.nextInt();
        
        vector = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.println("Ingrese un valor para la posición " + i );
            vector[i] = sc.nextInt();
        }
        
        acumulador = SumarElementosVector(vector, n);
        
        System.out.println("La suma de todos los elementos del vector da: " + acumulador);
    }
    
    public static int SumarElementosVector(int[] vector, int limite){
        int resultado = 0;
        
        for(int i=0; i<limite; i++){
            resultado = resultado + vector[i];
        }
        
        
        return resultado;
    }
    
}
