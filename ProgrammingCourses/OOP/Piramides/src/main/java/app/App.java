package app;

import co.edu.unicartagena.piramide.Piramide;

/**
 *
 * @author LENOVO
 */
public class App {
    
    public static void main(String[] args) {
        Piramide p1= new Piramide(50, 100);
        
        System.out.println("Área Base: " + p1.calcularAreaBase());
        System.out.println("Área Lateral: " + p1.calcularAreaLateral());
        System.out.println("Área Total: " + p1.calcularAreaTotal());
        System.out.println("Volumen: " + p1.calcularVolumen());
        System.out.println();
     }
}
    

