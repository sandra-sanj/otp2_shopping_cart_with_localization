FROM eclipse-temurin:21-jdk
LABEL authors="sandra"

WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn package
CMD ["java", "-jar", "target/otp2_shopping_cart_with_localization-1.0-SNAPSHOT.jar"]