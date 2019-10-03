Proceso HoraExtra
	horasD=0
	horasT=0
	Escribir "Digite Horas Extras"
	Leer horas
	si horas > 40 Entonces
		double = horas - 40
		si double > 8 Entonces
			triple = double - 8
			pagarD = 8 * 32500 * 2
			pagarT = triple * 32500 * 3
			Escribir pagarD + pagarT
		SiNo
			pagarD = double * 32500 * 2
			Escribir pagarD	
		FinSi	
	FinSi
FinProceso