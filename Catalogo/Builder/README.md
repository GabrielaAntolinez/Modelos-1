# Builder

```
Tipo:Creacional
```
### Propósito:
_Realiza una separación de la construcción de un objeto complejo de su representación, por lo que se puedan crear distintas representacione de un mismo modo proceso de construcción._

### Estructura:
![builder](https://user-images.githubusercontent.com/42217739/46638249-9b07ac80-cb25-11e8-95cf-ce913fb1271d.png)

### Participantes:

* Builder: Se crea una interfaz abstracta para generar un objeto complejo (Producto).

* BuilderConcreto: Posee los métodos del Builder implementados, por lo que fabrica y acopla las partes del objeto complejo.
     
* Director: Genera un objeto utilizando la interfaz de Constructor, la cual es pasada como parametro.
     
     
 Información utilizada: 
 
 
 http://java-white-box.blogspot.com/2014/11/patrones-de-diseno-patron-builder-que.html
 
 https://drive.google.com/file/d/0BywiVyFlIabXSnBjU19jbndVUG8/view
