/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;


public class MascotAPP {

    public static void main(String[] args) {
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
 
        System.out.println(m1.toString());
        
        //cuando dejamos de utilizar el objeto, lo eliminamos para no 
        //seguir ocupando memoria innecesariamente
        m1 = null;
    }

}
