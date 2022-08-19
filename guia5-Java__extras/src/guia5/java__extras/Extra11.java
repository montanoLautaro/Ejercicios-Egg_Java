/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package guia5.java__extras;

import java.util.Scanner;

public class Extra11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIngresado, digito, contador;
        
        System.out.println("Ingrese un numero: ");
        numeroIngresado = sc.nextInt();
        
        
        digito = numeroIngresado;
        contador = 0;
        do{
            digito = digito / 10;
            contador++;
        }while(digito >= 1);
        
        System.out.println("El numero " + numeroIngresado + " tiene " + contador + " digitos.");
        
        
    }
    
}
