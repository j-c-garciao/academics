/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author jc_go
 */
public class Triangulo {
    //ATRIBUTOS
    double ladoA;
    double ladoB;
    double ladoC;
    
    //CONSTRUCTOR
    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }
    
    //METODOS
    public double getArea(){
        double s;//s es el perimetro medio del triangulo
        s=(this.ladoA+this.ladoB+this.ladoC)/2;
        return Math.sqrt(s*(s-this.ladoA)*(s-this.ladoB)*(s-this.ladoC));
    }
    
    public String getLados(){
        return this.ladoA+" "+this.ladoB+" "+this.ladoC;
    }
}