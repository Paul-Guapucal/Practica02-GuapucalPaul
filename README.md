### Practica02-GuapucalPaul ###
Una agenda telefónica en la que se implementan métodos genéricos, además de mejorar la interfaz en cierto punto que sea agradable al usuario.

**Objetivos de la practica**

**•	Diseñar una interfaz gráfica en la IDE NetBeans que pueda gestionar la creación, actualización, eliminación y búsqueda de teléfonos de un usuario que puede registrarse e iniciar sesión dentro de la misma interfaz que se debe desarrollar para la presentación de la aplicación.**

**•	Utilizar la ayuda de los conceptos y los métodos de un controlador directo para gestionar los métodos principales dentro de la interfaz, aplicar la teoría de las arquitecturas MVC y DAO para la gestión de los teléfonos y su respectiva acción además de la creación de usuarios y sus respectivas acciones.**

**Items a desarrollar**

**1.	Revisar la teoría y conceptos de Java 8, 9 ,10, 11, 12, 13, 14, 15**


**2.	Diseñar e implementar las características de Java para generar la impresión de cualquier lista, de los modelos que tengan el campo id generar automaticamente.**

*En su respectiva pestaña tenemos el metodo implementado para generar la impresion de la lista*

[Ventana Listar telefono del usuario](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/vista/ListarTelefonosUsuarios.java)

[Ventana Listar telefonos](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/vista/Listartelefonos.java)

**3.  Probar y modificar el metodo validar para que nos permita utilizar excepciones, ademas de modificar el buscar para controlar el nullpointerexception.**

*Los metodos validar y modificar se encuentran dentro de sus respectivos controladores*

[Clase AbstractControlador](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/controlador/AbstractControlador.java)

[Clase ControladorTelefono](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/controlador/ControladorTelefono.java)

[Clase ControladorUsuario](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/controlador/ControladorUsuario.java)

**4.	Realizar práctica codificando los codigos de las nuevas caracteristicas de Java y su uso dentro de una agenda telefónica.**

*2.1 Paquetes de la practica*

[Paquetes de la Practica](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/tree/main/src/main/java/ec/edu/ups)

*2.1.1 Clase del paquete controlador*

[Clase AbstractControlador](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/controlador/AbstractControlador.java)

[Clase ControladorTelefono](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/controlador/ControladorTelefono.java)

[Clase ControladorUsuario](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/controlador/ControladorUsuario.java)

*2.1.2 Clase del paquete modelo*

[Clase Telefono](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/modelo/Telefono.java)

[Clase Usuario](https://github.com/Paul-Guapucal/Practica02-GuapucalPaul/blob/main/src/main/java/ec/edu/ups/modelo/Usuario.java)

*2.1.3 Clase del paquete vista*

[Ventana Gestion Telefono](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-08-Agenda-Telef-nica-con-MVC-y-DAO-con-Archivos-Binarios-2.-Desarrollar-un/blob/master/src/ec/edu/ups/vista/GestionTelefono.java)

![Interfaz Gestion Telefono](https://github.com/Paul-Guapucal/Screens-Practica08/blob/master/VentanaGestionTelefonos.jpg)

[Ventana Listar telefono del usuario](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-08-Agenda-Telef-nica-con-MVC-y-DAO-con-Archivos-Binarios-2.-Desarrollar-un/blob/master/src/ec/edu/ups/vista/ListarTelefonosUsuarios.java)

![Interfaz Listar telefono del usuario](https://github.com/Paul-Guapucal/Screens-Practica08/blob/master/VentanaListarTelefonosUsuario.jpg)

[Ventana Listar telefonos](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-08-Agenda-Telef-nica-con-MVC-y-DAO-con-Archivos-Binarios-2.-Desarrollar-un/blob/master/src/ec/edu/ups/vista/Listartelefonos.java)

![Interfaz Listar telefonos](https://github.com/Paul-Guapucal/Screens-Practica08/blob/master/VentanaListarTelefonos.jpg)

[Ventana Registrar Usuario](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-08-Agenda-Telef-nica-con-MVC-y-DAO-con-Archivos-Binarios-2.-Desarrollar-un/blob/master/src/ec/edu/ups/vista/RegistrarUsuario.java)

![Interfaz Registrar Usuario](https://github.com/Paul-Guapucal/Screens-Practica08/blob/master/VentanaRegistrarUsuario.jpg)

[Ventana Iniciar Sesion](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-08-Agenda-Telef-nica-con-MVC-y-DAO-con-Archivos-Binarios-2.-Desarrollar-un/blob/master/src/ec/edu/ups/vista/VentanaIniciarSesion.java)

![Interfaz Iniciar Sesion](https://github.com/Paul-Guapucal/Screens-Practica08/blob/master/VentanaIniciarSesion.jpg)

[Ventana Principal](https://github.com/juancvxpro/Pr-ctica-de-laboratorio-08-Agenda-Telef-nica-con-MVC-y-DAO-con-Archivos-Binarios-2.-Desarrollar-un/blob/master/src/ec/edu/ups/vista/VentanaPrincipal.java)

![Interfaz Ventana Principal](https://github.com/Paul-Guapucal/Screens-Practica08/blob/master/VentanaPrincipal.jpg)

**Resultados obtenidos en la practica**

**•	Utilizar la ayuda de controladores y las herramientas de NetBeans que permiten la gestión de archivos dentro de la IDE que luego serán asignados a una ruta especificado por el usuario dentro del ordenador.**

**•	Desarrollo de una aplicación que permita gestionar los teléfonos de un usuario que puede registrar e iniciar sesión dentro de la aplicación muy parecida a la práctica de Gestión de Teléfonos pero que ahora incluye una interfaz muy aceptable para el usuario que desee usarlo, además es muy fácil de manejar.**

**Conclusiones de la practica**

**•	Una manera más eficaz de manejar este tipo de aplicaciones dentro de NetBeans es con el uso de un controlador dentro del proyecto en sí, porque dentro de este se crearían los métodos que luego van a ser instanciados a las ventanas donde serán usados y a la vez requeridos para su ayuda dentro del código.**

**•	La aplicación de patrones de diseño y arquitecturas dentro de la aplicación creada son fundamentales y facilitan el trabajo a la vez que simplifican el código para que no venga a ser muy pesado y tenga una mayor aceptabilidad dentro de los ámbitos en los que se deseen proyectar su respectivo uso.**

**Recomendaciones de la practica**

**•	Utilizar la ID NetBeans para este tipo de aplicaciones es muy recomendable, puesto que su variedad de diccionarios, métodos, patrones, nos ahorran mucho tiempo en cuanto a el desarrollo de la interfaz del mismo, o más bien el entorno que será visualizado por el usuario.**

**•	Para que una vista de interfaz sea agradable a un lector se debe realizar un estudio de los colores que agraden a los usuarios para que de esta manera se pueda tener una respuesta factible cuando el o los usuarios utilicen la aplicación y den su visto bueno.**

**Nombre del estudiante**

*Paul Alexander Guapucal Cardenas*

**Firma del estudiante**

![firma de los estudiante](https://github.com/Paul-Guapucal/Capturas-Practica04/blob/master/Screen%20firma.jpg)
