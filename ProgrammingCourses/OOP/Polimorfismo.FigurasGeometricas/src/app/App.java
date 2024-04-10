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

package app;

import java.io.*;
import figurasgeometricas.*;
import java.awt.Color;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) 
    {
        Figura a = new Circulo(2.0, 2, Color.RED);
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(new File("data\\data.txt")));
            String line;
            String [] data;
            Figura [] al = new Figura[1000];
            Color color;
            int i=0;
            while((line=br.readLine()) != null)
            {
                data = line.split(";");
                switch(Integer.parseInt(data[2]))
                {
                    case 1: 
                        color = Color.RED;
                        break;
                    case 2: 
                        color = Color.BLUE;
                        break;
                    case 3: 
                        color = Color.YELLOW;
                        break;
                    default:
                        color = Color.BLACK;
                }
                switch (data[0]) 
                {
                    case "Circulo":
                        al[i++]=new Circulo(Double.parseDouble(data[3]), Integer.parseInt(data[1]), color);
                        break;
                        
                    case "Cuadrado":
                         al[i++]=new Rectangulo(Double.parseDouble(data[3]), Double.parseDouble(data[4]), Integer.parseInt(data[1]), color);
                        break;
                        
                    case "Triangulo":
                         al[i++]=new Triangulo(Double.parseDouble(data[3]), Double.parseDouble(data[4]), Double.parseDouble(data[5]), Integer.parseInt(data[1]), color);
                        break;
                        
                    default:
                         al[i++]=new Pentagono(Double.parseDouble(data[3]), Integer.parseInt(data[1]), color);
                        break;
                }
            }
            
            // Acceso del usuario
            Scanner read = new Scanner(System.in);
            Figura aux;
            int ID;
            int op;
            int pos = 0;
            int selec;
            do
            {
                System.out.println("Menú inicial: ");
                System.out.println("\n1. Ver datos de una figura");
                System.out.println("2. Modificar un datos");
                System.out.println("\n3. Salir\n");
                System.out.print("\nSeleccionar: "); op = read.nextInt();
                switch(op)
                {
                    case 1:
                        aux = null;
                        System.out.print("\nIngrese el ID de la figura: "); ID = read.nextInt();
                        for(int j = 0; j < al.length && aux == null; j++)
                        {
                            if(al[j].getID() == ID)
                            {
                                aux = al[j];
                            }
                        }
                        if(aux != null)
                        {
                            System.out.println("\nFigura encontrada: \n");
                            System.out.println(aux + "\n");
                        }
                        else
                        {
                            System.out.println("\nID ingresado no encontrado.\n");
                        }
                        break;
                    case 2:
                        aux = null;
                        System.out.print("\nIngrese el ID de la figura: "); ID = read.nextInt();
                        for(int j = 0; j < al.length && aux == null; j++)
                        {
                            if(al[j].getID() == ID)
                            {
                                aux = al[j];
                                pos = j;
                            }
                        }
                        if(aux != null)
                        {
                        switch (aux.getType()) 
                        {
                            case "Circulo":
                                Circulo c = new Circulo();
                                System.out.print("\nIngrese radio: ");
                                c.setRadio(read.nextDouble());
                                System.out.print("Ingrese color (1. Rojo, 2. Azul, 3. Amarillo): ");
                                selec = read.nextInt();
                                switch(selec)
                                {
                                    case 1:
                                        color = Color.RED;
                                        break;
                                    case 2:
                                        color = Color.BLUE;
                                        break;
                                    case 3:
                                        color = Color.YELLOW;
                                        break;
                                    default:
                                        System.out.println("\nOpción selecionda no valida.");
                                        color = aux.getColor();
                                }
                                c.setColor(color);
                                c.setID(aux.getID());
                                al[pos]= c;
                                break;
                            case "Rectangulo":
                                Rectangulo r = new Rectangulo();
                                System.out.print("\nIngrese la base: ");
                                r.setBase(read.nextDouble());
                                System.out.print("Ingrese la altura: ");
                                r.setAltura(read.nextDouble());
                                System.out.print("Ingrese color (1. Rojo, 2. Azul, 3. Amarillo): ");
                                selec = read.nextInt();
                                switch(selec)
                                {
                                    case 1:
                                        color = Color.RED;
                                        break;
                                    case 2:
                                        color = Color.BLUE;
                                        break;
                                    case 3:
                                        color = Color.YELLOW;
                                        break;
                                    default:
                                        System.out.println("\nOpción selecionda no valida.");
                                        color = aux.getColor();
                                }
                                r.setColor(color);
                                r.setID(aux.getID());
                                al[pos] = r;
                                break;
                            case "Triangulo":
                                Triangulo t = new Triangulo();
                                System.out.print("\nIngrese el lado A: ");
                                t.setLadoA(read.nextDouble());
                                System.out.print("Ingrese el lado B: ");
                                t.setLadoB(read.nextDouble());
                                System.out.print("Ingrese el lado C: ");
                                t.setLadoC(read.nextDouble());
                                System.out.print("Ingrese color (1. Rojo, 2. Azul, 3. Amarillo): ");
                                selec = read.nextInt();
                                switch(selec)
                                {
                                    case 1:
                                        color = Color.RED;
                                        break;
                                    case 2:
                                        color = Color.BLUE;
                                        break;
                                    case 3:
                                        color = Color.YELLOW;
                                        break;
                                    default:
                                        System.out.println("\nOpción selecionda no valida.");
                                        color = aux.getColor();
                                }
                                t.setColor(color);
                                t.setID(aux.getID());
                                al[pos]= t;
                                break;
                            default:
                                Pentagono p = new Pentagono();
                                System.out.print("\nIngrese la longitud de los lados: ");
                                p.setLado(read.nextDouble());
                                System.out.print("Ingrese color (1. Rojo, 2. Azul, 3. Amarillo): ");
                                selec = read.nextInt();
                                switch(selec)
                                {
                                    case 1:
                                        color = Color.RED;
                                        break;
                                    case 2:
                                        color = Color.BLUE;
                                        break;
                                    case 3:
                                        color = Color.YELLOW;
                                        break;
                                    default:
                                        System.out.println("\nOpción selecionda no valida.");
                                        color = aux.getColor();
                                }
                                p.setColor(color);
                                p.setID(aux.getID());
                                al[pos]= p;
                                break;
                        }
                                System.out.println("\nFinalización de configuración de datos . . . \n");
                                System.out.println("\nSeleccione la opción 1 del menú principal para visualizar los nuevos datos . . . \n");
                            }
                            else
                            {
                                System.out.println("\nID ingresado no encontrado.\n");
                            }                        
                            break;
                        case 3: break;
                        default:
                            System.out.println("\nOPCIÓN SELECIONADA NO VALIDA\n");
                }
            }while(op != 3);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }   
}
