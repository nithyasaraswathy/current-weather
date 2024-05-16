FROM openjdk:21
COPY /build/libs/CurrentWeather-0.0.1-SNAPSHOT.jar currentWeather-0.0.1.jar
ENTRYPOINT ["java","-jar","/currentWeather-0.0.1.jar"]