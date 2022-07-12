FROM maven:3.5-jdk-8-alpine as builder

#copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

#Build a release artifact
RUN mvn package -DskipTests

# Use adoptOpenJDK for base image.
# It's important to use OpenJDK 8u191 or above that has container support enabled.
#FROM openjdk:8-jdk-alpine
FROM adoptopenjdk/openjdk8:jdk8u202-b08-alpine-slim

COPY --from=builder /app/target/exercice-*.jar /exercice.jar

#Run the service
CMD["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/exercice.jar"]