# LABORATORIO 3

## Introduccion
Este laboratorio se ha hecho con funciones lambda ubicadas en una clase llamada [mySpark](project3/src/main/java/edu/eci/arep/lambda/mySpark.java) en donde se hacen los get sobre el [httpServer](project3/src/main/java/edu/eci/arep/pr2/HTTPServer.java) y atravez de consultas GET o POST se obtendran los archivos ubicados en el directorio de [recursos](project3/src/main/resource/).

## ¿Como Ejecutar?
Para ejecutarlo se debe de abrir desde la carpeta que genera github es decir desde AREP-LAB3 esto es para que el path funcione.
Se debe de ejecutar en el main de [mySpark](project3/src/main/java/edu/eci/arep/lambda/mySpark.java) una vez se ejecute y en la terminal aparezca ```listo para recibir.... ``` se puede hacer pedir los archivos que se encuentran en el archivo de [recursos](project3/src/main/resource/).

y para pedirlo se debe pedir de la siguiente manera:
```localhost:35000/upload?name=<nombreArchivo>``` y asi recuperara la información o el archivo en la pantalla.

## ¿Como Funciona?
Lo que se hace desde un inicio es a travez de el mySpark, cuando se ejecuta de manera singleton el HTTPServer abre el puerto 35000, es importante decir que en este laboratorio el formulario solo existe para mostrar el metodo post mas no funciona para la subida de archivos ya que para eso se puede hacer por el querry antes enseñado. Este querry es mandado a un metodo que se encarga de extrar el archivo y buscarlo dentro de la carpeta de recursos y segun sea su formato lo mostrara en la pantalla 

## AUTOR
David Eduardo Valencia Cardona.

## Coolaboradores
[Santiago Andres Rocha C.](https://github.com/SanRocks1220)

[Arteco](https://www.arteco-consulting.com/post/introduccion-a-java-lambda)

[Bing chat](https://www.microsoft.com/es-es/bing?form=MA13FV)

