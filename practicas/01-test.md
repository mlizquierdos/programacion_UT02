- [Práctica 1: Test de conocimientos](#práctica-1-test-de-conocimientos)
  - [Bloque 1: Introducción y fundamentos (preguntas 1-8)](#bloque-1-introducción-y-fundamentos-preguntas-1-8)
  - [Bloque 2: Programación estructurada (preguntas 9-25)](#bloque-2-programación-estructurada-preguntas-9-25)
  - [Bloque 3: Programación modular y flujo avanzado (preguntas 26-45)](#bloque-3-programación-modular-y-flujo-avanzado-preguntas-26-45)
  - [Bloque 4: Control de excepciones y aserciones (preguntas 46-50)](#bloque-4-control-de-excepciones-y-aserciones-preguntas-46-50)


# Práctica 1: Test de conocimientos

**Instrucciones:** Lee atentamente cada pregunta y selecciona la opción que consideres correcta.

---

### Bloque 1: Introducción y fundamentos (preguntas 1-8)

1.  **¿Cuáles son los primeros paradigmas de programación que se deben aprender y dominar, ya que son la base para otros paradigmas más avanzados?**
    a) Programación Orientada a Objetos y Funcional
    b) Programación Estructurada y Modular
    c) Programación Lógica y Declarativa
    d) Programación Concurrente y Distribuida

2.  **En un programa Java clásico, ¿dónde se escribe el código principal que se ejecuta al lanzar el programa?**
    a) Dentro del método `public static void main(String[] args)` de una clase
    b) Directamente en el archivo, fuera de cualquier clase
    c) Dentro de un bloque `static { }` de la clase
    d) En un archivo de configuración separado

3.  **En Java, ¿qué tipo se utiliza para almacenar números con decimales de alta precisión, como cantidades de dinero?**
    a) int
    b) float
    c) BigDecimal
    d) double

4.  **¿Cuál es la regla de nomenclatura (convención de estilo) que se debe seguir en Java para declarar una constante (`static final`)?**
    a) camelCase
    b) snake_case
    c) MAYUSCULAS_CON_GUIONES
    d) PascalCase

5.  **El método `nextLine()` de `Scanner` siempre devuelve un `String`. ¿Qué proceso es necesario para utilizar este dato como un número entero (`int`)?**
    a) Conversión implícita
    b) Conversión explícita (por ejemplo, `Integer.parseInt()`)
    c) Inferencia de tipos (`var`)
    d) Paso por referencia

6.  **¿Cuál es la característica principal de un lenguaje fuertemente tipado?**
    a) Los tipos de datos se asignan y cambian dinámicamente según la información
    b) El lenguaje realiza conversiones automáticas sin aviso
    c) Cada dato debe tener asignado explícitamente el tipo que le corresponde, aportando seguridad
    d) Permiten que las variables almacenen null por defecto

7.  **En la precedencia de operadores, ¿cuál es el operador lógico que tiene la mayor prioridad de evaluación?**
    a) `&&` (AND)
    b) `||` (OR)
    c) `!` (NOT)
    d) `+` (Suma)

8.  **¿Cuáles son las tres características esenciales de un algoritmo?**
    a) Lógico, rápido y reutilizable
    b) Imperativo, declarativo y modular
    c) Preciso, bien definido y finito
    d) Complejo, extenso y adaptable

### Bloque 2: Programación estructurada (preguntas 9-25)

9.  **Según el Teorema Fundamental de la Programación Estructurada, ¿cuáles son las tres estructuras de control básicas con las que se puede escribir cualquier programa propio?**
    a) Secuencial, Iterativa y GOTO
    b) Condicional, Recursiva y Modular
    c) Secuencial, Condicional e Iterativa
    d) Funciones, Procedimientos y Módulos

10.  **¿Qué característica define a un "programa propio" además de tener un único punto de entrada y salida?**
    a) Debe usar exclusivamente la estructura for
    b) No deben existir bucles sin fin
    c) Debe estar escrito en pseudocódigo
    d) Utiliza variables globales

11.  **¿Qué tipo de estructura condicional permite ejecutar un bloque de código si la condición se cumple y un bloque alternativo si la condición no se cumple?**
    a) Alternativa simple (if)
    b) Alternativa doble (if-else)
    c) Alternativa múltiple (switch)
    d) Secuencial

12.  **En sentencias if anidadas, si no se usan llaves para delimitar bloques, ¿con qué if se asocia la parte else?**
    a) Con el primer if de la estructura
    b) Con el if más lejano posible
    c) Con el if más cercano posible
    d) Con el if que contenga la condición booleana más simple

13.  **¿Qué principal ventaja ofrece la estructura switch frente a una larga cadena de if-else if-else?**
    a) Permite evaluar expresiones lógicas complejas
    b) Ofrece una alternativa más limpia y organizada para comparar una variable contra múltiples valores
    c) Permite saltar a cualquier parte del código usando GOTO
    d) Garantiza que el bucle se ejecute al menos una vez

14.  **En el contexto de los bucles, ¿qué se debe garantizar siempre para evitar un bucle infinito?**
    a) Que exista una variable de control
    b) Que exista una condición de parada
    c) Que el bucle sea definido (for)
    d) Que se utilicen solo operadores lógicos

15.  **¿Cuál es la principal diferencia entre los bucles indefinidos while y do-while?**
    a) while solo puede usarse con contadores, mientras que do-while usa centinelas
    b) do-while evalúa la condición después de la primera iteración, garantizando al menos una ejecución
    c) while evalúa la condición al final, mientras que do-while lo hace al principio
    d) do-while solo se usa para menús

16.  **¿Cuándo se recomienda usar bucles definidos (for)?**
    a) Cuando no se sabe cuántas iteraciones se necesitarán
    b) Cuando se utiliza una bandera para la condición de salida
    c) Cuando se conoce de antemano el número exacto de veces que se quiere repetir el código
    d) Cuando se necesita la estructura de repetición mínima de una vez

17.  **Según las buenas prácticas de la programación estructurada, ¿qué debe ocurrir con la variable de control de un bucle for?**
    a) Se debe modificar dentro del bucle para ajustar el número de vueltas
    b) Su valor es siempre 0 al finalizar el bucle
    c) No debe modificarse dentro del cuerpo del bucle (aunque Java lo permite)
    d) Se incrementa de dos en dos por defecto

18.  **¿Cuál de las siguientes es una de las tres formas típicas de controlar la ejecución de un bucle?**
    a) Bucles recursivos
    b) Bucles con centinela
    c) Bucles con if-else
    d) Bucles con return

19.  **¿Qué son las banderas (flags) en el control de bucles?**
    a) Variables que almacenan texto para la salida
    b) Variables que solo pueden tomar dos valores (normalmente `boolean`) para controlar la condición de parada
    c) Variables que solo se usan en bucles for
    d) La condición lógica que se evalúa al inicio de un bucle

20.  **En un bucle controlado por centinela, ¿qué es el centinela?**
    a) El contador del bucle
    b) Un valor especial introducido por el usuario o detectado por el programa que indica la parada
    c) Una variable booleana que cambia de true a false
    d) La variable de acumulación de una suma o producto

21.  **¿Para qué es especialmente útil la técnica de bucles anidados?**
    a) Para manejar la recursividad
    b) Para el manejo de matrices
    c) Para simplificar el paso de parámetros
    d) Para la validación de entradas con early return

22.  **¿Qué representa la estructura Secuencial?**
    a) Un bloque de código que se repite
    b) La ejecución de las instrucciones una detrás de la otra, en el orden en que están escritas
    c) La ejecución de un bloque de código u otro dependiendo de una condición
    d) La división del programa en módulos

23.  **¿Qué es la Iteración (o bucle)?**
    a) Un bloque de código que se repite mientras se cumpla una determinada condición
    b) La ejecución de sentencias una detrás de otra
    c) La evaluación de una expresión para decidir la siguiente sentencia a ejecutar
    d) El único punto de entrada de un programa

24.  **¿Por qué el Teorema Fundamental de la Programación Estructurada establece que el uso de la sentencia GOTO es innecesaria?**
    a) Porque GOTO complica el uso de bucles
    b) Porque las estructuras secuencial, condicional e iterativa son suficientes
    c) Porque GOTO solo funciona en lenguajes no tipados
    d) Porque solo se permite su uso en procedimientos

25.  **¿Qué se denomina bucle infinito?**
    a) La ejecución de la sentencia for
    b) Un bucle cuya condición de parada nunca se cumple
    c) El uso de la recursividad sin condición de fin
    d) El efecto de los bucles anidados

### Bloque 3: Programación modular y flujo avanzado (preguntas 26-45)

26.  **La programación modular se basa en la técnica de descomponer un problema grande en subproblemas más simples. ¿Cómo se conoce esta técnica?**
    a) Recursividad
    b) Ámbito Global
    c) Divide y Vencerás (DAC)
    d) Paso por Referencia

27.  **¿Cuál de las siguientes es una ventaja clave de la Programación Modular?**
    a) Aumenta la complejidad del diseño
    b) Permite que varios programadores trabajen en el mismo proyecto y reduce el tiempo de desarrollo
    c) Reduce la necesidad de la sentencia return
    d) Obliga al uso exclusivo de variables globales

28.  **¿Qué es un procedimiento en el contexto de la Programación Modular?**
    a) Un bloque de código que siempre devuelve un valor
    b) Un bloque de código que realiza una tarea específica y no devuelve ningún valor (`void`)
    c) Una variable con ámbito global
    d) El punto de entrada principal del programa

29.  **¿Qué es un parámetro en la definición de una función o procedimiento?**
    a) Un valor real que se utiliza en la llamada
    b) La dirección de memoria de una variable
    c) Una variable que actúa como "marcador de posición" para los valores que se pasarán
    d) El resultado que devuelve la función

30.  **Cuando se pasa un argumento a un módulo por valor, ¿qué recibe la función?**
    a) La dirección de memoria de la variable original
    b) Una copia del dato original
    c) Un puntero
    d) El resultado de la operación

31.  **En Java, ¿cómo se pasan los argumentos a un método?**
    a) Siempre por referencia
    b) Los primitivos por valor y los objetos por referencia
    c) Siempre por valor; con arrays y objetos lo que se copia es la referencia
    d) Por valor o por referencia, según se use la palabra clave `ref`

32.  **¿Cuál es la principal ventaja del paso por valor (el único mecanismo que ofrece Java)?**
    a) Permite modificar directamente la variable original
    b) Garantiza seguridad y predictibilidad (inmunidad a efectos secundarios)
    c) Permite devolver múltiples valores de una función
    d) Ahorra memoria al copiar grandes estructuras de datos

33.  **En Java, si un método necesita hacer llegar al llamante varios valores calculados, ¿qué opción es correcta?**
    a) Declarar los parámetros con `ref` u `out`
    b) Devolver un `record` con los valores, o modificar el contenido de un array u objeto recibido
    c) Usar variables globales para no tener que devolver nada
    d) No se puede hacer de ninguna forma

34.  **¿Qué determina el ámbito (o alcance) de una variable?**
    a) Si es de tipo entero o real
    b) La parte del programa donde puede ser accedida o modificada
    c) Si ha sido declarada con `final`
    d) Su nombre y su valor inicial

35.  **¿Cuál es el principal inconveniente de abusar de las variables de ámbito global (en Java, atributos `static`)?**
    a) Hacen el código más fácil de mantener y depurar
    b) Complica el código, pudiendo derivar en código "spaghetti"
    c) Se restringe su uso a una sola función
    d) Requiere el uso de la sentencia return

36.  **¿Qué se conoce como efectos laterales en Programación Modular?**
    a) Las variables que se usan en bucles anidados
    b) La comunicación de datos entre algoritmos al margen de los canales habituales (parámetros y devolución de funciones)
    c) El uso de métodos de librería como `Math.sqrt()`
    d) La definición de parámetros por defecto

37.  **Si una función se define con el mismo nombre que otra, pero acepta una lista de parámetros diferente (en tipo o número), ¿cómo se llama esta característica?**
    a) Encapsulamiento
    b) Herencia
    c) Sobrecarga de funciones
    d) Recursividad

38.  **¿Qué sintaxis se usa en Java para definir un parámetro que puede aceptar un número indeterminado de valores?**
    a) `final int numeros`
    b) `int... numeros` (varargs)
    c) `static int numeros`
    d) `void numeros`

39.  **Java no dispone de parámetros de salida (`out`). ¿Cuál es la forma recomendada de que un método devuelva varios valores relacionados?**
    a) Escribir varias sentencias `return` seguidas
    b) Devolver un `record` que agrupe los valores
    c) Usar parámetros por defecto
    d) Declarar una variable global por cada valor

40.  **Un método recibe `int[] datos`. Dentro hace `datos[0] = 99;` y después `datos = new int[5];`. ¿Qué observa el llamante al terminar el método?**
    a) No observa ningún cambio
    b) Su array tiene un 99 en la posición 0, pero su variable sigue apuntando al array original
    c) Su variable apunta ahora a un array nuevo de 5 elementos
    d) El código produce un error de compilación

41.  **¿Cuál es la principal ventaja de utilizar la técnica de Salida Anticipada (Early Return)?**
    a) Permite usar variables globales sin riesgo
    b) Permite evitar anidar estructuras if-else if-else complejas, aplanando la lógica y mejorando la legibilidad
    c) Garantiza que la función devuelva siempre un valor nulo
    d) Se aplica solo en estructuras while

42.  **La validación de entradas o condiciones fallidas al comienzo de una función que utiliza Early Return se conoce como:**
    a) Bucle controlado por centinela
    b) Guard Clauses (Cláusulas de Guarda)
    c) Sobrecarga de funciones
    d) Paso por valor

43.  **¿En qué contexto se aplica la técnica de Early Return?**
    a) Solo en el método `main`
    b) Solo dentro de bucles for y while
    c) Dentro de funciones y procedimientos
    d) Exclusivamente en la estructura switch

44.  **¿Qué técnica consiste en que una función o procedimiento se llama a sí mismo de forma repetida?**
    a) Sobrecarga
    b) Iteración
    c) Modularidad
    d) Recursividad

45.  **¿Qué debe incluir obligatoriamente un problema resuelto recursivamente para evitar una recursión infinita (y el consiguiente `StackOverflowError`)?**
    a) Una variable de tipo boolean
    b) Una condición de parada o de fin
    c) Un parámetro de tipo array
    d) Un método main

### Bloque 4: Control de excepciones y aserciones (preguntas 46-50)

46.  **En Java, ¿cuál es la clase raíz de la que heredan todas las excepciones y errores?**
    a) SystemError
    b) Throwable
    c) Exception
    d) Error

47.  **En Java, algunas excepciones como `IOException` son *checked* (comprobadas). ¿Cuál es la principal implicación de este diseño para el desarrollador?**
    a) El compilador obliga a capturarlas con try-catch o a declararlas con `throws`
    b) Se debe usar la sentencia `assert` en lugar de `throw`
    c) El código es más limpio, pero nadie es responsable de manejar los errores
    d) Se ignoran automáticamente en tiempo de ejecución

48.  **¿Qué bloque dentro de la estructura de manejo de excepciones (try, catch, finally) se ejecuta siempre, sin importar si se lanzó o capturó una excepción?**
    a) try
    b) catch
    c) finally
    d) throw

49.  **¿Cuál es la función principal de la palabra clave `throw` en el manejo de excepciones?**
    a) Capturar y gestionar una excepción en el bloque catch
    b) Verificar que una condición sea verdadera durante la depuración
    c) Lanzar una excepción de forma explícita para definir errores de lógica de negocio
    d) Marcar un bloque de código como potencialmente riesgoso

50.  **La aserción (`assert`) lanza un `AssertionError` si una condición es falsa (siempre que las aserciones estén activadas con `-ea`). ¿Para qué se utiliza principalmente esta herramienta?**
    a) Para manejar la entrada de datos incorrecta por parte del usuario
    b) Para verificar supuestos sobre el estado interno del programa durante los procesos de depuración y prueba
    c) Para asegurar el cierre de conexiones en el bloque finally
    d) Para forzar la conversión de tipos (casting) de manera segura
