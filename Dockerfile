FROM openjdk:8-jdk-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
WORKDIR /app
#CMD mkdir logs
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
#CMD ["/usr/bin/tail", "-f", "/dev/null"]
ENTRYPOINT ["java","-jar","/app/app.jar"]