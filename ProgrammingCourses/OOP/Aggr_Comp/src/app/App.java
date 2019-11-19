/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import cliente.Cliente;
import empresa.Empresa;

/**
 *
 * @author jc_go
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empresa e1=new Empresa("X1"); 
       
       
       
       
       
       
       
       
       
       Cliente c1 = new Cliente("C1");
       Cliente c2 = new Cliente("C2");
       e1.addClientes(c1);
       e1.addClientes(c2);
    }
}
