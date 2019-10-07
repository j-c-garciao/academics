package figgeom;

import java.awt.Color;

/**
 *
 * @author JCGARCIAO
 */

public class Triangulo extends Figura {
    
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC, Color color) {
        super(color);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public int calcularPerimetro(){
        return this.ladoA + this.ladoB + this.ladoC;
    }
    
    /**
     * Retorna el área de un triángulo conociendo la dimensión de sus
     * lados.
     * <p>
     * Este método asume que el tríangulo es válido según la dimensión
     * de sus lados: ladoA dimensión del lado A del triángulo,
     * ladoB dimensión del lado B del triángulo, y ladoC dimensión del 
     * lado C del triángulo.
     * @return el área del tringulo empleando la fórmula de Herón
     */
    
    public double calcularArea(){
    double s=(this.ladoA + this.ladoB + this.ladoC)/2.0;
    return Math.sqrt(s*(s-this.ladoA)*(s-this.ladoB)*(s-this.ladoC));
    }
}
