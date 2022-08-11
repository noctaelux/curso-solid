# Curso SOLID y Patrones de Diseño de Software

### S - Single Responsibility Principle
**Principio de responsabilidad única.**

Toda clase debe tener una única responsabilidad para evitar ser modificada posteriormente. Esto quiere decir que si una
clase tiene la responsabilidad de guardar datos en la persistencia, entonces solo debe tener esta responsabilidad, por
lo que no debería gestionar las conexiones a la base, esta otra responsabilidad, debería tenerla otra clase.

En este ejemplo, la clase `com.company.singleresp.UserController` es objeto de limpieza de código, se mueven las
funciones de validación a otra clase, así como el proceso de guardar en la base de datos y el desdoblamiento del JSON al
formato de clases de Java.