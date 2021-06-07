//202030799 Manuel Rojas
//Se leen desde teclado pares de temperaturas (T1 y T2)
//hasta que T1 sea cero. Hallar el promedio de las
//temperaturas ingresadas que están comprendidas entre 5° y 15° (incluidos)
Proceso Ejercicio9Parte2
	totalTemp <- 0
	contadorTemp <- 0
	Hacer
		Escribir "Ingrese la primera temperatura (T1)"
		Leer T1
		Escribir "Ingrese la segunda temperatura (T2)"
		Leer T2
		
		Si (T1 >= 5) & (T1 <= 15) Entonces
			totalTemp <- totalTemp + T1
			contadorTemp <- contadorTemp + 1
		SiNo
			Si (T2 >= 5) & (T2 <= 15) Entonces
				totalTemp <- totalTemp + T2
				contadorTemp <- contadorTemp + 1
			FinSi
		FinSi
	Mientras Que T1 <> 0
	promedio <- totalTemp/contadorTemp
	Escribir "El promedio de las temperaturas ingresadas que están comprendidas entre 5° y 15° es: ", promedio
FinProceso
