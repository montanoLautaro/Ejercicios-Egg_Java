/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java17 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, digitos, contadorUno, contadorDos, contadorTres, contadorCuatro, contadorCinco;
        int[] vector;
        
        contadorUno=0;
        contadorDos=0;
        contadorTres=0;
        contadorCuatro=0;
        contadorCinco=0;
        
        
        System.out.println("Ingrese un valor para n: ");
        n = sc.nextInt();
       
        vector = new int[n];
        
        for(int i=0; i<n; i++){
           vector[i] = (int) (Math.random() * 100000);
            System.out.println(vector[i]);
           digitos = ContarDigitos(vector[i]);
           switch(digitos){
               case 1:
                   contadorUno++;
                   break;
               case 2:
                   contadorDos++;
                   break;
               case 3:
                   contadorTres++;
                   break;
               case 4:
                   contadorCuatro++;
                   break;
               case 5:
                   contadorCinco++;
                   break;
           }
        }
        
        System.out.println("Cantidad de numeros de 1 digito: " + contadorUno);
        System.out.println("Cantidad de numeros de 2 digitos: " + contadorDos);
        System.out.println("Cantidad de numeros de 3 digitos: " + contadorTres);
        System.out.println("Cantidad de numeros de 4 digitos: " + contadorCuatro);
        System.out.println("Cantidad de numeros de 5 digitos: " + contadorCinco);
        

        
    }
    
    public static int ContarDigitos(int numero){
        int contador, resultado;
        contador = 0;
        resultado = numero;
        
        do{
            resultado = resultado / 10;
            contador++;
        }while(resultado >= 1);

        return contador;
    }
    
    
}
