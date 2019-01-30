# Factory Method (El método de la fábrica)

  # Propósito 
  
  Define una interfaz para crear un objeto pero dejando a las subclases decidir cual de las clases instanciar. El factory method deja a     una clase aplazar la instanciación a las subclases.
  
  # Clasificación del Patrón
  
  El Factory Method está considerado como un patrón creacional dado que crea instancias de una clase de una mejor manera.
  
  # Estructura del patrón
![factorymethod](https://user-images.githubusercontent.com/42217739/46635501-51fe2b00-cb1a-11e8-8309-36ad56bafcc4.jpg)

  # Participantes en la estructura
  
  * Producto: define una interfaz o clase abstracta para los objetos que crea el factory method que devuelve un objeto de tipo Producto.
  * ProductoConcreto: es la clase que implementa la interfaz de Producto.
  * Creator: es una clase abstracta o una interfaz que declara el factory method el cual retorna un objeto del tipo Producto.
  * ConcretCreator: Sobreescribe el factory method que devuelve una instancia de ProductoConcreto
  
  
  
