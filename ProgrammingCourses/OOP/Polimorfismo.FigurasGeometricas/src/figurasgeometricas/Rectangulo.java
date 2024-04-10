package figurasgeometricas;

import java.awt.Color;

public class Rectangulo extends Figura
{
    // Atributos
    private double base;
    private double altura;
    
    // Constructores

    // Constructor padre
    public Rectangulo(int ID, Color color)
    {
        super(ID, color);
    }
    
    // Constructor propio
    public Rectangulo(double base, double altura, int ID, Color color)
    {
        super(ID, color);
        this.base = base;
        this.altura = altura;
    }
    
    // Constructor nulo
    public Rectangulo()
    {
        super();
    }
    
    // Setters
    public void setBase(double base)
    {
        this.base = base;
    }
    
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    
    // Getters
    public double getBase()
    {
        return base;
    }
    
    public double getAltura()
    {
        return altura;
    }
    
    // Definición de métodos
    @Override
    public Double getArea()
    {
        return base * altura;
    }
    
    @Override
    public Double getPerimetro()
    {
        return (base * 2) + (altura * 2);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: Rectangulo").append("\n");
        sb.append("ID: ").append(this.getID()).append("\n");
        sb.append("Área: ").append(this.getArea()).append("\n");
        sb.append("Perímetro: ").append(this.getPerimetro()).append("\n");
        sb.append("Color: ").append(this.getColor());
        return sb.toString();
    }
    
    @Override
    public String getType()
    {
        return "Rectangulo";
    }
}
