FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/spring-hello-docker-*.jar
COPY ${JAR_FILE} /app/spring-hello-docker.jar
EXPOSE 8001
USER 1000
ENTRYPOINT ["java","-jar","/spring-boot-practice-0.0.1-SNAPSHOT.jar"]