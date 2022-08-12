# Open-Closed Principle
## Principio de Abierto-Cerrado

En toda clase que su funcionalidad haya sido probada, deberá permanecer cerrada para su modificación pero abierta para
su extensión.

Esto significa, que si tenemos otra clase que implementa un comportamiento parecido, entonces deberemos generar una
clase cerrada (interfaz, clase abstracta, etc.) la cual no se podrá modificar, pero se podrá extender para agregar o
modificar el comportamiento.

En este ejemplo, las clases `com.company.openclose.ISPSubscriber` y `com.company.openclose.PhoneSubscriber` comparten
comportamientos similares salvo ligeras diferencias. Si dejásemos existir estas dos clases, tendríamos el problema de
tener duplicidad en los datos. Por tanto, se genera la clase abstracta `com.company.openclose.Subscriber` en la cual se
irán todos esos atributos y métodos que tienen en común las dos clases anteriores y que queremos cerrar, esto provocará
que esta clase se vuelva cerrada para su modificación y si en un futuro se desea agregar la clase 
`com.company.openclose.VOIPSubscriber` entonces esta se extenderá de la clase abstracta para implementar las nuevas 
funcionalidades. Adicionalmente, la las clases hijas podrán ser modificadas solo en el método `calculateBill()` ya que 
es el único método abierto para extensión en la clase cerrada.