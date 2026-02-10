# S1.01-Herencia-y-Polimorfismo
**Descripción**: En este módulo tratarémos dos de los conceptos más importantes de la programación orientada a objetos: la herencia y el polimorfismo . A través de ejercicios prácticos, aprenderémos a reutilizar código de forma eficiente, a construir jerarquías de clases ya utilizar métodos polimórficos para obtener comportamientos dinámicos según el tipo concreto de objeto  

## 📌 Nivel 1 • Ejercicio 1 - Instrumentos musicales
-Crear una clase abstracta `Instrument` que contiene dos atributos: `name` , `price` y que define un método abstracto `play()`

-Crear tres subclases que heredan `Instrument`:
- `WindInstrument`
- `StringInstrument`
- `PercussionInstrument`

-Cada subclase implementa el método `play()` mostrando un mensaje distinto por consola.

*Investiga y documenta:
- ¿Qué es un blog de inicialización (sin static)?
- ¿Cuándo se ejecuta?
- ¿Qué diferencia hay entre éste y un blog static?
Ver `readme.md` del ejercicio para las respuestas.

## 📌 Nivel 1 • Ejercicio 2 - Clase Coche

-Crea una clase llamada `Car` con los siguientes atributos:
`brand`: debe ser `static final`
`model`: debe ser `static`
`power`: debe ser `final`

-Añade dos métodos:
Un método estático llamado `brake()` y un método no estático llamado `accelerate()`

## 📌 Nivel 2 • Ejercicio 1 - Smartphone con múltiples funcionalidades
-Crea una clase llamada `Phone` con información básica sobre un teléfono: `marca` y `modelo`. Esta clase debe incluir un método para realizar llamadas, que muestre por pantalla que se está llamando al número pasado como parámetro.

-Crea dos interfaces: `Camera` y `Clock`

-Desarrolla una clase llamada `Smartphone` que sea una extensión de `Phone`, y que a su vez implemente las interfaces `Camera` y `Clock`.

-Implementa los comportamientos para que muestren el mensaje adecuado por consola.

## 🛠 Tecnologías  
- Java 21
- IntelliJ IDEA
- GitHub

## 🚀 Clonar repositorio
`git clone https://github.com/AlePesole/S1.01-Herencia-y-Polimorfismo.git`   