/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // Se importa la clase Mensaje de el
        // paquete1, para hacer uso de la funcion obtenerMensaje que nos retorna
        // un valor de tipo String
        System.out.printf("%s con %d\n",Mensaje.obtenerMensaje(),Informacion.obtenerHabitantes());
        // usar printf;
    }
    
}
