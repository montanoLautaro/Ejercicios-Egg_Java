/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, alturaJ;
        alturaJ = 1;
        System.out.println("Ingrese una altura para la escalera: ");
        altura = sc.nextInt();
        
        for(int i=0; i<=altura; i++){
            for(int j=1; j<alturaJ; j++){
                System.out.print(j);
            }
            alturaJ++;
            System.out.println("");
        }

    }
    
}
