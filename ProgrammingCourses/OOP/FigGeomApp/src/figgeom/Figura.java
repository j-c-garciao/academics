/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figgeom;

import java.awt.Color;

/**
 *
 * @author ESTUDIANTE
 */
public class Figura {
    private Color color;

    public Figura(Color color){
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
    
    public int calcularPerimetro() {
        return 1;
    }
    
    public double calcularArea() {
        return 1.0;
    }
    
    
}
