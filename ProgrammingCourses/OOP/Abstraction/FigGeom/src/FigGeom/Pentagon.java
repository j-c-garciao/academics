package FigGeom;

import java.awt.Color;

public class Pentagon {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sideE;

    private Color color;

    public Pentagon(double sideA, double sideB, double sideC, double sideD, double sideE, Color color){

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
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

    public void setSideE(double sideE){

        this.sideE = sideE;

    }

    public void setBase(double base){

        this.sideA = base;
        this.sideB = base;
        this.sideC = base;
        this.sideD = base;
        this.sideE = base;
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

        return sideA + sideB < sideC + sideD + sideE &&
                sideB + sideC < sideA + sideD + sideE &&
                sideC + sideD < sideA + sideB + sideE &&
                sideD + sideE < sideC + sideB + sideA &&
                sideE + sideA < sideC + sideB + sideB;
    }

    public double getPerimeter(){

        if(!isValid()){
            System.out.print("This Pentagon does not exist");
            return 0;
        }

        return Math.floor((sideA+sideB+sideC+sideD+sideE)*100)/100;

    }

    public boolean isIrregular(){

        return !(sideA == sideB && sideB == sideC && sideC == sideD && sideD == sideE);
    }

    public double getArea(){

        if(isIrregular()){

            if(!isValid()){
                System.out.print("This Pentagon does not exist");
                return 0;
            }

            System.out.println("This Pentagon is irregular");
            return 0;
        }
        
        //36 es la mitad del angulo formado entre el la distancia del centro del pentagono
        //lado hasta uno de sus vertice de ese lado.
        double apotem = this.sideA/(2*Math.tan(36*(Math.PI/180)));
        double perimeter = getPerimeter();

        return Math.floor((apotem*perimeter/2)*100)/100;
    }

}
