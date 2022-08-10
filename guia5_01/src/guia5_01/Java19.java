/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5_01;
import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Java19 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        boolean resultado = true;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Ingrese un valor [" + i + "][" + j + "]");
                matrizA[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                
                matrizB[j][i] = matrizA[i][j];
            }
        }
        
        System.out.println("Matriz original: ");
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
         System.out.println("Matriz transpuesta: ");
         
         for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if( (matrizB[i][j] * -1) != matrizA[i][j]){
                    resultado = false;
                }
            }
            System.out.println(" ");
        }
        
        System.out.println(resultado);
        
    }
    
}
