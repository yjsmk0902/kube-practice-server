FROM openjdk:21-slim
WORKDIR /app
COPY build/libs/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar app.jar"]