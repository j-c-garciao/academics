Algoritmo CincoEnteros
	Escribir 'Digite a'
	Leer a
	Escribir 'Digite b'
	Leer b
	Escribir 'Digite c'
	Leer c
	Escribir 'Digite d'
	Leer d
	Escribir 'Digite e'
	Leer e
	Si a>=b Y a>=c Y a>=d Y a>=e Entonces
		Escribir 'A es el mayor'
	SiNo
		Si b>=a Y b>=c Y b>=d Y b>=e Entonces
			Escribir 'B es el mayor'
		SiNo
			Si c>=a Y c>=b Y c>=d Y c>=e Entonces
				Escribir 'C es el mayor'
			SiNo
				Si d>=a Y d>=b Y d>=c Y d>=e Entonces
					Escribir 'D es el mayor'
				SiNo
					Escribir 'E es el mayor'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

