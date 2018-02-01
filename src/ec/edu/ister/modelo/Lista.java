/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Lista {
    protected Nodo nodo;

    public Lista() {
        nodo=null;
    }
    public Lista InsertarHeaderr(int entrada){
        Nodo nuevo=new Nodo(entrada);
        nuevo.enlace=nodo;
        nodo=nuevo;
        return this;
    }
    public void Imprimir(){
        Nodo n;
        n=nodo;
        String acu=" ";
        while(n!=null){
         acu+=n.dato+" ";
         n=n.enlace;
        }
        JOptionPane.showMessageDialog(null,acu);
    }
}