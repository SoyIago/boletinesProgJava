### Cuestiones
Examina de nuevo la clase `Bicho` y su clase hija `BichoDormilon` del apartado anterior y trata de responder las siguientes cuestiones, justificando tu respuesta. Luego comprueba los resultados, ejecutando un programa con las sentencias propuestas:

- Vamos a definir una variable Bicho pero llamar sobre ella al constructor de BichoDormilon.

    - ¿Qué mostraría el siguiente código?

    ```java
    Bicho bi2 = new BichoDormilon(10);
    System.out.println("bi2 -> hambre: " + bi2.hambre);
    System.out.println("bi2 -> sueño: " + bi2.sueño);
    ```
    - ¿Solucionaríamos el problema del println anterior así?

    ```java
    System.out.println("bi2 -> sueño: " + ((BichoDormilon) bi2).sueño);
    ```

    - ¿Y así?
    ```java
    BichoDormilon bd4 = (BichoDormilon) bi2;
    System.out.println("bd2 -> sueño : " + bd4.sueño);
    ```

### Ejercicios

1. **Realiza un programa con una variable de tipo `Figura2D_v8`, y sobre ella llama a uno de los constructores de `Triangulo_v8`. Muestra sus dimensiones y el cálculo del área.**

2. **Realiza un programa que permita al usuario seleccionar un tipo de figura (*Triangulo o Rectangulo*), luego llame al constructor adecuado solicitando al usuario los parámetros necesarios, dependiendo del tipo de figura.**

    - Después de crear la figura, mostrará las dimensiones de la misma (*sea cual sea su tipo*).

    - Finalmente, y utilizando el operador `instanceof`, mostrará unos datos adicionales dependiendo del tipo de figura que sea:

        - Si es de tipo `Triangulo`, mostrará el área.
        - Si es de tipo `Rectangulo`, mostrará si es de forma cuadrada o no.

    - Usar una única variable para almacenar la figura, sea del tipo que sea.

3. **Modificar el ejercicio anterior para añadir a las figuras posibles el `Triancolor`. Así pues, el usuario seleccionará entre: `Triangulo`, `Triancolor`, `Rectangulo`.**

    - Después de crear la figura, mostrará las dimensiones de la misma (*sea cual sea su tipo*).
    
    - Finalmente, y utilizando el operador `instanceof`, mostrará unos datos adicionales dependiendo del tipo de figura que sea:
        
        - Si es de tipo `Triangulo`, mostrará el área (sea `Triancolor` o no).

        - Si es de tipo `Rectangulo`, mostrará si es de forma cuadrada o no.

        - Si es de tipo `Triancolor`, mostrará el color.

    > Ojo con el comportamiento de `instanceof`: si `x` es una instancia de `TrianColor`, `x instanceof Triangulo` será `true`, es decir un `Triancolor` también es un `Triangulo`.

4. **Realiza un programa que contenga un `ArrayList` de `figuras2D` de cualquiera de sus tipos e introduce valores *a mano*, por ejemplo, un par de instancias de cada tipo. A continuación, el programa:**

    - Sumar el área de todas ellas. ¿Tienen implementado el método `area()` todas ellas?

    No, solo se puede usar el método `area()` para los objetos `Triangulo_v8`.

    - Contar cuantos triángulos (*sean de color o no*) y cuantos rectángulos.

5. **Empleando las clases previas: `MovilPrepago`, `MovilTarifaPlana`, `MovilPlus`, realizar un programa que inicialmente permita seleccionar al usuario qué tipo de tarifa tiene entre las tres posibles, luego configurará el móvil solicitando al usuario los parámetros necesarios y finalmente presentará al usuario un menú para realizar las operaciones permitidas (*navegar, llamar, recargar, videollamar, ver saldo* y *salir*) según el tipo de tarifa.**

6. **Modificar el programa anterior para que el usuario tenga un `Array` de 5 teléfonos, y que después de elegir la operación a realizar pueda elegir con cuál de los 5 teléfonos desea hacerla.**

7. **Volviendo a la parte final del último ejercicio del capítulo anterior, haz un programa que cree un `ArrayList` que pueda contener tanto `Asalariados` como `ConsultoresExternos` e introduzca *a mano* trabajadores de ambos tipos en el `ArrayList`.**

    - Después modificar el contenido del `ArrayList` añadiendo 1 hora extra/horas trabajada a `Asalariados` y `ConsultoresExternos` respectivamente.

    - Fijar el importe de hora extra a 20 euros y la hora de consultor a 100 euros y modificar de nuevo el `ArrayList` calculando el salario final de cada trabajador.

    - Finalmente, recorriendo con un `for-each` el `ArrayList`, obtener el total que gastará la empresa en salarios.

8. **Crea una clase llamada Consola con un método estático sobrecargado llamado `leerEntero()` que solicite al usuario que teclee un valor entero, cumpliendo las siguientes características:**

    - Si no se le pasa ningún parámetro, no tiene requisitos, es simplemente un nextInt().

    - Si se le pasa un parámetro de tipo texto, escribe ese texto antes de solicitar el valor. Ejemplo: `leerEntero (“Introduzca su edad”);`

    - Si se le pasa un parámetro tipo texto y dos enteros, garantizará que el valor tecleado esté comprendido entre ambos. Ejemplo: `leerEntero (“Introduzca su edad”, 0, 120);`

    - Si se le pasan dos enteros, garantizará que el valor tecleado esté comprendido entre ambos, pero no muestra texto de instrucciones previo. Ejemplo: 
    
    ```java
    System.out.println (“Introduzca su edad”);
    leerEntero (0, 120);
    ```

    - Finalmente, haz un programa que pruebe todas las variantes del método.

9. **Haz un programa con un menú que permita gestionar la cola de espera de un médico. Hay tres tipos de pacientes: los que vienen a consulta (*se le pide al usuario nombre, fecha de nacimiento, motivo de la consulta*), los que viene por recetas (*se le pide: nombre, fecha de nacimiento, lista de medicamentos*) y el que viene a revisión (*se le pide nombre, fecha de nacimiento y fecha de la visita anterior*).**

    - Las tarifas del médico son: Consulta: 100 eur. Recetas: 5 eur por cada unidad. Revisión: 30 eur para mayores de 65 años, 50 eur para resto.

    - Crear una clase para cada tipo de paciente en el propio archivo del programa con los constructores necesarios y el método de facturar() en cada una de las clases. Implementa herencia si lo crees necesario.

    - El programa tendrá un menú para:

        - Registrar la llegada del paciente: se le preguntará por qué viene al médico y se le piden sus datos.

        - Llamar a consulta (por orden de llegada). Se le cobra la tarifa correspondiente.

        - Consultar total facturado hasta ese momento.

    > Puedes crear una clase `Clínica`, que tendrá un `ArrayList` de `Pacientes`, o bien definir ese `ArrayList` en el programa como variable global y no tener la clase `Clínica`.

10. **Haz un programa con un menú que permita gestionar un parking.**

    - El parking tiene 100 plazas y pueden aparcar cualquier tipo de 3 tipos de vehículos distintos: *Vehículos en general, Furgonetas y Autobuses.*

    - Todos los vehículos pagan 4 céntimos por minuto, pero las furgonetas pagan además un suplemento de 20 céntimos por cada metro de su longitud y los autobuses pagan un suplemento de 25 céntimos por asiento.

    - El menú del programa deberá permitir:

        - Entrada de un vehículo. Se le pide al usuario la matrícula, tipo de vehículo y datos adicionales para el cálculo de la estancia (longitud, número de asientos...).

        - Salida del vehículo. Se le pide al usuario la matrícula, se calcula el importe a pagar y libera la plaza.

        - Mostrar la lista de vehículos en el parking con la matrícula, tipo de vehículo y fecha/hora de llegada (piensa en el método `toString`). Al final número total de plazas ocupadas.

        - Salir.

    > Puedes hacer coste 4 céntimos por segundo (en vez de por minuto) para probarlo.

    > No hay el concepto de número de plaza, los coches van aparcando donde quieren.

    > Mantén la mayor cantidad de información (datos y cálculos) en las clases, no en el programa.

    > Puedes crear las clases en el mismo archivo que el programa (por comodidad) con el modificador de acceso por defecto.

    > El parking será un `ArrayList`. Para localizar un vehículo (en la opción de menú de Salida del vehículo) emplea `ArrayList.indexOf` y ello te puede implicar definir `equals` en alguna clase.

    > Al igual que en el ejercicio anterior, puedes crear una clase `Parking`, que tendrá un `ArrayList` de `Coches`, o bien definir ese `ArrayList` en el programa como variable global y no tener la clase `Parking`.

11. **Partiendo de clases del ejercicio de cuentas bancarias del capítulo anterior (`CuentaCorriente`, `CuentaPlazo`), haz un programa con un menú que permita gestionar unas cuentas bancarias que se almacenan en un `ArrayList` (*añadir cuenta, eliminar cuenta, ingresos y, retiradas*) siempre accediendo por un identificador que tendrá cada cuenta.**

12. **Crea una clase `Bicicleta` de la que deseamos mantener los siguientes datos: *marca, modelo, precio* y *descuento*. Se pide crear el *constructor, getters* y *setters*, método `toString()`, `equals()`, un método que devuelva el precio con el descuento aplicado y finalmente un método que fije el descuento a aplicar. Este último método estará sobrecargado de la siguiente forma:**

    - `fijarDescuento()`: se le hace 10% y dura ese descuento 1 mes.
    - `fijarDescuento(double d)`: se le hace d %, 1 mes.
    - `fijarDescuento(double d , int n)`: se le hace d %, n meses.

    - Haz un programa sencillo que defina una o dos instancias de bicicletas y use los métodos creados.

    > Dos bicicletas son iguales si tienen la misma marca y modelo.

    > Si se fija un descuento, se elimina el descuento que pudiera haber anteriormente.
    
    > Piensa si es necesario incorporar algún atributo adicional, para que, cuando ejecutemos el método de ver el precio final (*con descuento aplicado*), sepa si tiene que aplicar algún descuento o no.