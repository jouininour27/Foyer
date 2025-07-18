FROM openjdk:17-jdk-slim
EXPOSE 8082

# Copier le jar dans l'image Docker
COPY target/Foyer-1.4.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
