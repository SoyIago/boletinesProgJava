### Cuestiones

```java
public class Producto {
	public String nombre;
	public double precio;
	public double IVA;
	public double descuento;

	public Producto (String nom, double p, double IVA) {
		this.nombre = nom;
		this.precio = p;
		this.IVA = IVA;
		this.descuento=0;
	}
	
	public double calcularPrecioFinal () {
		double prFin= this.precio + (this.precio * this.IVA);
		double prFinDesc = prFin - (prFin * this.descuento);
		return prFinDesc;
	}
	
	public void setDescuento (double desc) {
		this.descuento = desc;
	}
	
}
```

1. *¿Cuántos atributos tiene?*

	Tiene cuatro atributos: `nombre`, `precio`, `IVA` y `descuento`.	

2. *¿Cuántos constructores tiene?*

	Tiene un constructor: `Producto()`.

3. *¿Cuántos métodos tiene?*

	Tiene dos metodos: `calcularPrecioFinal()` y `setDescuento()`.

4. ¿Cómo harías para crear en el `main()` de un programa dos productos? Por ejemplo, `p1` que sea un ordenador, que tiene un impuesto del 21% y `p2` una barra de pan, que tiene el 4%.

	```java
		Producto p1 = new Producto(¨Ordenador¨, 450d, 21d);
		Producti p2 = new Producto(¨Barra de pan¨, 0.65d, 4d);
	```

5. ¿Con qué descuento se crean?

	Todos los productos se crean con descuento 0: `this.descuento=0;`.

6. ¿Cómo mostrarías por pantalla el precio final de ambos productos creados?

	```java
	System.out.println("Total: " + (p1.calcularPrecioFinal() + p2.calcularPrecioFinal()));
	```

7. Aplícale un descuento del 10% al ordenador y muestra de nuevo el precio final.

	```java
	p1.setDescuento(10);
	System.out.println("Total: " + (p1.calcularPrecioFinal() + p2.calcularPrecioFinal()));
	```

8. Cambia el nombre a la barra de pan.

	```java
	p2.nombre = "Chapata";
	```

9. ¿Qué ocurre si hago en el main: `p1.IVA = p2.IVA;`?

	El IVA del producto `p1` pasará a ser el IVA del producto `p2`, en este caso `4`.

10. ¿Qué ocurre si hago en el main: `p1.descuento = p2.descuento;`?

	El descuento del producto `p1` pasará a ser el descuento del producto `p2`, en este caso `0`.

11. ¿Qué ocurre si hago en el main: `p1 = p2;`?

	El producto `p1` apuntará a la instancia `p2`.

12. ¿Cómo harías para que el objeto `p1` tuviese el mismo contenido que `p2` pero fuesen variables independientes que puedan tomar valores diferentes más adelante?

	```java
	p1 = p2.Clone();
	```

13. ¿Qué ocurre si hago `if (p1 == p2) System.out.println("Iguales")`?

	Solo se devolvera `true` si `p2` es una instancia de `p1`, Java no compara el contenido de los objetos si no su referencia en memoria, dos instancias declaradas de manera separada con los mismos valores no son `true` ya que no son la misma instancia.

14. Haz un `main` con el siguiente código:

	```java
		Producto p3 = new Producto ("impresora",50d, 0.21d);
		Producto p4 = p3;
		p3.precio = 60;
		System.out.println(p4.precio);
	```	
	
	- ¿Qué mostrará por pantalla? ¿Por qué?

### Ejercicios

- Ejercicio 1

	*A partir de la clase MovilPrepago que te proporcionará el profesor, haz un programa en el que se cree un teléfono con unas características determinadas y luego ejecute una serie de actividades como recargar 10 euros, llamar 30 segundos, navegar 10MB, etc. Viendo cómo se va modificando el saldo.*

	Las propiedades de un móvil prepago son:
	
	- `int numeroMovil` (13 dígitos)
	- `float costeEstablecLlamada` (euros, con dos decimales)
	- `float costeMinutoLlamada` (euros, con dos decimales)
	- `float costeConsumoMB` (euros, con dos decimales)
	- `float saldo` (euros, con dos decimales)

	Los métodos son:
	
	- `void efectuarLlamada (int segundos)`: reduce el saldo. Si el saldo no es suficiente, se corta la llamada
	- `void navegar(int MB)` análogo a efectuar una llamada
	- `boolean recargar (int importe)`: aumenta el saldo, debe ser múltiplo de 5 euros, sino devuelve false
	- `float consultarSaldo ()`
		
- Ejercicio 2 

	*A partir de la clase `MovilPrepago` del ejercicio anterior, crea un programa en el que el usuario dé de alta un teléfono con unas características determinadas y luego le permita mediante un menú hacer operaciones como consultar saldo, recarga, hacer llamada, navegar. Se proporciona un modelo (modeloMenu) a modo de esqueleto, con el menú y las funciones necesarias, en las que solo tienes rellenar los huecos.*

- Ejercicio 3

	*A partir de la clase `CuentaCorriente` que te proporcionará el profesor, crea un programa en el que se creen una cuenta corriente (siempre se crean con saldo inicial cero) y mediante un menú le permita al usuario hacer operaciones como ingresar, retirar y consultar saldo en la cuenta. El único atributo público de la cuenta es el IBAN (String de 24 dígitos/letras). Otros atributos privados son saldo, contadorIngresos, porcentaje, Comision y minimoComision, pero como son privados, no tenemos acceso a ellos. Los métodos son:*

	- `constructor (String Iban)`: se le pasa el nombre de la cuenta y fija saldo inicial a cero.
	- `void ingresar (float importe)`: aumenta el saldo. Si se hacen 3 ingresos consecutivos, sin ninguna retirada en medio, se regala 0,7 euros al usuario.
	- `boolean retirar (float importe)`: reduce el saldo si es posible, no puede quedar negativo (devuelve si se ha efectuado la retirada o no). Cada retirada tiene una comisión asociada.
	- `float getSaldo ()`: devuelve el saldo actual en la cuenta.
	- `setComision (float porcentaje, float impMinimo)`: Fija la comisión de retirada, para todas las cuentas.
	- `getPorcentajeComision()`: devuelve un float con el porcentaje de comisión a aplicar en retiradas.
	- `getMinimoComision()`: devuelve un float con el importe mínimo de comisión a aplicar en retiradas.

- Ejercicio 4

	*Haz un programa como el anterior, pero creando dos cuentas en vez de una. Habrá una opción de menú nueva que será “Cambiar cuenta activa” para pasar de una cuenta a otra. Tendremos una variable de tipo CuentaCorriente que le puedes llamar cuentaActiva que unas veces apuntará a una cuenta y otras veces a la otra Recuerda que las variables de tipo Objeto, a diferencia de los tipos primitivos, son apuntadores a los objetos, si tenemos los objetos ‘cuenta1’ y ‘cuenta2’ creados con su constructor, podemos hacer luego una tercera variable ‘cuentaActiva’ sin constructor y hacer ‘cuentaActiva=cuenta1’ o bien ‘cuentaActiva=cuenta2’ cuando nos interese.*

- Ejercicio 5

	*A partir de la clase Ahorcado que te proporcionará el profesor, crea un programa que permita al usuario jugar al ahorcado. Desconocemos los atributos de la clase Ahorcado ya que son privados, pero sus métodos públicos son:*

	- `Constructor(String txtAdivinar, String txtPista)`: Crea el juego con la frase a adivinar y con un texto de pista para el jugador.
	- `Constructor(String txtAdivinar)`: Crea el juego con la frase a adivinar, sin pistas.
	- `boolean probarLetra (char x)`. Comprueba si la letra pasada como parámetro está en la frase a adivinar, en caso afirmativo, devuelve true¸ sino false.
	- `boolean adivinada()`: Devuelve true si se ha adivinado la frase, false en caso contrario.
	- `boolean perdio()`: Devuelve true si se ha llegado al número máximo de intentos sin adivinar la frase, false en caso contrario.
	- `char leerLetra ()`: Pide al usuario por consola una letra y devuelve dicha letra.
	- `void pintar ()`: Dibuja un “tablero” en la consola, con el estado del juego.

- Ejercicio 6

	*A partir de las clases Nim y Consola, crea un programa que juegue al NIM contra la máquina. Se trata de un tablero con 3 filas de palillos, con 3, 5 y 7 palillos respectivamente. Dos jugadores por turnos alternos (el usuario y la máquina) han de retirar palillos del tablero perdiendo el que se quede el último palillo. En cada turno se pueden retirar uno o más palillos, pero solo de una misma fila. Por lo tanto, la estructura del programa será la siguiente: primero se crea el juego. Luego habrá un bucle mientras no gane ninguno de los dos y, dentro del bucle, primero piensa la máquina, luego hace su jugada, y se comprueba si ha ganado. Si no ha ganado, introduces los valores de tu jugada (fila y cantidad de palillos) y juegas. Se comprueba si has ganado y así sucesivamente hasta que gane uno de los dos. Desconocemos los atributos de la clase Nim ya que son privados, pero sus métodos públicos son:*

	- `Constructor ()` por defecto: Se crea una instancia del juego.
	- `boolean juega (int fila, int cant)`: Valida los datos y retira la cantidad de palillos indicada de la fila indicada devolviendo true. Devuelve false si los parámetros no son válidos. Las filas van de 0 a 2.
	- `boolean fin()`: devuelve `true` si se alcanzó el final del juego (un solo palillo en el tablero).
	- `int piensa ()`: Se invoca para que la máquina piensa su jugada y devuelve un entero cuyas decenas son la fila (0,1,2) y las unidades son los palillos que retira (entre 1 y 7), pero no implica que haga dicha jugada. Lo normal será llamar luego al método juega con los parámetros obtenidos con piensa().

	La clase `Consola`, tiene los siguientes métodos públicos estáticos:

	- `pintarTablero (Nim tablero)`: Se le pasa un tablero de Nim y lo pinta por consola.
	- `int leerEntero(texto)`: Pide un valor por consola y valida que sea un entero de forma que si mete letras o valores incorrectos no “casca” y vuelve a pedir que se introduzcan correctamente. El texto que se pasa como parámetro es el que le dice al usuario lo que tiene que introducir, así no hace falta meter antes un System.out.println. Ejemplo: x=leerEntero(“introduzca fila”); hará internamente ya System.out.println (“introduzca fila”)

	Hay que tener en cuenta que los usuarios hablamos de filas 1,2 y 3 mientras que la clase Nim habla de filas 0,1 y 2.

	Haz un programa que empiece siempre la máquina (ganará siempre) y, si quieres, haz otro en que empieces tú, a ver si eres capaz de ganarle.

	Por último, si no quieres, no es necesario usar el método `leerEntero()`, puedes usar la lectura de teclado habitual: `nextInt()`, `nextLine()`, etc.
	
- Ejercicio 7

	*Implementar una clase llamada `Circulo`, que tiene solo la propiedad radio y los métodos `setRadio`, `getRadio`, `calcularCircunferencia`, `calcularSuperficie`, `calcularDiametro` además de un constructor. Crea un programa que use esta clase creando un par de círculos y usando los métodos creados. ¿El atributo radio puede ser privado?*

- Ejercicio 8

	*Implementar una clase llamada EjemplarLibro que se va a usar en una biblioteca y que tiene los siguientes atributos:*
	
	- Título de libro (se le pone en el momento del alta)
	- Fecha de adquisición (es la fecha del sistema en el momento del alta)
	- Número de ejemplar: 1, 2, 3, etc. (de un mismo libro, la biblioteca tiene varios ejemplares)
	- Prestado (sí /no). Inicialmente no está prestado.
	
	Además, tiene los siguientes métodos:
	
	- Constructor 1: cuando es el primer ejemplar de un determinado título, se le pasa como parámetro solo el título del libro. El resto de datos los puede calcular él.
	- Constructor 2: se le pasa como parámetro un libro y copia todos sus atributos salvo el número de ejemplar que será 1 más el del libro pasado.
	- `Prestar ()`: si no está prestado lo marca como prestado y devuelve true¸ si está prestado no hace nada y devuelve false.
	- `Devolver ()`: si está prestado lo marca como no prestado y devuelve true¸ si no está prestado no hace nada y devuelve false.
	- `toString ()`: Genera un String con el nombre, la fecha entre paréntesis y el número de ejemplar entre corchetes. Este método se usará para sacar por pantalla de forma cómoda los datos de un libro.
	
	Haz un `main()` que cree 4 libros (probando ambos constructores), que realice algún préstamo y devolución, y finalmente muestre los libros -con `toString()`-.

- Ejercicio 9

	*Ejercicios de fechas. Usando las clases de Java para el manejo de fechas, realiza programas con la siguiente funcionalidad:*

	1. Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo.
	2. Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar dichos días a la fecha.
	3. Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos.
	4. ¿Cuántos años bisiestos ha habido desde el año 1 dC?
	5. Introducir una fecha y mostrar el día de la semana que le corresponde.
	6. Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa) y la fecha de compra, y que informe si se puede devolver a día de hoy o no (los plazos de devolución, son respectivamente 5 horas, 6 meses, 15 días)
	7. Introducir un año y decir cuántos domingos tiene.
	8. Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años.

> En general, procuraremos siempre de separar la parte de interface de usuario (println, nextInt, etc…) de la lógica del programa. Así podremos transportar fácilmente esa lógica a otro tipo de programas, con otra interface (consola, interface gráfica, página web, etc.) 
>
> En este programa, la clase Nim no depende de la interface de usuario, para cambiar a otro tipo de entorno simplemente sustituiremos la clase Consola por otro tipo de sistema de interacción con el usuario.
>
> Trata de seguir esta filosofía en las clases que desarrolles.


- Ejercicio 10

	*Desarrolla la clase `MovilPrepago` que te proporcionó el profesor para ejercicios anteriores y compárala con la proporcionada.*

- Ejercicio 11 

	*Desarrolla la clase `CuentaCorriente` que te proporcionó el profesor para ejercicios anteriores y compárala con la proporcionada.*
	
- Ejercicio 12

	Diseña una clase llamada `Alumno` para gestionar los alumnos de una escuela. Contiene los atributos: nombre completo, DNI, fecha de nacimiento y nombre de la escuela (común para todos los alumnos). Además del constructor, los métodos `set` y `get` para cada atributo, tendrá los siguientes métodos:

	- Método que nos dice si es mayor de edad o no.
	- Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es menor que él mismo. False en caso contrario.
	- Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es exactamente igual en todos los campos (un duplicado). False en caso contrario.

	Realiza a continuación un programa sencillo que use la clase definida.
	
- Ejercicio 13

	*Sobre el siguiente código, modifica la clase Contacto para que funcione el `main()` mostrado:*

	```java
	import java.time.*;
	public class ejercicio {
		public static void main(String[] args) {
			Contacto contacto;
			contacto = new Contacto ("Marta", 6661111222L, LocalDate.parse("2019-11-25"));
			contacto = new Contacto ("Miguel", 1111111L, LocalDate.now());
			contacto = new Contacto ("Ana", 3333333L,"2019-11-20");
			contacto = new Contacto ("Daniel", 444444L);
		}
	}
	
	class Contacto {
		public String nombre;
		public long numero;
		public LocalDate fechaAltaAgenda;
		
		Contacto (String no, long nu,LocalDate fe){
			this.nombre = no;
			this.numero = nu;
			this.fechaAltaAgenda = fe;
		}
	}
	```
	
- Ejercicio 14

	*Realiza un juego de la ruleta rusa para dos jugadores. La pistola tiene 6 huecos en la recámara pero solo una bala. Al empezar la partida se genera una posición al azar de la recámara para la bala de forma que puede salir en el primer disparo, en el segundo, etc. hasta el sexto. Los jugadores irán disparando sucesivamente hasta que uno de los dos se muera. Crea una clase Pistola con los atributos y métodos que la definen.*

- Ejercicio 15

	*Diseña una clase llamada Ruleta y un programa que la use, con la siguiente funcionalidad.*
	
	- El jugador puede apostar lo que quiera a par o a impar .
	- En cada juego obtiene un número al azar entre 0 y 36
	- Si sale 0 pierde tanto par como impar, y en caso contrario si el jugador acierta (par o impar) gana tanto como lo apostado.
	
	Define los métodos necesarios para que los usuarios puedan apostar a par o impar. Hacer un programa en el que un jugador lleve 10.000 euros y juegue 10.000 veces 1 euro cada vez siempre apostando a par ¿Con cuánto dinero acaba? El resultado final puede ir entre 0 y 20.000 euros. Ejecútalo varias veces. ¿Conclusiones sobre jugar a la ruleta? ;)


- Ejercicio 16 

	*Un profesor ha desarrollado un examen tipo test de 20 preguntas y cada una de ellas tiene cuatro opciones: a), b), c) ó d), siendo solo una de ellas la correcta. Cada pregunta correcta suma 0.5 puntos y cada una incorrecta resta 0.2 puntos, no pudiendo llevar un alumno ninguna nota inferior a cero. Desarrolla una clase llamada Examen que almacene las respuestas correctas de las 20 preguntas. La clase debe disponer de algún mecanismo mediante el que se le pase las respuestas de un alumno para las 20 preguntas (a,b,c,d o bien z, siendo respuesta en blanco) y nos informe de la puntuación en el examen. Hacer un programa que permita primero informar de las respuestas correctas a un examen y después introducir las respuestas de los alumnos, mostrándonos la nota obtenida por los mismos.*

- Ejercicio 17

	*Realiza mediante objetos un juego de Gato y Ratón: sobre un tablero que por el momento es de 20 filas x 20 columnas (aunque podría cambiar el tamaño), el gato y ratón se sitúan inicialmente en una posición al azar. En cada turno el gato y el ratón se mueven alternativamente. El ratón es rápido pero ciego así que se mueve de 2 en 2 casillas pero en una dirección aleatoria (si el movimiento provocase que saliese del tablero, vuelve a generarlo hasta que sea un movimiento válido). El gato se mueve de una en una casilla pero siempre en dirección hacia el ratón. El programa termina cuando se encuentren. El programa mostrará la situación del tablero después de cada movimiento (el usuario pulsará <ENTER> para que se produzca cada movimiento). Pistas:*

	- Hacer una clase TableroGatoRaton, con un constructor en el que se crea las dimensiones cantidad de filas y cantidad de columnas. Esa clase tiene un método para pintar el tablero, por ejemplo, con un punto para casillas vacías, una “G” para la posición del gato y una “R” para la posición del Ratón.
	- Hacer una clase Ratón y una clase Gato cuyas propiedades son su posición, con un constructor que sitúa al gato o ratón en una posición inicial, y un método mover que cambia de posición, según las reglas descritas.
	- Hacer un main() que cree un tablero, un ratón y un gato y alterne los movimientos de los dos últimos.

- Ejercicio 18

	*Haz el juego del “MasterMind” de la siguiente forma: la máquina genera al azar 4 dígitos entre 0 y 10 sin repetidos que es lo que se tendrá que adivinar. El jugador introducirá combinaciones de 4 dígitos también sin repetidos hasta que lo adivine. Cada vez que introduce una combinación el sistema le dirá cuántos dígitos de los introducidos están en la combinación a descubrir distinguiendo si están en la misma posición o si están en la combinación, pero en otra posición. Tiene 10 intentos para averiguarlo.*

	> Ejemplo: combinación a adivinar: 9871 intento: 8471: 2 dígitos bien colocados, 1 dígito mal colocado.

	El sistema validará que las combinaciones introducidas sean de 4 posiciones y sin repetidos. Haz una clase con la lógica del juego y un programa que la utilice pero solo como intermediario entre la clase y el jugador. Trata también de hacer el ejercicio lo suficientemente flexible para que a futuro se pudiese fácilmente cambiar a combinaciones de 5 dígitos (ó 6 ó 7 etc.) y también cambiar el número de intentos.

---
> Iago Xoan Casal Neira -- Curso 2022/23
> 
> 15005397 -- IES Fernando Wirtz Suarez\
> CSIFC03 -- Desenvolvemento de aplicacións web\
> MP0485 -- Programación