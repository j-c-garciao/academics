Proceso Problema3
	Dimension arreglo(500)
	//contadores
	cont_niños=0
	cont_adolescentes=0
	cont_adultos=0
	cont_adultos_mayores=0
	//media
	media_niños=0
	media_adolescentes=0
	media_adultos=0
	media_adultos_mayores=0
	//varianza
	var_niños=0
	var_adolescentes=0
	var_adultos=0
	var_adultos_mayores=0
	//dev_stat
	dev_niños=0
	dev_adolescentes=0
	dev_adultos=0
	dev_adultos_mayores=0
	
	//ingresar datos de manera aleatoria
	para i=1 hasta 500 hacer
		arreglo(i)=aleatorio(0,80)
	FinPara
	
	//IDENTIFICAR GRUPOS POBLACIONALES
	para i=1 hasta 500 hacer
		si(arreglo(i)>=0 Y arreglo(i)<=12) entonces 
			cont_niños=cont_niños+1
			media_niños=arreglo(i)+media_niños
		FinSi
		
		si(arreglo(i)>=13 Y arreglo(i)<=17) entonces 
			cont_adolescentes=cont_adolescentes+1
			media_adolescentes=arreglo(i)+media_adolescentes	
		FinSi
		
		si(arreglo(i)>=18 Y arreglo(i)<=59) entonces 
			cont_adultos=cont_adultos+1
			media_adultos=arreglo(i)+media_adultos
		FinSi
		
		si(arreglo(i)>=60 ) entonces 
			cont_adultos_mayores=cont_adultos_mayores+1
			media_adultos_mayores=arreglo(i)+media_adultos_mayores	
		FinSi
	FinPara
	
	//VERIFICAR RESPUESTAS
	//TOTAL GRUPOS POBLACIONALES
	escribir "Total Niños ", cont_niños
	escribir "Total Adolescentes ", cont_adolescentes
	escribir "Total Adultos ",cont_adultos
	escribir "Total Adultos Mayores ",cont_adultos_mayores
	
	//PROMEDIO EDAD GRUPO POBLACIONALES
	
	media_niños=media_niños/cont_niños
	media_adolescentes=media_adolescentes/cont_adolescentes
	media_adultos=media_adultos/cont_adultos
	media_adultos_mayores=media_adultos_mayores/cont_adultos_mayores
	
	escribir "Media Niños ", media_niños
	escribir "Media Adolescentes ", media_adolescentes
	escribir "Media Adultos ",media_adultos
	escribir "Media Adultos Mayores ",media_adultos_mayores
	
	//CALCULAR VARIANZA MUESTRA GRUPOS POBLACIONALES
	para i=1 hasta 500 hacer
		si(arreglo(i)>=0 Y arreglo(i)<=12) entonces 
			var_niños = (media_niños-arreglo(i))^2 + var_niños	
		FinSi
		
		si(arreglo(i)>=13 Y arreglo(i)<=17) entonces 
			var_adolescentes= (media_adolescentes-arreglo(i))^2 + var_adolescentes	
		FinSi
		
		si(arreglo(i)>=18 Y arreglo(i)<=59) entonces 
			var_adultos= (media_adultos-arreglo(i))^2 + var_adultos	
		FinSi
		
		si(arreglo(i)>=60 ) entonces 
			var_adultos_mayores= (media_adultos_mayores-arreglo(i))^2 + var_adultos_mayores	
		FinSi
	FinPara	
	
	//VARIANZA GRUPO POBLACIONALES
	
	var_niños=var_niños/cont_niños-1
	var_adolescentes=var_adolescentes/cont_adolescentes-1
	var_adultos=var_adultos/cont_adultos-1
	var_adultos_mayores=var_adultos_mayores/cont_adultos_mayores-1
	
	escribir "Varianza Niños ", var_niños
	escribir "Varianza Adolescentes ", var_adolescentes
	escribir "Varianza Adultos ",var_adultos
	escribir "Varianza Adultos Mayores ",var_adultos_mayores
	
	//DEV STA GRUPO POBLACIONALES
	escribir "Desviación Estandard Niños ", rc(var_niños)
	escribir "Desviación Estandard Adolescentes ", rc(var_adolescentes)
	escribir "Desviación Estandard Adultos ",rc(var_adultos)
	escribir "Desviación Estandard Adultos Mayores ",rc(var_adultos_mayores)
	
	
FinProceso
