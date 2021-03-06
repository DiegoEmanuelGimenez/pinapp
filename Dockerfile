FROM maven:3.5-jdk-8-alpine as builder

#copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

#Build a release artifact
RUN mvn package -DskipTests

FROM adoptopenjdk/openjdk8:jdk8u202-b08-alpine-slim

COPY --from=builder /app/target/exercice-*.jar /exercice.jar

#Run the service
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=mysql", "-jar", "/exercice.jar"]
