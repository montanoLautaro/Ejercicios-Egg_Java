/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java15 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector;
        vector = new int[100];
        vector = FormatearVector();
        MostrarVector(vector);
        
        
    }
    
    public static int[] FormatearVector(){
        int i;
        int[] vector = new int[100];
        
        for(i=0; i<100; i++){
            vector[i] = i + 1;
        }
        return vector;
    }
    public static void MostrarVector(int vector[]){
        int i;
        for(i=99; i>=0; i--){
            System.out.println(vector[i]);
        }
    }
    
}
