/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8_2;

/**
 *
 * @author remix
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista creada = new Lista();
        String total = creada.leerArchivo("C:\\Users\\remix\\OneDrive\\Documentos\\NetBeansProjects\\Remedial\\src\\main\\java\\Ejercicio_8_2\\DocumentoLeer");
        creada = creada.separar(total);
        creada.imprimir();

    }
}

