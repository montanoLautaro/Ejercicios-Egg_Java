/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package guia5_01;
import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Java08 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int longitud = 8;
        
        System.out.println("Ingrese una frase o palabra de 8 de largo: ");
        frase = sc.nextLine();
        
        if(longitud == frase.length()){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
    }

    
}
