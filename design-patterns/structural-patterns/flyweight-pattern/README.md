# Flyweight

### Uso

 - Usamos el patrón `Flyweight` cuando requerimos crear una gran cantidad de objetos de una clase donde podemos separar 
fácilmente los estados que se pueden compartir (_intrínsecos_) y los que se pueden externalizar (_extrínsecos_).
 - El patrón almacena sólo los estados intrínsecos, éstos se pueden compartir en cualquier contexto.
 - El utilizar una instancia del `Flyweight` proveemos del estado extrínseco cuando llamamos a los métodos. Los objetos
del `Flyweight` utilizarán este estado junto con sus estados internos para realizar el trabajo de combinarlos y regresar
un comportamiento.
 - El código del cliente almacena los estados extrínsecos por cada instancia del `Flyweight`.
 - Al tener un comportamiento `Singleton` por medio de un `Factory`, los estados que pesan se almacenan o cachean, 
permitiendo ahorrar una gran cantidad de **RAM** que de otra manera podría llegar a desbordar si los objetos por sí 
solos se crearan en instancias separadas.
 - El objeto regresado es siempre el mismo pero con cambios en su estado extrínseco.