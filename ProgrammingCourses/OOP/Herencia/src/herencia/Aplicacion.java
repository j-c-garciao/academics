/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.awt.Color;

/**
 *
 * @author jc_go
 */
public class Aplicacion  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario d = new Docente(1,"Jose");
        Usuario u = new Usuario(1,"Andrea");
        
        u.setPrestamo();
        u.cod=20;
        d.setPrestamo();
        d.cod=30;
        Color c= Color.RED;
    }
    
}
