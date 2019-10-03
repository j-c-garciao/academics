/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author jc_go
 */
public class Aplicacion_2 {
    public static void main(String args[]){
        Triangulo triangulo[]= new Triangulo[100];
        //CREAR OBJETOS
        for(int i=0;i<100;++i){
            triangulo[i]=new Triangulo();
            triangulo[i].setLadoA((int)(Math.random()*9)+1);
            triangulo[i].setLadoB((int)(Math.random()*9)+1);
            triangulo[i].setLadoC((int)(Math.random()*9)+1);
       }
        
        for(int i=0;i<100;++i){
            for(int j=0;j<100;++j){
                if(triangulo[i].calcularPerimetro()>triangulo[j].calcularPerimetro()){
                    Triangulo aux = triangulo[i];
                    triangulo[i]=triangulo[j];
                    triangulo[j]=aux;
                }
           }
        }
        //LEER OBJETOS
        for(int i=0;i<100;++i){
            System.out.println(triangulo[i].calcularPerimetro());//+"         "+triangulo[i].getLados());
        }
    }
}