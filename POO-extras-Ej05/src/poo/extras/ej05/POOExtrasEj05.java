/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package poo.extras.ej05;

import entidades.Meses;
import java.util.Scanner;

public class POOExtrasEj05 {

    public static void main(String[] args) {
        Meses mes = new Meses();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String m;
        boolean resultado = false;
        System.out.println("Adivine el mes secreto!!");

        do {
            System.out.println("Introduzca el nombre del mes en minúsculas:");
            m = sc.next();
            if (m.equals(mes.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
                resultado = true;
            }else{
                System.out.println("Incorrecto!!, vuelva a intentarlo.");
            }
        } while (resultado != true);
    }

}
