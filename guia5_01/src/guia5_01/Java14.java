/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guia5_01;
import java.util.Scanner;
/**
 *
 * @author hered
 */
public class Java14 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double euros;
        String moneda;
        
        System.out.println("Ingrese el valor en euros: ");
        euros = sc.nextDouble();
        System.out.println("Ingrese el tipo de moneda al cual desea convertir (dolares, yenes o libras): ");
        sc.nextLine();
        moneda = sc.nextLine();
        ConvertirMoneda(euros, moneda);
        
        
    }
    
    public static void ConvertirMoneda(double euros, String moneda){
        double resultado;
        resultado = 0;
        
        switch(moneda){
            case "libras":
                resultado = euros *  0.8;
                break;
            case "dolares":
                resultado = euros * 1.28611;
                break;
            case "yenes":
                resultado = euros * 129.852;
                break;
            default:
                System.out.println("El tipo de moneda ingresado es incorrecto.");
        
        }
       
        if(resultado > 0){
            System.out.println(euros + " Euros equivalen a " + resultado + " " + moneda);
        }
        
    }
    
}
