/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos;

import java.util.ArrayList;

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
        
        /* Matrices */
        
        /*Declaración eh inicialización de una matriz de int*/
        int[][] matriz_number;
        matriz_number = new int[3][3];
        
        /*Agregar valores a una matriz*/
        matriz_number[0][0] = 100;
        matriz_number[0][1] = 100;
        matriz_number[0][2] = 100;
        matriz_number[1][0] = 200;
        matriz_number[1][1] = 200;
        matriz_number[1][2] = 200;
        matriz_number[2][0] = 300;
        matriz_number[2][1] = 300;
        matriz_number[2][2] = 300;
        
        /*Matriz inicializada con valores*/
        //matriz_number = {  {10,20,30},{40,50,60},{70,80,90},  {10,20,30},{40,50,60},{70,80,90} };
        
        /*Recorrer una matriz*/
        for (int i = 0; i < matriz_number.length ; i++) {
            for (int j = 0; j < matriz_number[i].length; j++) {
                System.out.print(matriz_number[i][j]+" | ");
            }
            System.out.println();
        }
        
                /* ArrayList */
        
        /* Declaracion*/
        ArrayList<String> alumnos;
        /*Instancia*/
        alumnos = new ArrayList<>();
        /*Agregar*/
        alumnos.add("Raul");
        alumnos.add("Alfredo");
        alumnos.add("Marcos");
        /*Recorrer*/
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("ADD: "+alumnos.get(i));
        }
        /*Eliminar*/
        alumnos.remove(2);
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("DELETE: "+alumnos.get(i));
        }
        
    }
    
}
