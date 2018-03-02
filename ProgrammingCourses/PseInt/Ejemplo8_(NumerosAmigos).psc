Proceso Amigos
	Leer n1
	
	mientras n1 > 0 hacer
		//////////////////////////////
		//DIVISORES///////////////////
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
		
		
		si n1 = cont2 && n1 != cont1 Entonces
			Escribir n1, " ", cont1, " Son amigos"
		FinSi
		n1=n1-1
	fin mientras 
FinProceso
