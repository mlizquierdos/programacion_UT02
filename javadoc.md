# Documentación de código Java con Javadoc

**Módulo:** Programación (1.º DAM / DAW)
**Unidad:** Documentación del código
**Duración orientativa:** 2 sesiones (teoría + práctica)

---

## Índice

1. [¿Qué es Javadoc?](#1-qué-es-javadoc)
2. [Comentarios en Java: tres tipos](#2-comentarios-en-java-tres-tipos)
3. [Estructura de un comentario Javadoc](#3-estructura-de-un-comentario-javadoc)
4. [Etiquetas (tags) principales](#4-etiquetas-tags-principales)
5. [Etiquetas en línea y HTML](#5-etiquetas-en-línea-y-html)
6. [Qué documentar en cada elemento](#6-qué-documentar-en-cada-elemento)
7. [Ejemplo completo: clase de dominio](#7-ejemplo-completo-clase-de-dominio)
8. [Ejemplo completo: interfaz DAO](#8-ejemplo-completo-interfaz-dao)
9. [Generar la documentación HTML](#9-generar-la-documentación-html)
10. [Buenas y malas prácticas](#10-buenas-y-malas-prácticas)
11. [Práctica](#11-práctica)
12. [Rúbrica de evaluación](#12-rúbrica-de-evaluación)

---

## 1. ¿Qué es Javadoc?

**Javadoc** es la herramienta incluida en el JDK que lee comentarios con un formato especial dentro del código fuente y genera a partir de ellos una **documentación en HTML** navegable, con el mismo aspecto que la documentación oficial de la API de Java.

Cuando consultas la página de `String`, `ArrayList` o `Scanner` en la web de Oracle, estás leyendo documentación generada con Javadoc a partir de los comentarios escritos en el código fuente del JDK.

### ¿Por qué es importante?

- **El código se lee muchas más veces de las que se escribe.** Otros programadores (o tú dentro de seis meses) necesitan saber *qué hace* un método sin leer *cómo lo hace*.
- **Los IDE la muestran automáticamente.** Al pasar el ratón sobre un método en IntelliJ, Eclipse o NetBeans, aparece su Javadoc.
- **Define el contrato de una clase.** Qué recibe un método, qué devuelve, qué excepciones lanza y en qué condiciones.
- **Es un estándar profesional.** En cualquier proyecto real se espera que la API pública esté documentada.

---

## 2. Comentarios en Java: tres tipos

```java
// 1. Comentario de una línea: notas rápidas para quien lee el código.

/*
 * 2. Comentario de bloque: explicaciones internas más largas.
 *    Javadoc los IGNORA.
 */

/**
 * 3. Comentario Javadoc: empieza por barra y DOS asteriscos.
 *    Javadoc los procesa y genera documentación a partir de ellos.
 */
```

> ⚠️ **Clave:** la única diferencia visible entre un comentario de bloque y uno Javadoc es el segundo asterisco: `/**`. Si escribes `/*`, la herramienta no lo verá.

### ¿Dónde se coloca?

Un comentario Javadoc se escribe **justo encima** del elemento que documenta:

- Clases, interfaces, enumeraciones y records
- Atributos (campos)
- Constructores
- Métodos

```java
/**
 * Representa una cuenta bancaria.
 */
public class Cuenta {          // ← documenta la clase

    /** Saldo actual en euros. */
    private double saldo;      // ← documenta el atributo

    /**
     * Ingresa dinero en la cuenta.
     */
    public void ingresar(double cantidad) { ... }   // ← documenta el método
}
```

Si hay cualquier otra cosa entre el comentario y el elemento (por ejemplo, una sentencia `import` o una línea de código), el comentario no se asociará correctamente.

---

## 3. Estructura de un comentario Javadoc

Todo comentario Javadoc tiene dos partes:

```java
/**
 * Calcula la media aritmética de un array de notas.       ← (1) Primera frase: resumen
 * <p>
 * Las notas deben estar entre 0 y 10. Si el array está     ← (2) Descripción ampliada
 * vacío no se puede calcular la media y se lanza una         (opcional)
 * excepción.
 *
 * @param notas array con las notas del alumno              ← (3) Bloque de etiquetas
 * @return la media de las notas, entre 0.0 y 10.0
 * @throws IllegalArgumentException si el array está vacío
 */
public static double calcularMedia(double[] notas) { ... }
```

1. **Primera frase (resumen).** Javadoc la copia a la tabla resumen de la clase. Debe ser breve y terminar en punto. Se suele escribir en tercera persona y empezando por un verbo: *"Calcula…"*, *"Devuelve…"*, *"Comprueba si…"*.
2. **Descripción ampliada.** Detalles, condiciones, ejemplos de uso. Admite HTML básico.
3. **Bloque de etiquetas.** Siempre al final, cada una empezando en línea nueva con `@`.

---

## 4. Etiquetas (tags) principales

| Etiqueta | Dónde se usa | Para qué sirve |
|---|---|---|
| `@param nombre descripción` | Métodos y constructores | Describe un parámetro. Una por parámetro, en el mismo orden que en la firma. |
| `@return descripción` | Métodos no `void` | Describe el valor devuelto. |
| `@throws Excepción descripción` | Métodos y constructores | Indica qué excepción puede lanzarse y **en qué condición**. (`@exception` es un sinónimo antiguo.) |
| `@author nombre` | Clases e interfaces | Autor del código. |
| `@version texto` | Clases e interfaces | Versión actual. |
| `@since texto` | Cualquier elemento | Versión en la que apareció el elemento. |
| `@see referencia` | Cualquier elemento | Enlace "Véase también" a otra clase, método o URL. |
| `@deprecated explicación` | Cualquier elemento | Marca algo como obsoleto e indica qué usar en su lugar. Se acompaña de la anotación `@Deprecated`. |

### Ejemplos de cada etiqueta

```java
/**
 * Divide dos números enteros.
 *
 * @param dividendo número que se va a dividir
 * @param divisor   número entre el que se divide; no puede ser 0
 * @return el cociente entero de la división
 * @throws ArithmeticException si {@code divisor} es 0
 */
public int dividir(int dividendo, int divisor) {
    return dividendo / divisor;
}
```

```java
/**
 * Gestiona el catálogo de libros de la biblioteca.
 *
 * @author Ana Pérez
 * @version 1.2
 * @since 1.0
 * @see Libro
 */
public class Catalogo { ... }
```

```java
/**
 * Calcula el precio con IVA usando un tipo fijo del 21 %.
 *
 * @param precio precio sin impuestos
 * @return precio con IVA
 * @deprecated El tipo de IVA puede variar. Usa
 *             {@link #calcularPrecioConIva(double, double)} indicando el tipo.
 */
@Deprecated
public double calcularPrecioConIva(double precio) {
    return precio * 1.21;
}
```

### Sobre `@throws`

Documenta **todas las excepciones comprobadas** (*checked*) que declara el método con `throws`, y también las **no comprobadas** (*unchecked*) que el método lanza deliberadamente al validar sus argumentos. Lo importante no es solo el tipo, sino **la condición**:

```java
// ❌ Inútil: repite el nombre de la excepción
 * @throws IOException si hay una IOException

// ✅ Útil: explica cuándo ocurre
 * @throws IOException si el fichero no existe o no se puede leer
```

---

## 5. Etiquetas en línea y HTML

Algunas etiquetas se escriben **dentro del texto**, entre llaves:

| Etiqueta en línea | Uso |
|---|---|
| `{@code texto}` | Muestra texto en fuente de código (monoespaciada). Ideal para `null`, `true`, nombres de variables o fragmentos. |
| `{@link Clase#metodo}` | Crea un enlace a otra clase o método. |
| `{@linkplain Clase texto}` | Igual que `@link`, pero el texto del enlace aparece en fuente normal. |
| `{@literal texto}` | Muestra el texto tal cual, sin interpretar HTML (útil para `<` y `>`). |

```java
/**
 * Busca un alumno por su NIA.
 * <p>
 * Devuelve {@code null} si no existe ningún alumno con ese NIA.
 * Para obtener todos los alumnos usa {@link #listarTodos()}.
 *
 * @param nia número de identificación del alumno
 * @return el {@link Alumno} encontrado o {@code null}
 */
```

### HTML básico admitido

```java
/**
 * Valida una contraseña.
 * <p>
 * Una contraseña es válida si cumple <b>todas</b> estas condiciones:
 * <ul>
 *   <li>Tiene al menos 8 caracteres.</li>
 *   <li>Contiene al menos un dígito.</li>
 *   <li>Contiene al menos una letra mayúscula.</li>
 * </ul>
 *
 * Ejemplo de uso:
 * <pre>{@code
 * if (Validador.esPasswordValida("Secreta123")) {
 *     System.out.println("OK");
 * }
 * }</pre>
 *
 * @param password contraseña a validar; no puede ser {@code null}
 * @return {@code true} si la contraseña es válida, {@code false} en caso contrario
 */
```

- `<p>` separa párrafos (un salto de línea en el comentario **no** crea un párrafo nuevo).
- `<ul>` / `<ol>` + `<li>` para listas.
- `<b>`, `<i>` para negrita y cursiva.
- `<pre>{@code ...}</pre>` para bloques de código de varias líneas, respetando sangría y sin problemas con `<` o `>`.

---

## 6. Qué documentar en cada elemento

### Clase

- Qué representa o qué responsabilidad tiene.
- Cómo se usa típicamente (si no es obvio).
- `@author`, `@version`, `@since`.

### Atributo

- Qué significa y, si aplica, sus unidades o restricciones.
- Normalmente basta con un comentario de una línea: `/** Precio en euros, siempre positivo. */`

> Por defecto, Javadoc solo incluye en el HTML los elementos `public` y `protected`. Documentar los atributos `private` sigue siendo útil para quien lee el código fuente y en el IDE.

### Constructor

- Qué estado inicial deja el objeto.
- `@param` de cada parámetro y `@throws` si valida argumentos.

### Método

- **Qué hace** (no cómo lo hace).
- Precondiciones: qué debe cumplirse al llamarlo.
- Postcondiciones: qué garantiza al terminar.
- `@param`, `@return`, `@throws`.

### Getters y setters triviales

Para un getter como `getNombre()` no hace falta una novela; basta con:

```java
/**
 * Devuelve el nombre del alumno.
 *
 * @return nombre del alumno
 */
public String getNombre() { return nombre; }
```

Si el setter valida, entonces sí hay que documentar la regla y la excepción.

---

## 7. Ejemplo completo: clase de dominio

```java
package es.dam.biblioteca.modelo;

import java.time.LocalDate;

/**
 * Representa un préstamo de un libro a un socio de la biblioteca.
 * <p>
 * Un préstamo tiene una duración fija de {@value #DIAS_PRESTAMO} días desde
 * la fecha de inicio. Una vez devuelto, el préstamo queda cerrado y no se
 * puede volver a devolver.
 *
 * @author Celia
 * @version 1.0
 * @since 1.0
 * @see Libro
 * @see Socio
 */
public class Prestamo {

    /** Número de días que dura un préstamo. */
    public static final int DIAS_PRESTAMO = 15;

    /** Penalización en euros por cada día de retraso. */
    public static final double PENALIZACION_DIARIA = 0.50;

    /** Libro prestado. Nunca es {@code null}. */
    private final Libro libro;

    /** Socio que tiene el libro. Nunca es {@code null}. */
    private final Socio socio;

    /** Fecha en la que se inició el préstamo. */
    private final LocalDate fechaInicio;

    /** Fecha de devolución, o {@code null} si el libro aún no se ha devuelto. */
    private LocalDate fechaDevolucion;

    /**
     * Crea un préstamo que comienza en la fecha indicada.
     *
     * @param libro       libro que se presta; no puede ser {@code null}
     * @param socio       socio que se lleva el libro; no puede ser {@code null}
     * @param fechaInicio fecha de inicio del préstamo; no puede ser {@code null}
     * @throws IllegalArgumentException si alguno de los argumentos es {@code null}
     */
    public Prestamo(Libro libro, Socio socio, LocalDate fechaInicio) {
        if (libro == null || socio == null || fechaInicio == null) {
            throw new IllegalArgumentException("Libro, socio y fecha son obligatorios");
        }
        this.libro = libro;
        this.socio = socio;
        this.fechaInicio = fechaInicio;
    }

    /**
     * Devuelve la fecha límite en la que el libro debe devolverse.
     *
     * @return fecha de inicio más {@value #DIAS_PRESTAMO} días
     */
    public LocalDate getFechaLimite() {
        return fechaInicio.plusDays(DIAS_PRESTAMO);
    }

    /**
     * Indica si el libro ya ha sido devuelto.
     *
     * @return {@code true} si el préstamo está cerrado
     */
    public boolean estaDevuelto() {
        return fechaDevolucion != null;
    }

    /**
     * Registra la devolución del libro en la fecha indicada.
     *
     * @param fecha fecha en la que se devuelve el libro; no puede ser
     *              anterior a la fecha de inicio
     * @throws IllegalStateException    si el préstamo ya estaba devuelto
     * @throws IllegalArgumentException si {@code fecha} es {@code null} o
     *                                  anterior a la fecha de inicio
     */
    public void devolver(LocalDate fecha) {
        if (estaDevuelto()) {
            throw new IllegalStateException("El préstamo ya está devuelto");
        }
        if (fecha == null || fecha.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("Fecha de devolución no válida");
        }
        this.fechaDevolucion = fecha;
    }

    /**
     * Calcula la penalización por devolver el libro tarde.
     * <p>
     * Se cobran {@value #PENALIZACION_DIARIA} € por cada día que pase de la
     * fecha límite. Si se devolvió a tiempo, la penalización es 0.
     *
     * @return importe de la penalización en euros, nunca negativo
     * @throws IllegalStateException si el libro todavía no se ha devuelto
     */
    public double calcularPenalizacion() {
        if (!estaDevuelto()) {
            throw new IllegalStateException("No se puede calcular la penalización de un préstamo abierto");
        }
        long diasRetraso = getFechaLimite().until(fechaDevolucion).getDays();
        return Math.max(0, diasRetraso) * PENALIZACION_DIARIA;
    }
}
```

> Fíjate en `{@value #DIAS_PRESTAMO}`: inserta automáticamente el valor de una constante en el texto generado. Si cambias la constante, la documentación se actualiza sola.

> **Nota técnica:** `until(...).getDays()` devuelve solo la componente de días de un `Period`, por lo que falla con retrasos de más de un mes. Es un buen detalle para comentar en clase: la documentación promete algo ("por cada día de retraso") que la implementación no cumple del todo. La versión correcta usa `ChronoUnit.DAYS.between(getFechaLimite(), fechaDevolucion)`.

---

## 8. Ejemplo completo: interfaz DAO

En una interfaz, el Javadoc es aún más importante: define el **contrato** que tendrán que cumplir todas las implementaciones (ficheros, JDBC, memoria…). Las clases que la implementen heredan esta documentación.

```java
package es.dam.biblioteca.dao;

import es.dam.biblioteca.modelo.Libro;
import java.util.List;
import java.util.Optional;

/**
 * Define las operaciones de persistencia para la entidad {@link Libro}.
 * <p>
 * Las implementaciones pueden almacenar los datos en memoria, en ficheros o
 * en una base de datos. Todas deben respetar el contrato descrito en cada
 * método.
 *
 * @author Celia
 * @version 1.0
 * @see es.dam.biblioteca.dao.jdbc.LibroDaoJdbc
 */
public interface LibroDao {

    /**
     * Guarda un libro nuevo.
     *
     * @param libro libro que se va a guardar; no puede ser {@code null}
     * @throws DaoException si ya existe un libro con el mismo ISBN o se
     *                      produce un error de acceso a los datos
     */
    void insertar(Libro libro) throws DaoException;

    /**
     * Busca un libro por su ISBN.
     *
     * @param isbn ISBN del libro, con o sin guiones
     * @return un {@link Optional} con el libro, o vacío si no existe
     * @throws DaoException si se produce un error de acceso a los datos
     */
    Optional<Libro> buscarPorIsbn(String isbn) throws DaoException;

    /**
     * Devuelve todos los libros almacenados.
     *
     * @return lista con todos los libros; vacía si no hay ninguno, nunca
     *         {@code null}
     * @throws DaoException si se produce un error de acceso a los datos
     */
    List<Libro> listarTodos() throws DaoException;

    /**
     * Elimina el libro con el ISBN indicado.
     *
     * @param isbn ISBN del libro que se quiere eliminar
     * @return {@code true} si se eliminó, {@code false} si no existía
     * @throws DaoException si se produce un error de acceso a los datos
     */
    boolean eliminar(String isbn) throws DaoException;
}
```

### Herencia de la documentación: `{@inheritDoc}`

En la implementación no hace falta repetir el comentario. Si no escribes nada, Javadoc copia el de la interfaz. Si quieres **añadir** algo, usa `{@inheritDoc}`:

```java
public class LibroDaoJdbc implements LibroDao {

    /**
     * {@inheritDoc}
     * <p>
     * Esta implementación usa una sentencia {@code PreparedStatement} para
     * evitar inyección SQL.
     */
    @Override
    public void insertar(Libro libro) throws DaoException { ... }
}
```

---

## 9. Generar la documentación HTML

### Desde la terminal

```bash
# Documentar un paquete y dejar la salida en la carpeta doc/
javadoc -d doc -sourcepath src es.dam.biblioteca.modelo es.dam.biblioteca.dao

# Documentar ficheros sueltos
javadoc -d doc src/Prestamo.java

# Incluir @author y @version (no se muestran por defecto)
javadoc -d doc -author -version -sourcepath src -subpackages es.dam.biblioteca

# Incluir también miembros privados
javadoc -d doc -private -sourcepath src -subpackages es.dam.biblioteca

# Documentación en español (texto de la plantilla)
javadoc -d doc -locale es_ES -encoding UTF-8 -docencoding UTF-8 -sourcepath src -subpackages es.dam.biblioteca
```

| Opción | Efecto |
|---|---|
| `-d carpeta` | Carpeta de salida |
| `-sourcepath ruta` | Raíz del código fuente |
| `-subpackages paquete` | Incluye un paquete y todos sus subpaquetes |
| `-author` / `-version` | Muestra esas etiquetas en el HTML |
| `-private` | Incluye también los miembros privados |
| `-encoding UTF-8` | Codificación de los ficheros fuente (evita problemas con tildes y ñ) |
| `-Xdoclint:none` | Desactiva las comprobaciones estrictas (útil mientras aprendes, pero lo ideal es corregir los avisos) |

Al terminar, abre `doc/index.html` en el navegador.

### Desde el IDE

- **IntelliJ IDEA:** *Tools → Generate JavaDoc…* Elige el ámbito, la carpeta de salida y añade `-encoding UTF-8 -docencoding UTF-8` en *Other command line arguments*.
- **Eclipse:** *Project → Generate Javadoc…*
- **NetBeans:** clic derecho sobre el proyecto → *Generate Javadoc*.

**Truco:** en los tres IDE, si escribes `/**` justo encima de un método y pulsas **Intro**, se genera automáticamente el esqueleto con los `@param`, `@return` y `@throws` correspondientes. Solo tienes que rellenar las descripciones.

### Con Maven

```bash
mvn javadoc:javadoc
```

La documentación se genera en `target/site/apidocs/` (o `target/reports/apidocs/` en versiones recientes del plugin).

---

## 10. Buenas y malas prácticas

### ❌ Evita

```java
/**
 * Método sumar.
 * @param a a
 * @param b b
 * @return return
 */
public int sumar(int a, int b)
```
→ No aporta nada que no diga ya la firma.

```java
/**
 * Recorre el array con un bucle for y va acumulando en la variable
 * total cada elemento, y al final lo divide entre la longitud.
 */
public double media(int[] v)
```
→ Describe **cómo** está implementado, no **qué** hace. Si cambias la implementación, el comentario queda desactualizado. Los detalles de implementación van en comentarios `//` dentro del método.

```java
/**
 * Devuelve el alumno.
 * @param id el id
 */
public Alumno buscar(int id) throws AlumnoNoEncontradoException
```
→ Falta `@return` y, sobre todo, falta `@throws`: ¿qué pasa si no existe?

### ✅ Recomendaciones

1. **Documenta el contrato, no la implementación.** Qué hace, qué espera, qué garantiza.
2. **La primera frase importa.** Corta, en tercera persona, empezando por verbo y terminada en punto.
3. **Explica los casos límite:** ¿acepta `null`? ¿Qué devuelve si la lista está vacía? ¿Qué pasa con números negativos?
4. **Cada `@throws` con su condición.**
5. **Mantén la documentación sincronizada.** Un Javadoc que miente es peor que no tenerlo.
6. **No documentes lo evidente con relleno**, pero tampoco te saltes los métodos públicos.
7. **Escribe en un único idioma** de forma consistente en todo el proyecto.

### Javadoc frente a comentarios internos

| Javadoc `/** */` | Comentarios `//` y `/* */` |
|---|---|
| Para quien **usa** la clase | Para quien **mantiene** la clase |
| Explica **qué** hace y el contrato | Explica **por qué** se ha hecho así una decisión |
| Va encima de clases, métodos y atributos | Va dentro del cuerpo de los métodos |
| Genera HTML | No genera nada |

Ambos son necesarios y complementarios.

---

## 11. Práctica

### Contexto

Se te entrega el código de un pequeño sistema de **gestión de un gimnasio**. Funciona correctamente, pero **no tiene ninguna documentación**. Tu trabajo es documentarlo completamente con Javadoc y generar la documentación HTML.

### Código de partida

Crea un proyecto con el paquete `es.dam.gimnasio` y los siguientes ficheros.

**`Socio.java`**

```java
package es.dam.gimnasio;

public class Socio {

    public static final int EDAD_MINIMA = 16;

    private final String dni;
    private String nombre;
    private int edad;
    private TipoCuota cuota;

    public Socio(String dni, String nombre, int edad, TipoCuota cuota) {
        if (dni == null || !dni.matches("\\d{8}[A-Z]")) {
            throw new IllegalArgumentException("DNI no válido");
        }
        if (edad < EDAD_MINIMA) {
            throw new IllegalArgumentException("Edad mínima: " + EDAD_MINIMA);
        }
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.cuota = cuota;
    }

    public String getDni() { return dni; }

    public String getNombre() { return nombre; }

    public int getEdad() { return edad; }

    public TipoCuota getCuota() { return cuota; }

    public void setCuota(TipoCuota cuota) {
        if (cuota == null) {
            throw new IllegalArgumentException("La cuota no puede ser null");
        }
        this.cuota = cuota;
    }

    public double calcularPrecioMensual() {
        double precio = cuota.getPrecioBase();
        if (edad >= 65) {
            precio *= 0.5;
        } else if (edad < 25) {
            precio *= 0.8;
        }
        return precio;
    }
}
```

**`TipoCuota.java`**

```java
package es.dam.gimnasio;

public enum TipoCuota {
    BASICA(25.0),
    COMPLETA(40.0),
    PREMIUM(60.0);

    private final double precioBase;

    TipoCuota(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
```

**`SocioNoEncontradoException.java`**

```java
package es.dam.gimnasio;

public class SocioNoEncontradoException extends Exception {

    public SocioNoEncontradoException(String dni) {
        super("No existe ningún socio con DNI " + dni);
    }
}
```

**`Gimnasio.java`**

```java
package es.dam.gimnasio;

import java.util.ArrayList;
import java.util.List;

public class Gimnasio {

    private final String nombre;
    private final int aforoMaximo;
    private final List<Socio> socios;

    public Gimnasio(String nombre, int aforoMaximo) {
        this.nombre = nombre;
        this.aforoMaximo = aforoMaximo;
        this.socios = new ArrayList<>();
    }

    public boolean darDeAlta(Socio socio) {
        if (socios.size() >= aforoMaximo) {
            return false;
        }
        for (Socio s : socios) {
            if (s.getDni().equals(socio.getDni())) {
                throw new IllegalStateException("Socio duplicado");
            }
        }
        socios.add(socio);
        return true;
    }

    public Socio buscar(String dni) throws SocioNoEncontradoException {
        for (Socio s : socios) {
            if (s.getDni().equals(dni)) {
                return s;
            }
        }
        throw new SocioNoEncontradoException(dni);
    }

    public void darDeBaja(String dni) throws SocioNoEncontradoException {
        Socio s = buscar(dni);
        socios.remove(s);
    }

    public List<Socio> listarPorCuota(TipoCuota cuota) {
        List<Socio> resultado = new ArrayList<>();
        for (Socio s : socios) {
            if (s.getCuota() == cuota) {
                resultado.add(s);
            }
        }
        return resultado;
    }

    public double calcularIngresosMensuales() {
        double total = 0;
        for (Socio s : socios) {
            total += s.calcularPrecioMensual();
        }
        return total;
    }

    public int getPlazasLibres() {
        return aforoMaximo - socios.size();
    }
}
```

### Tareas

**Parte 1 — Documentar las clases (5 puntos)**

1. Añade un comentario Javadoc a **cada clase y enum** con su descripción, `@author`, `@version` y `@since`.
2. Documenta **todos los atributos y constantes** con un comentario Javadoc de una línea que explique su significado o restricciones.
3. Documenta **todos los constructores y métodos públicos** con:
   - Primera frase descriptiva.
   - `@param` para cada parámetro.
   - `@return` cuando el método devuelva algo.
   - `@throws` para cada excepción, indicando **la condición** en que se lanza.
4. En `Socio#calcularPrecioMensual()`, explica los descuentos usando una **lista HTML** (`<ul>`).
5. Usa `{@code}` para `null`, `true`, `false` y nombres de variables, y `{@link}` al menos **tres veces** para enlazar entre clases.
6. Usa `{@value}` para mostrar el valor de `EDAD_MINIMA` dentro de algún comentario.

**Parte 2 — Detectar problemas a través de la documentación (2 puntos)**

Al documentar con precisión qué hace cada método, aparecen casos límite que el código no contempla. Responde en un fichero `respuestas.md`:

1. ¿Qué ocurre si se llama a `darDeAlta(null)`? ¿Y al constructor de `Socio` con `nombre` o `cuota` a `null`? ¿Cómo lo documentarías? ¿Lo corregirías en el código?
2. `darDeAlta` informa de dos situaciones de fallo de **formas distintas** (devolviendo `false` y lanzando una excepción). Explica cuáles son y si te parece un diseño coherente.
3. ¿Qué devuelve `listarPorCuota` si no hay socios de esa cuota? Indícalo en el Javadoc.
4. ¿Puede `getPlazasLibres()` devolver un número negativo? Razónalo.

**Parte 3 — Generar el HTML (2 puntos)**

1. Genera la documentación en una carpeta `doc/`, incluyendo `@author` y `@version` y con codificación UTF-8.
2. Comprueba que **no aparecen avisos** (*warnings*) en la salida de `javadoc`. Si aparecen, corrígelos.
3. Haz una captura de la página de la clase `Gimnasio` y otra del resumen de métodos de `Socio`.

**Parte 4 — Deprecación (1 punto)**

Se decide que el gimnasio debe poder aplicar descuentos configurables. Añade a `Socio` un método nuevo:

```java
public double calcularPrecioMensual(double descuentoJoven, double descuentoMayor)
```

Implementa el método, márcalo con Javadoc completo, y marca el método antiguo `calcularPrecioMensual()` como **obsoleto** usando `@deprecated` (con enlace al nuevo método) y la anotación `@Deprecated`.

### Entrega

Un archivo comprimido `ApellidoNombre_Javadoc.zip` con:

```
ApellidoNombre_Javadoc/
├── src/es/dam/gimnasio/   ← código fuente documentado
├── doc/                   ← documentación HTML generada
├── capturas/              ← las dos capturas de pantalla
└── respuestas.md          ← respuestas de la Parte 2
```

### Pista de arranque

Así podría empezar la documentación del método `buscar`. Úsalo como modelo de nivel de detalle:

```java
/**
 * Busca un socio por su DNI.
 *
 * @param dni DNI del socio que se busca
 * @return el {@link Socio} con ese DNI
 * @throws SocioNoEncontradoException si no hay ningún socio registrado
 *                                    con el DNI indicado
 */
public Socio buscar(String dni) throws SocioNoEncontradoException {
```

---

## 12. Rúbrica de evaluación

| Criterio | Excelente | Adecuado | Insuficiente | Puntos |
|---|---|---|---|---|
| **Cobertura** | Todas las clases, atributos, constructores y métodos públicos documentados | Falta algún elemento menor | Faltan clases o métodos públicos | 2 |
| **Etiquetas de bloque** | `@param`, `@return` y `@throws` completos y correctos en todos los casos | Algún `@throws` sin condición o algún `@param` incompleto | Etiquetas ausentes o incorrectas de forma generalizada | 2 |
| **Calidad de las descripciones** | Describen el contrato y los casos límite, sin relleno | Correctas pero genéricas | Repiten la firma o describen la implementación | 1 |
| **Análisis de casos límite (Parte 2)** | Respuestas razonadas que identifican los problemas y proponen solución | Respuestas correctas pero superficiales | Respuestas incorrectas o ausentes | 2 |
| **Generación HTML** | Sin avisos, UTF-8 correcto, `@author`/`@version` visibles | Genera con algún aviso o problema de codificación | No genera o no se entrega | 2 |
| **Deprecación** | Método nuevo documentado, antiguo con `@deprecated` + `{@link}` + `@Deprecated` | Falta el enlace o la anotación | No realizado | 1 |
| | | | **Total** | **10** |

---

### Referencias

- Documentación oficial de la herramienta: *The javadoc Command* (Oracle, JDK 21).
- Guía de estilo: *How to Write Doc Comments for the Javadoc Tool* (Oracle).
