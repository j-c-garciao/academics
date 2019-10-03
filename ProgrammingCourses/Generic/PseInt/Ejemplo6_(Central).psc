Algoritmo Central
	Leer a
	Leer b
	Leer c
	Si (a>=b Y a<=c Y b<=c) O (a<=b Y a>=c Y b>=c) Entonces
		Escribir "a es central"
	SiNo
		Si (b>=a Y b<=c Y a<=c) O (b<=a Y b>=c Y a>=c) Entonces
			Escribir "b es central"
		SiNo
			Escribir "c es central"
		FinSi
	FinSi
FinAlgoritmo

