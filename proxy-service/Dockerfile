FROM eclipse-temurin:17.0.10_7-jdk

COPY target/*.jar proxy-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/proxy-service-0.0.1-SNAPSHOT.jar"]