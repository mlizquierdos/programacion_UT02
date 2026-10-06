# Batería de ejercicios: programación modular y excepciones en Java

**Instrucciones:** Para cada ejercicio, implementa el código en Java (JDK 21 o superior). Puedes ejecutar un único fichero directamente con `java Ejercicio01.java` o crear un proyecto en IntelliJ IDEA. Los métodos se declaran `static` dentro de la clase y se llaman desde `main`; sus nombres van en **lowerCamelCase** (`calcularPropina`, no `CalcularPropina`). Recuerda: **primero el diseño en papel, luego la codificación**.

---

### Bloque I: Funciones con valor de retorno (ejercicios 1-10)

**Ejercicio 1: Calculadora de Propinas**
Implementa una función `static double calcularPropina(double cuenta, double porcentaje)` que devuelva la propina. El programa pide la cuenta y el porcentaje. Muestra: "{cuenta}€ + {propina}€ = {total}€".

**Ejercicio 2: Conversor de Temperatura**
Implementa dos funciones: `static double centigradosAFahrenheit(double c)` y `static double fahrenheitACentigrados(double f)`. El usuario elige el sentido de la conversión.

**Ejercicio 3: ¿Es Palíndromo?**
Implementa una función `static boolean esPalindromo(String texto)` que compruebe si una palabra se lee igual al derecho que al revés. Prueba con "oso", "reconocer", "hola". Resuélvelo recorriendo los caracteres con `charAt()`.

**Ejercicio 4: Clasificador de IMC**
Implementa una función `static double calcularIMC(double peso, double altura)` y otra `static String clasificarIMC(double imc)`. Pide datos al usuario y muestra la clasificación.

**Ejercicio 5: Generador de Contraseña**
Implementa una función `static String generarContrasena(int longitud)` que genere una contraseña aleatoria con mayúsculas, minúsculas y números usando `Random`. **Documenta** la función con Javadoc (`/** ... */`, `@param`, `@return`).

**Ejercicio 6: Validador de Email**
Implementa un procedimiento `static void validarEmail(String email)` que lance `NullPointerException` (usando `Objects.requireNonNull`) si el email es `null`, e `IllegalArgumentException` si está vacío o no contiene `@` o `.`. Usa `try-catch` en `main` para capturar cada tipo de excepción por separado. Prueba con 3 emails diferentes (uno de ellos `null`).

**Ejercicio 7: Contador de Palabras**
Implementa una función `static int contarPalabras(String frase)` que cuente cuántas palabras tiene una frase (separadas por espacios). Pide una frase y muestra el resultado.

**Ejercicio 8: Texto Más Largo**
Implementa una función `static String masLargo(String a, String b)` que devuelva el texto más largo. Prueba con "Hola" y "Adiós mundo".

**Ejercicio 9: Tabla de Multiplicar Modular**
Implementa un procedimiento `static void mostrarTabla(int numero)` que muestre la tabla de multiplicar. Llámalo para el 5, el 7 y el 12.

**Ejercicio 10: Promedio de 3 Notas**
Implementa una función `static double promedio(double n1, double n2, double n3)` que devuelva la media. Pide 3 notas y muestra si ha aprobado (>=5).

---

### Bloque II: Procedimientos y parámetros (ejercicios 11-20)

**Ejercicio 11: Mostrar con Recuadro**
Implementa un procedimiento `static void mostrarConRecuadro(String texto)` que imprima el texto dentro de un recuadro de asteriscos. Llámalo 3 veces con textos diferentes.

**Ejercicio 12: Intercambiar: ¿por qué no funciona?**
Implementa primero un procedimiento `static void intercambiarMal(int a, int b)` que intercambie dos valores. Declara `x = 5, y = 15`, llámalo y muestra antes/después: comprobarás que **no funciona**. Explica en un comentario por qué (en Java todo se pasa por valor). Después implementa `static void intercambiar(int[] v, int i, int j)`, que intercambia dos posiciones de un array, y comprueba que esta versión sí funciona.

**Ejercicio 13: División con Record**
Declara `record Division(boolean ok, int cociente) {}` e implementa una función `static Division dividir(int a, int b)` que divida `a` entre `b`. Si `b` es 0, devuelve un `Division` con `ok = false`. Prueba con 10/3 y 10/0.

**Ejercicio 14: Parámetros por Defecto con Sobrecarga**
Java no tiene parámetros por defecto. Simúlalos con sobrecarga encadenada: implementa `static void registrar(String nombre, String email, boolean premium)`, que muestra los datos, y `static void registrar(String nombre, String email)`, que llama a la anterior con `premium = false`. Llama con 2 y con 3 argumentos.

**Ejercicio 15: Varargs para Suma Variable**
Implementa una función `static int sumarTodos(int... numeros)` que sume todos los argumentos. Llámala con 3, 5 y 2 argumentos diferentes, y también sin ningún argumento.

**Ejercicio 16: Sobrecarga de Funciones**
Implementa dos funciones `static int area(int lado)` (cuadrado) y `static int area(int largo, int ancho)` (rectángulo). Prueba ambas.

**Ejercicio 17: Early Return en Validación**
Implementa una función `static boolean validarEdad(int edad)` que use Early Return: si es menor a 0 o mayor a 120, retorna `false`. Prueba con 25, -5 y 150.

**Ejercicio 18: El Orden de los Parámetros Importa**
Implementa un procedimiento `static void mostrarInfo(String nombre, int edad, String ciudad)`. Intenta llamarlo con los argumentos en otro orden, por ejemplo `mostrarInfo("Madrid", "Ana", 25)`, y anota el error de compilación. Explica en un comentario por qué ocurre (Java no tiene argumentos nombrados). Después, cambia la llamada a `mostrarInfo("Madrid", 25, "Ana")`: ¿compila? ¿Es correcto lo que muestra? ¿Qué conclusión sacas sobre los parámetros del mismo tipo?

**Ejercicio 19: Recursividad: Suma de Dígitos**
Implementa una función recursiva `static int sumaDigitos(int n)` que sume todos los dígitos de un número (ej: 123 → 1+2+3 = 6). Prueba con 456, 1000 y 9999.

**Ejercicio 20: Recursividad: Potencia**
Implementa una función recursiva `static double potencia(double base, int exponente)` que calcule la potencia sin usar `Math.pow`. Incluye la condición de parada. Prueba con 2^10, 3^0 y 5^3.

---

### Bloque III: Ámbito y diseño modular (ejercicios 21-28)

**Ejercicio 21: Variables Locales vs Globales**
Implementa un programa con un atributo de clase `static int contador = 0;` (lo más parecido a una variable global en Java) y un procedimiento `static void incrementar()` que lo incremente. Llámalo 5 veces y muestra el contador. Comenta por qué las variables globales son peligrosas.

**Ejercicio 22: Early Return en Email**
Implementa una función `static boolean validarEmail(String email)` con Early Return: si es `null` o vacío → `false`, si no contiene `@` → `false`, si no contiene `.` → `false`. Si todo está bien → `true`.

**Ejercicio 23: Sobrecarga con Diferentes Tipos**
Implementa dos funciones `static String describir(int numero)` y `static String describir(String texto)`. La primera dice "Es un entero: {numero}", la segunda "Es un texto de {texto.length()} caracteres". Prueba ambas.

**Ejercicio 24: Recursividad: Fibonacci**
Implementa una función recursiva `static int fibonacci(int n)` que devuelva el término n de la sucesión de Fibonacci. Prueba con n=5, n=10 y n=1.

**Ejercicio 25: Varios Valores por Defecto con Sobrecarga**
Simula con sobrecarga encadenada el método `mostrarMensaje(String msg, String color = "blanco", int tamano = 12)`: implementa la versión completa con los tres parámetros y dos versiones más cortas (con 1 y con 2 parámetros) que llamen a la completa con los valores por defecto. Escribe la lógica de mostrar **una sola vez**. Llama con 1, 2 y 3 argumentos.

**Ejercicio 26: Sobrecarga Simple**
Implementa dos procedimientos `static void crearUsuario(String nombre)` y `static void crearUsuario(String nombre, String email)`. El primero muestra "Usuario: {nombre}", el segundo "Usuario: {nombre}, Email: {email}". Prueba ambos.

**Ejercicio 27: Factorial Recursivo vs Iterativo**
Implementa el factorial de dos formas: una función recursiva `static long factorialRecursivo(int n)` y una función iterativa `static long factorialIterativo(int n)` con un `for`. Prueba ambas con los mismos valores (5, 10, 0) y comprueba que dan el mismo resultado. Reflexiona: ¿cuál es más legible? ¿Cuál es más eficiente?

**Ejercicio 28: Early Return en Calificación**
Implementa una función `static String calificar(double nota)` con Early Return: < 0 → "Error", > 10 → "Error", < 5 → "Suspenso", < 7 → "Aprobado", < 9 → "Notable", → "Sobresaliente".

---

### Bloque IV: Arrays, records y parámetros `final` (ejercicios 29-36)

> 📝 En Java no existen `ref`, `out` ni `in`. En este bloque practicarás las alternativas: modificar el contenido de un array recibido, devolver varios valores con un `record` y marcar parámetros como `final`.

**Ejercicio 29: Ordenar Tres Números**
Implementa un procedimiento `static void ordenar(int[] v)` que reciba un array de 3 elementos y lo ordene de menor a mayor usando solo comparaciones e intercambios (sin `Arrays.sort`). Prueba con `{5, 2, 8}` y muestra el array antes y después.

**Ejercicio 30: Calcular Edad con Record**
Declara `record Edad(int anios, int meses) {}` e implementa una función `static Edad calcularEdad(int anioNac, int mesNac, int diaNac)` que calcule la edad exacta usando la fecha actual (`LocalDate.now()` y sus métodos `getYear()`, `getMonthValue()`, `getDayOfMonth()`). Como comprobación, compara tu resultado con `Period.between(...)`.

**Ejercicio 31: Cambio en Monedas con Record**
Declara `record Cambio(int m2, int m1, int m50, int m20, int restoCentimos) {}` e implementa `static Cambio calcularCambio(double total, double pagado)` que calcule el cambio en monedas de 2€, 1€, 50 céntimos y 20 céntimos, y los céntimos que no se puedan devolver con esas monedas. **Usa `assert pagado >= total : "..."`** antes de calcular (y ejecuta con `-ea`). Consejo: convierte las cantidades a céntimos (`int`) para evitar los errores de redondeo de `double`. Prueba con total = 4.70€, pagado = 10€.

**Ejercicio 32: Estadísticas con Record**
Declara `record Stats(double suma, int count, double max, double min) {}` e implementa `static Stats actualizarStats(Stats actual, double valor)`, que devuelve un **nuevo** `Stats` con el valor incorporado. Procesa 5 valores que pida al usuario y muestra la suma, la media, el máximo y el mínimo. Reflexiona: ¿por qué el método devuelve un objeto nuevo en lugar de modificar el que recibe?

**Ejercicio 33: Validación con Record**
Declara `record Validacion(boolean ok, String error) {}` e implementa `static Validacion validar(String nombre, String pass)` que valide: nombre > 2 caracteres, pass > 6 caracteres. Si falla, `error` explica el problema; si todo es correcto, `error` puede ser `null` o una cadena vacía.

**Ejercicio 34: Invertir un Array con Swap**
Implementa un procedimiento `static void swap(int[] v, int i, int j)` que intercambie dos posiciones de un array. Úsalo dentro de otro procedimiento `static void invertir(int[] v)` para darle la vuelta a `{1, 2, 3, 4, 5}`. Muestra el array antes y después.

**Ejercicio 35: Contar Vocales con Record**
Declara `record Recuento(int vocales, int consonantes) {}` e implementa `static Recuento contarVocales(String texto)` que analice un texto (ignora espacios y signos). Prueba con "Hola Mundo".

**Ejercicio 36: `final` para Solo Lectura**
Implementa una función `static double calcularDescuento(final double precio, final double porcentaje)` que calcule el descuento. Intenta reasignar `precio` dentro del método y comenta el error de compilación. Después implementa `static void aplicarDescuento(final double[] precios, double porcentaje)` y modifica `precios[0]` dentro: ¿compila? Explica en un comentario qué protege `final` y qué no.

---

### Bloque V: Try-Catch (ejercicios 37-44)

**Ejercicio 37: Lectura Segura de Números**
Implementa un programa que pida un número al usuario. Usa `sc.hasNextInt()` en un bucle `while` hasta que introduzca un número válido (recuerda descartar la entrada incorrecta con `sc.nextLine()`). No uses `try-catch`: es prevención, no reacción.

**Ejercicio 38: División Segura**
Implementa un programa que pida dos números enteros (léelos con `Integer.parseInt(sc.nextLine())`). Usa `try` para dividir. Si el divisor es 0, captura `ArithmeticException`. Si el formato es incorrecto, captura `NumberFormatException`. Después, repite la división con `double` y explica por qué ya no se lanza ninguna excepción.

**Ejercicio 39: Calculadora con Excepciones**
Implementa una calculadora que pida dos números enteros y una operación (`+`, `-`, `*`, `/`). Cada operación es una función. La división usa `try-catch` para `ArithmeticException`.

**Ejercicio 40: Excepción en Conversión**
Implementa un programa que pida un entero al usuario como texto. Usa `try-catch` para capturar `NumberFormatException` si `Integer.parseInt` no puede convertirlo.

**Ejercicio 41: Excepción de Validación**
Implementa un procedimiento `static void validarEdad(int edad)` que lance `IllegalArgumentException` si la edad es negativa o mayor a 150, con un mensaje que indique el valor recibido. Usa `try-catch` en `main` para capturarla.

**Ejercicio 42: Múltiples Catch**
Implementa un programa con un array de 5 elementos que pida un índice al usuario y muestre el elemento. Usa `catch` separados para `NumberFormatException` (si lo escrito no es un número válido, incluido un número demasiado grande para un `int`) y `ArrayIndexOutOfBoundsException` (si el índice no existe). Añade al final un `catch (Exception e)` genérico y comprueba qué ocurre al compilar si lo colocas el primero.

**Ejercicio 43: Conexión Simulada (excepción checked)**
Implementa un procedimiento `static void conectar(String cadenaConexion)` que simule una conexión. Si la cadena es "error", lanza una `IOException`. Observa qué te exige el compilador al tratarse de una excepción *checked* y añade el `throws` necesario. En `main`, usa `try-catch-finally` para mostrar "Conexión cerrada" en el `finally`.

**Ejercicio 44: Throw con Mensaje Descriptivo**
Implementa un procedimiento `static void transferir(double saldo, double cantidad)` que lance `IllegalArgumentException("Cantidad no válida: " + cantidad)` si cantidad <= 0, e `IllegalStateException("Saldo insuficiente")` si cantidad > saldo. Piensa en qué orden deben ir las comprobaciones.

---

### Bloque VI: Finally y avanzado (ejercicios 45-50)

**Ejercicio 45: Finally con Recursos**
Implementa un procedimiento `static void procesar(boolean provocarError)` que simule usar un recurso (`boolean recursoAbierto = true;`). En `try` procesa datos, en `finally` cierra el recurso. Prueba con datos válidos y provocando una excepción.

**Ejercicio 46: Excepciones en Bucle**
Implementa un programa que pida 5 números al usuario como texto. Para cada uno, usa `try-catch` para convertirlo con `Integer.parseInt`. Si falla uno, muestra el error y sigue con el siguiente. Al final, muestra cuántos se introdujeron correctamente.

**Ejercicio 47: Aserción con assert**
Implementa un procedimiento `static void calcularPorcentaje(double total, double porcentaje)` que use `assert porcentaje >= 0 && porcentaje <= 100 : "El porcentaje debe estar entre 0 y 100";` antes de calcular. Ejecuta el programa con y sin `-ea` con un porcentaje de 150 y explica la diferencia.

**Ejercicio 48: Throw en Recursividad**
Implementa una función recursiva `static int fibonacci(int n)` que lance `IllegalArgumentException` si n < 0. Usa `try-catch` en `main` para capturar la excepción.

**Ejercicio 49: Validación Completa con Excepciones**
Implementa un procedimiento `static void crearUsuario(String nombre, String email, int edad)` que valide todo: nombre no nulo (`Objects.requireNonNull`) y con más de 2 caracteres (`IllegalArgumentException`), email que contenga `@` (`IllegalArgumentException`) y edad > 0 y < 150 (`IllegalArgumentException`). Lanza la primera que falle, con un mensaje que indique qué parámetro falla y con qué valor.

**Ejercicio 50: Proceso Crítico con Finally**
Implementa un procedimiento `static void procesoCritico(int pasoQueFalla)` que simule 3 pasos: "Conectar", "Leer", "Procesar". Usa `try` para el proceso, un `catch` para cada tipo de error que pueda producirse (por ejemplo, `IllegalStateException` y `ArithmeticException`) y `finally` para "Desconectar siempre". Prueba tanto el caso de éxito como el de fallo en cada paso. Como mejora, reescribe la parte de conexión con try-with-resources.
