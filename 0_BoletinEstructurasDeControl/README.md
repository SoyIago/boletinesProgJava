# Boletin Estructuras de Control
### Cuestiones

Evaluar las siguientes expresiones (verdadero o falso), teniendo en cuenta los valores de las variables y razona la respuesta.

- `i = 1` y `i >= 10`
	
	- Seria `false` ya que `i` no es mayor ni igual que 10.

- `i = 1` y `i > 0 && i < 10`

	- Seria `true` ya que `i` es mayor que 0 y tambien es menor que 10.

- `i = 1` y `i > 0 && i > 10`

	- Seria `false` ya que, aunque `i` es mayor que cero, no es mayor que 10.

- `i = -1` y `i > 0 || i < 10`

	- Seria `true` ya que `i` es menor que 10, a pesar de ser menor que 0.

- `i = 1; j = 10` y `i > 0 && i < 10 || j==1`

	- Seria `true` ya que `i` es mayor que 0 y menor que 10, a pesar de que `j` no sea igual a 1, solo necesitamos que se cumpla una de las expresiones, operador lógico `||`.

- `i = 1` y `!(i==1)`
	- Seria `false` ya que `i` es igual a 1, pero `!()` invierte el resultado de la expresión contenida en el paréntesis.

- `i = 1; j = 10` y `!(i==10) && j==10`

	- Seria `true` ya que `i` no es 10, pero `!()` invierte el resultado, y `j` si que es 10.

- `i = 1; j = 10` y `i > 2 || i < 10 && j==10`

	- Seria `true` ya que `i` es menor que 10 y `j` es igual a 10, a pesar de que `i` no es mayor que 2, solo necesitamos que se cumpla una de las expresiones, operador lógico `||`.

- `i = 1; j = 0; k = -1` y `i + k <= j - k * 3 && k >= 2`

	- Sustituimos variables y operamos en la expresión: `0 <= 3 && -1 >= 2`
	- Es `false` ya que -1 no es mayor ni igual a 2, a pesar de que 0 si que es menor que 3.

- `i = 3; j = 2; k = -1` y `i==3 || j <= 2 && k > 0`

	- Seria `true` ya que `i` es igual a 3, a pesar de que `k` no sea mayor que 0, y por tanto la expresión `j <= 2 && k > 0` resulte en `false`; se cumple la primera expresión y esta es parte de una operación del operador *OR* (`||`)

- `i = 3; j = 2; k = -1` y `(i == 3 || j <= 2 ) && k > 0`

	- Seria `false` ya que `k` es menor que cero, se trata de una operación con el operador *AND* (`&&`) y requiere que ambas operaciones resulten en un `true`; a pesar de que la operación con prioridad (entre paréntesis) tiene prioridad y que ambas de sus expresiones si que resultan en un `true`, `i` es 3 y `j` es 2.

- `año = 2020` y `año % 4 == 0`

	- Es `true` ya que 2020 es múltiplo de 4 y por tanto el *MOD4* de 2020 resulta en 0.

- `año = 2000` y `año % 4 == 0 && año % 100 != 0 || año %400 == 0`

	- Es `true` ya que 2000 es múltiplo de 400 y por tanto el *MOD400* resulta en 0, estamos en una operación con el operador *OR* (`||`) que solo requiere que una de las expresiones sea `true`; la expresión `año % 4 == 0 && año % 100 != 0` resulta en `false` ya que 2000 es múltiplo de 4, por tanto, el *MOD4* resulta en 0, pero, 2000 si que es múltiplo de 100, entonces el *MOD100* no es diferente de 0.

### Ejercicios

1. **Hacer programas sencillos que hagan lo siguiente.**

- Leer un número entero y determinar si es mayor de 10.
- Leer dos números enteros y muestre si el primero es mayor que el segundo.
- Leer un número entero y de determinar si se trata de un número par o impar.
- Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.
- Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.
- Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).
- Leer dos números enteros y diga si uno y solo uno es mayor de 10.
- Leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos números son iguales.
- Leer dos números enteros y diga si el segundo es divisor del primero (*prevenir divisiones por cero, que causan error*). *Repasar operadores en cortocircuito para hacer un solo `if`.*
- Leer dos números enteros y diga si el menor de ellos es divisor del mayor (*prevenir divisiones por cero, que causan error*) *Repasar operadores en cortocircuito para hacer un solo `if`.*
- Leer un número y decir si es múltiplo de 2, de 3 y/o de 10.
Si no es múltiplo de 2 ya no hay que mirar si lo es de 10.
- Leer tres números enteros y diga hay alguno mayor que cero.
- Leer tres números enteros y diga hay alguno mayor que cero, pero no todos.

2. **Diseñar un programa al que se le introduzcan por consola tres números enteros. Si todos son negativos, mostrar el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de los tres. En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el tercero. ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo? (Suponer que el cero es un número positivo). Hacer el programa lo más sencillo posible.**

3. **Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en clase y la nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las siguientes situaciones:**

	- Nota examen mayor o igual a 5
	- Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor que 5.
	- Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la valoración del trabajo en clase.

	Diseñar un algoritmo al que se le introduzcan por consola la nota del examen, la valoración del trabajo en clase y la nota del trabajo práctico y saque por pantalla si está aprobado o no, todo en con una sola sentencia condicional.

4. **Programa al que se le introduzcan las coordenadas X e Y de dos puntos del plano, nos diga si lo que forman es un cuadrado o un rectángulo y calcule el área del mismo.**

5. **Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de segundos transcurridos desde el comienzo del día. *No emplear las clases de fecha de Java*.**

6. **Un sistema de ecuaciones lineales de la forma:**

	`ax + by = c`\
	`dx + ey = f`

	**...puede resolverse utilizando las siguientes formulas:**

	`x = (ce - bf) / (ae - bd)`\
	`y = (af - cd) / (ae - bd)`

	**Realizar un programa que lea por teclado los dos conjuntos de coeficientes (`a`, `b` y `c`; `d`, `e` y `f`) y calcule los valores para `x` e `y` según la fórmula descrita** ¿Existen algunos casos para los cuales este algoritmo no funcione? Nota: cuando en matemáticas se escriben dos variables juntas, por ejemplo `ce` quiere decir `c` por `e`.

7. **Realizar un programa que informe si un año introducido previamente es bisiesto o no. Son bisiestos los años múltiplos de 4 que no sean múltiplos de 100. Como excepción los múltiplos de 400 también son bisiestos. Se puede hacer una primera versión con varias sentencias condicionales y otra más sofisticada con una sola. *No usar las clases de fechas de Java*.**

8. **La tabla siguiente representa las horas de salida de un bus. Diseña un algoritmo al que se le introduzca el día (1-7) y la hora (9-14), verifique la entrada y nos informe si hay bus o no. Hacer una primera condición que haga la verificación de la entrada de datos y otra única condición para ver si hay bus.**

	|   | Lunes | Martes | Mierc. | Jueves | Viernes | Sábado | Domingo |
	| ----- | --- | --- | --- | --- | --- | --- | --- |
	| 9:00  |     |     |     |     |     |     | Si  |
	| 10:00 | Si  | Si  | Si  | Si  | Si  | Si  | Si  |
	| 11:00 |     |     |     |     |     |     | Si  |
	| 12:00 |     |     |     | Si  |     |     | Si  |
	| 13:00 |     |     |     |     |     |     | Si  |
	| 14:00 | Si  | Si  | Si  | Si  | Si  |     | Si  |

	*Hay que tratar de hacer un `if` que agrupe todas las condiciones. Piensa como lo dirías si alguien te preguntase a qué horas hay bus y luego trata de pasarlo a una sola condición en Java.*

9. **Realizar un programa al que se le introduzca la hora del día (0 –23) y nos diga que días de la semana hay salida de bus (utilizar la tabla anterior).**

10. **Realizar un programa al que se le introduzcan DIA, MES, AÑO, que verifique que los valores introducidos sean correctos, *sin emplear las clases de fechas de Java*.**

	*Si primero calculamos los días que tiene un mes/año, luego será muy fácil la verificación de la fecha.*

11. **Realizar un programa al que se le introduzcan DIA, MES, AÑO, que calcule el día siguiente. Suponemos que los valores son correctos, *sin emplear las clases de fechas de Java*.**

	*Hay que hacer un tratamiento diferente según sea fin de año, fin de mes (no fin de año) o un día no fin de mes.*

12. **Introduciendo dos fechas (día, mes, año), hacer un programa que nos diga cuál de las dos es mayor (agrupa las condiciones de día, mes y año en una sola sentencia condicional). *Suponemos que se introducen fechas válidas y no empleamos las clases de fecha de Java*.**

13. **Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos muestre por pantalla la nota final en texto, con la siguiente equivalencia:** *Muy deficiente (0, 1, 2), Insuficiente (3, 4), Aprobado (5, 6), Notable (7, 8) y Sobresaliente (9, 10)*.

	*Si estás pensando hacerlo con muchos ‘if’ anidados sobre la misma variable... hay una forma más cómoda.*

14. **Diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI. Consiste en dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente según la siguiente tabla (*Hacer con `switch`, no empleando ni `array` ni `String`*)**

	|   RESTO   |  0 |  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 |
	| --------- | -- | -- | -- | -- |  -- | -- | -- | -- |  -- | -- | -- | -- | -- | -- | -- | -- |  -- | -- | -- | -- |  -- | -- | -- |
	| **LETRA** |  T |  R |  W |  A |  G |  M |  Y |  F |  P |  D |  X |  B |  N |  J |  Z |  S |  Q |  V |  H |  L |  C |  K |  E |

15. **Haz 3 versiones de un mismo programa, que pida que se introduzcan por teclado 2 números `int` sobre sendas variables llamadas `a` y `b` y que incluyan las instrucciones que se muestran abajo. Para cada una de las versiones, ejecútalo varias veces, introduciendo cero para alguno de los valores y finalmente explica la diferencia de comportamiento entre cada una de las versiones:**

	- Version `A`: `if (b != 0 && a / b == 0) {r = a / b; System.out.println(r);}`
	- Version `B`: `if (a / b ==0 && b != 0) {r = a / b; System.out.println(r);}`
	- Version `C`: `if (b != 0 & a / b == 0) {r = a / b; System.out.println(r);}`

	*Puede ser el mismo código con las tres sentencias junta, teniendo una sola vigente y las otras dos como comentarios. Comentando unas y descomentando otra vas probando cada caso. La explicación puedes ponerla en el propio código, al final, como comentarios.*