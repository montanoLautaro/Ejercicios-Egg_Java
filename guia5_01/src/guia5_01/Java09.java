/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package guia5_01;
import java.util.Scanner;

/**
 * @author lautaro
 */
public class Java09 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palabra, primerLetra;
        
        System.out.println("Ingrese una palabra: ");
        palabra = sc.nextLine();
        
        primerLetra = palabra.substring(0, 1);
        
        if("A".equals(primerLetra)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
       
    }
    
}
