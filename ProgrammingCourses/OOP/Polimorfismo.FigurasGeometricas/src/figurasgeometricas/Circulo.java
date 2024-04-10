package figurasgeometricas;

import java.awt.Color;

public class Circulo extends Figura
{
    // Atributos
    private double radio;
    
    // Constructores
    
    // Constructor padre
    public Circulo(int ID, Color color)
    {
        super(ID, color);
    }
    
    // Constructor propio
    public Circulo(Double radio, int ID, Color color)
    {
        super(ID, color);
        this.radio = radio;
    }
    
    // Constructor nulo
    public Circulo()
    {
        super();
    }
    
    // Setters
    public void setRadio(double radio)
    {
        this.radio = radio;
    }
    
    // Getters
    public double getRadio()
    {
        return radio;
    }
    
    
    // Definición de métodos
    @Override
    public Double getPerimetro()
    {
        return 2 * Math.PI * radio;
    }
    
    @Override
    public Double getArea()
    {
        return Math.PI * Math.pow(radio, 2);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura: Circulo").append("\n");
        sb.append("ID: ").append(this.getID()).append("\n");
        sb.append("Área: ").append(this.getArea()).append("\n");
        sb.append("Perímetro: ").append(this.getPerimetro()).append("\n");
        sb.append("Color: ").append(this.getColor());
        return sb.toString();
    }
    
    @Override
    public String getType()
    {
        return "Circulo";
    }
}
