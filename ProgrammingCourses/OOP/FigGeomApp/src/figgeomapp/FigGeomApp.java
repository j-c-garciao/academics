package figgeomapp;

import figgeom.Pentagono;
import java.awt.Color;

/**
 *
 * @author ESTUDIANTE
 */
public class FigGeomApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pentagono p1 = new Pentagono (7,7,7,7,7,Color.BLUE);
       System.out.println(p1.calcularPerimetro());
       System.out.println(p1.calcularArea());
       System.out.println(p1.getColor());
    }
}
