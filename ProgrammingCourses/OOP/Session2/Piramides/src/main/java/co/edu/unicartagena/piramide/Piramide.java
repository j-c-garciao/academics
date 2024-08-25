/*
Copyright (c) 2024, Juan Carlos Garcia Ojeda, Universidad de Cartagena
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

/*
Class created by employing the following prompt in ChatGPT

"Hola, soy estudiante y quiero una solución orientada a objetos 
programada en java que me permita gestión de n cantidad de pirámides 
de cuatro caras, base cuadrada, las pirámides son regulares"
*/



package co.edu.unicartagena.piramide;

// Clase Piramide
public class Piramide {
    private double base;  // Longitud de un lado de la base cuadrada
    private double altura; // Altura de la pirámide

    // Constructor
    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área de la base
    public double calcularAreaBase() {
        return base * base;
    }

    // Método para calcular el área lateral
    public double calcularAreaLateral() {
        double apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        return 4 * (base * apotema / 2);
    }

    // Método para calcular el área total
    public double calcularAreaTotal() {
        return calcularAreaBase() + calcularAreaLateral();
    }

    // Método para calcular el volumen
    public double calcularVolumen() {
        return (calcularAreaBase() * altura) / 3;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Piramide [Base=" + base + ", Altura=" + altura + "]";
    }
}