# Boletin Funciones
- Ejercicio 1

	*Realizar funciones que realicen los siguientes supuestos, y un
`main()` desde el que se llame a dichas funciones:*

	> Función llamada par() que se le pasa un entero y devuelve `true` si es par, `false` si no lo es.
	> 
	> Función llamada mayor() que se le pasan 3 `double` y devuelve el mayor de ellos.
	> 
	> Función llamada `sumaIntervalo()` que le pasan dos `long` y devuelve otro `long` con la suma de los números comprendidos entre los números pasados (el primero es menor que el segundo, y ambos mayores que cero, en caso contrario devuelve `-1`).
	> 
	> Función llamada `contarCeros()` que se le pasa una cadena (`String`) y devuelve la cantidad de ceros que tiene.
	> 
	> Función llamada `aleatorio()` que se le pasan dos valores enteros (`int`) devuelve un entero al azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos mayores que cero, en caso contrario devuelve `-1`).

- Ejercicio 2

	*Programa que presente un menú y permita calcular repetidas veces:*

	> A. El área de círculo, necesitará el radio.
	> 
	> B. El área de cuadrado, necesitará el lado.
	> 
	> C. El área de triángulo, necesitará base y altura.
	> 
	> D. Salir. 

	*Usar funciones para cada una de las 3 opciones.*

- Ejercicio 3

	*Hacer una función llamada
`CalcularDiasMes()` que se le pase como parámetro un año y un mes y devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos.*

	*A continuación, realizar un programa al que se le introduzca una fecha y nos informe de los días pasados desde el 1 de enero
de ese año **(no usar clases Java de fechas)**.*

- Ejercicio 4

	*Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan dos fechas del mismo año y nos informe de los días comprendidos entre ellas **(no usar clases Java de fechas)**.*

- Ejercicio 5

	*Programa que calcule el factorial de números menores de 20. El programa permite al usuario meter los números que desee y finalizará cuando meta un número menor que 1 o mayor que 20.*

	*Crea las funciones que consideres útiles y que puedas reutilizar en otros programas.*

- Ejercicio 6

	*Realiza una función llamada `cantidadDivisores()` al que se le pase como parámetro un número entero y devuelva el número de divisores o bien cero si el número es negativo. Usa dicha función en un `main()`.*

- Ejercicio 7

	*Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo. Usando la función del programa anterior, haz un programa que muestre la suma de los números primos comprendidos entre 1 y 1000.*

- Ejercicio 8

	*Realizar un programa al que se le introduzcan dos números enteros positivos y nos diga cuál de los dos tiene más divisores **(usar función previa)**.*

- Ejercicio 9

	*El siguiente programa tiene una variable global llamada saldo sobre la que se ejecutan las funciones `ingresar()` y `retirar()` que aumentan y reducen el saldo respectivamente, no pudiendo quedar el saldo por debajo de cero. ¿Hay algún error ¿Cuánto vale la variable saldo al finalizar la ejecución del programa?*

	```java
	public class Ejercicio {
		public static int saldo=0;
		public static void main(String[] args){
			boolean ok = false;
			ingresar(30);
			retirar(10);
			if (retirar(10)==false) System.out.println("No se puede retirar tanto");
			System.out.println("Saldo final: "+ saldo);
		}

		static void ingresar(int i){
			saldo+=i;
		}

		static boolean retirar(int i){
			if (i>saldo) return false;
			saldo-=i;
			return true;
		}
	}
	```
- Ejercicio 10

	*Este código es erróneo ¿Qué mostraría por pantalla? ¿Por qué?*

	```java
	public static void main(String[] args) {
		float saldo = 500f;
		saldo = ingresar(saldo, 400f);
		if (ingresar(saldo, 400f)>1000f)
			System.out.println("Ya tienes más de 1000 euros: " + saldo);
		else System.out.println("No tienes más de 1000 euros: " + saldo);
	}
	static float ingresar (float saldo, float increm) {return saldo+increm;}
	```
- Ejercicio 11

	*¿Qué mostraría este código por pantalla? ¿Por qué?*

	```java
	public static void main(String[] args) {
		float saldo = 500f;
		ingresar(saldo, 600f);
		if (saldo > 1000f) System.out.println("Ya tienes más de 1000 euros: " + saldo):
		else System.out.println("No tienes más de 1000 euros: "+ saldo);
}
static void ingresar(float saldo, float increm) {saldo += increm;} 
	```

---
> Iago Xoan Casal Neira -- Curso 2022/23
> 
> 15005397 -- IES Fernando Wirtz Suarez
> CSIFC03 -- Desenvolvemento de aplicacións web
> MP0485 -- Programación