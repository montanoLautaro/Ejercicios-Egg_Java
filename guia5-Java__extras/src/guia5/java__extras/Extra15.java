/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroA, numeroB;

        System.out.println("Ingrese un número: ");
        numeroA = sc.nextDouble();

        System.out.println("Ingrese otro número: ");
        numeroB = sc.nextDouble();
        
        System.out.println("El resultado de la suma entre los dos números es: " + suma(numeroA,numeroB));
        System.out.println("El resultado de la resta entre los dos números es: " + resta(numeroA,numeroB));
        System.out.println("El resultado de la multiplicación entre los dos números es: " + multiplicar(numeroA,numeroB));
        System.out.println("El resultado de la división entre los dos números es: " + dividir(numeroA,numeroB));

    }

    public static double suma(double numeroA, double numeroB) {
        double resultado;

        resultado = numeroA + numeroB;

        return resultado;
    }

    public static double resta(double numeroA, double numeroB) {
        double resultado;

        resultado = numeroA - numeroB;

        return resultado;
    }

    public static double multiplicar(double numeroA, double numeroB) {
        double resultado;

        resultado = numeroA * numeroB;

        return resultado;
    }

    public static double dividir(double numeroA, double numeroB) {
        double resultado;

        resultado = numeroA / numeroB;

        return resultado;
    }

}
