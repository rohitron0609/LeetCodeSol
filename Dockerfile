FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY RyeetCodeSol-1.jar app.jar
ENTRYPOINT ["java", "-jar", "RyeetCodeSol-1.jar"]
