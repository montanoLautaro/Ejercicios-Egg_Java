package poo.ej01;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author hered
 */
public class POOEj01 {

    public static void main(String[] args) {
        //INSTANCIACION (en esta etapa se guarda un espacio en memoria necesario para el objeto)
        Persona p1 = new Persona();

        Persona p2 = new Persona("Lautaro", "Montaño", 25, 12341234);

        PersonaService persServicio = new PersonaService();

        Persona p3 = persServicio.crearPersona();
        persServicio.MostrarPersona(p3);

//        p1.setNombre("juan");
//        p1.setApellido("Carlos");
//        p1.setEdad(33);
//        p1.setId(1234124);
//        
//        System.out.println("Nombre: " + p1.getNombre() +  ", Apellido: " + p1.getApellido() + ", Edad: " + p1.getEdad() + ", Id: " + p1.getId() + ".");
    }

}
