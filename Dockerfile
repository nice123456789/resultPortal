from maven:3.8.4-openjdk-8 as build
copy . .
Run mvn clean package -DskipTests

from openjdk:8-slim
copy -- from=build /target/resultPortal-0.0.1-SNAPSHOT.jar resultPortal.jar
expose 8080
entrypoint ["java","jar","resultPortal.jar"]

