FROM adoptopenjdk:11-jre-hotspot
COPY target/demo-0.0.2-SNAPSHOT.jar /usr/app/demo-0.0.2-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/app/demo-0.0.2-SNAPSHOT.jar"]
