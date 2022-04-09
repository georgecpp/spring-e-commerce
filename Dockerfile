FROM adoptopenjdk/openjdk11:ubi
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY target/*.jar app.jar
COPY src/main/java/com/androcpp/ecommerce/db/phones.db .
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]