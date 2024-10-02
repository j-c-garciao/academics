/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import usuarios.Docente;
import usuarios.Usuario;
import java.awt.Color;

/**
 *
 * @author jc_go
 */
public class App  {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u = new Docente(1);
        Docente d = new Docente(1);
        
        //Docente d1 = new Usuario(1);
        u.setPrestamo();
        
        d.setPrestamo();
        d.



         //Usuario d = new Docente(1,"Jose");
        //Usuario u = new Usuario(1,"Andrea");
        //Usuario u1 = new Usuario(2,"Pepe",9);
        
        //u.setPrestamo();
        //u.cod=20;
        //d.setPrestamo();
        //d.cod=30;
        //System.out.println(u1.getSecret());
    }
    
}
