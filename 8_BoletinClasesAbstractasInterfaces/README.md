### Cuestiones
A partir de las clases siguientes:
```java
public abstract class PoligonoRegular {
    double tamañoLado;
    abstract double area();
    abstract int getCantidadLados();
    double perimetro() {
        return getCantidadLados() * this.tamañoLado;
    }
    PoligonoRegular(double tl) {
        this.tamañoLado = tl;
    }
}
```
```java
class Pentagono extends PoligonoRegular {
    Pentagono(double t) {
        super (t);
    }
    @Override
    int getCantidadLados() {
        return 5;
    }
    @Override
    double area() {
        return 1.72048d * Math.pow(this.tamañoLado,2);
    }
}
```
```java
class Hexagono extends PoligonoRegular {
    Hexagono(double t) {
        super (t);
    }
    @Override
    int getCantidadLados () {
        return 6;
    }
    @Override
    double area() {
        double lado = this.tamañoLado;
        double apotema = Math.sqrt((lado *lado)-((lado/2)*(lado/2)));
        return lado * apotema * 3;
    }
}
```

- Prueba a crear instancias de hexágonos y pentágonos sobre variables de tipo `PoligonoRegular` y comprueba mediante alguna calculadora online que calcula correctamente su área y perímetro.

- ¿Por qué `PoligonoRegular` es abstracta?

- ¿El método `area()` podría ser no abstracto?

- ¿Es posible crear una clase hija de `PoligonoRegular` sin desarrollar el método `area()`?

- ¿Puedo crear instancias de `PoligonoRegular`?

- ¿Por qué el método `perimetro()` no es abstracto si no se calcula igual para cada tipo de polígono regular? (*pentágono es lado por 5, hexágono es lado por 6, etc.*)

- ¿El siguiente código es correcto? Explica por qué funciona.

    ```java
    ArrayList <PoligonoRegular> listaPoligonos = new ArrayList <>();
    for (PoligonoRegular p : listaPoligonos) System.out.println(p.area());
    ```

- Si no existiesen las clases abstractas y el método `area()` lo definiésemos en las clases hijas, ¿funcionaría el código anterior? ¿Por qué?

### Ejercicios

1. **Copia la última versión de las clases de los primeros ejercicios: `Figura2D`, `Triangulo`, `TrianColor` y `Rectangulo` (*añade sufijo `_v9`*) y realiza los siguientes cambios:**

    - Crea un método abstracto llamado `area()` en Figura2D que ha de implementarse en las clases hijas.

    - Crea un método `precio(float precioMetroCuadrado)` en la clase `Figura2D`, que use el método abstracto anterior.

    - Verificar que las clases hijas implementan el método `area()`. ¿Qué ocurriría si no lo tuviesen implementado?

    Sin implementar `area()` se hace imposible compilar cualquier clase hija de `Figura2D`.
    
    - Haz un programa que almacene figuras de los tres tipos en un `ArrayList` y finalmente se recorra el `ArrayList` con un `for-each` mostrando el precio de cada figura, suponiendo un precio de 10 euros el metro cuadrado.

2. **Diseña una clase abstracta llamada `Figura3D_v1` con método abstracto `volumen()`. Crea subclases: `Esfera_v1` y `PrismaRectangular_v1` que implementen el método de la superclase. Incorpora los atributos que creas necesarios a las tres clases. Haz un programa que cree una instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más.**

3. **Haz una nueva versión de las clases del ejercicio anterior (añádele el sufijo `_v2`). Añádele a la clase base el método abstracto `superficie()`. Crea una nueva clase `Cilindro` y haz que implemente los métodos de la superclase. Haz un programa que permita crear una instancia de cada una de las 3 figuras y nos muestre cuál tiene más superficie.**

4. **Copia el ejercicio del capítulo anterior de la lista de espera del médico y redefine la superclase `Paciente` como abstracta haciendo el método `facturar()` abstracto, ya que se implementa en las tres clases hijas.**

5. **Pensando que en el futuro implementemos el juego de ajedrez para dos jugadores, se desea crear una clase abstracta llama `PiezaAjedrez`, con dos atributos enteros llamados `fila` y `columna` que representan sus coordenadas en el tablero (*valores entre 0 y 7*) y un método abstracto llamado `mover()` al que se le pasan como parámetro la `fila` y `columna` destino de un movimiento. El método devolverá `true` si el movimiento se puede realizar o `false` si es un movimiento erróneo. Implementa esa clase y sus subclases `AlfilAjedrez` y `TorreAjedrez`. Para simplificarlo, vamos a pensar en movimientos en un tablero vacío, es decir solo con una pieza, la que se está movimiento.**

    - Haz un programa que permita al usuario mover una sola pieza (al comenzar elegirá Alfil o Torre) por el tablero, partiendo de la posición 0,0, indicando las coordenadas destino del movimiento que quiere hacer cada vez, terminando el programa cuando introduzca fila -1.

    - El programa tendrá una función que presente por pantalla la situación del tablero.

    - Por comodidad, puedes hacer las clases dentro del mismo fichero que el programa.

6. **Modifica la clase `PiezaAjedrez` (*versión `_v2`*) para incluir métodos ¿estáticos? para que el usuario introduzca la columna como letra (*a-h*) y la fila (*entre 1 y 8*) y los convierta a los valores usados previamente (*entre 0 y 7*). Esto obligará a generar una nueva versión del programa anterior, para que el usuario introduzca *a-h* y *1-8* como valores destino del movimiento.**

7. **Crea una interfaz llamada `Perimetrable` con un solo método llamado `calcularPerimetro` al que no se le pasa ningún parámetro y devuelve un double con el perímetro de la clase que la implemente. Copia las clases `Figura2D`, `Triangulo`, `TrianColor` y `Rectangulo` en su última versión (añade sufijo `_v10`) y modifica la nueva `Figura2D` para que implemente `Perimetrable`.**

    - ¿Qué ocurre al añadir esta implementación? ¿Se produce algún error de compilación?

        Sin hacer más cambios que añadir la implementación: se producen errores.

    - ¿Por qué? ¿Hay alguna forma rápida de arreglar ese error?

        Se producen errores porque no se está implementando `calcularPerimetro()` en la clase abstracta `Figura2D_v10`, la forma más rápida de arreglar el error es implementar un método abstracto con el mismo nombre.

    - Modifica las clases necesarias para que calculen el perímetro correctamente (supón que los triángulos son equiláteros para simplificar el cálculo).

    Haz un programa sencillo que cree instancias de `Triangulo`, `TrianColor` y `Rectangulo` y muestre su perímetro.

8. **Crea una nueva clase `PoligonoIrregular` (*no es hija de `Figura2D` ni de ninguna otra clase*) que tiene como único atributo un `ArrayList` con la longitud de todos los lados del mismo. Haz que esta clase implemente `Perimetrable`. Crea un programa sencillo con una instancia de `PoligonoIrregular` y que calcule su perímetro. Añade al programa un `ArrayList` de figuras (`PoligonoIrregular`, `Rectangulo_v10`, `Triangulo_v10`, `Triancolo_v10`) y que muestre el perímetro de todos ellos.**

    - ¿Tiene sentido que `Perimetrable` sea interfaz y no clase abstracta? ¿Por qué?

    Sí, porque al ser `Perimetrable` una clase abstracta esta se puede implementar en cualquier tipo de figura, sin perjuicio de tener que implementar otros métodos que en el caso de `PoligonoIrregular` no tendrían sentido.

9. **Desarrolla una interfaz llamada `Ciclista` con un método llamado `recorrer()` al que se le pasa un número de kilómetros y una cadena con tipo de terreno y devuelve los segundos que tarda en recorrerlo. Una interfaz llamada `Nadador` con un método llamado `nadar` a la que se le pasan metros y devuelve los segundos en recorrerlo, y por último otra interfaz llamada `Saltador` con un método `saltarAltura` que no recibe parámetros y que devuelve los centímetros saltados.**

    - Desarrolla una clase `Delfin` que implemente la interfaz `Nadador`. El tiempo en recorrer una distancia es aleatorio entre 40km/h y 70km/hora.

    - Desarrolla una clase `BallenaAzul` que implemente la interfaz `Nadador`. El tiempo en recorrer una distancia es de 10km/h para las mayores de 5 años y 13km/h para las menores.

    - Desarrolla una clase `TriAtleta` que implemente las tres interfaces, con los criterios que tu consideres (*pueden devolver valores aleatorios entre unos mínimos y máximos que tú decidas o tener en cuenta otros parámetros como edad, sexo, etc.*).

    - Realiza un programa sencillo que cree instancias de delfines, ballenas azules y triatletas y use los métodos desarrollados.

10. **Empleando las tres clases definidas en el ejercicio anterior (`Delfín`, `BallenaAzul` y `TriAtleta`) y la interfaz `Nadador`, realiza un programa que contenga un `ArrayList` de nadadores (*polimorfismo de interfaces*) con tres elementos, uno de cada tipo, esto es un `Delfin`, una `BallenaAzul` y un `TriAtleta`. A continuación, recorre el ArrayList con un bucle `for...each`, mostrando cuánto tarda cada uno de ellos en recorrer un kilómetro.**

11. **Duplica las interfaces y las clases del ejercicio anterior (añadiéndoles el sufijo `_v2`) Modifica la interfaz `Saltador_v2` añadiéndole el método `saltaPertiga` que recibe como parámetro una altura en centímetros y devuelve `true` si ha logrado el salto y `false` si no lo ha logrado ¿Qué ocurre con la clase `TriAtleta_v2`? Desarrolla `saltaPertiga` como método `default` en la interfaz de forma que por defecto devuelva `false`.**

    - Haz una nueva versión de TriAtleta (sufijo `_v2b`) que implemente saltaPertiga con este criterio: para saltos de más de 6 metros devuelve `false`, entre 5 y 6 metros devuelve `true` la mitad de las veces y por debajo de 5 metros devuelve siempre `true`.

    - Haz un programa que cree una instancia de `Triatleta_v2` y otra de `Triatleta_v2b` y que muestre el resultado de ambos atletas saltando: 100cm, 550cm, 560cm, 580cm, 700cm.

12. **Añade el sufijo `_v2` a las clases de capítulos previos: `movilPrepago`, `movilTarifaPlana`, `movilPlus` y crea una interfaz llamada `PrePagable` que estas clases deberían implementar. Incluye en la interfaz todos los métodos que creas oportuno y, si es necesario, alguno puede ser método por defecto.**

13. **Se desea hacer la gestión de las habitaciones de un hotel. Todas las habitaciones tienen un número de habitación y un proceso de check-in y check-out. En el hotel hay tres tipos de habitaciones, aunque podría haber más en el futuro:**

    > 3 habitaciones Lowcost (cuesta 50 euros/dia todo el año).
    > 10 habitaciones dobles. Tienen una tarifa normal de 100 euros/dia y un incremento del 20% si el día de salida es abril, julio o agosto.
    > 5 habitaciones Suite. 200 euros/día con 20% de descuento para estancias de 10 o más días.

    - El programa inicialmente meterá las 18 habitaciones en un ArrayList y las marcará como *no ocupadas*.

    - El programa tendrá un menú para hacer check-in entre las habitaciones libres, check-out entre las ocupadas y listar habitaciones libres y ocupadas.

    - El check-in es común para todas las habitaciones, consiste en marcar la habitación como ocupada. El check-out consiste en marcar la habitación como libre y calcular el importe a pagar que se calculará en función del tipo de habitación y de los días de estancia (*quizás sea necesario almacenar la fecha de llegada en el momento del check-in*).

    1. ¿`Habitacion` debería ser una clase abstracta o una interfaz? ¿Por qué?
    2. ¿Es útil que el método `toString()` en la clase `Habitacion`?

    > Mantener toda la información en las clases más que en el programa que las utiliza.

    > Puedes crear una clase `Hotel`, que tendrá un `ArrayList` de Habitaciones, o bien definir ese `ArrayList` en el programa como variable global y no tener la clase `Hotel`.

    > Sugerencia: Para probar el programa, al hacer el check-out, puedes considerar cada día como un segundo, así, si han pasado 3 segundos, considerar 3 días.

14. **Haz una versión del ejercicio anterior pensando que el programa podría usarse para alquilar otro tipo de elementos nuevos (*no habitaciones, por ejemplo, coches*) con unos atributos totalmente distintos y con una forma de facturar distinta, pero el `ArrayList` debe poder contener cualquier tipo de elemento y pero sus elementos deben tener el método de `checkIn` y `checkOut` implementado.**