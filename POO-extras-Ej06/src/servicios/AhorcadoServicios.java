/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado nuevoAhorcado = new Ahorcado();
        int longitud;
        String palabra;

        System.out.println("Ingrese la palabra para el ahorcado: ");
        palabra = sc.next();
        longitud = palabra.length();
        String[] palabraBuscar = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            palabraBuscar[i] = palabra.substring(i, i + 1);
        }

        nuevoAhorcado.setPalabraBuscar(palabraBuscar);

        System.out.println("Ingrese la cantidad de jugadas máximas para el juego: ");
        nuevoAhorcado.setCantidadJugadasMax(sc.nextInt());
        
        nuevoAhorcado.setLetrasEncontradas(0);
        return nuevoAhorcado;
    }
    
    public int longitud(Ahorcado juego){
        int longitud = juego.getPalabraBuscar().length;
        System.out.println("La longitud de la palabra a buscar es de: " + longitud);
        return longitud;
    }
    
    public void buscar(String letra, int longitud, Ahorcado juego){
        boolean resultado = false;
        for(int i=0; i<longitud; i++){
            if(letra.equals(juego.getPalabraBuscar()[i])){
                resultado = true;
                break;
            }
        }
        
        if(resultado == true){
            System.out.println("La letra pertenece a la palabra.");
        }else{
            System.out.println("La letra no pertenece a la palabra.");
        }
    }
    
    public boolean encontradas(String letra, int longitud, Ahorcado juego ){
        boolean resultado = false;
        
        
        
        return resultado;
    }
    
}
