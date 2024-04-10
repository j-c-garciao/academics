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
    public double getPerimetro()
    {
        return (5*lado);
    }
    
    @Override
    public double getArea()
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
