# Dependency Invertion Principle
## Principio de Inversión de Dependencia

1. Módulos de nivel superior no deben depender de módulos de nivel inferior. Ambos deben depender de abstracciones.
2. Abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones.

Los **módulos de nivel superior** son aquellos que implementan la lógica de negocio, y los **módulos de nivel inferior**
implementan funcionalidades más básicas como formatear un archivo de texto, convertir una cadena a JSON, sanitizar un
formulario, etc.

En este sentido, la Inversión de Dependencia se refiere a que un método no debe implementar funcionalidades de bajo
nivel, las funcionalidades de bajo nivel pueden llegar a cambiar con el tiempo y con los requerimientos. Entonces para 
evitar tener que modificar el código, se recomienda "invertir la dependencia", esto quiere decir que nosotros ya no 
realizaremos la implementación, esta nos será proporcionada desde un nivel superior, facilitando así los cambios en la
aplicación.

En este caso, la clase Main de la aplicación mandaba una cadena de texto y el nombre del archivo a generar hacia el 
método `writeMessage(String msg, String fileName)` de la clase `com.company.depinv.MessagePrinter`, dentro del método, 
se instanciaban las funcionalidades de JSONFormatter y PrintWriter, lo cual viola el principio de Inversión de 
Dependencia. Para solucionar este problema, es más fácil que se pasen estas instancias como argumentos del método, esto
permitirá tener un código más compacto y el día que llegue a cambiar la funcionalidad entonces no será el método quien
tiene que actualizar las dependencias, sino quien lo invoca.