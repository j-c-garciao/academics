package figgeomapp;

import figgeom.Figura;
import figgeom.Pentagono;
import figgeom.Triangulo;
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
       Figura t1 = new Triangulo(7,7,7,Color.RED);
       System.out.println(p1.calcularPerimetro());
       System.out.println(p1.calcularArea());
       System.out.println(p1.getColor());
       
       System.out.println(t1.calcularPerimetro());
       System.out.println(t1.calcularArea());
       System.out.println(t1.getColor());
       
       
       if(t1 instanceof Triangulo){
           System.out.println("Es un triangulo");
       }
       
    }
}
