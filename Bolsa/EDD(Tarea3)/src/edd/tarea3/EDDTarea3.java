/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tarea3;

/**
 *
 * @author Juan Pablo
 */
public class EDDTarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bolsa bolsa = new Bolsa();
        
      bolsa.insertar(0, 0);
        bolsa.insertar(1,1);
        bolsa.insertar(2, 2);
        bolsa.insertar(3,3);
        bolsa.insertar(4,4);
        bolsa.insertar(5,5);
      
        bolsa.imprimir();
        bolsa.vaciar();
        bolsa.imprimir();
        bolsa.vaciar();
        bolsa.contar();
        
      
    }
    
}
