package figurasgeometricas;

import java.awt.Color;

public class Triangulo extends Figura
{
    // Atributos
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    // Constructores
    
    // Constructor padre
    public Triangulo(int ID, Color color)
    {
        super(ID, color);
    }
    
    // Constructor propio
    public Triangulo(double ladoA, double ladoB, double ladoC, int ID, Color color)
    {
        super(ID, color);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // Constructor nulo
    public Triangulo()
    {
        super();
    }
    
    // Setters

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    // Getters
    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }
    
    // Métodos
    private boolean isValid()
    {
        return (ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA;
    }
    
    private double calcArea()
    {
        double s = (this.getPerimetro()) / 2;
        return Math.sqrt((s*(s-ladoA)*(s-ladoB)*(s-ladoC)));
    }
    
    // Definición de métodos 
    @Override
    public Double getPerimetro()
    {
        return this.isValid() ? (ladoA + ladoB + ladoC) : null;
    }
    
    @Override
    public Double getArea()
    {
        return this.isValid() ? calcArea() : null;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: Triangulo").append("\n");
        sb.append("ID: ").append(this.getID()).append("\n");
        sb.append("Área: ").append(this.getArea()).append("\n");
        sb.append("Perímetro: ").append(this.getPerimetro()).append("\n");
        sb.append("Color: ").append(this.getColor());
        return sb.toString();
    }
    
    @Override
    public String getType()
    {
        return "Triangulo";
    }
}
