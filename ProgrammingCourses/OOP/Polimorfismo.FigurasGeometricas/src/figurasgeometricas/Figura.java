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
    public abstract double getArea();
    @Override
    public abstract double getPerimetro();
    @Override
    public abstract String getType();
}