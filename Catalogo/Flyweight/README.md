# Flyweight

```
TIPO: Estructural
```
## Proposito
_Tiene como propósito eliminar la redundancia de objetos cuando se tiene una gran cantidad de ellos, aumentando la flexibilidad y el rendimiento con el uso de referencias a los objetos ya existentes donde se lleguen a necesitar_

## Diagrama


![image00](https://user-images.githubusercontent.com/42217739/52363009-cf29a600-2a0f-11e9-80e0-a7df753f0de4.jpg)

* _Flyweight_: crea la interfaz con la cual los diferentes flyweight actúan sobre los estados compartidos y no compartidos.
* _ConcretFlyweigth_: implementa la interfaz "Flyweight" y almacena los estados compartidos cuando estos existen.
* _UnsharedConcreteFlyweigth_: implementa la interfaz "Flyweight" y almacena aquellos objetos que no tieene estado compartido.
* _FlyweigthFactor_: crea y gestiona los objetos de flyweight, garantizando que estos se comparten de forma apropiada.
* _Client_: contiene las referencias de los flyweigth y calcula los estados que son no compartidos.


https://goo.gl/hKbA9z
