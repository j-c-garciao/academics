/*
Copyright (c) 2019 - 2024, Juan Carlos Garcia Ojeda, Universidad de Cartagena
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.
   
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
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
    public double getArea()
    {
        return base * altura;
    }
    
    @Override
    public double getPerimetro()
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
