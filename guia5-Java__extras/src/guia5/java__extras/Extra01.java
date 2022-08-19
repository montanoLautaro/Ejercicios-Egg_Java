/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia5.java__extras;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Extra01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias, minutos, horas, auxiliar;

        horas = 0;
        dias = 0;
        
        System.out.println("Ingrese una cantidad de minutos: ");
        minutos = sc.nextInt();
        auxiliar = minutos;
        
        while(auxiliar >= 1440){
            auxiliar = auxiliar - 1440;
            dias++;
        }
        
        while(auxiliar >= 60){
            auxiliar = auxiliar - 60;
            horas++;
        }
        
        System.out.println( minutos + " minutos es equivalente a: " + horas + " día/s, " + horas + " hora/s.");
    }
    
}
