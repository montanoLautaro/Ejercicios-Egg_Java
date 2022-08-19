/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package guia5.java__extras;

import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Extra05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoSocio;
        double precio, total, descuento;
        boolean validar = false;

        total = 0;

        System.out.println("Seleccione el tipo de socio: ");
        System.out.println("A. Socio de tipo 'A', tienen un 50% de descuento en los tratamientos. ");
        System.out.println("B. Socio de tipo 'B', tienen un 35% de descuento en los tratamientos. ");
        System.out.println("C. Socio de tipo 'C', no tienen descuentos en los tratamientos. ");
        tipoSocio = sc.next();

        tipoSocio = tipoSocio.toUpperCase();

        System.out.println("Ingrese el costo del tratamiento: ");
        precio = sc.nextDouble();

        switch (tipoSocio) {
            case "A":
                descuento = precio * 0.5;
                total = precio - descuento;
                validar = true;
                break;
            case "B":
                descuento = precio * 0.35;
                total = precio - descuento;
                validar = true;
                break;
            case "C":
                total = precio;
                validar = true;
                break;
            default:
                System.out.println("El tipo de socio ingresado no es válido.");

        }

        if (validar == true) {
            System.out.println("El total a pagar es de: " + total);
        }

    }

}
