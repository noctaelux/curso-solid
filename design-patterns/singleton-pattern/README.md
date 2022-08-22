# Singleton

### Uso

> **¡Cuidado!** El abuso de estados mutables en este patrón, lo convertirán en un antipatrón de desarrollo pues estos
> estados estarán disponibles globalmente para su modificación.

 - El patrón **Singleton** cuando necesitamos ejecutar una única instancia de una clase en toda la aplicación.
 - En java, podemos lograr este patrón declarando el constructor de la clase como privado, esto evitará que la clase
   pueda ser heredada, adicionalmente tenemos que crear un método público estático que regrese la instancia de la clase.
 - Existen dos tipos de objetos singleton:
   1. **Eager loading singleton**, la instancia se crea desde el inicio de la aplicación, desde el *classloader*.
   2. **Lazy loading singleton**, la instancia se crea en el momento en que se manda a llamar la clase. Y se tienen dos
      tipos:
      1. **Double Checked Lock (DCL)**, es el método más común que se encontrará en la mayoría de los códigos, este 
         método trabaja por medio de las declaraciones `volatile` y `synchronized`. La primera indica al JVM que 
         guarde/busque en memoria física la constante que contiene la declaración del **Singleton** y la segunda es
         donde se declara el DCL para evitar que dos hilos puedan generar dos instancias separadas de la instancia.
      2. **Initialization-on-Demand Holder (IoDH)**, es mejor que el anterior y se crea desde que el *classloader* se
         inicializa (ojo, no se confunda con el JVM, el JVM puede tener múltiples ejecuciones de la misma aplicación). 
   3. **Enum singleton**, no se recomienda en lo absoluto, pero puede ser útil en casos muy sencillos y específicos.

En cualquier caso, se recomienda siempre utilizar el método **Eager**, sólo en los casos donde la inicialización de la
aplicación sea costosa (dure mucho tiempo) o por otras razones muy específicas, elegiremos la inicialización **Lazy**.

El problema con el patrón **Singleton** es cuando se tienen múltiples estados mutables dentro de la misma clase, lo cual
deberemos evitar en todo caso, lo mejor es mantener pocos o ninguno. El patrón **Singleton** suele utilizarse en casos
muy específicos en la actualidad, por lo general no es un buen patrón de diseño cuando se abusa de éste. Se usa
básicamente para leer archivos de configuraciones al inicio o realizar el *logging* de la aplicación. No se deben
guardar dependencias dentro de estas clases, ya que pueden ser perdidas. El unit testing puede ser complicado. No se 
sugiere para manejar múltiples instancias de la misma aplicación, ya que el *classloader* funciona por instancia, no por
JVM.

> **Spring Framerwork** declara todos los beans como **Singleton**.

No se sugiere inicializar por medio de parámetros la instancia, pera ello es mejor utilizar un patrón **Factory**.
