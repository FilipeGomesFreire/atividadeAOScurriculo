# atividadeAOScurriculo

passo a passo

start.spring.io

Project: Maven
Lenguage: JAVA (obvio) 
Spring Boot: 3.4.4
Dependencies: 
-Spring Web
-Spring Data JPA
-PostgreSQL Driver

estrai o arquivo curriculo-api.zip na pasta 

depois de ajeitar as coisas eu rotei com o comando 
mvn spring-boot:run

fiz o procfile com
web: java -jar target/curriculo-api-0.0.1-SNAPSHOT.jar

modificado o application.properties para produção

Adiciona packaging jar no pom.xml

<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>  <<<< aqui
	<name>curriculo-api</name>


tive q por um arquivo Dockerfile 

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/curriculo-api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]



no RENDER
escolhi webservice

adicionado ao Docker Command
java -jar target/curriculo-api-0.0.1-SNAPSHOT.jar

