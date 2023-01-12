# Bloque Array
## Cuestiones

**Ejecuta estas porciones de código y responde a las cuestiones:**

1. **Indica los errores del siguiente código y muestre lo que saca por pantalla:**

	```java
	int [] a = new int [] {1,2,3,4,5};
	int p=0,i=0;
	for (int x=0;x<a.length;x++)
		if (x%2==0) p+=a[x];
		else i+=a[x];
	System.out.printf("%d-%d\n",p,i);
	```

	El código es correcto sintéticamente, pero, supongo que la linea 4 tendría más sentido si fuese `if (a[x]%2==0) p+=a[x];` ya que en el original se está preguntando si el indice actual del bucle es múltiplo de `2` en lugar de si el número contenido en el indice actual del bucle es múltiplo de `2`.
	
2. **Indica los errores de cada línea:**

	```java
	int [] arr = new arr [] {1,2,3,4,5};
	```

	El tipo `arr` no existe, hay que porporcionar el tipo de datos que va a contener el bucle, en este caso sería `int`.
	
	```java
	int [5] arr = new int [] {1,2,3,4,5};
	```

	La cantidad de indices no se declara ahí y, de todos modos, no tendría, sentido hacerlo en este caso ni en el lugar correcto, ya que no se puede declarar contenido del array y dimensión del mismo a la vez.
	
	```java
	int [] arr = new int [5] {1,2,3,4,5};
	```

	No se puede declarar la cantidad de indices del array porque ya se están declarando los indices.
		
	```java
	int [] arr = new int [] {1,2,3,4,5};
	```

	Es correcto.
		
	```java
	int [] arr = new int [5];
	```

	Es correcto.

3. **Corrige los errores de este código e indica la salida del mismo:**

	```java
	int [] arr = new int [5] {1,2,3,4,5};
	for (int i=0; i<= arr.length()-1;i=+1) arr[i]=arr[i+1];
	System.out.println(Arrays.toString(arr));
	```

	Corrección:

	```java
	int[] arr = new int[] {1,2,3,4,5};
	for (int i = 0; i < arr.lenght() - 1; i++) arr[i] = arr[i + 1];
	System.out.println(Arrays.toString(arr));
	```

	El código devolvera por pantalla el array: `2, 3, 4, 5, 5`.
	
4. **Indica que muestra este código y corrige los errores que encuentres:**

	```java
	public static void main(String[] args) {
		int [] arr = new int [] {1,2,3,4,5};
		System.out.println(Arrays.toString(fun (arr)));
	}

	static int [] fun (int [] x ){
	int [] y = new int[x.length*2];
	int cont=0;
	for (int z : x) {
		y[cont++]=z;
		y[cont++]=z+10;
		}
	return y;
	}
	```

	Corrección:

	```java
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(fun (arr)));
	}

	static int[] fun(int[] x) {
		int[] y = new int[x.lenght * 2];
		for (int z = 0; z < x.lenght; z++) {
			y[z] = x[z];
			y[z + 1] = x[z] + 10;
		}
		return y;
	}
	```
	
5. **Dado el siguiente programa en Java:**

	```java
	public class ej {
		public static void main(String[] args) {
			boolean result=true;
			if (args.length != 2) result=false;
			else if (!args[0].equals(args[1])) result= false;
			System.out.println (result);
		}
	}
	```

- ¿Qué mostrarían las siguientes ejecuciones?
	
	- `java ej abc abc abc`

		Devuelve `false` porque el número de elementos en `args` es distinto de `2`.

	- `java ej abc abc`

		Devuelve `false` porque el primer elemento es equivalente al segundo elemento.

	- `java ej ABc abc`

		Devuelve `true` porque `args` contiene `2` elementos y ambos son diferentes el uno del otro.

6. **Indica qué hace este programa.**

	```java
	boolean result=true;
	if (args.length != 2) result=false;
	else if (!args[0].equals(args[1])) result= false;
	else {
		int up=0, low=0;
		for (int i=0;i<args[0].length();i++){
			if (Character.isUpperCase(args[0].charAt(i))) up++;
			else if (Character.isLowerCase(args[0].charAt(i))) low++;
		}
		if (low <= 1 || up <= 1 ) result = false;
	}
	System.out.println (result);
	```

	- El programa devuelve `false` si el número de elementos en `args` es distinto de `2` o si ambos elementos son iguales.

	- Si el número de elementos es `2` y estos son diferentes:
		- Recorre todos los caracteres del primer elemento de `args`, suma `1` a `low` si encuentra alguna letra minúscula o `1` a `up` si encuentra alguna letra mayúscula.
		- Sí se encontró alguna letra -- `up` mayor o igual a `1` y/o `low` mayor o igual a `1` -- se devuelve `false`, de lo contrario la ejecución termina con un `true`.
	
### Ejercicios

1. **Realiza un programa que tenga definido un Array como variable global llamado `temperaturaMeses`, de `12` enteros, con las temperaturas medias de un lugar en cada uno de los meses del año. Serán valores enteros negativos o positivos. El programa tendrá diferentes funciones que realicen las siguientes tareas:**

	- Llenar el Array con valores al azar para todos los meses (entre `0` y `40`).
	- Mostrar por pantalla el contenido del Array.
	- Mostrar por pantalla el contenido del Array en orden inverso.
	
2. **Realiza un programa similar al anterior, con las siguientes tareas:**
	- Llenar el Array con valores al azar para todos los meses (entre `0` y `40`).
	- Mostrar la temperatura media del año.
	- Mostrar los meses en los que hizo más de `30` grados.
	- Decir si hay algún mes con más de `30` grados, recorriendo lo imprescindible del array, es decir, en cuanto sepa que sí hay alguno, que pare de recorrer el array. Puedes usar `break` o `return`.
	- Decir si hay algún mes con más de `30` grados, recorriendo lo imprescindible del array pero ahora sin usar ni break ni return.
	- Decir si hay alguna temperatura repetida en dos o más meses.
	
3. **Realiza un programa similar al anterior, pero que en la parte ‘a’ garantice que no hay temperaturas repetidas.**

4. **Realiza un programa similar a los anteriores pero que realice las siguientes funciones:**

	- Llenar el Array con valores al azar para todos los meses. Para enero, febrero, marzo, noviembre y diciembre los valores estarán comprendidos entre `-10` y `+20` y para el resto de meses entre `+10` y `+40`.
	- Mostrar por pantalla el contenido del array con el nombre de los meses (usar clases Java para obtener el nombre del mes).
	- Mostrar la temperatura máxima del año, usando `printf` especificando en el formato que incluya el signo `+` en temperaturas positivas y que solo muestre `1` decimal.
	- Mostrar el nombre del mes más frío del año.
	- Para hacer pruebas estadísticas, desplazar los valores a la derecha, pasando el último al primero.

5. **Realizar una clase `Primitiva` que tenga definido un Array privado de 6 elementos con el resultado de un sorteo de la primitiva (serán `6` enteros con valores comprendidos entre `1` y `49` y sin repetidos). La clase dispondrá de un constructor en el que se generan y almacenen esos números al azar, también tendrá un método al que se le pase una combinación jugada como parámetro (no necesariamente ordenada) y devuelva el número de aciertos. Realiza tres programas distintos que usen esa clase:**

	- Programa que el usuario introduzca los `6` números de su boleto y le diga cuantos acertó.
	- Programa en el que se generen `1000` boletos al azar y nos informe de cuantos boletos hay con `3`, `4`, `5` y `6` aciertos (a lo mejor es necesario crear un nuevo método en la clase `Primitiva` para generar boletos al azar).
	- Programa con un bucle que genere boletos hasta que acierte los `6` números ¿Cuántos boletos has tenido que crear?

6. **Realizar una clase llamada `Parking` que gestione los coches aparcados en un parking mediante un Array que almacene las matrículas. El parking es un poco raro, mide solo 3 metros de ancho y caben `20` coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir (esta estructura se llama pila LIFO – Last Input, First Output). La clase debe tener métodos siguientes:**

	- Mostrar el estado del parking, esto es las matrículas de las plazas ocupadas.
	- Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
	La plaza del fondo es la número `1` y la que está más cerca de la entrada es la `20`.
	- Desaparcar: (¿hace falta pasarle algún parámetro?). Devuelve la matrícula del coche a desaparcar o bien una cadena vacía si el parking está vacío.
	- Mostrar la cantidad de plazas libres en ese momento.
	
	Hacer un programa con un menú que permita al usuario usar los métodos creados mostrando la información del parking correspondiente a los métodos creados (los métodos no deben escribir nada por consola, eso lo hace el programa que usa la clase)

	> Para implementar este tipo de estructuras LIFO existe una Colecciones que resuelven esto de forma más sencilla, se verá en el tercer trimestre.
	
7. **Realizar una clase llamada `Parking2` que gestione los coches aparcados en un parking mediante un Array, que almacene las matrículas y la hora de entrada en el parking. El parking es un poco raro, mide solo 3 metros de ancho y caben `20` coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir (esta estructura se llama pila LIFO – Last Input, First Output). Cada minuto en el parking cuesta *`2` céntimos* (máx *`10` euros*). La clase debe tener métodos siguientes:**

	- Mostrar el estado del parking, esto es las matrículas/hora de entrada de las plazas ocupadas.
	- Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
	La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
	- Desaparcar: (¿hace falta pasarle algún parámetro?). Al desaparcar se calcula el importe a pagar según los segundos de estancia. Devuelve la matrícula del coche y el importe a pagar. Si es parking está vacío devuelve cadena vacía y cero euros.
	- Mostrar lo recaudado hasta ese momento.
	
	Hacer un programa con un menú que permita al usuario usar los métodos creados. No hay que introducir a mano los valores de hora de entrada y salida en el parking, se harán por el reloj del sistema.

8. **Realizar una clase `carritoCompra` que mantenga las compras realizadas por un cliente en un Array. Cada posición del Array contendrá el código del producto, la descripción, el precio unitario y la cantidad de unidades compradas y el precio total de ese producto (cantidad x precio unitario). Se permite comprar como máximo de `100` artículos diferentes. Además de la lista de productos, la clase tiene el importe total de la compra, que debe estar siempre actualizado. Necesitamos los métodos:**

	- Mostrar por consola el estado actual del carrito.
	- Añadir producto.

	Hacer un programa con un menú que permita al usuario operar con el carrito de la compra.
	
	> **Nota**: Pensar en crear un método .toString() para facilitar el mostrar por pantalla cada producto comprado.
	
9. **Realizar un programa que tenga una función a la que se le pasa un Array con las edades de los alumnos de una clase y nos devuelva la edad media. Añadir una función a la que se le pasa un Array con las edades de los alumnos y nos devuelva un Array solo con los mayores de edad.**

10. **Realizar un programa que tenga definido un Array de `12` filas y `30` columnas llamado temperaturaDia con las temperaturas medias de un lugar en cada uno de los días del año (suponemos meses de `30` días). Serán valores enteros negativos o positivos. El programa debe tener funciones para realizar las siguientes tareas:**

	- Llenar de valores el Array: para evitar tener que introducir los valores a mano, genera valores al azar para todos los días. Para enero, febrero, marzo, noviembre y diciembre los valores estarán comprendidos entre `-10` y `+20` y para el resto de meses entre `+10` y `+35`.
	- Mostrar por pantalla el contenido del array en forma de tabla: todos los días de un mes en la misma fila, ocupando 3 posiciones (una para el signo y dos dígitos para la temperatura).
	- Mostrar la temperatura media del año.
	- Calcular la temperatura media de cada mes.
	- Crear un Array unidimensional con la temperatura mínima de cada mes.
	
11. **Realizar un programa que tenga definido un Array de `12` filas y `30` columnas llamado temperaturaDia con las temperaturas medias de un lugar en cada uno de los días del año (suponemos meses de `30` días). Serán valores enteros negativos o positivos. El programa debe tener funciones para realizar las siguientes tareas:**

	- Llenar de valores el Array: para evitar tener que introducir los valores a mano, genera valores al azar para todos los días. Para enero, febrero, marzo, noviembre y diciembre los valores estarán comprendidos entre `-10` y `+20` y para el resto de meses entre `+10` y `+35`.
	- Mostrar el día en el que más calor hizo del año.
	- Decir si hay algún día con más de `30` grados, recorriendo lo imprescindible del array, es decir, en cuanto sepa que sí hay alguno, que pare de recorrer el array.

12. **Realizar un programa llamado hipotenusa al que se le pasen como parámetros dos valores, verifique que son enteros positivos y que suponiendo que son los catetos de un ángulo recto, calcule el valor de la hipotenusa.**(*Se refiere a introducirlos en la llamada al programa, `java prog param1 param2`, sería algo así: `java hipotenusa 4 2`)*.

	> Para asignar parámetros a programas en Netbeans, clicamos botón derecho sobre el proyecto y, en Propiedades del Proyecto, en la sección Ejecutar: comprobamos que la entrada ’clase main’ contiene el nombre del paquete+programa de este ejercicio en concreto, y en ’argumentos’ ponemos separados por espacios en blanco los argumentos. Para ejecutar pulsamos F6, o bien Ejecutar proyecto, pero no May+F6 (Ejecutar archivo actual) como sí podemos hacer en otros casos.

13. **Realizar un programa que tenga un Array con una agenda de teléfonos simple con unos valores cualquiera. Por ejemplo:**

	| Nombre   | Número       |
	| -------- | -------------|
	| Marta    | 666111222    |
	| Miguel   | 981981981    |
	| Ana      | 900900900    |
	| Daniel   | +34881000001 |
	
	Al programa se le pasará como parámetro un nombre. Si el nombre está en la agenda, mostrará su teléfono, y en caso contrario informará que no existe dicha persona. `java prog Ana`.

	> En el tercer trimestre veremos que este tipo de estructuras, como la agenda, que no van orientadas a una numeración específica, se almacenan mejor en estructuras llamadas `Map`.
	
14. **Realizar un programa que defina un Array con `10` elementos e introduzca valores a azar entre `1` y `20` pero garantizando que no se introducen repetidos y una vez introducidos, ordénalos ascendentemente programando un algoritmo de ordenación.**

	> En el apartado siguiente veremos que mediante ArrayList disponemos de métodos que ordenan por nosotros.


# Bloque B: ArrayList

### Cuestiones

1. **Muestra el contenido del ArrayList después de ejecutar este código:**

	```java
	ArrayList <Long> a = new ArrayList <>();
	for (int i=0;i<=9;i++)
		a.add((long)Math.pow(2,i+1));
	```

2. **Si sobre el ArrayList anterior ejecutamos el siguiente código.¿Cómo quedaría el ArrayList?**

	```java
	for (int i=0;i<a.size();i+=2)
		a.set(i,999);
	```

3. **Inventa dos ejemplos de lo que podría ser la salida de este código:**

	```java
	ArrayList <Integer> a = new ArrayList <>();
	int lon=(int) (Math.random()*6)+5;
	for (int i=0;i<lon;i++)
		a.add((int)(Math.random()*100)+1);
	Collections.sort(a);
	for (int i=0; i<a.size();i++)
		System.out.println(a.get(i));
	```

4. **Inventa dos ejemplos de lo que podría ser la salida de este código:**

	```java
	ArrayList <Integer> a = new ArrayList <>();
	int n=0;
	for (int i=0;i<6;i++) {
		do {
			n = (int)(Math.random()*49)+1;
		} while (a.contains(n));
		a.add(n);
	}
	Collections.sort(a);
	for (int i=0; i<a.size();i++)
		System.out.println(a.get(i));
	```

5. **¿Qué hace este código con los valores contenidos en el ArrayList anterior?¿Tiene errores?**

	```java
	for (int i=0;i<a.size();i++) {
		a.set(i,a.get(i)+1);
	}
	```

6. **¿Qué hace este código con los valores contenidos en el ArrayList?¿Tendrá valores mayores de 30?**

	```java
	ArrayList <Integer> a = new ArrayList <>();
	llenarArrayList (a); //llena el arrayList con valores positivos y negativos
	for (int i=0;i<a.size();i++) {
		if (a.get(i)>30) a.set(i,30);
		else a.set(i,Math.abs(a.get(i)));
	}
	```

7. **Indica que hace el siguiente código. ¿Estadísticamente hablando, cuántos elementos tendrá más o menos el `ArrayList`?**

	```java
	ArrayList <Integer> a = new ArrayList <>();
	for (int i=0;i<10000;i++) {
		a.add((int)(Math.random()*1000)+1);
	}
	for (int i=0; i<a.size();i++)
		if (a.get(i)>= 250 & a.get(i) <= 750) a.remove(i);
	```

8. **Este código quiere ordenar un Array convirtiéndolo en ArrayList, aplicándole el método estático sort y volviendo a convertir el ArrayList al array inicial. Qué falta en la línea en blanco.**

	```java
	Integer [] arr = {10, 3, 7, 2, 9, 5}; //no fuciona con int
	Collections.sort(lista);
	arr = lista.toArray(new Integer[lista.size()]);;
	System.out.println (Arrays.toString(arr));
	```

9. **¿Es correcto este código?¿Hace algo?**

	```java
	static void fun (ArrayList <String> a, String x) {
		while (a.remove(x)){}
	}
	```

10. **¿Es correcto este código?¿Hace algo?**

	```java
	public static void main(String[] args) {
		ArrayList <Integer> x = new ArrayList <>();
		for (int i=0;i<5;i++) x.add((int)(Math.random()*100));
		Collections.sort(x);
		fun (x, 20);
		fun (x, 200);
		fun (x, -1);
	}

	static void fun (ArrayList <Integer> a, int n) {
		for (int i=0; i<a.size();i++) {
			if (a.get(i)>n) {
				a.add(i,n);return;
			}
		}
		a.add(n);
	}
	```

### Ejercicios

1. **Realiza un programa que tenga un `ArrayList` llamado `AlturaAlumnos` que mantenga una lista con las alturas de los alumnos de un centro. Serán valores positivos entre `0,50` y `2,50` redondeados a dos decimales. El programa tendrá las siguientes funciones (accesibles mediante un menú):**

	- Añadir altura.
	- Mostrar lista actual con el número de posición
	- Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha posición.
	- Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones en las que se encuentre dicha altura. Devuelve la cantidad de eliminaciones.
	- Ordenar la lista.
	- Vaciar la lista.

2. **Realizar un programa al que se le vayan introduciendo por teclado números enteros. El programa dispone de dos `ArrayList`, uno llamado `positivos` y otro `negativos`. Se trata de meter los números introducidos en uno u otro según su signo hasta que finalice el programa (esto ocurrirá cuando se introduzca cero). Al finalizar, mostrará la media aritmética de cada `ArrayList`.**

3. **Realiza una clase llamada `Primitiva2` similar a la clase `Primitiva`, pero empleando ahora una `ArrayList`, y aprovechando los métodos de los que dispone para simplificar la generación de números sin repetidos. Además, los números premiados se mantendrán ordenados y, por último, la búsqueda de los números jugados en el `ArrayList` de los premiados se requiere que se haga de forma dicotómica. Rehacer los 3 programas del ejercicio anterior de la `Primitiva` pero usando esta nueva clase.**

	- Programa que el usuario introduzca los `6` números de su boleto y le diga cuantos acertó.
	- Programa en el que se generen `1000` boletos al azar y nos informe de cuantos boletos hay con `3`, `4`, `5` y `6` aciertos (a lo mejor es necesario crear un nuevo método en la clase Primitiva para generar boletos al azar).
	- Programa con un bucle que genere boletos hasta que acierte los `6` números ¿Cuántos boletos has tenido que crear?

	Opcionalmente, puedes probar a hacer una nueva versión de la clase, sería `Primitiva3`, que sea igual que `Primitiva2`, pero con Array en vez de `ArrayList`. Como no dispones de métodos para ordenar ni para búsqueda dicotómica deberás construirlos tú mismo. Así compruebas las ventajas de usar `ArrayList` y sus métodos ya creados en vez de Arrays.

4. **Realizar un programa que tenga una función a la que se le pasa un entero y devuelva un `ArrayList` con todos sus divisores.**

5. **Realizar una clase `carritoCompra2` que mantenga las compras realizadas por un cliente en un `ArrayList`. Cada posición del `ArrayList` contendrá el código del producto, la descripción, el precio unitario y la cantidad de unidades compradas y el precio total de ese producto (cantidad x precio unitario). Se permite comprar un número indeterminado de artículos. Además de la lista de productos, la clase tiene el importe total de la compra, que debe estar siempre actualizado. Necesitamos los métodos:**

	- Mostrar por consola el estado actual del carrito.
	- Vaciar carrito.
	- Añadir producto.
	- Eliminar producto (se le pasa el código de producto) y lo elimina físicamente del `ArrayList`.

	Hacer un programa con un menú que permita al usuario operar con el carrito de la compra. Pensar en crear un método `.toString()` para facilitar el mostrar por pantalla cada producto comprado.

6. **Diseñar una clase Factura que consta de:**

	- Número identificador: lo proporciona el usuario en el alta de la factura.
	- Fecha de la factura: la toma del sistema en el momento del alta.
	- Número de cliente: : lo proporciona el usuario en el alta de la factura.
	- Porcentaje de IVA: 21% para todas las facturas.
	- Un número indeterminado de lineaFactura que contienen:
		- Descripción del producto
		- Precio unitario
		- Cantidad de unidades
		- Porcentaje de descuento: 5% para líneas con más de 10 unidades.
		- Importe total de la línea.
		- Importe total: inicialmente cero, y se va actualizando siempre que se añadan/eliminen líneas.

	Implementar la clase con su constructor y métodos para añadir línea de factura, eliminar línea de factura y mostrar la factura por consola. Te hará falta una clase `lineaFactura` con su constructor. Para añadir línea de factura, habrá que solicitar al usuario los campos necesarios para añadirlo (descripción, precio unitario y cantidad de unidades). Para eliminar una línea, solicitaremos el número de línea.
	Hacer también un programa con un menú para gestionar una factura (alta, añadir/eliminar líneas, mostrar factura).

	> Nota: pensar en método `.toString()` para líneaFactura.
	
7. **Realizar una versión del juego de cartas de las 7 y media para `3` jugadores.**

	- Los jugadores van solicitando cartas `1` a `1` para llegar a las 7 y media sin pasarse, pudiendo plantarse cuando lo desee.
	- Las figuras valen medio punto y el resto su valor numérico. La baraja tiene `40` cartas.
	- El juego se acaba cuando todos los jugadores se planten, se hayan pasado, o se acaben las cartas.
	- Hacer una clase `Baraja` paso a paso, primero una versión que solo obtenga las cartas de forma aleatoria eliminando la carta del `ArrayList` para que no vuelva a salir, luego que juegue un solo jugador y finalmente, la versión completa.

	> Pensar en crear las clases: `Carta`, `Jugador` y una clase `Baraja` que incluya `40` cartas y hasta `3` jugadores.
	
8. **Realizar un programa que cree un `ArrayList` con `10000` números aleatorios entre `1` y `6` (como si fuese lanzar un dado). Utilizando los métodos estáticos de la clase `Collections` guarda en otro `ArrayList` la distribución de resultados obtenidos (cuantas veces ha salido el uno, cuantas veces ha salido el dos, etc...) y muestra su contenido. Finalmente, también mediante métodos de `Collections`, mostrar la diferencia de veces entre el número que más ha salido y el que menos ha salido.**

9. **Realizar el programa que simule el comportamiento de una cola `FIFO` con los nombres de pacientes que esperan en la consulta del médico. Tendrá un menú con las siguientes opciones:**

	- Llega un paciente (esto es, Introducir elemento al final de la cola).
	- Llamar al paciente para ser atendido (esto es, sacar el primer elemento de la cola) mostrándolo por pantalla.
	- Mostrar el estado de la cola y d) salir de programa.

10. **Realizar un programa con una función a la que se le pasan dos `ArrayList` de enteros como parámetros y nos devuelva true si los dos `ArrayList` tienen los mismos elementos, aunque sean en otro orden, y devuelva `false` en caso contrario (suponemos que no tienen valores repetidos).**

11. **Realizar una clase llamada `Parking3` que gestione los coches aparcados en un parking mediante un `ArrayList`, que almacene las matrículas y la hora de entrada en el parking. El parking es un poco raro, mide solo 3 metros de ancho y caben 20 coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir (esta estructura se llama pila `LIFO` – Last Input, First Output). Cada minuto en el parking cuesta 2 céntimos (máx 10 euros). La clase debe tener métodos siguientes:**

	- Mostrar el estado del parking, esto es las matrículas/hora de entrada de las plazas ocupadas.
	- Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
		La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
	- Desaparcar: (¿hace falta pasarle algún parámetro?). Al desaparcar se calcula el importe a pagar según los segundos de estancia. Devuelve el importe a pagar. Si es parking está vacío devuelve -1.
	- Mostrar lo recaudado hasta ese momento.
	
	Hacer un programa con un menú que permita al usuario usar los métodos creados. No hay que introducir a mano los valores de hora de entrada y salida en el parking, se harán por el reloj del sistema.

12. **Haz el juego del `MasterMind` con las mismas características que el del capítulo anterior, pero almacenando en un `ArrayList` las combinaciones que va introduciendo el usuario con su resultado (cuantos bien colocados, cuantos mal colocados). Añade un método que muestre el contenido de ese `ArrayList`, así, cuando el jugador introduzca una combinación, le mostrará en forma de lista, todos los intentos que lleva con su resultado, como se ve en la figura.**
