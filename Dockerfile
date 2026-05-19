#Etapa 1: build con gradle 9.5.0 y Java 21(Compilación)
FROM gradle:9.5.0-jdk21 AS build
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle build -x test --no-daemon

#Etapa 2: runtime con Java JDK 21 (Ejecución)
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar plataforma-pelis.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "plataforma-pelis.jar"]