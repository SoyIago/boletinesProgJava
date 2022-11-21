El programa pregunta por una cadena de texto y crea un `StringBuilder` de nombre `cadenaSB` a la que intentara eliminar todos los espacios que contenga.

El código esta mal planteado, lo que esta ocurriendo es que no se crea un `StringBuilder` con el contenido de la entrada del usuario, si no que, se intenta declarar un `StringBuilder` de longitud la cadena de entrada que da el usuario, lo cual es imposible ya que esto es un tipo `String`, no un `int`, ademas, el contenido del `String cadena` jamas se pasa al `StringBuilder cadenaSB`.

El código correcto seria:

```java
Scanner teclado = new Scanner(System.in);
System.out.print("Dame una cadena: ");
String cadena = teclado.nextLine();
StringBuilder cadenaSB = new StringBuilder(cadena.lenght);
cadenaSB.append(cadena);

int pos;
do {
	pos = cadenaSB.indexOf(" ");
	if (pos != -1) cadenaSB.deleteCharAt(pos);
} while (pos != -1);
```

