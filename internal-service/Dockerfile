FROM eclipse-temurin:17.0.10_7-jdk

COPY target/*.jar internal-service-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/internal-service-0.0.1-SNAPSHOT.jar"]