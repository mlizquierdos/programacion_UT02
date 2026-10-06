- [1. Introducción](#1-introducción)
  - [1.1. Programación estructurada y modular: un paradigma](#11-programación-estructurada-y-modular-un-paradigma)
  - [1.2. Del caos al orden: una analogía](#12-del-caos-al-orden-una-analogía)
  - [1.3. Conexión con UD01: lo que ya sabes](#13-conexión-con-ud01-lo-que-ya-sabes)
  - [1.4. ¿Qué aprenderás en esta unidad?](#14-qué-aprenderás-en-esta-unidad)


# 1. Introducción

> 💡 **Punto de partida:** ¿Alguna vez has intentado seguir una receta de cocina que no tenía pasos numerados? ¿O montar un mueble de IKEA sin instrucciones? Eso es programar sin estructura: el código funciona (a veces), pero nadie lo entiende ni lo puede mantener.

**Objetivos de aprendizaje:**

- Comprender qué es la programación estructurada y modular y por qué es importante
- Diferenciar entre programación estructurada y modular
- Conocer las tres estructuras de control básicas (secuencia, condicional, bucle)
- Entender la conexión con los conceptos de la UD01

En la UD01 vimos qué es la programación, los algoritmos y los paradigmas. Aprendimos a escribir programas simples: declarar variables, leer datos y mostrar resultados. Pero ¿qué pasa cuando el problema crece? ¿Cómo organiza Netflix el algoritmo que decide qué serie recomendarte? ¿Cómo gestiona Instagram el filtro que aplica a tu foto?

La respuesta es: **programación estructurada y modular**.

## 1.1. Programación estructurada y modular: un paradigma

Recordarás de la UD01 que un **paradigma** es un estilo o filosofía de programación. La programación estructurada y modular es un **paradigma** que se basa en dos ideas fundamentales:

- **Estructurada**: el código se escribe usando solo tres estructuras de control (secuencia, condicional, bucle). Sin saltos desordenados.
- **Modular**: el código se divide en piezas pequeñas y reutilizables (métodos: funciones y procedimientos). Sin todo en un solo sitio.

```mermaid
graph LR
    P[Paradigmas UD01] --> IMP[Imperativo]
    P --> EST[Estructurado]
    P --> MOD[Modular]
    P --> POO[Orientado a Objetos]
    P --> FUN[Funcional]
    EST --> SEC[Secuencia]
    EST --> CON[Condicional]
    EST --> BUC[Bucle]
    MOD --> FUN2[Funciones]
    MOD --> PROC[Procedimientos]
    style P fill:#2196F3,color:#fff
    style IMP fill:#607D8B,color:#fff
    style EST fill:#4CAF50,color:#fff
    style MOD fill:#FF9800,color:#fff
    style POO fill:#607D8B,color:#fff
    style FUN fill:#607D8B,color:#fff
    style SEC fill:#4CAF50,color:#fff
    style CON fill:#4CAF50,color:#fff
    style BUC fill:#4CAF50,color:#fff
    style FUN2 fill:#FF9800,color:#fff
    style PROC fill:#FF9800,color:#fff
```

📌 **Ejemplo real:** Netflix usa programación estructurada para el flujo de reproducción: secuencia (cargar vídeo → reproducir → pausar), condicionales (¿está suscrito? ¿hay conexión?) y bucles (¿seguir reproduciendo la siguiente serie?). Cada paso es claro, predecible y mantenible.

Antes de este paradigma, el código fluía de forma desordenada mediante saltos incondicionales (`GOTO`), lo que se conocía como **código espagueti**: una maraña de saltos imposible de mantener.

> 📝 **Curiosidad:** En Java, `goto` es una **palabra reservada** pero no se puede usar. Los creadores del lenguaje la reservaron precisamente para que nadie pudiera escribir código espagueti con ella.

```mermaid
graph LR
    subgraph "Código Espagueti"
        A[Inicio] --> B[Salto a línea 50]
        B --> C[Salto a línea 10]
        C --> D[Salto a línea 100]
        D --> B
    end
    subgraph "Código Estructurado"
        M[Inicio] --> S[Secuencia]
        S --> C2{¿Condición?}
        C2 -->|Sí| A1[Acción A]
        C2 -->|No| A2[Acción B]
        A1 --> F[Fin]
        A2 --> F
    end
    style A fill:#f44336,color:#fff
    style B fill:#f44336,color:#fff
    style C fill:#f44336,color:#fff
    style D fill:#f44336,color:#fff
    style M fill:#4CAF50,color:#fff
    style S fill:#2196F3,color:#fff
    style C2 fill:#FF9800,color:#fff
    style A1 fill:#4CAF50,color:#fff
    style A2 fill:#4CAF50,color:#fff
    style F fill:#4CAF50,color:#fff
```

## 1.2. Del caos al orden: una analogía

Un programa bien estructurado es como una **empresa bien organizada**:

| Empresa | Programa |
|---------|----------|
| Cada departamento tiene una función clara | Cada módulo/responsabilidad está separada |
| Existen protocolos para tomar decisiones | Condicionales (`if`, `switch`) |
| Se repiten procesos cada mes | Bucles (`while`, `for`) |
| Un empleado no hace todo solo | Modularidad: funciones y procedimientos |

```mermaid
graph TD
    P[Programa] --> ES[Estructurado]
    P --> MOD[Modular]
    ES --> SEC[Secuencia: paso a paso]
    ES --> CON[Condicional: decidir]
    ES --> BUC[Bucle: repetir]
    MOD --> FUN[Funciones: calcular]
    MOD --> PRO[Procedimientos: hacer]
    MOD --> PRI[Principios: DRY, SRP]
    style P fill:#2196F3,color:#fff
    style ES fill:#4CAF50,color:#fff
    style MOD fill:#FF9800,color:#fff
    style SEC fill:#607D8B,color:#fff
    style CON fill:#607D8B,color:#fff
    style BUC fill:#607D8B,color:#fff
    style FUN fill:#607D8B,color:#fff
    style PRO fill:#607D8B,color:#fff
    style PRI fill:#607D8B,color:#fff
```

## 1.3. Conexión con UD01: lo que ya sabes

En la UD01 aprendiste las bases que ahora usaremos como cimientos:

| UD01 (Lo que sabes) | UD02 (Lo que aprenderás) |
|---------------------|--------------------------|
| Tipos de datos (`int`, `String`, `boolean`) | Cómo pasarlos a métodos (en Java, siempre por valor) |
| Variables y constantes (`final`) | Ámbito: dónde vive cada variable |
| Entrada por consola (`Scanner`) | `hasNextInt()` para leer números de forma segura |
| Salida por consola (`System.out.println()`) | Formateo con `printf` y `String.format` |
| Operadores aritméticos y lógicos | Condicionales complejos (`if-else`, `switch`) |
| Conversión de tipos | Casting explícito y `Integer.parseInt` |
| Paradigmas de programación | Profundizar en estructurado y modular |

📌 **Ejemplo real:** Instagram lee tu nombre (`String`), tu edad (`int`) y tu email (`String`). En la UD01 solo sabías mostrarlos. En la UD02 aprenderás a pasarlos a métodos que validen, calculen y tomen decisiones con esos datos.

> 📝 **Nota sobre los ejemplos de esta unidad:** En Java todo el código vive dentro de una clase. Para que los ejemplos sean cortos:
> - Los fragmentos de código se suponen **dentro del método `main`**.
> - Los métodos que definimos (funciones y procedimientos) son **`static`** y están **dentro de la misma clase**.
> - Cuando se lee de teclado, se supone creado un `Scanner sc = new Scanner(System.in);` (con `import java.util.Scanner;`).
> - Usamos **Java 21 LTS o superior**. Lo que necesita una versión más moderna se indica junto al ejemplo.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Aquí van los fragmentos de código de los ejemplos
    }

    // Aquí van los métodos static (funciones y procedimientos)
}
```

## 1.4. ¿Qué aprenderás en esta unidad?

```mermaid
graph LR
    UD02[UD02: Estructurada y Modular] --> P1[Punto 2: Estructurada]
    UD02 --> P2[Punto 3: Modular]
    UD02 --> P3[Punto 4: Excepciones]
    P1 --> S[Secuencias]
    P1 --> C[Condicionales]
    P1 --> B[Bucles]
    P2 --> F[Métodos]
    P2 --> R[Parámetros: valor, varargs, records]
    P2 --> RE[Recursividad]
    P3 --> TC[try-catch]
    P3 --> TH[throw y throws]
    P3 --> AS[Aserciones]
    style UD02 fill:#2196F3,color:#fff
    style P1 fill:#4CAF50,color:#fff
    style P2 fill:#FF9800,color:#fff
    style P3 fill:#9C27B0,color:#fff
    style S fill:#607D8B,color:#fff
    style C fill:#607D8B,color:#fff
    style B fill:#607D8B,color:#fff
    style F fill:#607D8B,color:#fff
    style R fill:#607D8B,color:#fff
    style RE fill:#607D8B,color:#fff
    style TC fill:#607D8B,color:#fff
    style TH fill:#607D8B,color:#fff
    style AS fill:#607D8B,color:#fff
```

Al finalizar esta unidad serás capaz de:

- **Escribir código claro** usando secuencias, condicionales y bucles
- **Tomar decisiones** con `if-else`, `switch` y el operador ternario
- **Repetir tareas** con `while`, `for`, `do-while` y for-each
- **Dividir problemas** en métodos (funciones y procedimientos) reutilizables
- **Pasar y devolver datos** entendiendo el paso por valor, los varargs (`...`) y los records
- **Manejar errores** con `try-catch-finally`, `throw` y `throws`
- **Depurar código** con el depurador del IDE y aserciones (`assert`)

> 💡 **Consejo:** Esta unidad es la base de todo lo que viene. Si dominas estructurada y modular, la POO (UD04) será mucho más fácil. Piensa en ella como aprender a cocinar antes de abrir un restaurante.

En el siguiente punto veremos la programación estructurada en profundidad: secuencias, condicionales (`if-else`, `switch`, ternario), bucles (`while`, `for`, `do-while`) y cómo trabajar de forma segura con valores `null`.

## Buenas prácticas

- [ ] Usar siempre las tres estructuras de control básicas: secuencia, condicional y bucle
- [ ] Evitar los saltos desordenados — en Java ni siquiera existe un `goto` utilizable
- [ ] Aplicar el principio DRY (Don't Repeat Yourself) desde el primer día
- [ ] Organizar el código en módulos con una responsabilidad clara (SRP)
- [ ] Conectar los conceptos nuevos con los conocimientos previos de la UD01
