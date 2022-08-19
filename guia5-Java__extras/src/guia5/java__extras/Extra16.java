/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Ingrese la cantidad de personas que desea ingresar: ");
        n = sc.nextInt();

        IngresarPersonas(n);

    }

    public static void IngresarPersonas(int cantidad) {
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[cantidad];
        String respuesta;
        int[] edad = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre de la persona número " + (i + 1) + ": ");
            if (i == 0) {
                nombre[i] = sc.nextLine();
            } else {
                sc.nextLine();
                nombre[i] = sc.nextLine();
            }
            System.out.println("Ingrese su edad: ");
            edad[i] = sc.nextInt();
        }
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            if (edad[i] > 17) {
                System.out.println(nombre[i] + " es mayor de edad.");
            } else {
                System.out.println(nombre[i] + " es menor de edad.");
            }

            if (i < cantidad - 1) {
                System.out.println("Desea seguir ingresando personas (si/no): ");
                respuesta = sc.nextLine();
                if (respuesta.equals("no")) {
                    break;
                }
            }
        }
    }

}
