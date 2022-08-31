package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {

    // para que next() lea hasta ingresar un enter en vez del espacio
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {

        System.out.println("Introducir nombre: ");
        String nombre = leer.next();

        System.out.println("Introducir apodo: ");
        String apodo = leer.next();

        System.out.println("Introducir tipo: ");
        String tipo = leer.next();

        System.out.println("Introducir edad: ");
        int edad = leer.nextInt();

        System.out.println("Introducir raza: ");
        String raza = leer.next();

        return new Mascota(nombre, apodo, tipo, 0, true, raza);

        
    }

}
