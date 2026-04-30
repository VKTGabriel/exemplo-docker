FROM maven:4.0.0-rc-5-amazoncorretto-25-al2023 as build
WORKDIR  /build
COPY . .
RUN mvn clean package -DskipTests

FROM amazoncorretto:25.0.3
WORKDIR /app

COPY --from=build ./build/target/*.jar ./app.jar
EXPOSE 8008

ENTRYPOINT exec java -jar app.jar