/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        double promedio, hijos, promedioTotal;
        System.out.println("Ingrese la cantidad de familias: ");
        n = sc.nextInt();
        promedioTotal = 0;

        
        for(int i=1; i<=n; i++){
            hijos = 0;
            promedio = 0;
            System.out.println("Ingrese la cantidad de hijos para la familia número " + i + ": ");
            m = sc.nextInt();
            
            for(int j=1; j<=m;j++){
                hijos = (int) (hijos + (Math.random() * 20)); 
            }
            promedio = hijos / m;
            promedioTotal = promedioTotal + promedio;
            
        }

        promedioTotal = promedioTotal / n;
        System.out.println("La edad media es de: " + promedioTotal);
        
        
    }
    
}
