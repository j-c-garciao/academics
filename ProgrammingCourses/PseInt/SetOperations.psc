Proceso Problema2
	escribir "Cuantos elementos va a validar (1-10)"
	leer n
	Dimension conjuntoA(10)
	Dimension conjuntoB(10)
	Dimension conjuntoC(10)
	
	
	para i=1 hasta n hacer
		r=aleatorio(0,9)
		conjuntoA(r+1)=1
		r=aleatorio(0,9)
		conjuntoB(r+1)=1
	FinPara
    
	para i=1 hasta 10 hacer 
		si (conjuntoA(i)=1 Y conjuntoB(i)=1)
			conjuntoC(i)=1
		FinSi
	FinPara
	
	
	Escribir "Conjunto A"
	para i=1 hasta 10 hacer 
		si (conjuntoA(i)=1) Entonces
			escribir i-1, " " Sin Saltar
		FinSi 
	FinPara
	
	Escribir ""
	Escribir "Conjunto B"
	para i=1 hasta 10 hacer 
		si (conjuntoB(i)=1) Entonces
			escribir i-1, " " Sin Saltar
		FinSi 
	FinPara
	
	Escribir ""
	Escribir "Conjunto C"
	
	para i=1 hasta 10 hacer 
		si (conjuntoC(i)=1) Entonces
			escribir i-1, " " Sin Saltar
		FinSi
	FinPara
FinProceso
