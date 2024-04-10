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
    public double getPerimetro()
    {
        return this.isValid() ? (ladoA + ladoB + ladoC) : null;
    }
    
    @Override
    public double getArea()
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
