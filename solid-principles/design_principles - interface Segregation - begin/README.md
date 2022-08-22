# Interface Segregation Principle
## Principio de Segregación de Interfaces

Los clientes (clases que implementan interfaces), no deben ser forzadas a depender de interfaces que no deberían de usar.

En muchos casos, este principio es violado cuando se tienen grandes interfaces que involucran muchas funcionalidades que
las clases que las implementan no necesitan todas esas funcionalidades (**Contaminación de interfaces**). Para resolver 
este problema, lo más usual es crear nuevas interfaces que minimicen estas funcionalidades o depurar las ya existentes.

Cuando ocurre este problema, se identifica claramente al momento de implementar un método de la interfaz que la clase
no requiere; en todos estos casos la solución **NUNCA** deberá ser mandar un objeto nulo, lanzar una excepción del tipo 
`UnsupportedOperationException`, dejar en blanco la implementación del método o mandar Dummies.

Para este código de ejemplo, la interfaz `com.company.intersegrega.service.PersistenceService` sirve a la clase
`com.company.intersegrega.service.UserPersistenceService`. Si posteriormente se agrega el nuevo servicio 
`com.company.intersegrega.service.OrderPersistenceService` notaremos que PersistenceService tiene la firma del método
`findByName()` el cual no se utiliza para OrderPersistenceService pues esta clase no tiene ningún atributo que se llame
"name". La solución a este problema es eliminar dicho método de la interfaz y eliminar la anotación `@Override` de la
implementación en `com.company.intersegrega.service.UserPersistenceService`. De esta forma se elimina la contaminación
por interfaz.