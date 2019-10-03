/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import encapsulation.paquete1.Clase1;
import encapsulation.paquete2.Clase2;
import encapsulation.paquete2.Clase2Hijo;
 
/**
 *
 * @author jc_go
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase0 cls0 = new Clase0();
        System.out.println(cls0.atributo1);
        System.out.println(cls0.atributo2);
        System.out.println(cls0.atributo4);
        
        Clase1 cls1 = new Clase1();
        
        System.out.println(cls1.atributo1);
        System.out.println(cls1.atributo2);
        System.out.println(cls1.atributo3);
        System.out.println(cls1.atributo4);
        
        Clase2Hijo cls2hijo = new Clase2Hijo();
        System.out.println(cls2hijo.atributo1);
        System.out.println(cls2hijo.atributo2);
        System.out.println(cls2hijo.atributo3);
        System.out.println(cls2hijo.atributo4);
        
    }
    
}
