## ¿Cuál de estos atributos puede inicializarse desde el constructor?

- R: `power`, `power` es `final`, pero no es `static`, por lo tanto pertenece a cada objeto.
- Los atributos final pueden inicializarse en el constructor, siempre que se haga una sola vez.

## ¿Cuál no puede modificarse nunca?

- R: `brand` y `power` (éste se puede inicializar pero no modificar después)
- `brand` es `static final`: es una constante de clase, se inicializa directamente y no puede cambiar nunca
- `power` es `final`: se asigna una vez (en el constructor) pero no puede modificarse después
 

## ¿Cuál afecta a todas las instancias de la clase?

- R: `brand` y `model`
- Ambos son `static`, lo que significa que no pertenecen al objeto, sino a la clase