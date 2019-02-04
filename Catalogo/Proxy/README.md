# Proxy

```
TIPO: Estructural
```
## Proposito
_Intenta proporcionar un objeto inmediato que represente el objeto original, con la intencion de controlar el acceso a este y sus caracteristicas._

## Diagrama

![proxy](https://user-images.githubusercontent.com/42217739/46707967-fc04b280-cc01-11e8-9b9b-970d9515a26e.png)


* _Cliente_: solicita los servicios a travez de "ElementoProxy".
* _Elemento_: es la interfaz que le da acceso comun a "ElementoReal" y a "ElementoProxy".
* _ElementoReal_: se encarga de definir el objeto real al cual se le dara representacion con el objeto proxy.
* _ElementoProxy_: controla el acceso y el uso de las funciones del objeto real, manteniendo una referencia a él.

https://goo.gl/p17vRM

https://goo.gl/tDDqnE
