/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author jc_go
 */
public class Gato implements Animal {

    @Override
    public void sonidoAnimal() {
        System.out.println("Miau Miau");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz");
    }
    
}
