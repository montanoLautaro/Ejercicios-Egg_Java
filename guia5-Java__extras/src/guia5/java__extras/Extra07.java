/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Ingrese el valor de n: ");
            n = sc.nextInt();

        } while (n <= 0);

        VersionWhile(n);
        VersionDoWhile(n);

    }

    public static void VersionWhile(int n) {
        double numeroIngresado, maximo, minimo, promedio, acumulador;
        Scanner sc = new Scanner(System.in);
        int i = 0;

        maximo = 0;
        minimo = 0;
        acumulador = 0;

        System.out.println("Version con WHILE");

        while (i < n) {
            System.out.println("Ingrese un numero: ");
            numeroIngresado = sc.nextDouble();

            if (i == 0) {
                maximo = numeroIngresado;
                minimo = numeroIngresado;
            } else {
                if (numeroIngresado > maximo) {
                    maximo = numeroIngresado;
                } else {
                    if (numeroIngresado < minimo) {
                        minimo = numeroIngresado;
                    }
                }
            }
            i++;
            acumulador = numeroIngresado + acumulador;
        }

        promedio = acumulador / n;

        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);

    }

    public static void VersionDoWhile(int n) {
        double numeroIngresado, maximo, minimo, promedio, acumulador;
        Scanner sc = new Scanner(System.in);
        int i = 0;

        maximo = 0;
        minimo = 0;
        acumulador = 0;

        System.out.println("Version Do While");

        do {
            System.out.println("Ingrese un numero: ");
            numeroIngresado = sc.nextDouble();

            if (i == 0) {
                maximo = numeroIngresado;
                minimo = numeroIngresado;
            } else {
                if (numeroIngresado > maximo) {
                    maximo = numeroIngresado;
                } else {
                    if (numeroIngresado < minimo) {
                        minimo = numeroIngresado;
                    }
                }
            }
            i++;
            acumulador = numeroIngresado + acumulador;
        } while (i < n);

        promedio = acumulador / n;

        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);

    }

}
