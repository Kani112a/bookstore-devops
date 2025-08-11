# Use an official OpenJDK 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy JAR file from host to container
COPY target/bookstore-devops-1.0.0.jar app.jar

# Run the JAR when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
