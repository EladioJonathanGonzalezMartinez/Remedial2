/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8_5;

/**
 *
 * @author remix
 */
public class Nodo {
    Polinomio poli;
    Nodo siguiente;

    public Nodo(Polinomio x) {
        this.poli = x;
        siguiente = null;
    }

    public Nodo(Polinomio x, Nodo nuevoelemento) {

        this.poli = x;
        siguiente = nuevoelemento;

    }

    Polinomio getPolinomio() {
        return this.poli;
    }

    Nodo getsiguientet() {
        return siguiente;
    }
}
