Algoritmo Triangulo
	Escribir 'Digita el lado a'
	Leer lado_a
	Escribir 'Digita el lado b'
	Leer lado_b
	Escribir 'Digite el lado c'
	Leer lado_c
	Si lado_a=lado_b Y lado_b=lado_c Entonces
		Escribir 'El triangulo es Equilatero'
	SiNo
		Si lado_a=lado_b O lado_a=lado_c O lado_b=lado_c Entonces
			Escribir 'El triangulo es Isoceles'
		SiNo
			Escribir 'El triangulo es Escaleno'
		FinSi
	FinSi
FinAlgoritmo

