/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jc_go
 */
public class Aplicacion2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        String ladoA=JOptionPane.showInputDialog("Digite la dimension del lado A");
        t1.setLadoA(Integer.parseInt(ladoA));
        String ladoB=JOptionPane.showInputDialog("Digite la dimension del lado B");
        t1.setLadoB(Integer.parseInt(ladoB));
        String ladoC=JOptionPane.showInputDialog("Digite la dimension del lado C");
        t1.setLadoC(Integer.parseInt(ladoC));
        JOptionPane.showMessageDialog(null,"El valor del perimetro es "+String.valueOf(t1.calcularPerimetro()));
        System.out.println(t1.calcularPerimetro());
    }    
}
