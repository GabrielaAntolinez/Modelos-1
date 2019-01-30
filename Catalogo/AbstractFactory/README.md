# Abstract Factory

```
TIPO: Creacional
```
## Proposito
_Dispone una interfaz para la generación de familias de objetos relacionados o que dependen entre ellos sin la necesidad de especificar desde el principio de que clase concreta serán. Ademaás, es bastante util cuando se prevee la inclusión de nuevas familias de productos._

## Diagrama


![abstractfactory](https://user-images.githubusercontent.com/42217739/46635435-0d728f80-cb1a-11e8-8880-aae31542826a.png)

* _AbstractFactory_: crea la base para las fabricas concretas, contruyendo objetos de productos abstractos.
* _FactoryConcreto_: implementa la base dada por "AbtractFactory" para crear la fabrica de determinado tipo de objeto.
* _AbstractProduct_: crea la base para los productos concretos.
* _Producto_: implementa "AbtracProduct" definindo concretamente las especificaciones de dicho producto correspondiente a una de las fabricas concretas.
* _CLient_: Unicamente esat relacionada con las clases abtractas, es decir "AbstractFactory" y "AbstractProduct".
