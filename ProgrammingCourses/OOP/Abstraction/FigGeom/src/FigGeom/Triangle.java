package FigGeom;

import java.awt.Color;

public class Triangle
{
	// Atributos
	private Color color;
	float ladoA;
	float ladoB;
	float ladoC;

	// Constructor
	public Triangle(float ladoA, float ladoB, float ladoC, Color color)
	{
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.color = color;
	}

	// Setters
	public void setColor(Color color)
	{
		this.color = color;
	}

	public void setLadoA(float ladoA)
	{
		/*
		 *	ModificaciÃ³n del mÃ©todo estÃ¡ndar "setLadoA(float)":
		 *
		 *	El atributo "ladoA" es entendido cÃ³mo una longitud
		 *	por ende no puede abarcar valores reales menores a 0
		 *
		 *	ModificaciÃ³n: Se asigna el valor absoluto del 
		 *	paramÃ©tro recibido mediante el mÃ©todo "abs()" de la
		 *	clase Math. 
		 *
		 */
		this.ladoA = Math.abs(ladoA);
	}

	public void setLadoB(float ladoB)
	{
		/*
		 *	ModificaciÃ³n del mÃ©todo estÃ¡ndar "setLadoB(float)":
		 *
		 *	Leer modificaciÃ³n del mÃ©todo "setLadoA(float)".
		 */
		this.ladoB = ladoB;
	}

	public void setLadoC(float ladoC)
	{
		/*
		 *	ModificaciÃ³n del mÃ©todo estÃ¡ndar "setLadoC(float)":
		 *
		 *	Leer modificaciÃ³n del mÃ©todo "setLLadoC(float)".
		 */
		this.ladoC = ladoC;
	}

	// Getters
	public Color getColor()
	{
		return this.color;
	}

	public float getLadoA()
	{
		return this.ladoA;
	}

	public float getLadoB()
	{
		return this.ladoB;
	}

	public float getLadoC()
	{
		return this.ladoC;
	}

	// MÃ©todos
	
	public boolean isValid()
	{
		/*
		 *	MÃ©todo "public": boolean isValid(void):
		 *
		 *	Conociendo el hecho que para que un triangulo sea valido ningun lado
		 *	debe ser mayor a la suma de los otros dos, retonamos el valor de verdad
		 *	del cumplimiento de esta condiciÃ³n para los tres lados.
		 *
		 *	E.j:
		 *
		 *	Triangle t1 = new Triangle(4, 3, 2, Color.RED);
		 *	Triangle t2 = new Triangle(4, 1, 1, Color.RED);
		 *
		 *	t1.isValid() --> True
		 *	t2.isValid() --> False
		 *
		 */
		return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoC + ladoB > ladoA);
	}

	public Float getPerimeter()
	{
		/*
		 *	MÃ©todo "public": Float getPerimeter(void)
		 *
		 *	El mÃ©todo confirma si el triangulo es valido, de ser asÃ­ retonar su
		 *	perimÃ©tro (sumatoria de sus lados), de lo contrario retonar "null".
		 *
		 *	E.j:
		 *
		 *	Triangle t1 = new Triangle(4, 3, 2, Color.RED);
		 *	Triangle t2 = new Triangle(4, 1, 1, Color.RED);
		 *
		 *	t1.getPerimeter() --> 9
		 *	t2.getPerimeter() --> null
		 */
		if(this.isValid())
		{
			return this.ladoA + this.ladoB + this.ladoC;
		}
		return null;
	}

	public Float getArea()
	{
		/*
		 *	MÃ©todo "public: " Float getArea()
		 *
		 *	El mÃ©todo confirma si el triangulo es valido, de ser asÃ­
		 *	retona su Ã¡rea (formÃºla de HerÃ³n), de lo contrario retona "null".
		 *
		 *	E.j:
		 *
		 *	Triangle t1 = new Triangle(4, 3, 2, Color.RED);
		 *	Triangle t2 = new Triangle(4, 1, 1, Color.RED);
		 *
		 *	t1.getArea() --> 8,4375
		 *	t2.getArea() --> null
		 */
		if(this.isValid())
		{
			double S = (double)getPerimeter() / 2;
			double area = Math.sqrt(S*(S-this.ladoA)*(S-this.ladoB)*(S-this.ladoC));
			return (float)area;
		}
		return null;
	}
}
