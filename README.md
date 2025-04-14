# Backend - Spring Boot (Java)

Este serviço representa a API principal escrita em Spring Boot. Ele gerencia as operações de autenticação ou dados principais da To-Do List.

## 📦 Pré-requisitos

- Java 17
- Maven
- Docker (opcional)

## ▶️ Rodar localmente

```bash
# No diretório backend-spring
mvn spring-boot:run

A API estará acessível em: http://localhost:8080
```

## 🐳 Rodar com Docker
```bash
docker build -t todo-app-backend-spring .
docker run -p 8080:8080 todo-app-backend-spring
