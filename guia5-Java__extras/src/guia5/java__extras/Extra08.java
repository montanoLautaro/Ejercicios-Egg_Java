/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia5.java__extras;
import java.util.Scanner;

public class Extra08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIngresado, contador, contadorPares, contadorImpares;
        
        contador = 0;
        contadorImpares = 0;
        contadorPares = 0;
        
        do{
            System.out.println("Ingrese un número: ");
            numeroIngresado = sc.nextInt();
            contador++;
            if(numeroIngresado >= 0){
                if(numeroIngresado % 2 == 0){
                    contadorPares++;
                }
                else{
                    contadorImpares++;
                }
            }            
        }while(numeroIngresado % 5 != 0);
        
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
        System.out.println("Cantidad de números leídos: " + contador);

    }
    
}
