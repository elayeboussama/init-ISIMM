# init-ISIMM

A **Spring Boot** starter project used as a base for ISIMM coursework (Java / Maven).

## Tech stack

- Java, Spring Boot
- Maven (with the Maven wrapper)

## Getting started

### Prerequisites

- JDK 17+

### Run

```bash
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

The application starts on http://localhost:8080.

### Build

```bash
./mvnw clean package
```

## Project structure

```
src/main/java/        Application source
src/main/resources/   Configuration (application.properties)
pom.xml               Maven build
```
