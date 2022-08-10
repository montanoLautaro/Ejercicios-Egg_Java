/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java13 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        
        System.out.println("Ingrese un valor entero para 'n': ");
        n = sc.nextInt();
        
        for(i=0; i<n; i++){
           for(j=0; j<n; j++ ){
              if(i==0 || i==n-1){
                  System.out.print("* ");
              }
              else{
                  if(j==0 || j==n-1){
                      System.out.print("* ");
                  }
                  else{
                      System.out.print("  ");
                  }
              }
           }
           System.out.println("");
        }

    }
    
}
