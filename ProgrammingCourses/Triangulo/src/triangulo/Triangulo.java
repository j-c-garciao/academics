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
public class Triangulo {
    //ATRIBUTOS
    int ladoA;
    int ladoB;
    int ladoC;
    
    //CONSTRUCTOR
    public Triangulo(int ladoA, int ladoB, int ladoC){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }
    
    //METODOS
    public int getPerimetro(){
        return this.ladoA + this.ladoB + this.ladoC;
    }
   
}