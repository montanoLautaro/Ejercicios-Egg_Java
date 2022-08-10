/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package guia5_01;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Java01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numeroUno;
        int numeroDos;
        int suma;
        
        System.out.println("Ingrese un numero: ");
        numeroUno = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        numeroDos = leer.nextInt();
        
        suma = numeroUno + numeroDos;
        
        System.out.println("La suma es de: " + suma);
        
    }
    
}
