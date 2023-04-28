package FigGeomApp;

import FigGeom.*;
import java.awt.Color;

public class App {
    public static void main(String[] args){
        //ARREGLO DE OBJETOS
        Circle circle_array []=new Circle[3];
        //int array[] = new int[10];
        circle_array[0]=new Circle(5, Color.RED);
        circle_array[1]=new Circle(4, Color.GREEN);
        circle_array[2]=new Circle(3, Color.BLUE);
        
        for(int i=0;i<circle_array.length;i++){
            System.out.println("El área del círculo "+(i+1)+" es "+circle_array[i].getArea());
        }
        
        
        
        
        
        
        //Circle circle = new Circle(5, Color.RED);
        /*Pentagon penta = new Pentagon(5, 5, 5, 5, 5, Color.BLUE);
        Rectangle recta = new Rectangle(5, 6, Color.CYAN);
        Triangle triangle = new Triangle(3, 4, 2, Color.BLACK);
        
        // Datos circulo
        System.out.println("Área circulo: " + circle.getArea());
        System.out.println("Perímetro circulo: " + circle.getPerimeter());
        System.out.println("Color circulo: " + circle.getColor());
        System.out.println("");
        
        // Datos triangulo
        System.out.println("Área triangulo: " + triangle.getArea());
        System.out.println("Perímetro triangulo: " + triangle.getPerimeter());
        System.out.println("Color triangulo: " + triangle.getColor());
        System.out.println("");
        
        // Datos rectangulo
        System.out.println("Área rectangulo: " + recta.getArea());
        System.out.println("Perímetro retangulo: " + recta.getPerimeter());
        System.out.println("Color rectangulo: " + recta.getColor());
        System.out.println("");
        
        // Datos pentagono
        System.out.println("Área pentangono: " + penta.getArea());
        System.out.println("Perímetro pentanogo: " + penta.getPerimeter());
        System.out.println("Color pentangono: " + penta.getColor());   */     
    }
}
