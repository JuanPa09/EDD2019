/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tarea.pkg1;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo
 */
public class Date {
    
    int dia,mes,anio;
    int name=3;
    int a=4;
    String nombre;
   
    
    
    public Date(int dia, int mes, int anio){
    
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        
        
    
    }
    
    
    public void Day(){
    int day=2;
    int year=1700;
    int month =1;
   
    
        while( day<dia || month<mes || year<anio){
           
            day+=1;
            
            
            
             if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                 
                            if (day>31){

                            day=1;
                            month+=1; 
                            
                            if(month>12){
                              a+=1;
                                month=1;
                                year+=1;
                                
                            }
                            
                            }
                    }else{
                    
                        if (month == 2){
                           
                            if (a==4){
                            
                            if(day>29){
                            day=1;
                            month+=1;  
                            }
                            
                            }else{
                                
                              if(day>28){
                            day=1;
                            month+=1;  
                            }  
                            }
                            
                            if(month>12){
                              a+=1;
                                month=1;
                                year+=1;
                                
                            }
                            
                            
                            
                        }else{
                    
                            if(day>30){
                            day=1;
                            month+=1; 
                            
                            if(month>12){
                              a+=1;
                                month=1;
                                year+=1;
                                
                            }
                            
                            }
                        }             
                    
            
                     
            
           
            
            
           
             }
             
              name+=1;
            if (name==8){
            name=1;
            }
            
            if (a==5){
            
            a=1;
                
            }
             
             
            //  System.out.println("("+day+","+month+","+year+")"+"dia= "+name);
        }
        
        
        
    switch (name){
        case 1: System.out.println("Lunes"); break;
        case 2:System.out.println("Martes"); break;
        case 3:System.out.println("Miercoles"); break;
        case 4:System.out.println("Jueves"); break;
        case 5:System.out.println("Viernes"); break;
        case 6:System.out.println("Sabado"); break;
        case 7:System.out.println("Domingo"); break;
            }
    
    
    }
}
