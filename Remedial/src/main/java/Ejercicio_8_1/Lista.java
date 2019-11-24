/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8_1;

/**
 *
 * @author remix
 */
public class Lista {
//Declaración de atributos

    private nodo inicio;
    private nodo fin;

    //Constructos de la clase Lista
    public Lista() {
        inicio = fin = null;
    }

    //Metodo para agregar un nodo al final
    public void agregarFin(int info) {

        nodo nuevo = new nodo(info, null);

        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }

    }

    //Metodo para imprimir los datos
    public void imprimir() {
        nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    //Metodo apra eliminar los valores que superen un valor dado
    public void eliminar(int valor) {
        nodo anterior = inicio;
        nodo aux = inicio.getSiguiente();
        nodo temp;
        while (aux != null) {
            //Condicional simple para eliminacion de nodos
            if (aux.getDato() > valor) {
                temp = aux.getSiguiente();
                anterior.setSiguiente(aux.getSiguiente());
                aux = temp;
            } else {
                anterior = anterior.getSiguiente();
                aux = aux.getSiguiente();
            }
        }
    }
}
