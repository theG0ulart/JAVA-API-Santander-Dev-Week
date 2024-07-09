# Use uma imagem base do Maven para construir o aplicativo
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copie o arquivo pom.xml e as dependências do projeto
COPY pom.xml .
COPY src ./src

# Construa o aplicativo
RUN mvn clean install -DskipTests

# Use uma imagem base do OpenJDK para rodar o aplicativo
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copie o arquivo JAR gerado pelo Maven
COPY --from=build /app/target/SimpleBank-0.0.1-SNAPSHOT.jar app.jar

# Comando para rodar o aplicativo
ENTRYPOINT ["java", "-jar", "app.jar"]
