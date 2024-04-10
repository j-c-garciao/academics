package figurasgeometricas;

import java.awt.Color;

public abstract class Figura implements Operaciones
{
    // Atributos
    private Color color;
    private int ID;
    
    // Constructor
    public Figura(int ID, Color color)
    {
        this.ID = ID;
        this.color = color;
    }
    
    public Figura()
    {
        // Constructor NULO
    }
    
    // Setters
    public void setColor(Color color)
    {
        this.color = color;
    }
    
    public void setID(int ID)
    {
        this.ID = ID;
    }
    
    // Getters
    public Color getColor()
    {
        return color;
    }
    
    public int getID()
    {
        return ID;
    }
    // Métodos abstractos
    @Override
    public abstract Double getArea();
    @Override
    public abstract Double getPerimetro();
    @Override
    public abstract String getType();
}