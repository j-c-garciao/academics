/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import animal.Gato;

/**
 *
 * @author jc_go
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.sonidoAnimal();
        gato.dormir();
    }
    
}
