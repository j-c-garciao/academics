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
    
    public Triangulo(){
        
    }
    
    //METODOS
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
    
    public int calcularPerimetro(){
        return this.ladoA + this.ladoB + this.ladoC;
    }
    
    
   
}