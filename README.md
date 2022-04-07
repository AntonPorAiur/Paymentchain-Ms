# Maven Spring Boot projets

## Proposito
 Ejemplo de  un grupo de proyectos en maven con el framework de spring boot

## Que hay dentro
 * Un proyecto padre llamado paymentchain-Ms
 * el proyecto padre contiene dos submodulos
    infraestructuradomain
    businessdomain 
 * El subproyecto infraestructuradomain
   contiene los microservicios de
    eureka
    springconfig
    administracion 

 * El subproyecto businessdomain
   contiene los microservicios de
    customer
    product
    transaction 

Se usa la ultiam version del framework de spring boot 2.6.2
Se ha hecho un upgrade de spring fox a spring docs openapi
Se ha probado con éxito el jdk 1.8, 11 y la ultima LTS jdk 17

## Intrucciones para ambientar
1. Descarga Docker Desktop que incluye docker y docker-compose
2. Ejecutar docker desktop, el engine debe mostrarse en verse y running
3. Validar la instalacion con el comando: 
docker --version
docker-compose --version

## En el poryecto maven
1. En el pom padre descomentar el plugin de com.spotify
2. Configurar una tarea maven 'package'' de modo que al hacer package de cada submodulo 
se compile, se empaquete y se genere la imagen de docker, por cada microservicio
   (Aparecera un error en el log ya que el plugin intenta hacer un push de la imagen en dockhub)
3. Una ves generada la imagen se puede validar en docker desktop o con el comando: docker images
4. Correr un contenedor de cada microservicio empezando por eureka, congif y admin, despues los de negocio