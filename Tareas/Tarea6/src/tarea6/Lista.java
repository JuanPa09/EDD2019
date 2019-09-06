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
public class Lista {
    
    private Nodo inicio,fin;
    
    
    public boolean estaVacia() {
		if(inicio==null) {
			return true;
		}
		else {
			return false;
		}
	}
    
    public void insertar(int codigo,int stock,int Mstock, String codigop) {
		if(estaVacia()) {
			inicio = new Nodo(codigo,stock,Mstock,codigop);
			fin = inicio;
		}
		else {
			fin = fin.siguiente = new Nodo(codigo,stock,Mstock,codigop);			
		}
	}
    
    
    //INSERTAR PRODUCTOS CUYO STOCK SEA MENOR AL STOCK MINIMO
    public void mStock(Lista lista){ 
        System.out.println(" ");
        Lista listt=new Lista();
        //Recorrer Lista
        Nodo temp = lista.inicio;
       
        while(temp!= null) {
      
            int stock=temp.Stock;
            int Mstock=temp.Mstock;
                
            if(stock<Mstock){
                
                listt.insertar(temp.codigo,temp.Stock,temp.Mstock,temp.codigoP);
            
                
                
                
            }
		
            temp=temp.siguiente;
            
	}    
        
        
        //Imprimir
        System.out.println("Productos Con Stock menor a Stock Minimo");
        temp = listt.inicio;
        while(temp!=null){
        
            
           
            System.out.println("Codigo: "+temp.codigo);
            
            temp=temp.siguiente;
        
        }
        System.out.println(" ");
    }

    
    public void eliminar(){
        //Recorrer Lista
        Nodo temp = inicio;
        Nodo ant = null;
        while(temp!=null){
            int codigo = temp.codigo;
            
            if (estaVacia()){
                
                System.out.println("La lista esta vacia");
                
            }else{
                    if(codigo>100){
                        ant.siguiente=temp.siguiente;
                        temp.siguiente=null;
                        temp=ant;
                    }
                }
            
            ant=temp;
            temp=temp.siguiente;
            }
        }
    
    
   public void imprimir(){
       System.out.println("Productos");
        Nodo temp = inicio;
        while(temp!=null){
        
            System.out.println("Codigo: "+temp.codigo+" Stock: "+temp.Stock+" Stock Minimo: "+temp.Mstock+" Codigo Proveedor: "+temp.codigoP);
            
            temp=temp.siguiente;
        
        }
   
   }
   
    
    }
    

