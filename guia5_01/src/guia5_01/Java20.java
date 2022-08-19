/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package guia5_01;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Java20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int valorDiagonales, valorColumna, valorFila;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un valor [" + i + "][" + j + "] entre el 1 y el 9: ");
                    matriz[i][j] = sc.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }

        MostrarMatriz(matriz);

        valorFila = ValidarFilas(matriz);
        valorColumna = ValidarColumnas(matriz);
        valorDiagonales = ValidarDiagonales(matriz);


        if ((valorFila != -1) && (valorColumna != -1) && (valorDiagonales != -1)) {
            if (valorFila == valorColumna && valorFila == valorDiagonales) {
                System.out.println("El cuadrado es mágico!!!");
            } else {
                System.out.println("El cuadrado no es mágico.");
            }
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    // si todas las filas dan como resultado mismo acumulador retorna el acumulador, sino retorna -1
    public static int ValidarFilas(int[][] matriz) {
        boolean resultado = true;
        boolean bandera = false;
        int acumuladroFila, valorFila;

        acumuladroFila = 0;
        valorFila = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                acumuladroFila = matriz[i][j] + acumuladroFila;
            }
            if (acumuladroFila == valorFila || bandera == false) {
                valorFila = acumuladroFila;
                bandera = true;
            } else {
                resultado = false;
            }
            acumuladroFila = 0;
        }
        if (resultado == true) {
            return valorFila;
        } else {
            return -1;
        }
    }

    // si todas las columnas dan como resultado mismo acumulador retorna el acumulador, sino retorna -1
    public static int ValidarColumnas(int[][] matriz) {
        boolean resultado = true;
        boolean bandera = false;
        int acumuladorColumnas, valorColumna;

        acumuladorColumnas = 0;
        valorColumna = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                acumuladorColumnas = matriz[j][i] + acumuladorColumnas;
            }
            if (acumuladorColumnas == valorColumna || bandera == false) {
                valorColumna = acumuladorColumnas;
                bandera = true;
            } else {
                resultado = false;
            }
            acumuladorColumnas = 0;
        }
        if (resultado == true) {
            return valorColumna;
        } else {
            return -1;
        }
    }

    // si las dos diagonales tienen el mismo valor retorna el valor del acumulador, sino retorna -1
    public static int ValidarDiagonales(int[][] matriz) {
        int valorDiagonales = 0;
        int acumuladorDiagonalA, acumuladorDiagonalB, diagonal;

        acumuladorDiagonalA = 0;
        acumuladorDiagonalB = 0;
        diagonal = 2;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    acumuladorDiagonalA = acumuladorDiagonalA + matriz[i][j];
                }
                if (j == diagonal) {
                    acumuladorDiagonalB = acumuladorDiagonalB + matriz[i][j];
                }

            }
            diagonal--;
        }

        if (acumuladorDiagonalA == acumuladorDiagonalB) {
            return acumuladorDiagonalA;
        } else {
            return -1;
        }
    }

    public static void MostrarMatriz(int[][] matriz) {
        System.out.println("Matriz: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
