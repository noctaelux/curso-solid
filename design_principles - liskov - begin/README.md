# Liskov's Substitution Principle
## Principio de substitución de Liskov

Debemos poder substituir objetos de la clase base, con objetos de clases hijas, mientras esto no altere el
comportamiento y/o características de la clase base.

En este ejemplo, en un principio, la clase hija `com.company.liskov_1.Square` modificaba el comportamiento de la clase
padre `com.company.liskov_1.Rectangle`, esto se logra evidenciar al ejecutar el método Main de la aplicación. Debido a
un cambio en la clase Square, se modifica el comportamiento de la clase Rectangle, violando el principio de Liskov.

Para resolver este problema, se ha creado la interface `com.company.liskov_1.Shape` la cual generaliza más el concepto,
ya que un **Cuadrado** no es exactamente un **Rectángulo**, en esta interfaz se ha agregado la funcionalidad que 
ambas figuras ocupan en común: `computeArea()`. Y Square ha dejado de extender de Rectangle para que ambas clases
implementen Shape.