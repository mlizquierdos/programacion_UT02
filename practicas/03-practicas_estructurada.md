# Batería de ejercicios: programación estructurada en Java

**Instrucciones:** Para cada ejercicio, implementa el código en Java (JDK 21 o superior). Puedes ejecutar un único fichero directamente con `java Ejercicio01.java` o crear un proyecto en IntelliJ IDEA. Para leer de teclado usa `Scanner` y para mostrar resultados con formato usa `System.out.printf` o `String.format`. Recuerda: **primero el diseño en papel, luego la codificación**.

---

### Bloque I: Secuencias y operaciones básicas (ejercicios 1-10)

**Ejercicio 1: Tu Setup de Programador**
Implementa un programa que muestre tu setup de programador: marca del portátil (`String`), pulgadas de pantalla (`int`), RAM en GB (`int`), sistema operativo (`String`). Muestra todo en un formato bonito usando `printf`.

**Ejercicio 2: Calculadora de Edad**
Implementa un programa que pida al usuario su edad en años. Calcula los meses aproximados (edad × 12) y los días (edad × 365). Muestra: "Tienes {edad} años, que son aproximadamente {meses} meses o {dias} días".

**Ejercicio 3: Inventario de Videojuego**
Implementa un programa con variables para un inventario: `int pociones = 5;` `int espadas = 2;` `int monedas = 1500;`. Muestra el inventario. Luego suma 3 pociones y resta 200 monedas. Muestra el actualizado. **Documenta** el código con comentarios que expliquen cada operación.

**Ejercicio 4: Intercambio de Variables**
Implementa un programa con `int a = 10;` `int b = 25;`. Intercambia sus valores SIN usar una variable temporal (usa aritmética: `a = a + b; b = a - b; a = a - b;`). Muestra antes y después.

**Ejercicio 5: Constantes de Streaming**
Implementa un programa con constantes de clase: `static final int RESOLUCION = 1080;` `static final double BITRATE = 6.0;` `static final String CODEC = "H.264";`. Muestra la configuración.

**Ejercicio 6: Precio con IVA**
Implementa un programa que pida el precio base de un producto. Calcula el IVA (21%) y el precio final. Muestra: "{precio}€ + {iva}€ IVA = {total}€" con dos decimales (`%.2f`).

**Ejercicio 7: División Entera y Resto**
Implementa un programa que pida dos números enteros. Muestra la división entera (`/`) y el módulo (`%`). Ejemplo: 17 / 5 = 3, 17 % 5 = 2.

**Ejercicio 8: Clasificación de Servidor**
Implementa un programa que pida la temperatura de un servidor (`double`). Si es < 30, muestra "Servidor OK". Si es >= 30 y < 50, muestra "Advertencia: temperatura alta". Si es >= 50, muestra "CRÍTICO: servidor sobrecalentado".

**Ejercicio 9: Saludo por Horario**
Implementa un programa que pida la hora actual (`int`, 0-23). Si es < 12, muestra "Buenos días". Si es >= 12 y < 20, muestra "Buenas tardes". Si es >= 20, muestra "Buenas noches".

**Ejercicio 10: Par o Impar**
Implementa un programa que pida un número al usuario. Si es par, muestra "Par". Si es impar, muestra "Impar". Usa `%` para determinar la paridad.

---

### Bloque II: Condicionales múltiples y ternario (ejercicios 11-20)

**Ejercicio 11: Clasificación por Edad**
Implementa un programa que pida la edad. Usa `if-else if-else` para mostrar: "Niño" (<12), "Adolescente" (12-17), "Adulto" (18-64), "Mayor" (65+).

**Ejercicio 12: Descuento por Compra**
Implementa un programa que pida el total de la compra. Si es > 100€, aplica 10% de descuento. Si es > 50€, aplica 5%. Si no, sin descuento. Muestra el descuento y el total final.

**Ejercicio 13: Consola de Gaming**
Implementa un programa que pida una opción numérica (1-4). Usa `switch`: 1=PlayStation, 2=Xbox, 3=Nintendo, 4=PC. Default → "Opción no válida".

**Ejercicio 14: Día de la Semana**
Implementa un programa que pida un número del 1 al 7. Usa un `switch` clásico para mostrar el día de la semana. Si es 6 o 7, muestra "¡Fin de semana!". Usa `case 6: case 7:` para agrupar. Después, reescríbelo con la sintaxis de flecha (`case 6, 7 ->`) y comprueba qué ocurre en la versión clásica si olvidas un `break`.

**Ejercicio 15: Mayor de Edad con Ternario**
Implementa un programa que pida la edad. Usa el operador ternario: `String msg = edad >= 18 ? "Puedes votar" : "Todavía no puedes votar";`.

**Ejercicio 16: Ternario Anidado: Nota**
Implementa un programa que pida una nota (0-10). Usa un ternario anidado para mostrar: "Malo" (<4), "Regular" (4-6), "Bueno" (7-8), "Excelente" (9-10).

**Ejercicio 17: Mayor de Dos**
Implementa un programa que pida dos números. Usa un ternario para mostrar cuál es el mayor.

**Ejercicio 18: Menú con Opciones**
Implementa un programa que muestre un menú: 1=Jugar, 2=Opciones, 3=Salida. Pide una opción y muestra qué se ha seleccionado. Si no es válida, muestra "Opción no válida".

**Ejercicio 19: Tipo de Sangre**
Implementa un programa que pida un número (1-4). Usa `switch`: 1=A+, 2=A-, 3=B+, 4=O+. Default → "Desconocido".

**Ejercicio 20: Ternario con Operación**
Implementa un programa que pida dos números y una operación (`+`, `-`). Usa un ternario para mostrar el resultado según la operación elegida. Recuerda que la operación es un `String`: compárala con `equals()`, no con `==`.

---

### Bloque III: Bucles while y Do-While (ejercicios 21-30)

**Ejercicio 21: Cuenta Atrás**
Implementa un programa con `while` que muestre una cuenta atrás desde 10 hasta 0. Cuando llegue a 0, muestra "¡Lanzamiento!".

**Ejercicio 22: Menú Repetitivo**
Implementa un programa con `do-while` que muestre un menú: 1=Jugar, 2=Opciones, 3=Salir. Si elige 3, se sale. Si no, vuelve a mostrar el menú.

**Ejercicio 23: Suma hasta Negativo**
Implementa un programa con `while` que pida números al usuario. Cuando escriba -1, se detiene y muestra la suma total.

**Ejercicio 24: Validar Contraseña**
Implementa un programa con `do-while` que pida una contraseña. Si tiene menos de 8 caracteres (`length()`), vuelve a pedirla. Muestra "Contraseña aceptada".

**Ejercicio 25: Adivina el Número**
Implementa un programa con un número secreto 7. Usa `do-while` para pedir intentos al usuario. Cuando acierte, muestra "¡Acertaste en {intentos} intentos!".

**Ejercicio 26: Suma de Pares**
Implementa un programa con `while` que sume todos los números pares del 1 al 100. Muestra el resultado.

**Ejercicio 27: Multiplicar por Sumas**
Implementa un programa que pida dos números enteros positivos. Usa un `while` para multiplicar por sumas sucesivas (ej: 3 × 4 = 3+3+3+3). Muestra el resultado.

**Ejercicio 28: Dividir por Restas**
Implementa un programa que pida dividendo y divisor. Usa un `while` para obtener el cociente entero y el resto por restas sucesivas.

**Ejercicio 29: Media con Centinela**
Implementa un programa con `while` que pida notas al usuario. Cuando escriba -1 (centinela), se detiene y muestra la media de las notas válidas. Ten en cuenta el caso en que no se introduce ninguna nota.

**Ejercicio 30: Buscar con Bandera**
Implementa un programa con `boolean encontrado = false;` y un número objetivo 23. Usa un `while` pidiendo números al usuario hasta que escriba 23. Cuando lo encuentre, muestra "¡Encontrado!".

---

### Bloque IV: Bucles for (ejercicios 31-40)

**Ejercicio 31: Tabla de Multiplicar**
Implementa un programa que pida un número. Usa un `for` del 1 al 10 para mostrar su tabla de multiplicar.

**Ejercicio 32: Suma de Pares con For**
Implementa un programa con un `for` del 1 al 100 que sume todos los números pares. Muestra el resultado.

**Ejercicio 33: Factorial**
Implementa un programa que pida un número. Usa un `for` para calcular su factorial (n × (n-1) × (n-2) × ... × 1). **Documenta** el código con un comentario que explique qué es el factorial. Usa `long` y comprueba a partir de qué número el resultado deja de ser correcto con `int`.

**Ejercicio 34: Contar Dígitos**
Implementa un programa que pida un número entero. Usa un `for` con divisiones sucesivas por 10 para contar cuántos dígitos tiene.

**Ejercicio 35: Suma de Dígitos**
Implementa un programa que pida un número. Usa un `for` para sumar sus dígitos (ej: 123 → 1+2+3 = 6).

**Ejercicio 36: Tabla Completa (For Anidado)**
Implementa un programa con dos bucles `for` anidados para mostrar la tabla de multiplicar completa del 1 al 10, alineada en columnas con `printf("%4d", ...)`.

**Ejercicio 37: Triángulo de Asteriscos**
Implementa un programa con `for` anidados para dibujar un triángulo de 5 filas:
```
*
**
***
****
*****
```

**Ejercicio 38: Triángulo Invertido**
Implementa un programa con `for` anidados para dibujar:
```
*****
****
***
**
*
```

**Ejercicio 39: Pirámide de Números**
Implementa un programa con `for` anidados para dibujar:
```
1
12
123
1234
12345
```

**Ejercicio 40: FizzBuzz**
Implementa un programa con un `for` del 1 al 100. Si es múltiplo de 3, muestra "Fizz". Si es múltiplo de 5, muestra "Buzz". Si es múltiplo de ambos, muestra "FizzBuzz". Si no, muestra el número.

---

### Bloque V: Break, continue y control (ejercicios 41-50)

**Ejercicio 41: Break en Bucle**
Implementa un programa con `while` que pida números al usuario. Cuando escriba 42, muestra "¡Encontrado!" y sale con `break`.

**Ejercicio 42: Continue: Solo Pares**
Implementa un programa con un `for` del 1 al 20. Usa `continue` para saltar los impares y mostrar solo los pares.

**Ejercicio 43: Break en Menú Infinito**
Implementa un programa con `while (true)` que muestre un menú. Si elige 3, usa `break` para salir del bucle infinito.

**Ejercicio 44: Continue en Suma**
Implementa un programa con un `for` del 1 al 10. Usa `continue` para sumar solo los números pares. Muestra la suma.

**Ejercicio 45: Break y Continue Juntos**
Implementa un programa con un `for` del 1 al 50. Si el número es múltiplo de 7, usa `break` para parar. Si es impar, usa `continue` para saltarlo. Muestra los pares que no son múltiplos de 7.

**Ejercicio 46: Números Primos**
Implementa un programa con un `for` del 2 al 50. Para cada número, usa un bucle anidado para comprobar si es primo. Muestra los primos.

**Ejercicio 47: ¿Es Primo?**
Implementa un programa que pida un número. Usa `boolean esPrimo = true;` y un `for` para comprobar si es primo. Muestra el resultado.

**Ejercicio 48: Encontrar el Mayor**
Implementa un programa con un `for` que pida 5 números al usuario. Usa una variable `max` para guardar el mayor. Usa `assert max >= valor : "...";` tras cada comparación para verificar que la lógica es correcta. Muestra el resultado final. Ejecuta el programa con las aserciones activadas (`java -ea Ejercicio48.java`, o añadiendo `-ea` en las *VM options* de IntelliJ) y comprueba qué pasa si introduces a propósito un error en la comparación.

**Ejercicio 49: Encontrar el Menor**
Implementa un programa con un `for` que pida 5 números al usuario. Usa una variable `min` para guardar el menor. Muestra el resultado.

**Ejercicio 50: Positivos y Negativos**
Implementa un programa con un `for` que pida 10 números. Cuenta cuántos son positivos y cuántos negativos. Muestra ambos conteos.
