FROM openjdk
COPY target/*.jar /
EXPOSE 4200 
ENTRYPOINT ["java","-jar","/api_gateway-0.0.1-SNAPSHOT.jar"]
