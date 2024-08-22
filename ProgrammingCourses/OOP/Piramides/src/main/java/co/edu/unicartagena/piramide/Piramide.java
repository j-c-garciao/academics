package co.edu.unicartagena.piramide;

/**
 *
 * @author LENOVO
 */

// Clase Piramide
public class Piramide {
    private double base;  // Longitud de un lado de la base cuadrada
    private double altura; // Altura de la pirámide

    // Constructor
    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área de la base
    public double calcularAreaBase() {
        return base * base;
    }

    // Método para calcular el área lateral
    public double calcularAreaLateral() {
        double apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        return 4 * (base * apotema / 2);
    }

    // Método para calcular el área total
    public double calcularAreaTotal() {
        return calcularAreaBase() + calcularAreaLateral();
    }

    // Método para calcular el volumen
    public double calcularVolumen() {
        return (calcularAreaBase() * altura) / 3;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Piramide [Base=" + base + ", Altura=" + altura + "]";
    }
}