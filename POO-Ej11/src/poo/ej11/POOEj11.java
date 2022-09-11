/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package poo.ej11;

import java.util.Date;
import java.util.Scanner;

public class POOEj11 {

    public static void main(String[] args) {
        int dia, mes, anio, diferencia;
        Scanner sc = new Scanner(System.in);
        Date fechaActual = new Date();
        
        System.out.println("Ingrese el día: ");
        dia = sc.nextInt();
        
        System.out.println("Ingrese el mes: ");
        mes = sc.nextInt();
        
        System.out.println("Ingrese el año: ");
        anio = sc.nextInt();
        
        Date fecha = new Date(anio - 1900, mes, dia);
        System.out.println(fecha);
        
        diferencia = Math.abs(fechaActual.getYear() - fecha.getYear());
        
        System.out.println("Cantidad de años que hay entre la fecha ingresada y la actual: " + diferencia);
        
    }
    
}
