FROM amazoncorretto:23

WORKDIR /app
COPY . .

COPY ./build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
