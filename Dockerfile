FROM openjdk
COPY target/*.jar /
EXPOSE 8082 
ENTRYPOINT ["java","-jar","/api_gateway-0.0.1-SNAPSHOT.jar"]
