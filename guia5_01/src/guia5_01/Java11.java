/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java11 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numeroUno;
       int numeroDos;
       int opcion;
       float resultado;
       String confirmacion = "hola como";
       
    
       System.out.println("Ingrese un numero entero positivo: ");
       numeroUno = sc.nextInt();
       System.out.println("Ingrese otro numero entero positivo: ");
       numeroDos = sc.nextInt();
       
       do{
           System.out.println("MENU ");
           System.out.println("1. Sumar");
           System.out.println("2. Restar ");
           System.out.println("3. Multiplicar ");
           System.out.println("4. Dividir");
           System.out.println("5. Salir ");
           System.out.println("Elija una opción:");
           opcion = sc.nextInt();
           
           switch(opcion){
               case 1:
                   resultado = numeroUno + numeroDos;
                   System.out.println(resultado);
                   break;
               case 2:
                   resultado = numeroUno - numeroDos;
                   System.out.println(resultado);
                   break;
               case 3:
                   resultado = (float)numeroUno * numeroDos;
                   System.out.println(resultado);
                   break;
               case 4:
                   resultado = (float)numeroUno / numeroDos;
                   System.out.println(resultado);
                   break;
               case 5:
                   System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                   sc.nextLine();
                   confirmacion = sc.nextLine();
                   if(confirmacion.equalsIgnoreCase("S")){
                       System.out.println("Esta saliendo del programa.");
                   }
                   break;
               default:
                   System.out.println("La opción ingresada es invalida.");
                   break;
           }
           resultado = 0;
       }while(!confirmacion.equalsIgnoreCase("S"));
       
       
    }

}
