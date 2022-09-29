/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package colecciones.ej06;

import java.util.HashMap;
import java.util.Map;
import librerias.Consola;

public class Servicio {
    public int llamarMenu(HashMap<String,Integer> productos){
        int opcion;
        System.out.println("");
        System.out.println("--MENU--");
        System.out.println("1. Ingreso de producto");
        System.out.println("2. Modificar el precio de un producto");
        System.out.println("3. Eliminar un producto");
        System.out.println("4. Mostrar los productos");
        System.out.println("5. SALIR");
            opcion = Consola.leerEntero("Elija una opción: ");
            switch(opcion){
                case 1:
                    System.out.println("--INGRESO DE PRODUCTO A LA LISTA--");
                    ingresarElemento(productos);
                    break;
                case 2:
                    System.out.println("--MODIFICAR EL PRECIO DE UN PRODUCTO--");
                    modificarPrecio(productos);
                    break;
                case 3:
                    System.out.println("--ELIMINAR UN PRODUCTO DE LA LISTA--");
                    eliminarProducto(productos);
                    break;
                case 4:
                    System.out.println("--LISTA DE TODOS LOS PRODUCTOS--");
                    mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("");
                    System.out.println("La opcion ingresada es inválida, intentelo nuevamente.");
            }
        return opcion;
    }
    
    public void ingresarElemento(HashMap<String,Integer> productos){
        String nombreProducto = Consola.leer("Ingrese el nombre del producto: ");
        Integer precio = Consola.leerEntero("Ingrese el precio del producto: ");
        while(precio < 0){
            System.out.println("El precio ingresado no es válido.");
            precio = Consola.leerEntero("Ingrese el precio del producto: ");
        }
        productos.put(nombreProducto, precio); 
    }
    
    public void modificarPrecio(HashMap<String,Integer> productos){
        boolean resultado = false;
        String producto;
        Integer nuevoPrecio;

        mostrarProductos(productos);
        
        producto = Consola.leer("Ingrese el nombre del producto el cual desea modificar su precio: ");
        
        for (String aux : productos.keySet()) {
            if(aux.equals(producto)){
                resultado = true;
            }
        }
        
        if(resultado == true){
            nuevoPrecio = Consola.leerEntero("Ingrese el nuevo precio: ");
            
            productos.put(producto, nuevoPrecio);
            
            System.out.println("La modificación se realizo con exito.");
        }else{
            System.out.println("El producto ingresado no esta en la lista.");
        }
    }
    
    public void mostrarProductos(HashMap<String,Integer> productos){
        System.out.println("LISTA DE PRODUCTOS");
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Nombre: " + key + "      precio: $" + val);
        }
    }
    
    public void eliminarProducto(HashMap<String,Integer> productos){
        boolean resultado = false;
        String producto;
        
        mostrarProductos(productos);
        
        producto = Consola.leer("Ingrese el nombre del producto que desea eliminar: ");

        for (String aux : productos.keySet()) {
            if(aux.equals(producto)){
                resultado = true;
            }
        }
        
        if(resultado == true){
            productos.remove(producto);
            
            System.out.println("La modificación se realizo con exito.");
        }else{
            System.out.println("El producto ingresado no esta en la lista.");
        }
        
    }
    
    
}
