# PROYECTO FINAL JPA/HIBERNATE

### INTRODUCCIÓN

Este trabajo o proyecto consiste en crear una aplicación web en Spring o Jakarta que interactúe con una base de datos
y que además haga uso del patrón MVC (modelo-vista-controlador).  
En nuestro caso, hemos decidido partir del modelo de base de datos del proyecto de Javier Martinez realizado en la tercera evaluación del curso pasado
del módulo de Bases de Datos.  
Nuestro trabajo se basa en un portal web que vende entradas para un festival. Desde dicho sitio web, un usuario podrá darse de alta y convertirse en cliente al comprar una entrada,
consultar sus datos, consultar los artistas y carteles que actúan en el festival, etc.  
Además, hemos diseñado una ventana de administrador a la que podrá acceder un usuario gestor del sistema pará dar de alta nuevos escenarios, patrocinadores, artistas o carteles, entre otras cosas.
También podrá realizar otras tareas como aumentar la gama de un camerino o modificar el sueldo de un artista.


### COMPONENTES DEL SERVICIO WEB

Para desarrollar nuestro proyecto hemos recurrido a numerosas tecnologías y/o componentes:  
La parte de negocio o backend está desarrollada con Java, concretamente Spring Boot. En cuanto a la vista, se ha realizado con HTML5, CSS3 y algo de JavaScript,
haciendo uso del motor de plantillas Thymeleaf para poder comunicarse con el código programado.  
En esta parte también se ha hecho uso de Bootstrap y algún que otro framework como NiceAdmin en la ventana de administrador.  
Volviendo a la parte de negocio, no se limita a hacer un CRUD entre las entidades, sino que también incluye algunas acciones interesantes 
y dos servicios REST.  
El servicio de base de datos es proporcionado por un docker a partir de un fichero .yml que se encuentra en la raíz del proyecto. El gestor que usaremos nosotros es MySQL.  
Para desplegar la aplicación, usaremos Tomcat que viene integrado con Hibernate. La configuración del mismo se encuentra en el fichero **application.properties**, en la ruta **/src/main/java/resources**. 


### VENTANA DE ADMINISTRADOR

A este recurso o página sólo podrán acceder aquellos usuarios que sean de tipo "Administrador" (atributo definido siempre que se da de alta un nuevo usuario: cliente o administrador).
Desde esta ventana tenemos numerosas opciones: consultar la cartera del festival (su valor varía en función de la entrada que compra cada cliente), añadir nuevos datos a las entidades o modificar algunos de las mismas, entre otras cosas.  
Como ejemplo de las dos acciones nombradas en la última línea tenemos el añadir un nuevo elemento para cada entidad, modificar la fecha de celebración de un cartel, aumentar la gama de un camerino o modificar el sueldo de un artista.  
Para acceder a esta ventana desde la vista del cliente, solo hay que logearse en el icono de la esquina superior derecha e introducir las credenciales correctas. Si quien se logea es un cliente del festival, se le redirige a una página web 
donde se mostrarán sus datos y los de su entrada.   