# Decorador

```
TIPO: Estructural
```

## Proposito
_Tiene como proposito el añadir responsabilidades diferentes a las originales a objetos en concreto de manera dinamica. Esto se puede lograr por medio de la herencia, o con una opcion mas flexible, la cual seria la utilizacion de otro objeto que rodee al primero y le adicione las caracteristicas nuevas necesarias._

## Diagrama

![decorador](https://user-images.githubusercontent.com/42217739/46707886-80a30100-cc01-11e8-833d-b226b32a7650.jpg)


* _Componente_: Da la base para los objetos a los cuales se les podra adicionar responsabilidades extra de forma dinamica.
* _ComponenteConcreto_: usa la base que da "Componente y defiene los objetos a los cuales se les va a adicionar nuevo comportamiento.
* _Decorador_: define una interface de acuerdo a lo que se muestra en "Componente y mantiene una referencia a dicho objeto.
* _DecoradorConcreto_: es el que se encarga de darle la nueva funcionalidad al objeto que se requiere.

https://goo.gl/rJqnwu
