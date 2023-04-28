package FigGeom;

import java.awt.Color;

public class Circle 
{
    // Atributos
    private float radio;
    private Color color;    
    
    // Constructor
    public Circle(float radio,Color color) 
    {
        /*
            Modificación Constructor estándar:
            Leer modificación método "setRadio(float)". 
        */
        
        this.color = color;
        this.radio = Math.abs(radio);
    }
    
    // Setters
    public void setColor(Color color)
    {
        this.color = color;
    }
    
    public void setRadio(float radio)
    {
        /*
            Modificación "setRadio(float)" estándar:
        
            El valor "this.radio" es entendido cómo una longitud por ende no
            puede abarcar valores reales menores a 0.
        
            Modificación: Se asigna el valor absoluto del parametro al 
            atributo mediante método "abs()" de la clase Marh para restringir 
            los valores negativos.
        */
        this.radio = Math.abs(radio);
    }
    
    // Getters
    public Color getColor()
    {
        return this.color;
    }
    
    public float getRadio()
    {
        return this.radio;
    }
    
    /*
        Método "Public": double getArea(void)
    
        Cálcula y retornar el área del circulo, cómo valor decimal extenso en 
        cifras, en función de su radio mediante la formula A = PI*(r^2) 
        (Léease "pi por radio al cuadrado").
    
        E.j:
    
        Para objeto del tipo "Circle" con atributo "radio" igual a 5 se aplica 
        formula:
    
        > objetoEjemplo.getArea();
        >>> 78.5398 / <-- Resultado de retorno aproximado /
    */
    public double getArea()
    {
        return Math.PI * (Math.pow(this.radio, 2));
    }

    /*
        Método "Public": double getPerimeter(void)
    
        Cálcula y retonar el perímetro de un circulo, cómo valor decimal extenso
        en cifras, en función de su radio mediante la formula L = 2 * PI * r
        (Léease "dos por pi por radio").
    
        E.j:
    
        Para objeto del tipo "Circle" con atributo "radio" igual a 5 se aplica
        formula:
    
        > objetoEjemplo.getPerimeter();
        >>> 31.4159 / <-- Resultado de retorno aproximado /
    */
    public double getPerimeter()
    {
        return 2 * Math.PI * this.radio;
    }

}
