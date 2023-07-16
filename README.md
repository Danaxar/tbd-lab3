# Laboratorio N°3 - Laboratorio de Taller de Base de Datos
Este repositorio contiene todos los archivos relacionados con el Laboratorio N°3 del
Laboratorio de Taller de Base de Datos desarrollado por el grupo 1. 

## Integrantes del grupo 1
* [Daniel Catalán](https://github.com/Danaxar)
* [Diego Ramírez](https://github.com/DiegoRamirez2)
* [Alan Donoso](https://github.com/4lephZer0)
* [Jhoisan Allendes](https://github.com/holYadio)
* [Diego Acuña](https://github.com/Dieggo19)

## Descripción
El Laboratorio consiste en expandir lo realizado en el Laboratorio 1 y 2, ahora realizando consulta realizadas con Base de Datos No Relacionales (No SQL), utilizando MongoDB. Para ello, se realiza un Backend utilizando Java. <br>

El repositorio incluye lo siguiente:  <br>
* [Carpeta Backend](https://github.com/Danaxar/tbd-lab3/tree/main/Backend): Contiene todos los archivos del Backend del proyecto y las clases de las entidades del modelo. 
Se distribuyen las clases en los paquetes Services, Repositories, Models y Controllers.
* [Carpeta Database](https://github.com/Danaxar/tbd-lab3/blob/main/import.json): Contiene el archivo .json para crear la Base de Datos, cargar los datos de prueba, cargar las emergencias, regiones, tareas y voluntarios en formato MongoDB.

## Modelo Relacional a seguir para el Laboratorio N°3 (Mismo del Laboratorio 1 y 2)

* [Link del Modelo](https://lucid.app/lucidchart/40133991-4eb4-477a-8dbf-cef306156ed9/edit?viewport_loc=-1160%2C201%2C2990%2C1421%2C0_0&invitationId=inv_add495fb-67ce-4904-af54-fb84dadb2197)


## Requisitos y herramientas de desarrollo
Para ejecutar correctamente todo el proyecto, además de los archivos del repositorio se requieren las siguientes tecnologías:

* [MongoDB Community Edition](https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-windows/) versión 6.0.
* [MongoDB Compass](https://www.mongodb.com/try/download/compass) versión 1.34.2.
* [IntelliJ IDEA Ultimate](https://www.jetbrains.com/es-es/idea/download/#section=windows) versión 2022.2.1, aunque debería funcionar con cualquier versión.
* JDK Versión 17 (Se debe configurar tanto en el proyecto como en Gradle)
* [Nuxt + VUE](https://nuxtjs.org) versión 3.
* [Postman](https://www.postman.com/downloads/) versión 9.4

También, para el desarrollo del proyecto se utilizó:
* [Visual Studio Code](https://code.visualstudio.com) versión 1.74.1
* [GitKraken](https://www.gitkraken.com) versión 9.0.0

## Instrucciones de instalación
1. Clonar el repositorio: Esto proporcionará las carpetas principales para el proyecto de Laboratorio. Para clonarlo, se debe usar el siguiente comando en el directorio deseado:
```sh
git clone https://github.com/Danaxar/tbd-lab3.git
```
2. Ir al siguiente [link](https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-windows/) e instalar MongoDB Community Edition y seguir las instrucciones del instalador.
3. Ir al siguiente [link](https://www.mongodb.com/try/download/compass) e instalar MongoDB Compass y seguir las instrucciones del instalador.
4. Instalar IntelliJ IDEA Ultimate: Ingresar al sitio web oficial de IntelliJ IDEA y seleccionar el instalador dependiendo del Sistema Operativo en uso:
* Para Windows, utilizar el siguiente [link](https://www.jetbrains.com/idea/download/#section=windows).
* Para Linux, utilizar el siguiente [link](https://www.jetbrains.com/es-es/idea/download/#section=linux).
* Para MacOs, utilizar el siguiente [link](https://www.jetbrains.com/es-es/idea/download/#section=mac).
5. Al abrir IntelliJ IDEA Ultimate, abrir un nuevo proyecto y seleccionar la carpeta **Backend**. Debemos esperar a que el proyecto se configure y se instalen los plugins necesarios.
6. Dentro de la carpeta src -> main crear una carpeta llamada "resources". Luego, crear un archivo sin extensión llamado **application.properties**. Dentro del archivo, se debe incluir lo siguiente:
```sh
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=TBD
```
7. Configurar el JDK: Al abrir una clase IntelliJ nos solicitará configurar un JDK. Debemos asegurarnos de seleccionar JDK versión 17. Si no tenemos JDK 17, IntelliJ nos proporciona una opción para instalarlo automáticamente. 
8. Ir al siguiente [link](https://nodejs.org/en/) e instalar la última versión de Node.js, siguiendo las instrucciones de instalación.

9. Ir al siguiente [link](https://www.postman.com/downloads/) e instalar la última versión de Postman.

Con esto ya estamos listos con todo lo que es la instalación del proyecto y se puede continuar a las instrucciones de uso.

## Instrucciones de uso
1. Utilizar el archivo Dump llamado desde la terminal ejecutandolo con el siguiente comando:
```sh
mongorestore --db TBD --collection <nombre de la colección> <path del archivo .bson>
```
2. Utilizando IntelliJ IDEA Ultimate, asegurarse de que se detecte correctamente Spring Boot y Gradle. Ejecutar la aplicación haciendo click en la opción "Run" dentro de IntelliJ IDEA.

¡Con esto ya tenemos el Backend listo para trabajar!

3. Para probar el CRUD de una tabla, debemos colocar la ruta en Postman (Por ejemplo, **http://127.0.0.1:8080/emergencias**). Luego seleccionar uno de los métodos a aplicar, dependiendo de si quieres crear, mostrar, editar o eliminar un elemento y lo mismo para los otros casos.
