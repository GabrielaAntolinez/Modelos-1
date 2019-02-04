# Facade

```
TIPO: Estructural
```
## Proposito
_Cumple la funcion de ocultar el procedimiento y la complejidad de una tarea al crear un punto de conexion entre la parte del usuario  y la que se encarga de realizar las tareas que el mismo requiere. Es muy util cuando se requiere manejar varios subsistemas para determinado objetivo._

## Diagrama

![facade](https://user-images.githubusercontent.com/42217739/46707917-bcd66180-cc01-11e8-93d2-6392e3eab83b.png)

* _Facade_: es la clase que conoce todos los subsistemas con los cuales realizar las tareas que se le lleguen a pedir, y se encarga de ejecutarlos de manera correcta.
* _ModuloN_: Tiene una de las funcionalidades para el sistema completo y se encarga de su tarea especifica, si n tener conocimiento de las existencia de la fachada.

https://goo.gl/YqVRMF
