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
public class Aplicacion {
    public static void main(String args[]){
        Triangulo triangulo[]= new Triangulo[100];
        
        //CREAR OBJETOS
        for(int i=0;i<100;++i){
            triangulo[i]=new Triangulo(Math.random()*9+1,Math.random()*9+1,Math.random()*9+1);
        }
        
        for(int i=0;i<100;++i){
            for(int j=0;j<100;++j){
                if(triangulo[i].getArea()>triangulo[j].getArea()){
                    Triangulo aux = triangulo[i];
                    triangulo[i]=triangulo[j];
                    triangulo[j]=aux;
                }
           }
        }
        
        //LEER OBJETOS
        for(int i=0;i<100;++i){
            System.out.println(triangulo[i].getArea());//+"         "+triangulo[i].getLados());
        }
    }
}
