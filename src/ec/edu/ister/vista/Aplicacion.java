/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Lista;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB7-PC1-USE
 */
public class Aplicacion {
    public static void main(String[] args) {
        Random R;//genera numeros random
        int d;//representa el dato del nodo
        Lista lista;//crea la lista del nodo
        int k;//indica el numero de nodo de la lista  
        R = new Random();
        lista =new Lista();
        k=Integer.parseInt(JOptionPane.showInputDialog("ingrese numeros relacionados"));
        for(;k>0;k--){
            d= R.nextInt()%99;
            lista.InsertarHeaderr(d);
        }
               lista.Imprimir();
    }
}
