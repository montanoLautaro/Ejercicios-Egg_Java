/*

 */
package Entidad;

/**
 *
 * @author hered
 */
public class Persona {
    
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private int id;

    // INSTANCIACION (creacion del objeto al definir constructores)
    //CONSTRUCTORES  alt + insert
    
    //el constructor por defecto, que se borra al crear un nuevo constructor, tambien sirve para que no sea necesario inicializar al objeto
    public Persona(){
        
    }
    
    
    public Persona(String nombre, String apellido, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }


    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
