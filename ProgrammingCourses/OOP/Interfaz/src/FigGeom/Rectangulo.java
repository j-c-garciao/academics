/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figgeom;

import java.awt.Color;

/**
 *
 * @author JCGARCIAO
 */
public class Rectangulo extends Figura {
    private int ladoA;
    private int ladoB;

    public Rectangulo(int ladoA, int ladoB, Color color) {
        super(color);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    public int calcularPerimetro(){
        return 2 * this.ladoA + 2 * this.ladoB;
    }
    
    public int calcularArea(){
        return this.ladoA * this.ladoB;
    }
}
