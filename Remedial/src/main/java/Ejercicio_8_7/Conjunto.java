/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8_7;

/**
 *
 * @author remix
 */
public class Conjunto {
    Elemento siguiente;
    Elemento primero;
    int Cardinal;
    
    public void Conjunto(){
        primero=null;
        Cardinal=0;
    }
    public boolean vacia(){
        return primero==null;
    }
    public int getCadinal(){
        return Cardinal;
    }
    public void agregar(int elemen){
        Elemento nuevo = new Elemento(elemen);
        if (vacia()) {
           primero= nuevo;
           siguiente=nuevo;           
        }else{
            siguiente.setSiguiente(nuevo);
            siguiente=nuevo;
        }
        Cardinal++;
    }
    public void buscar(int elemen){
        Elemento buscar=primero;
        while(buscar != null){
            if (buscar.getElemen()==elemen) {
                System.out.println(" Elemento "+elemen+" pertenece al conjunto ");  
                break;
            }
            buscar=buscar.getSiguiente();
        }
        if (buscar==null) {
            System.out.println("!Elemento "+elemen+" no pertenece al conjunto¡");  
        }
    }
    public void mostrar(){
        Elemento recorrer = primero;
        while(recorrer!=null){
            System.out.println("!Elemento"+recorrer.getElemen() +"¡");  
            recorrer = recorrer.getSiguiente();
        }
    }
}
