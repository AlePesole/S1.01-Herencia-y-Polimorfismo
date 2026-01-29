Ejercicio 1 – Instrumentos musicales

•Enunciado
Estamos diseñando un programa para manejar instrumentos musicales de un grupo de música. En este grupo, existen tres tipos de instrumentos:

Instrumentos de viento
Instrumentos de cuerda
Instrumentos de percusión
Todos estos instrumentos tienen dos características en común: un nombre y un precio . Además, todos pueden tocarse , pero lo hacen de formas diferentes.

•Pasos a seguir
Realiza un commit explicativo para cada punto, siguiendo el estándar de Conventional Commits.

1-Crea una clase abstracta llamada Instrument, con:
Dos atributos: nameiprice
Un método abstracto llamadoplay()

2-Crea tres subclases que hereden de Instrument:
WindInstrument
StringInstrument
PercussionInstrument

3-En cada subclase, implementa el método play()para que muestre por consola un mensaje específico:
"Esta sonando un instrumento de viento" para WindInstrument
"Esta sonando un instrumento de cuerda" para StringInstrument
"Esta sonando un instrumento de percusión" para PercussionInstrument

4-Añade una clase Maincon un método main()donde:
Se cree un objeto de cada tipo de instrumento
Se llame el método play()de cada uno para ver el comportamiento polimórfico

•Carga de clases y blogs estáticos
El proceso de carga de una clase Java sólo se produce una sola vez durante la ejecución del programa.

Demuestra que esta carga se puede provocar de dos formas:

Cuando se crea la primera instancia de la clase.
Cuando se accede a un miembro estático de la clase (como un método o atributo static).
Para comprobarlo, añade un bloque estático en la clase y observa cuándo se ejecuta.