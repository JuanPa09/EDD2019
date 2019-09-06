/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6;

/**
 *
 * @author Juan Pablo
 */
public class Tarea6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista list = new Lista();
        
        
        list.insertar(1, 100, 10, "452");
        list.insertar(2, 45, 50, "452");
        list.insertar(3, 30, 25, "452");
        list.insertar(50, 70, 100, "452");
        list.insertar(120, 20, 13, "452");
        list.insertar(200, 10, 20, "452");
        
        list.imprimir();
        
        list.mStock(list);
        
        list.eliminar();
        list.imprimir();
    }
    
}
