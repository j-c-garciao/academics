package figurasgeometricas;

import java.awt.Color;

public class Pentagono extends Figura 
{
    // Atributos
    private double lado;
    
    // Constructores
    
    // Constructor padre
    public Pentagono(int ID, Color color)
    {
        super(ID, color);
    }
    
    // Constructor propio
    public Pentagono(double lado, int ID, Color color)
    {
        super(ID, color);
        this.lado = lado;
    }
    
    // Constructor nulo
    public Pentagono()
    {
        super();
    }
    
    // Setters
    public void setLado(double lado)
    {
        this.lado = lado;
    }
    
    // Getters
    public double getLado()
    {
        return lado;
    }
    
    // Definición de métodos
    @Override
    public Double getPerimetro()
    {
        return (5*lado);
    }
    
    @Override
    public Double getArea()
    {
        return 1.72 * Math.pow(lado, 2);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: Pentagono").append("\n");
        sb.append("ID: ").append(this.getID()).append("\n");
        sb.append("Área: ").append(this.getArea()).append("\n");
        sb.append("Perímetro: ").append(this.getPerimetro()).append("\n");
        sb.append("Color: ").append(this.getColor());
        return sb.toString();
    }
    
    @Override
    public String getType()
    {
        return "Pentagono";
    }
}
