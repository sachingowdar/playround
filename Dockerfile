FROM java:8-jdk-alpine
RUN ["ls"]
ADD ./target/playround-0.0.1-SNAPSHOT.jar playround-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "playround-0.0.1-SNAPSHOT.jar"]