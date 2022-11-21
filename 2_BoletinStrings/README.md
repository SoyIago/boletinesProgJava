# Boletin Strings

1.	**Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:**

	1. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.

	2. Decir si en la cadena aparece el carácter `x`.

	3. Decir si la cadena tiene más de 10 posiciones.

	4. Decir si la cadena contiene el carácter `x` a partir de la cuarta posición.

	5. Crear una cadena formada por las 5 primeras posiciones de la cadena.

	6. Crear una cadena formada por las 5 últimas posiciones de la cadena.

	7. Decir si la cadena es igual a la cadena `hola`.

	8. Convertir la cadena de entrada a una variable de tipo `int`, suponiendo que dicha cadena es un número, esto es, contiene solo dígitos decimales (del `0` a `9`).

	9. Convertir la cadena de entrada a una variable de tipo `int`, suponiendo que dicha cadena es un número hexadecimal, esto es, contiene solo dígitos decimales (del `0` a `9`) y letras de la `A` a `F`.

	10. Si se encuentra con en su interior con `prueva` sustituir por `prueba`.

	11. Decir si la primera posición de la cadena es igual a la última.

	12. Decir cuántos dígitos numéricos hay en la cadena.

	13. Decir si la cadena es un palíndromo *(se lee igual hacia adelante como hacia atrás)*.

	14. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones intercambiadas. *Ejemplo: si introducen: `abcde`, obtendría `ebcda`.*

	[Solución](./src/ejercicio1.java)

2. **Diseña un algoritmo capaz de obtener la letra del NIF a partir del número de DNI. Consiste en dividir dicho número entre `23` y tomar el resto de la división asignándole la letra correspondiente según la siguiente tabla. Almacena las letras del NIF en una cadena.**

	|   RESTO   |  0 |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 |
	| --------- | -- | -- | -- | -- |  -- | -- | -- | -- |  -- | -- | -- | -- | -- | -- | -- | -- |  -- | -- | -- | -- |  -- | -- | -- |
	| **LETRA** |  T |  R |  W |  A |  G |  M |  Y |  F |  P |  D |  X |  B |  N |  J |  Z |  S |  Q |  V |  H |  L |  C |  K |  E |

	[Solución](./src/ejercicio2.java)

3. **Realiza un programa que solicite que se le introduzcan una cadena y un carácter y nos muestre cuantas veces está contenido el carácter en la cadena.**

	[Solución](./src/ejercicio3.java)

4. **Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las siguientes limitaciones:**

	- Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la `a` y la `j`.

	[Solución](./src/ejercicio4.java)

5. **Realiza un programa que muestre una contraseña generada aleatoriamente teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre la `a` y la `j`
pero sin letras repetidas.**

	[Solución](./src/ejercicio5.java)

6. **Realiza un programa al que se le introduzca un email y nos devuelva el nombre del dominio y subdominios si los hubiese, es decir, lo que está entre la arroba y el punto final (Ejemplo:
`info@empresas.clientes.mundo-r.com` mostraría `empresas.clientes.mundo-r`).**

	[Solución](./src/ejercicio6.java)

7. **Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a lo largo de todo el mensaje, por ejemplo las `A` por `F`, las `B` por `X`, las `C` por `M`. Obviamente si la `A` pasa a ser `F`, ninguna otra letra pasará `F`.**

	- Hacer un programa que le introduzca una cadena en mayúsculas
y muestre la cadena encriptada en (todo lo que no sean letras mayúsculas se deja intacto: números, espacios en blanco, etc.). 

	- Hacer una segunda versión que funcione con mayúsculas y minúsculas.

	[Solución A](./src/ejercicio7a.java) -- [Solución B](./src/ejercicio7b.java)

8. **Realizar un programa que solicite una cadena, un número que indica una posición de la cadena y una letra. El programa reemplazará sobre la misma cadena, el carácter que hubiera en la posición indicada por la letra introducida. Hacer dos versiones, la primera con `String` y otra con `StringBuilder`.**

	[Solución A](./src/ejercicio8a.java) -- [Solución B](./src/ejercicio8b.java)

9. **Escribe un programa que solicite que se introduzca por teclado un nombre completo y una edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase `Format` y otra versión con el método `System.out.printf`.**

	> `Hola, me llamo Pepe Pérez López y tengo 20 años` suponiendo que se introduce `Pepe Pérez López` como nombre completo y `20` como edad.

	[Solución A](./src/ejercicio9a.java) -- [Solución B](./src/ejercicio9b.java)

10. **Realizar un programa que solicite la entrada de 10 cadenas de caracteres y construya una cadena con el primer carácter de cada cadena. Finalmente mostrará dicha cadena por pantalla.**

	[Solución](./src/ejercicio10.java)

11. **Describe que realiza el código siguiente e indica si contiene algún error.**

	```java
	java.util.Scanner teclado = new java.util.Scanner(System.in);
	System.out.println("Introduce una cadena:");
	String cadena = teclado.nextLine();
	StringBuilder cadenaSB = new StringBuilder(cadena);
	int pos;
	do {
		pos = cadenaSB.indexOf(" ");
		if (pos!=-1) cadenaSB.deleteCharAt(pos);
	} while (pos != -1);
	System.out.println(cadenaSB);
	```

	[Solución](./src/ejercicio11.md)

12. **Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que todas sean dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá introducirla de nuevo hasta que lo haga correctamente.**

	[Solución](./src/ejercicio12.java)

13. **Realizar un programa al que se le introduzca un número decimal y lo convierta a un `String` con su representación hexadecimal. Hay que hacerlo codificando el proceso sin usar las clases de Java y luego compararlo con el resultado ofrecido por las clases de Java para convertir de decimal a hexadecimal.**

	[Solución](./src/ejercicio13.java)

14. **Realizar un programa al que se le introduzca una cadena por teclado, que la convierta a `StringBuilder`, y aplicando métodos de esa clase, haga lo siguiente:**

	1. Borrar el carácter que haya en la posición `3`.
	2. Insertar una `x` en la posición `5`.
	3. Sustituir el carácter de la posición `1` por una `z`.
	4. Borrar los caracteres entre la posición `5` y `10`.
	5. Darles la vuelta a todos los caracteres del `StringBuilder`.
	6. Convertir el 	`StringBuilder` en cadena. Habrá que verificar en algunos casos que la cadena tiene una longitud mayor que la de la posición indicada, sino producirá errores.

	[Solución](./src/ejercicio14.java)

15. **Realizar un programa en el que el usuario introduzca un texto y sustituya sus posiciones impares por asteriscos, por ejemplo: `abcdefg` cambie las posiciones impares pasaría a: `a*c*e*g`**

	[Solución](./src/ejercicio15.java)

---
> Iago Xoan Casal Neira -- Curso 2022/23
> 
> 15005397 -- IES Fernando Wirtz Suarez\
> CSIFC03 -- Desenvolvemento de aplicacións web\
> MP0485 -- Programación