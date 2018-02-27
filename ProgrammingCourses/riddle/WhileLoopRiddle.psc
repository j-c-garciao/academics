Proceso Adivinanza
	Escribir '¿Su numero es 16? Responda S(Si) o N(No)'
	Leer respuesta
	Si respuesta='S' Entonces
		Escribir 'He Ganado!'
	SiNo
		intentos <- 1
		lim_inf <- 1
		lim_sup <- 32
		numero <- 16
		Mientras intentos<=5 Hacer
			Escribir 'Su numero es Mayor(M) o Menor(N)'
			Leer respuesta
			Si respuesta='M' Entonces
				lim_inf <- numero
				numero <- trunc((lim_inf+lim_sup)/2)
				si numero=lim_inf Entonces
					numero=lim_sup
				FinSi
			SiNo
				lim_sup <- numero
				numero <- trunc((lim_inf+lim_sup)/2)
			FinSi
			Escribir '¿Su número es ',numero,', Si (S) o No (N) ?'
			Leer respuesta
			Si respuesta='S' Entonces
				Escribir '¿He Ganado?'
				intentos <- 6
			SiNo
				intentos <- intentos+1
			FinSi
		FinMientras
	FinSi
FinProceso

