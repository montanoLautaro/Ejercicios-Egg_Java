/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package poo.ej10;

import java.util.Arrays;

public class POOEj10 {

    public static void main(String[] args) {
        float[] vectorA = new float[50];
        float[] vectorB = new float[20];

        for(int i=0; i<50; i++){
            Arrays.fill(vectorA, i, i+1,(float) Math.random() * 10);
        }
        System.out.println(Arrays.toString(vectorA));
        
        Arrays.sort(vectorA);

        System.arraycopy(vectorA, 0, vectorB, 0, 10);
        
        Arrays.fill(vectorB,9,20, 0.5F);
        
        System.out.println(Arrays.toString(vectorA));
        System.out.println(Arrays.toString(vectorB));
    }

}
