FROM maven:3.6.0-jdk-8-slim

# Create app directory
RUN mkdir -p /usr/src/calculator
WORKDIR /usr/src/calculator

# Bundle app source
COPY . /usr/src/calculator

RUN mvn clean install

EXPOSE 8080
CMD [ "java", "-jar", "./target/calculator-webservice-1.0.0.jar" ]