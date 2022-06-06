FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD flutter-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]







