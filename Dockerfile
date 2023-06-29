FROM openjdk:17
ADD target/demo-0.0.1-SNAPSHOT.jar springbootdocker.jar
ENTRYPOINT ["java", "-jar", "springbootdocker.jar"]
