### Cuestiones

Examina la clase `Bicho` y su clase hija `BichoDormilon`:

```java
class Bicho {
    public int hambre;
    private int peso;

    Bicho () { hambre =50; peso=50; }
    Bicho (int h, int p) { hambre = h; peso = p;}
    
    public void come () { hambre -=5; peso++; }
}

class BichoDormilon extends Bicho {
    public int sueño;

    BichoDormilon () { sueño = hambre * 2; }
    BichoDormilon (int i) { super(i,0); sueño = i+20; }

    @Override
    public void come () {hambre -= 10; sueño += 5; }
    public void aDormir () {super.come(); sueño =0; }
}
```

Y trata de responder las siguientes cuestiones, justificando tu respuesta. Luego comprueba los resultados, ejecutando un programa con las sentencias propuestas:

- ¿Qué mostraría el siguiente código?

    ```java
    Bicho bi = new Bicho();
    BichoDormilon bd = new BichoDormilon();
    System.out.println("bi -> hambre: " + bi.hambre);
    System.out.println("bd -> hambre: " + bd.hambre);
    System.out.println("bd -> sueño: " + bd.sueño);
    System.out.println("bd -> peso: " + bd.peso);
    ```

- Si a continuación se ejecutan estas instrucciones ¿qué mostraría?

    ```java
    bi.come();
    bd.come();
    System.out.println("bi -> hambre: " + bi.hambre);
    System.out.println("bd -> hambre: " + bd.hambre);

    bd.aDormir();
    System.out.println("bd -> hambre: " + bd.hambre);
    System.out.println("bd -> sueño: " + bd.sueño);
    ```

- Sobre las mismas clases, vamos a crear un nuevo BichoDormilon ¿qué mostrarían estas sentencias?

    ```java
    BichoDormilon bd2 = new BichoDormilon (5);

    bd2.come(10);
    System.out.println("bd2 -> hambre: " + bd2.hambre);
    ```

- Vamos a hacer algo parecido otra vez, vamos a crear otro BichoDormilon ¿qué mostrarían estas sentencias?

    ```java
    BichoDormilon bd2 = new BichoDormilon (5);
    bd2.come();
    System.out.println("bd2 -> hambre: " + bd2.hambre);
    System.out.println("bd2 -> sueño: " + bd2.sueño);
    ```

### Ejercicios

1. **Realiza las siguientes operaciones:**

    - Crea una clase llamada `Figura2D` con atributos numéricos con decimales y públicos: `ancho` y `alto`, y un método `verDim` que muestre por consola el `alto` y el `ancho` en una sola línea, con dos decimales.

    - Define una clase llamada `Triángulo` que es hija de `Figura2D` y añádele una cadena llamada estilo (vale: *isósceles*, *rectángulo*, *equilátero*, *etc.*), un método llamado área que devuelva la superficie del triángulo y un último método llamado `verEstilo` que muestre por consola el valor del atributo estilo.

    - Finalmente hacer un programa que cree un triángulo, asigne valores a sus atributos y use los métodos para ver sus dimensiones, estilo y área.

2. **Copia las clases anteriores como una nueva versión de las mismas (*añade sufijo `_v2`*) y realiza los siguientes cambios:**

    - Ahora los atributos `ancho` y `alto` serán privados.

    - Añade los métodos *getter* y *setter* para ambos atributos.

    - Modifica la clase `Triangulo` obligados por los cambios en su clase padre.

    - Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que el programa creado en el ejercicio anterior sigue funcionando.

    > Si creas estas clases mediante copiar y pegar del ejercicio anterior, cuidado con la cláusula `extends` ya que no la actualiza, puedes tener el error: `public class Triangulo_v2 extends Figura2D` en vez de: `public class Triangulo_v2 extends Figura2D_v2`.

3. **Copia las clases anteriores como una nueva versión de las mismas (*añade sufijo `_v3`*) y realiza los siguientes cambios:**
    
    - Añade un constructor a la clase `Triangulo` al que se le pasan tres parámetros: `estilo`, `alto` y `ancho`.

    - Se invocará al constructor por defecto de la clase base.

    - Modificar el programa de los ejercicios anteriores para que los triángulos sean creados mediante este nuevo constructor.

4. **Copia las clases anteriores como una nueva versión de las mismas (*añade sufijo `_v4`*) y realiza los siguientes cambios:**

    - Añade un constructor a la clase `Figura2D` al que se le pasan dos parámetros: `alto` y `ancho`.
    
    - ¿Funciona ahora el constructor de `Triangulo` (*creado en el ejercicio anterior*)? ¿Por qué?

        No, porque ahora se hace necesario llamar al constructor definido de `Figura2D_v4` para poder instanciarla, haciendo uso de `super(an, al)`.

    - Reescribe el constructor de `Triangulo` creado en el ejercicio anterior para que haga uso del nuevo constructor de la clase base.

    - Comprueba que el programa creado en el ejercicio anterior sigue funcionando.

    - Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que sigue funcionando.

5. **Copia las clases anteriores como una nueva versión de las mismas (*añade sufijo `_v5`*) y realiza los siguientes cambios:**

    - Añade un constructor más a la clase `Figura2D`, a este se le pasa solo un parámetro que se le asigna tanto al alto como al ancho (*figura igual alto que ancho*).

    - Hacer el constructor sin parámetros (*ya no se crea por defecto*) en este caso tanto alto como ancho igual a cero.

    - Añade a la clase `Triangulo` también un constructor sin parámetros, que invoque al constructor sin parámetros de la clase base (*aunque se hace por defecto*) y que ponga el estilo a `null`.

    - Añade otro constructor a la clase Triangulo, con un solo parámetro, para aquellos que tienen igual alto que ancho (*en este caso el estilo será `igualBaseAltura`*).

    - Haz un programa similar a los de ejercicios anteriores pero que use las nuevas características incorporadas en este ejercicio.

6. **Copia las clases anteriores como una nueva versión de las mismas (*añade sufijo `_v6`*) y realiza los siguientes cambios:**

    - Crea una nueva clase `TrianColor_v6`, hija de la clase `Triángulo_v6`, que incluye un nuevo atributo privado de tipo `String` llamado `color`.

    - Esta nueva clase tiene un constructor de 4 parámetros (`alto`, `ancho`, `estilo`, `color`), además del *getter* y *setter* de `color`.

    - Haz un nuevo programa que cree un triángulo de color y llame a métodos definidos en sus clases base.

7. **Copia las clases anteriores como una nueva versión de las mismas (*añade sufijo `_v7`*) y realiza los siguientes cambios:**

    - `Figura2D_v7` tendrá un nuevo constructor, que recibe como parámetro otro objeto de tipo `Figura2D_v7` y que copiará todos sus datos.

    - Hacer otro constructor análogo para la clase `Triangulo_v7`.

    - Haz un programa que cree un `Triangulo_v7` con el constructor de 3 parámetros creado previamente, y otro triángulo utilizando el nuevo constructor. Mostrar el área de ambos.

8. **Copia la última versión de las clases `Figura2D`, `Triangulo`, `Triancolor` como una nueva versión de las mismas (añade sufijo `_v8`) y realiza los siguientes cambios:**

    - Añadir a la clase `Figura2D_v8` un atributo privado llamado `nombre` de tipo `String`.

    - Añadir el *getter*/*setter* de ese campo y modificar los constructores de dicha clase para incorporar como parámetro el nombre de la figura (en el constructor por defecto se le asignará valor `null`).

    - Modificar las clase hija (`Triangulo_v8`) y nieta (`Triancolor_v8`) para incluir el nombre en constructores.

    - Crear una nueva clase hija de `Figura2D_v8` llamada `Rectangulo_v8` con constructor con tres parámetros (`alto`, `ancho`, `nombre`), constructor con dos parámetros (`lado` y `nombre`), siendo el `lado` el valor tanto para ancho como alto) y un método que devuelve boolean llamado `esCuadrado()`.

    - Hacer un programa que cree un ArrayList con 4 rectángulos, algunos cuadrados y otros no, y cuente cuantos hay cuadrados. En el mismo `main()` crear un `triancolor` a los que le asignes también el nuevo atributo: `nombre` y muestres su área.

9. **A partir de la clase `CuentaCorriente` que te proporcionará el profesor realiza las siguientes operaciones:**

    - Estudia los métodos: `ingresar` y `retirar` y añádeles un comentario a cada método explicando su funcionamiento (*bonificaciones y comisiones*).

    - Crea una clase hija llamada `CuentaPlazo` igual que la anterior, pero sin comisiones. Además, tiene un nuevo atributo, que es la fecha de creación.

    - Esta nueva clase ya no permitirá que haya subclases de ella.

    - Crea constructor para la nueva clase que incorpore la inicialización de la fecha de creación al día en curso.

    - Sobrescribe el método `retirar()` para que no que no calcule comisiones. Revisa los modificadores de acceso de atributos y quizás tengas que crear algún *getter*/*setter*.

    - Haz un programa que cree inicialmente una cuenta a plazo y luego, mediante un menú, permita ingresar, retirar y consultar el saldo.

10. **A partir de la clase `MovilPrepago` que te proporcionará el profesor realiza las siguientes operaciones:**

    - Crea una subclase llamada MovilPlus igual que la anterior pero que al efectuar llamadas no se le aplica ningún coste por el establecimiento de llamada y tiene una nueva funcionalidad llamada videollamada a la que se le pasa los segundos de la videollamada y reduce el saldo de forma similar a ‘navegar’. En este caso, cada segundo de llamada son 2 MB de datos (*recuerda que los atributos de `MovilPrepago` son privados, esto puede ser un problema a resolver*).

    - Crea constructor para la nueva clase, que llame al constructor de la clase padre.

    - Sobrescribe el método `toString()` en la superclase para que muestre el número y el saldo del móvil.

    - Añade una nueva subclase de `MovilPrepago` llamada `MovilTarifaPlana` ̧ en la que se redefine el método navegar para no reducir el saldo y además en el constructor fija el coste de navegación a cero.

    - Haz un programa que cree una instancia de `MovilPrepago`, otra de `MovilPlus` y otra de `MovilTarifaPlana`, y realicen diversas operaciones sobre los mismos: llamar, navegar, videollamar, etc. mostrando como se reduce su saldo con el nuevo método `toString()`.

11. **Crear una clase llamada Trabajador con los atributos privados: id, nombre, fecha de nacimiento y salario base.**

    - Dispondrá también de un constructor que inicialice todos sus campos, *getter*s, *setter*s, método `toString()` y `equals()`, sabiendo que dos trabajadores son iguales si tienen el mismo `id`.

    - Crear una subclase de `Trabajador` llamada `Asalariado` que añade un nuevo atributo llamado `salarioFinal` y otro llamado `horasExtra`.

    - El constructor de esta nueva clase `Asalariado` incorpora la inicialización a cero de las horas extra y el salario final igual al salario base.

    - La clase `Asalariado` también incorpora *setter* y *getter* para las horas extra y un método llamado `calcularSalarioFinal()` al que se le pasa a cuanto se paga la hora extra en ese momento y calcula el salario final del empleado siendo su salario base más el importe de las horas extras trabajadas.

    - Crear una subclase de `Trabajador` llamada `ConsultorExterno` que añade un nuevo atributo llamado `horasTrabajadas` y `salarioFinal`.

    - El constructor de esta nueva clase ConsultorExterno incorpora la inicialización a cero de las horas trabajadas, salario base y salario final.

    - La clase `ConsultorExterno` también incorpora *setter* y *getter* para las horas trabajadas y un método llamado `calcularSalarioFinal()` al que se le pasa a cuanto se paga la hora a los consultores en ese momento y calcula el salario final del consultor solo en función de las horas trabajadas (*el salario base de estos trabajadores es cero*).

    - Haz un programa que cree un `ArrayList` de `Asalariados` y otro de `ConsultoresExternos` e introduce *a mano* dos o tres empleados en ambos `ArrayList`.

        - Después modifica el contenido de ambos `ArrayList` añadiendo también *a mano* las horas extra/horas trabajadas respectivamente para todos los empleados.

        - Fijar el importe de hora extra a *20 euros* y la hora de consultor a *100 euros* y modificar de nuevo los `ArrayList` calculando el salario final de cada trabajador.

        - Finalmente, recorriendo con un `for-each` ambos `ArrayList`, obtener el total que gastará la empresa en salarios.

        - ¿Sería útil tener un `ArrayList` que pudiese contener instancias de ambas clases?