/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;
import java.lang.Math ;

/**
 *
 * @author jc_go
 */
public class Concurrencia extends Thread {
    int numero;
    Concurrencia(int n){ 
        this.numero = n; 
    }
    public void run() {
    try{ 
        while(true){
            System.out.println(numero);
            sleep((long)(2500*Math.random()));
            
        }
    } 
    catch (InterruptedException e){ 
        return; 
        } 
    }
    public static void main (String args[]) {
    for (int i=0; i<10; i++)
        new Concurrencia(i).start();
    }
} 