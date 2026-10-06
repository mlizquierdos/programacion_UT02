
#### Cuestionario de investigación y desarrollo: programación estructurada y modular en Java

- [Cuestionario de investigación y desarrollo: programación estructurada y modular en Java](#cuestionario-de-investigación-y-desarrollo-programación-estructurada-y-modular-en-java)
  - [I. Fundamentos y estructura del programa (preguntas 1-4)](#i-fundamentos-y-estructura-del-programa-preguntas-1-4)
  - [II. Programación estructurada y flujo de control (preguntas 5-11)](#ii-programación-estructurada-y-flujo-de-control-preguntas-5-11)
  - [III. Modularidad y diseño de funciones (preguntas 12-18)](#iii-modularidad-y-diseño-de-funciones-preguntas-12-18)
  - [IV. Control de excepciones y aserciones (preguntas 19-20)](#iv-control-de-excepciones-y-aserciones-preguntas-19-20)


##### I. Fundamentos y estructura del programa (preguntas 1-4)

1. Justifique la afirmación de que los paradigmas de Programación Estructurada y Modular son la **base fundamental** para la comprensión de paradigmas avanzados como la Programación Orientada a Objetos o Funcional.

2. Describa y analice los tres elementos clave que, según la Programación Estructurada, permiten al programador mantener el programa "dentro de la cabeza".

3. El Teorema Fundamental de la Programación Estructurada define un "programa propio". ¿Qué implicaciones tiene la restricción de que **no deben existir bucles sin fin** para la verificación y seguridad del programa?

4. El método `nextLine()` de la clase `Scanner` siempre devuelve un `String`. Explique la necesidad de la **conversión explícita** (`Integer.parseInt`, `Double.parseDouble`) en programas que manejan entrada numérica, compare esta opción con leer directamente con `nextInt()` / `hasNextInt()`, y discuta los riesgos de pérdida de información asociados a las conversiones de tipos (por ejemplo, el *casting* de `double` a `int`).

##### II. Programación estructurada y flujo de control (preguntas 5-11)

5. Compare la estructura `if-else if-else` con la estructura `switch` (o según). ¿En qué condiciones de legibilidad y diseño es preferible la implementación del `switch` para manejar la selección múltiple? Incluya en su análisis la diferencia entre el `switch` clásico (con *fall-through*) y el `switch` con flechas (`->`) de Java 14+.

6. En el contexto de estructuras condicionales anidadas (`if` anidados), ¿cómo resuelve el lenguaje la ambigüedad al asociar una parte `else`? Cite la regla que rige esta asociación.

7. Justifique la decisión de diseño de incluir el bucle `do-while` en los lenguajes de programación. ¿En qué tipo de interacciones con el usuario (ej. menús o preguntas de validación) el `do-while` es la elección estructural más adecuada frente al `while`?

8. Java **permite** modificar la variable de control de un bucle `for` dentro de su cuerpo, pero las buenas prácticas de la programación estructurada lo desaconsejan. Analice por qué **no debería modificarse**. ¿De qué manera esta restricción garantiza la predictibilidad y se adhiere a los principios de la Programación Estructurada?

9. Explique la diferencia conceptual y práctica entre un **Bucle controlado por Indicadores (Banderas)** y un **Bucle controlado por Centinela**. Proporcione un escenario donde una bandera booleana (`boolean`) es indispensable para controlar el flujo de un bucle.

10. ¿Por qué se afirma que la utilización de la sentencia `GOTO` es totalmente innecesaria en la Programación Estructurada? ¿Qué efecto tiene la sentencia `GOTO` en la legibilidad comparado con las tres estructuras básicas? Investigue por qué en Java `goto` es una palabra reservada que, sin embargo, no puede utilizarse.

11. Los **bucles anidados** son una técnica iterativa avanzada. Justifique por qué esta técnica es especialmente útil y necesaria para la manipulación de estructuras de datos bidimensionales como las matrices.

##### III. Modularidad y diseño de funciones (preguntas 12-18)

12. Defina el principio de **"Divide y Vencerás" (DAC)**. ¿Cómo se traduce este principio en la práctica de la Programación Modular para facilitar la resolución de problemas grandes y la colaboración entre programadores?

13. ¿Cuál es la diferencia definitoria entre una **Función** y un **Procedimiento** en términos de su salida? ¿Cómo afecta esta diferencia al diseño de la firma del método (tipo de retorno o `void`) y a su invocación desde el método `main`?

14. Analice la afirmación "**en Java todo se pasa por valor**". Explique qué se copia al pasar un tipo primitivo y qué se copia al pasar un array u objeto. Desde una perspectiva de seguridad y predictibilidad del código, ¿por qué el paso por valor garantiza la "inmunidad a efectos secundarios" con los primitivos, y qué riesgos aparecen cuando el método recibe un array u objeto que puede modificar?

15. Los **efectos laterales** son un concepto crucial en la modularidad. Defina qué son y por qué el uso de variables de **ámbito global** (en Java, atributos `static` de la clase) se considera una práctica que debe ser evitada para prevenir el "código spaghetti".

16. Otros lenguajes, como C#, disponen de parámetros por referencia (`ref`) y de salida (`out`); **Java no**. Explique qué alternativas ofrece Java para (a) que un método haga llegar cambios al código que lo llama y (b) devolver varios valores a la vez (devolver el nuevo valor con `return`, modificar el contenido de un array u objeto, devolver un `record`). Compare las ventajas e inconvenientes de cada alternativa.

17. Analice el propósito del **Early Return**. ¿Cómo la aplicación de **Cláusulas de Guarda** (*Guard Clauses*) al inicio de una función logra el objetivo de **aplanar la lógica** y evitar el "efecto cascada" en las estructuras condicionales?

18. La **Sobrecarga de métodos** permite múltiples módulos con el mismo nombre. Java no admite parámetros por defecto ni argumentos nombrados, por lo que la sobrecarga (encadenada) es la forma habitual de simular valores por defecto. Justifique su uso y analice sus inconvenientes cuando crece el número de parámetros opcionales.

##### IV. Control de excepciones y aserciones (preguntas 19-20)

19. El control de excepciones es crucial para la robustez en el **despliegue de aplicaciones web**. Explique qué es una excepción y justifique la decisión de diseño de Java de distinguir entre excepciones **comprobadas** (*checked*) y **no comprobadas** (*unchecked*), indicando la clase raíz de la jerarquía (`Throwable`) y la rama de la que heredan las *unchecked* (`RuntimeException`). Compare este diseño con el de lenguajes como C# o Kotlin, donde todas las excepciones son *unchecked*.

20. Describa la diferencia de propósito entre la sentencia `throw` y la aserción (`assert`). ¿En qué contexto se recomienda usar `assert` (qué lanza —`AssertionError`— y por qué está desactivada por defecto salvo que se ejecute con `-ea`) frente a usar `throw` para validar errores de lógica de negocio?
