Proceso Amigos
	Leer n1
	cont1 = 0
	para i=1 hasta n1-1 Con Paso 1
		si n1 mod i = 0 Entonces
			cont1 = cont1 + i
		FinSi
	FinPara
	
	/////////////////////////////
	// SEGUNDO NUMERO //////////
	
	cont2 = 0
	para i=1 hasta cont1-1 Con Paso 1
		si cont1 mod i = 0 Entonces
			cont2 = cont2 + i
		FinSi
	FinPara
	
	Escribir n1, " ", cont1
	si n1 = cont2 Entonces
		Escribir "Son amigos"
	FinSi
FinProceso
