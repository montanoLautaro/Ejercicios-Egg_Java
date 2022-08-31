/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package guia5.java__extras;

import java.util.Random;

/**
 *
 * @author hered
 */
public class Extra20 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        int[] nuevoVector = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i < 10; i++) {
            vector[i] = aleatorio.nextInt(11);
        }

        FormatearVector(vector, nuevoVector);
        MostrarVector(nuevoVector);

        nuevoVector[0] = 6;

    }

    public static void FormatearVector(int[] vectorMolde, int[] nuevoVector) {

        System.arraycopy(vectorMolde, 0, nuevoVector, 0, 10);

    }

    public static void MostrarVector(int[] vector) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de la posición " + i + ": " + vector[i]);
        }
    }

}
