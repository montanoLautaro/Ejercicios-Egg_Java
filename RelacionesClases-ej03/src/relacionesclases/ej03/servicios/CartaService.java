/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package relacionesclases.ej03.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import librerias.Consola;
import relacionesclases.ej03.entidades.Carta;
import relacionesclases.ej03.enumeraciones.Palo;

public class CartaService {

    private List<Carta> mazoPrincipal = new ArrayList();
    private List<Carta> mazoDescarte = new ArrayList();

    public void crearMazoPrincipal() {

        for (Palo aux : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    mazoPrincipal.add(new Carta(i, aux));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(mazoPrincipal);
    }

    public void siguienteCarta() {
        if (mazoPrincipal.isEmpty()) {
            System.out.println("No hay más cartas.");
        } else {
            
            mazoDescarte.add(mazoPrincipal.get(0));
            mazoPrincipal.remove(0);
            System.out.println(mazoDescarte.get(0));
        }
    }

    public void cartasDisponibles() {
        System.out.println("Números de cartas disponibles: " + mazoPrincipal.size());
    }

    public void darCartas() {
        int numeroCartas = Consola.leerEntero("Cuántas cartas quiere sacar?");
        if (numeroCartas > mazoPrincipal.size()) {
            System.out.println("El número de cartas excede la cantidad de cartas disponibles.");
        } else {
            for (int i = 0; i < numeroCartas; i++) {
                mazoDescarte.add(mazoPrincipal.get(0));
                mazoPrincipal.remove(0);
            }
        }
    }

    public void cartasMonton() {
        if (mazoDescarte.isEmpty()) {
            System.out.println("Todavia no se entrego ninguna carta. ");
        } else {
            for (Carta carta : mazoDescarte) {
                System.out.println(carta.toString());
            }
        }
    }

    public void mostrarBaraja() {
        if (mazoPrincipal.isEmpty()) {
            System.out.println("Ya no hay mas cartas en el mazo. ");
        } else {
            for (Carta carta : mazoPrincipal) {
                System.out.println(carta.toString());
            }
        }
    }

    public void menu() {
        crearMazoPrincipal();
        int opcion;
        do {
            System.out.println("\n\t --MENU PRINCIPAL--");
            System.out.println("Elija una opción: ");
            System.out.println("1. Barajar");
            System.out.println("2. Pasar a la siguiente carta");
            System.out.println("3. Mostrar el número de cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Mostrar las cartas del mazo de descarte");
            System.out.println("6. Mostrar la baraja");
            System.out.println("7. SALIR");
            opcion = Consola.leerEntero();
            
            switch (opcion) {
            case 1:
                System.out.println("Barajando el mazo...");
                barajar();
                break;
            case 2:
                System.out.println("Pasando a la siguiente carta...");
                siguienteCarta();
                break;
            case 3:
                cartasDisponibles();
                break;
            case 4:
                darCartas();
                break;
            case 5:
                System.out.println("--CARTAS DESCARTADAS--");
                cartasMonton();
                break;
            case 6:
                System.out.println("--CARTAS DISPONIBLES--");
                mostrarBaraja();
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta, intentelo nuevamente.");
        }
            
        }while(opcion != 7);
    
    }

}
