/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tarea.pkg1;

/**
 *
 * @author Juan Pablo
 */
public class MCD {
    int a,b;
    
    public MCD(int a,int b){

        this.a=a;
        this.b=b;

}
    
    public void Encontrar(){
    
        if (b==a){
        
            System.out.println("El MCD es "+a);
            
        }else{
        
            while (a!=b){
            
                if (a>b){
                
                    a=a-b;
                    
                }else{
                b=b-a;
                }
                
                System.out.println("("+a+","+b+")");
                
            }
            
            System.out.println("El MCD es "+a);
        }
                
    
    
    
    }
    
    
    
    
    
}
