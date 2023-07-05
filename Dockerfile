FROM openjdk:17
ADD target/demo-0.0.1-SNAPSHOT.jar springbootdocker.jar
CMD ["java", "-jar", "springbootdocker.jar", "--spring.config.location=classpath:application.properties,/desktop/application.properties"]
