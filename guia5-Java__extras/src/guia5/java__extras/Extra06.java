/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, promedioGeneral, promedioBajitos, acumuladorBajitos, acumulador;
        String respuesta = "si";
        int contadorBajitos, contador;
        
        contador = 0;
        contadorBajitos = 0;
        acumuladorBajitos = 0;
        acumulador = 0;
        
        while(respuesta.equalsIgnoreCase("si")){
            System.out.println("Ingrese la altura en mts: ");
            altura = sc.nextDouble();
            if(altura < 1.60){
                contadorBajitos++;
                acumuladorBajitos = acumuladorBajitos + altura;
            }
            acumulador = acumulador + altura;
            contador++;
            System.out.println("Desea continuar? (si/no): ");
            respuesta = sc.next();
           
        }
        
        promedioGeneral = acumulador / contador;
        promedioBajitos = acumuladorBajitos / contadorBajitos;
        
        System.out.println("El promedio de las estaturas por debajo de 1.60mts es de : " + promedioBajitos);
        System.out.println("El promedio en general de las estaturas es de: " + promedioGeneral);
        
    }

}
