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
package co.edu.unicartagena.matriz;

public class Matriz {
    public void rotacion(){
	int [][]matrix = new int [3][3];
        matrix[0][0]=1;matrix[0][1]=2;matrix[0][2]=3;
        matrix[1][0]=4;matrix[1][1]=5;matrix[1][2]=6;
        matrix[2][0]=7;matrix[2][1]=8;matrix[2][2]=9;
        
        for (int i=0;i<3;++i){
        	for (int j=0;j<3;++j){
            	System.out.print(matrix[i][j]+"\t");
           	}
        	System.out.println();
       	}        
        
        int []arregloSuperior=new int [3];
        int []arregloInferior=new int [3];
        int []arregloIzquierda=new int [3];
        int []arregloDerecha=new int [3];
              
        for (int i=0;i<3;++i)
        	arregloSuperior[i]=matrix[0][i];
         
        for (int i=0;i<3;++i)
        	arregloInferior[i]=matrix[2][i];
        
        for (int i=0;i<3;++i)
        	arregloIzquierda[i]=matrix[i][0];
        
        for (int i=0;i<3;++i)
        	arregloDerecha[i]=matrix[i][2];
        
        for (int i=0;i<3;++i)
        	System.out.println(arregloSuperior[i]);
        
    	System.out.println("***");
        
        for (int i=0;i<3;++i)
        	System.out.println(arregloInferior[i]);
        System.out.println("***");
        for (int i=0;i<3;++i)
        	System.out.println(arregloIzquierda[i]);
        System.out.println("***");
        for (int i=0;i<3;++i)
        	System.out.println(arregloDerecha[i]);
        System.out.println("***");
        
        //Rotacion Derecha 90
        
	System.out.println("Rotación Derecha 90°");
        
        //Superior a Derecha
        for(int i=0;i<3;++i){
                System.out.println("Fila a Columna");
              	matrix[i][2]=arregloSuperior[i];
        }
        //Derecha a Inferior
        for(int i=2;i>=0;i--){
                System.out.println("Columna a Fila");
              	matrix[2][2-i]=arregloDerecha[i];
        }        
        
        //Inferior a Izquierda
        for(int i=0;i<3;i++){
                System.out.println("Fila a Columna");
              	matrix[i][0]=arregloInferior[i];
        }
        
        //Izquierda a Superior
        for(int i=2;i>=0;i--){
                System.out.println("Columna a Fila");
              	matrix[0][i]=arregloIzquierda[2-i];
        }
        
        for (int i=0;i<3;++i){
        	for (int j=0;j<3;++j){
            	System.out.print(matrix[i][j]+"\t");
           	}
        	System.out.println();
       	}
    }
}