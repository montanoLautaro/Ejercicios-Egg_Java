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
package servicios;

import entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena frase = new Cadena();
        int longitud;

        System.out.println("Ingrese una frase: ");
        frase.setFrase(sc.next());

        longitud = frase.getFrase().length();
        frase.setLongitud(longitud);

        return frase;
    }

    // A)
    public void contarVocales(Cadena frase) {
        int contador = 0;
        String letra;

        for (int i = 0; i < frase.getLongitud(); i++) {
            letra = frase.getFrase().substring(i, i + 1);
            letra = letra.toLowerCase();

            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    contador++;
                    break;
            }
        }
        System.out.println(contador);
    }

    // B)
    public void invertirFrase(Cadena frase) {
        String nuevaFrase = "";
        String letra;

        for (int i = frase.getLongitud(); i > 0; i--) {
            letra = frase.getFrase().substring(i - 1, i);
            nuevaFrase = nuevaFrase.concat(letra);
        }
        System.out.println("--FRASE INVERTIDA--");
        System.out.println(nuevaFrase);
    }

    // C) y D)
    public void vecesRepetido(Cadena frase, String letra) {
        int contador = 0;
        String letraCadena;
        for (int i = 0; i < frase.getLongitud(); i++) {
            letraCadena = frase.getFrase().substring(i, i + 1);
            if (letraCadena.equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        
        System.out.println("El carácter " + letra + " se repite " + contador + " veces.");
    }
    
    // E)
    public void compararLongitud(Cadena frase, String fraseIngresada){
        int longitudFraseIngresada = fraseIngresada.length();
        
        if(longitudFraseIngresada == frase.getLongitud()){
            System.out.println("Las dos frases tienen la misma longitud.");
        }else{
            System.out.println("Las frases tienen una longitud diferente.");
        }
    }
    
    // F)
    public void unirFrases(Cadena frase, String fraseIngresada){
        String nuevaFrase = frase.getFrase().concat(fraseIngresada);
        System.out.println(nuevaFrase);
    }

    // G)
    public void reemplazar(Cadena frase, String letra){
        String nuevaFrase = "";
        String letraCadena;
        for (int i = 0; i < frase.getLongitud(); i++){
            letraCadena = frase.getFrase().substring(i, i + 1);
            if(letraCadena.equalsIgnoreCase("a")){
                nuevaFrase = nuevaFrase.concat(letra);
            }else{
                nuevaFrase = nuevaFrase.concat(letraCadena);
            }
        }
        System.out.println(nuevaFrase);
    }
    
    // H)
    public boolean contiene(Cadena frase, String letra){
        boolean resultado = false;
        String letraCadena;
        for (int i = 0; i < frase.getLongitud(); i++) {
            letraCadena = frase.getFrase().substring(i, i + 1);
            if (letraCadena.equalsIgnoreCase(letra)) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
}
