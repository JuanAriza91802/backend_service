
📌 Proyecto: Miprueba

📖 Descripción

Este proyecto es una aplicación backend desarrollada en Spring Boot, que gestiona un contador de visitas y un modo de desarrollo. Utiliza MySQL como base de datos y está lista para ser desplegada en Docker.

🚀 Tecnologías utilizadas

+ Java 21
+ Spring Boot 3.4.3
+ Maven
+ MySQL
+ Docker
+ Swagger (OpenAPI 2.8.5)

📂 Estructura del Proyecto

📁 src/main/java/com/ariza/miprueba
 ├── 📂 controllers
 │   └── VisitController.java
 ├── 📂 models
 │   └── Visit.java
 ├── 📂 repository
 │   └── VisitRepository.java
 ├── 📂 services
 │   └── VisitService.java
 ├── 📂 config
 │   └── CorsConfig.java
📁 src/main/resources
 ├── application.properties
📄 pom.xml
📄 Dockerfile
📄 README.md

📦 Dependencias principales (pom.xml)

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.8.5</version>
    </dependency>
</dependencies>

🛠 Configuración de la base de datos (application.properties)

spring.application.name=miprueba
spring.datasource.url=jdbc:mysql://localhost:3306/miapprueba
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

📌 Endpoints disponibles

+ Método
+ Endpoint
+ Descripción

POST
/api/visits/increment
Incrementa el contador de visitas

GET
/api/visits/increment
Obtiene el contador actual

PUT
/api/visits/update-mode?isDevelop=true
Cambia el modo de desarrollo

🐳 Dockerfile

# Usa la imagen de Java con JDK 21
FROM openjdk:21-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado por Maven
COPY target/miprueba.jar app.jar

# Expone el puerto en el que corre la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

🚀 Pasos para ejecutar el proyecto

1️⃣ Clonar el repositorio
git clone https://github.com/tuusuario/miprueba.git
cd miprueba

2️⃣ Construir el proyecto con Maven
mvn clean package

3️⃣ Ejecutar la aplicación localmente
java -jar target/miprueba.jar

4️⃣ Construir y ejecutar con Docker
docker build -t miprueba .
docker run -p 8080:8080 miprueba

📄 Documentación con Swagger
Una vez en ejecución, la documentación de la API está disponible en:
http://localhost:8080/swagger-ui.html



