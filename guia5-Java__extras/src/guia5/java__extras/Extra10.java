/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package guia5.java__extras;

import java.util.Scanner;

public class Extra10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroA, numeroB, resultado, respuesta;
        boolean bandera = false;
        
        numeroA =  (int) (Math.random() * 10);
        numeroB =  (int) (Math.random() * 10);
        resultado = numeroA * numeroB;
        
        do{
            if(bandera == true){
                System.out.println("La respuesta es incorrecta, intentelo nuevamente. ");
            }
            System.out.println("Adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10 :");
            respuesta = sc.nextInt();
            bandera = true;
        }while(resultado != respuesta);
        
        System.out.println("Respuesta correcta!!");
        
    }
    
}
