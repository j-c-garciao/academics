/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.App;

import LR.LR;

/**
 *
 * @author jc_go
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LR arreglo [] = new LR[50];
        arreglo[0]=new LR(1, "Titulo", "Artista", 0, 'r', 0);
        int id=1;
        System.out.println("El registro ["+id+"] "+arreglo[0].searchLR(arreglo, id));
        if(arreglo[0].searchLR(arreglo, id))
        
        
        
    }
    
}
