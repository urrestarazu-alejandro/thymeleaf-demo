El proyecto es una aplicación web básica desarrollada con Spring Boot y Thymeleaf. 
Este proyecto es ideal para aprender los conceptos básicos de Spring Boot y Thymeleaf, y cómo integrarlos para crear aplicaciones web dinámicas.

### Descripción del Proyecto
El proyecto es una aplicación web que utiliza Spring Boot como framework principal para el backend y Thymeleaf como motor de plantillas para renderizar vistas HTML en el frontend. 
La aplicación muestra una página de inicio (index.html) que saluda al usuario con un mensaje personalizado.


### Características Principales

#### Backend:

Implementado en Java con Spring Boot.
Controlador (IndexController) que maneja las solicitudes HTTP GET para las rutas / y /index.
El controlador pasa un atributo (name) al modelo para ser renderizado en la vista.

#### Frontend:

Utiliza Thymeleaf como motor de plantillas para generar contenido dinámico en HTML.
La plantilla index.html muestra un saludo personalizado utilizando la variable name proporcionada por el controlador.

#### Configuración:

Configuración de Thymeleaf en el archivo application.properties:
Deshabilita la caché para facilitar el desarrollo.
Define el prefijo y sufijo de las plantillas HTML.

#### Construcción y Dependencias:


Utiliza Gradle como herramienta de construcción.
Compatible con Java y Kotlin.

#### Estructura del Proyecto
app/src/main/java: Contiene el código fuente del backend.
Application.java: Clase principal que inicia la aplicación Spring Boot.
infra/controller/IndexController.java: Controlador que maneja las solicitudes HTTP.
app/src/main/resources/templates: Contiene las plantillas Thymeleaf.
index.html: Página de inicio que muestra el saludo.
app/src/main/resources/application.properties: Archivo de configuración de la aplicación.

#### Ejecución

Asegúrate de tener Java y Gradle instalados.
Ejecuta el comando para iniciar la aplicación. 
```
./gradlew bootRun 
```
Accede a [http://localhost:8080](http://localhost:8080) en tu navegador para ver la página de inicio.
