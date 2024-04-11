/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Mensaje;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // Se importa la clase Mensaje de el
        // paquete1, para hacer uso de la funcion obtenerMensaje que nos retorna
        // un valor de tipo String
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        String cadena = String.format("%s con %d\n",
                Mensaje.obtenerMensaje(), Informacion.obtenerHabitantes());
        // Si el numero ingresado tiene un valor entre el 1 y el 5 imprimira
        // el valor que almacene la variable 'cadena' caso contrario imprimiremos
        // el valor de 'cadena' en mayusculas con la ayuda de la funcion 
        // toUpperCase().
        if (num <= 5 && num >= 1) {
            System.out.printf(cadena);
        } else {
            cadena = cadena.toUpperCase();
            System.out.printf(cadena);
        }
        // usar printf;

        // Si ingresa 1 2 3 4 5 se presentara la cadena original de lo contrario
        // se presentara en mayuscula
    }

}
