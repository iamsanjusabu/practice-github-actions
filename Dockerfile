FROM eclipse-temurin:25-jdk

WORKDIR /app

COPY target/simple-api.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "simple-api.jar"]