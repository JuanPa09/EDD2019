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
public class Bolsa {
    int a=0;
    class celda{
    int x,y;
    celda sig;
    }
    celda inicio = null;
    celda fin = null;
    
    void insertar(int x, int y){
       
    celda temp = new celda();
        temp.x=x;
        temp.y=y;
        if (inicio==null) {
            
        
        temp.sig=inicio;
        inicio=temp;
        fin=inicio;
        
        
        }else{
        
            temp.sig=inicio;
            inicio=temp;
            fin.sig = inicio;
           
        
        }
        
        a+=1;
    
    }
    
    void imprimir(){
        
    celda temp = new celda();
        temp=inicio;
        if (temp==null) {
            System.out.println("Bolsa Vacia");
        }else{
        
                    while(temp!=null){

                        System.out.println("X: "+temp.x+" Y: "+temp.y);
                        temp=temp.sig;
                        fin.sig=temp;

                                    if (temp.sig==fin.sig) {
                                        temp=temp.sig;
                                        System.out.println("X: "+temp.x+" Y: "+temp.y);
                                        temp=null;
                                    }


                    } 
      
        
        }
    
    
    }
    
    
    void vaciar(){
        
    celda temp = new celda();
        temp=inicio;
        if (temp==null) {
            System.out.println("La bolsa ya esta vacia");
        }else{
        
                    while(temp!=null){

                       
                        
                        temp=temp.sig;
                        inicio=temp;
                        fin.sig=temp;

                                    if (temp.sig==fin.sig) {
                                        temp=temp.sig;
                                        
                                        temp=null;
                                        inicio=null;
                                        fin=null;
                                    }


                    } 
      
        
        }
    
        
    }
    
    
    
    void contar(){
   
        System.out.println("Hay "+a+" Registros");
    }
    
    
    
}
