package figgeom;

import java.awt.Color;

/**
 *
 * @author JCGARCIAO
 */
public class Circulo extends Figura {
    private int diametro;
    
    public Circulo(int diametro, Color color) {
        super(color);
        this.diametro = diametro;
    }
    
    public double calcularPerimetro(){
        return (2 * Math.PI * (this.diametro/2));
    }
    
    public double calcularArea(){
        return (Math.PI * Math.pow((this.diametro/2),2));
    }
}