package FigGeom;

import java.awt.Color;

public class Rectangle {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    private Color color;


    public Rectangle(int base, int height, Color color){

        this.sideA = base;
        this.sideB = height;
        this.sideC = base;
        this.sideD = height;

        this.color = color;

    }
    
    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setSideA(double sideA){

        this.sideA = sideA;

    }

    public void setSideB(double sideB){

        this.sideB = sideB;

    }

    public void setSideC(double sideC){

        this.sideC = sideC;

    }

    public void setSideD(double sideD){

        this.sideD = sideD;

    }

    public void setBase(double base){

        this.sideA = base;
        this.sideC = base;

    }

    public void setHeight(double height){

        this.sideB = height;
        this.sideD = height;

    }

    public Color getColor()
    {
        return this.color;
    }
    
    public double getBase(){

        return this.sideA;

    }

    public double getHeight(){

        return this.sideB;

    }

    private boolean isValid(){

        toOrganize();

        if(this.sideA != this.sideC || this.sideB != this.sideD){
            return false;
        }
        return true;
    }

    private void toOrganize(){

        if(this.sideA == this.sideB){

            double aux = this.sideB;
            this.sideB = this.sideC;
            this.sideC = aux;

        }

    }

    public double getPerimeter(){

        if(!isValid()){
            System.out.print("This Rectangle does not exist");
            return 0;
        }

        return sideA+sideB+sideC+sideD;

    }

    public double getArea(){
        
        if(!isValid()){

            System.out.print("This Rectangle does not exist");
            return 0;
        }

        return sideA*sideB;

    }

}
