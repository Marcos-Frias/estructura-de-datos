/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos;

/**
 *
 * @author marcos
 */
public class Recursividad {
    
    public int fibonacci(int num){
        if ( num == 0 || num == 1) {
            return num;
        }else{
            return fibonacci(num -1) + fibonacci(num -2);
        }
    }
            
    
}
