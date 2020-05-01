FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} playround-0.0.1-SNAPSHOT.jar
RUN ["ls"]
RUN ["pwd"]
RUN ["cd","/var/lib/jenkins/workspace/Build/target"]
RUN ["pwd"]
RUN ["ls"]
EXPOSE 8083
ENTRYPOINT ["java","-jar","playround-0.0.1-SNAPSHOT.jar"]