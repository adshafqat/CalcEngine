FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD target/CalcEngine-0.0.1-SNAPSHOT.jar CalcEngine.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/CalcEngine.jar"]