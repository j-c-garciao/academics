/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author jc_go
 */
public class Aplicacion1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        int ladoA=in.nextInt();
        t1.setLadoA(ladoA);
        int ladoB=in.nextInt();
        t1.setLadoB(ladoB);
        int ladoC=in.nextInt();
        t1.setLadoC(ladoC);
        System.out.println(t1.calcularPerimetro());
    }    
}
