/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tarea.pkg2;

/**
 *
 * @author Juan Pablo
 */
public class Primos {
    
    int contador=0;
    int b;
    double c,d;
    
    
    public void Find(int a){
    
        for (int i = 1; i <= a; i++) {
            
            
            for (int j = 1; j <= i; j++) {
               
                double v1=i;
                double v2=j;
                
                
                
                
                b=i/j;
                c=v1/v2;
             
                if (c==b) {
                    contador+=1;
                    
                    if (contador==3){
                    //No es Primo
                  break;
                    }
                    
                }
                
                
                
            }
            
            if (contador!=3){
            //Es Primo
                System.out.println(i);
            }
            contador=0;
            
        }
        
        
    
    
    }
    
    

    
    
}
