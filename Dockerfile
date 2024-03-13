FROM openjdk:17-jdk-alpine
ARG JAR_FILE=RyeetCodeSol-1.jar
COPY RyeetCodeSol-1.jar app.jar
ENTRYPOINT ["java", "-jar", "RyeetCodeSol-1.jar"]
