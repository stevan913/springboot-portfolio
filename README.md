# 🚀 Spring Boot Portfolio

A secure and production-ready REST API built with Spring Boot.

### 🔐 Authentication
This API uses JWT for authentication.

The account is:
Username: admin
Password: password

1. Generate a token via `/api/auth/login`.
2. Click **Authorize** in Swagger.
3. Enter: `Bearer <your_token>`.
4. Access protected endpoints.

### 🚀 Features
- JWT Authentication and Authorization
- H2 In-Memory Database (Default)
- MySQL Support via Spring Profiles
- Swagger/OpenAPI Documentation
- Pagination, Sorting, and Search
- Global Exception Handling
- Gradle Build System
- Spring Security Integration

## 🛠️ Technologies Used
- Java 11
- Spring Boot 2.5.8
- Spring Security
- Spring Data JPA
- H2 Database
- MySQL
- JWT (JJWT)
- Swagger / OpenAPI
- Gradle
- Lombok

## ▶️ How to Run
```bash
./gradlew bootRun