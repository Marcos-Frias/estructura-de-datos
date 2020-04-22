/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos;

/**
 *
 * @author marco
 */
public class EstructuraDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Array */
        
        /*Declaración eh inicialización de un array de int*/
        int[] array_number;
        array_number = new int[5];
        
        /*Agregar valores a un array*/
        array_number[0] = 100;
        array_number[1] = 200;
        array_number[2] = 300;
        array_number[3] = 400;
        array_number[4] = 500;
        
        /*Recorrer un array*/
        for(int i = 0; i < array_number.length ; i++){
            /*Mostrar en pantalla el array*/
            System.out.println(array_number[i]);
        } 
        
    }
    
}
