# Boletín Bucles
1. **Mostrar por pantalla la frase “esto es un bucle” 10 veces.**

	[Solución](./src/ejercicio1.java)

2. **Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado previamente.**

	[Solución](./src/ejercicio2.java)

3. **Diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a uno si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra versión en la que la lectura de datos se haga únicamente al principio del bucle.**

	[Solución A](./src/ejercicio3a.java) -- 	[Solución B](./src/ejercicio3b.java)

4. **Diseñar un programa capaz de leer un valor entero, que verifique que esté comprendido entre 1 y 10, y mostrar su tabla de multiplicar.**

	[Solución](./src/ejercicio4.java)

5. **Sumar una cantidad de números que se van introduciendo, siempre que sean positivos hasta
que se teclee el `-1`.**

	[Solución](./src/ejercicio5.java)

6. **Diseñar un programa que muestre los números pares comprendidos entre 100 y 1 en orden descendente.**

	[Solución](./src/ejercicio6.java)

7. **Indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta alguna llave?¿Podrías reducir el recorrido del for para que el programa sea más rápido, manteniendo su funcionalidad?**

	[Solución](./src/ejercicio7.java)

8. **Calcular la suma de los 100 números siguientes a uno tecleado previamente.**

	[Solución](./src/ejercicio8.java)

9. **Sumar una cantidad de números que se van introduciendo por teclado hasta que la suma de los mismos valga más de 100.**

	[Solución](./src/ejercicio9.java)

10. **Programa al que se le introduzcan las edades de los alumnos (`-1` para finalizar) y nos informe si hay alguno menor de edad.**

	[Solución](./src/ejercicio10.java)

11. **Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre los números comprendidos entre ellos ordenados ascendentemente, junto con el valor de elevar cada uno de esos números al cuadrado. No se sabe si `m > n`, pero se desea utilizar una sola sentencia repetitiva tanto si `m > n` como si `m < n`.**

	[Solución](./src/ejercicio11.java)

12. **Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de una clase con decimales. Se introducirá –1 para indicar que no hay más notas. El algoritmo informará del total de notas introducidas, calculará la nota mínima, máxima , la media, si hay algún 5.0 exacto, y el porcentaje de aprobados. Hay que validar que estén entre 0 y 10.**

	[Solución](./src/ejercicio12.java)

13. **Programa al que le introduzcas un número y que garantice que es positivo, es decir si lo introducimos menor o igual que cero nos obligará a volver a introducirlo las veces que sea necesario hasta que se introduzca uno positivo.**

	[Solución](./src/ejercicio13.java)

14. **Diseñar un algoritmo que informe de los números perfectos que hay entre `1` y `10000`. Un número perfecto si es igual a la suma de todos los divisores menores que él.**

	[Solución](./src/ejercicio14.java)

15. **Sin ejecutarlo, intenta explicar que hace este programa.**

	```java
	public class Ejercicios {
		public static void main(String[] args) {
			int hora=0;
			for (int i=1;i<=7*24;i++) {
				System.out.println (hora);
				if (++hora > 23) hora=0;
			}
		} //fin main
	} //fin clase
	```

	[Solución](./src/ejercicio15.md)

16. **Programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99 que habrá que adivinar. El jugador intentará adivinar el número y el programa le responderá si es mayor, menor o si ha acertado. Se dispone de un máximo de 5 intentos.**

	[Solución](./src/ejercicio16.java)

17. **Diseñar un algoritmo al que se le introduzcan las notas de un alumno en los nueve módulos de un ciclo y nos informe si puede ir a la FCT (todos aprobados). ¿Habría que solicitarle al usuario siempre las notas de los nueve módulos?**

	[Solución](./src/ejercicio17.java)

18. **Mostrar las tablas de multiplicar del 1 al 9.**

	[Solución](./src/ejercicio18.java)

19. **Programa que se le introduzcan números por consola y que informe si están ordenados ascendentemente o no. El programa finaliza si se introduce cero o en cuanto se detecte que los números no están ordenados.**

	[Solución](./src/ejercicio19.java)

20. **Programa que muestre los número primos comprendidos entre 2 y 1000. Hacer los bucles con un número mínimo de iteraciones (se permite el uso de break) sabiendo que:**

	- Un número primo es solo divisible por 1 y el mismo.
	- Los números primos son todos impares salvo el 2.
	- Los divisores de un número siempre son menores que la mitad de dicho número (salvo el mismo).
	- Si un número no es divisible por 2 ya no va a serlo por ningún otro número par.

	[Solución](./src/ejercicio20.java)

21. **La serie de Fibonacci se compone a partir de números naturales, empezando por 0 y 1, y construyendo cada nuevo número de la serie como la suma de los dos anteriores elementos de la serie, así pues, el tercero sería 1 (es 0 +1), el siguiente 2 (1+1), luego 3 (2+1), luego 5 (3+2), 8 (5+3) y así sucesivamente. El siguiente programa pretende mostrar 12 primeros números de esta serie ¿Funciona correctamente? Es decir, muestra: 0,1,1,2,3,5,8,13,21,34,55,89. Si no es así, corrígelo.**

	```java
	public class Ejercicios {
		public static void main(String[] args) {
			int ant=1, ant2=0, num;
			for (int i=1; i<=12; i++){
				num = ant + ant2;
				System.out.println(num);
				ant = num; ant2 = ant;
			}
		}
	}
	```
	[Solución](./src/ejercicio21.java)

22. **Hacer un programa que permita calcular el sueldo final de los vendedores de un concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas extras realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas extras (se pagan a 100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas -> 500€, entre 21 y 30 ventas -> 1000€ y si supera las 30 ventas -> 1300 €. Después de tratar cada vendedor se preguntará al usuario y hay más vendedores a tratar, finalizando el programa si contesta negativamente. Al final el programa mostrará el total de ventas y el salario final del que más ventas ha realizado (supón que al menos introducen los datos de un empleado).**

	[Solución](./src/ejercicio22.java)

23. **Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta que introduzca un número mayor que `1000`. Si no se introduce un número mayor que `1000` el programa finalizará después de introducidos `15` números.** *(Ojo: es fácil equivocarse y hacer que solicite un numero de más o bien que no sume correctamente)*

	[Solución](./src/ejercicio23.java)

24. **Realizar un programa que permita introducir el sexo (`H`,`M`) y la edad de los 30 trabajadores de una fábrica. El programa debe obligar a que las edades que se introduzcan estén comprendidas entre `16` y `70` años. El programa nos mostrará la edad y el sexo del más joven y también mostrará la media de edad de las mujeres. Finalmente nos informará si hay alguno con más de `60` años. Si se introduce cero como edad el programa terminará en ese momento sin esperar a que introduzcan los `30` trabajadores.**

	[Solución](./src/ejercicio24.java)

---
> Iago Xoan Casal Neira -- Curso 2022/23
> 
> 15005397 -- IES Fernando Wirtz Suarez\
> CSIFC03 -- Desenvolvemento de aplicacións web\
> MP0485 -- Programación
