/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package poo.ej08;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

public class POOEj08 {

    public static void main(String[] args) {
        CadenaServicio sv = new CadenaServicio();
        Cadena frase = sv.crearCadena();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("--CONTADOR DE VOCALES--");
        sv.contarVocales(frase);
        
        sv.invertirFrase(frase);
        
        System.out.println("--VECES QUE SE REPITE EL CARACTER--");
        System.out.println("Ingrese una letra: ");
        sv.vecesRepetido(frase, sc.next());
        
        System.out.println("--COMPARAR LONGITUD--");
        System.out.println("Ingrese una nueva frase: ");
        sv.compararLongitud(frase, sc.next());
        
        System.out.println("--FRASES CONCATENADAS--");
        System.out.println("Ingrese una nueva frase: ");
        sv.unirFrases(frase, sc.next());
              
        System.out.println("--MODIFICAR LETRA A DE LA CADENA--");
        System.out.println("Ingrese una letra: ");
        sv.reemplazar(frase, sc.next());
        
        
        System.out.println("--CONTIENE UNA LETRA INGRESADA--");
        System.out.println("Ingrese una letra: ");
        sv.contiene(frase, sc.next());
    }
    
}
