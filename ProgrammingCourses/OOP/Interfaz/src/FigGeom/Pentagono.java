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
public class Pentagono extends Figura {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int ladoD;
    private int ladoE;
    
    public Pentagono(int ladoA, int ladoB, int ladoC, int ladoD, int ladoE, Color color) {
        super(color);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
        this.ladoE = ladoE;
    }

    public int calcularPerimetro(){
        return this.ladoA + this.ladoB + this.ladoC + this.ladoD + this.ladoE;
    }
    
     /**
     * Retorna el área de un pentagono conociendo la dimensión de uno de sus
     * lados. 
     * <p>
     * Este método asume que el pentagono es regular (i.e., todos sus lados 
     * iguales): ladoA dimensión del lado A del triángulo.
     * <p>
     * @return el área del pentagono empleando la estrategia de los triángulo
     * rectángulos.
     */
    
    public double calcularArea(){
      double b = (((double)ladoA)/2); 
      double h = b / Math.tan(36.0);
      double At = (b * h) / 2;
      return At * 10;
    }
    
    public String toString(){
        return "Lado A    := " +this.ladoA +"\n"+
               "Lado B    := " +this.ladoB +"\n"+
               "Lado C    := " +this.ladoC +"\n"+
               "Lado D    := " +this.ladoD +"\n"+
               "Lado E    := " +this.ladoE +"\n"+
               "Perimetro := " +this.calcularPerimetro()+ "\n"+
               "Area      := " +this.calcularArea()+"\n"+
               "***************\n";
    }
}