FROM java:8-jdk-alpine
RUN ["ls"]
COPY ./target/playround-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "playround-0.0.1-SNAPSHOT.jar"]