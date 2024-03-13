FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/RyeetCodeSol-1.jar app.jar
ENTRYPOINT ["java", "-jar", "target/*.jar"]
