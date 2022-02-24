FROM openjdk:8
COPY target/Employee.jar Employee.jar
ENTRYPOINT ["java", "-jar", "/Employee.jar"]