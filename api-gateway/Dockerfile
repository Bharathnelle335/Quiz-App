# Use a minimal base image to run the application
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the jar file from the host machine's target folder
COPY target/api-gateway.jar .

# Expose the port your application runs on
EXPOSE 8080

# Define the command to run your application
ENTRYPOINT ["java","-jar","api-gateway.jar"]
