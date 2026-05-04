# E-Commerce Backend System

## Overview

This is a personal backend project for an e-commerce system built with Spring Boot.
The project focuses on implementing core backend functionalities such as authentication, authorization, and order processing, while progressively improving system design and scalability.

---

## Objectives

* Build a real-world backend project from scratch
* Practice RESTful API development with Spring Boot
* Strengthen understanding of backend architecture
* Prepare for Java Backend Internship roles
* Explore deployment using Docker and Cloud (AWS)

---

## Tech Stack

* Backend: Spring Boot
* Database: MySQL
* Security: Spring Security + JWT
* Build Tool: Maven
* API Testing: Postman
* Containerization (Planned): Docker
* Cloud Deployment (Planned): AWS

---

## Features

* User Registration & Login (JWT Authentication)
* Role-based Authorization (ADMIN / USER)
* Product Management (CRUD APIs)
* Shopping Cart System
* Order Processing (Mock Payment)
* Product Search & Filtering

---

## Key Highlights

* Implemented JWT-based Authentication
* Designed Role-based Access Control (RBAC)
* Applied Layered Architecture (Controller - Service - Repository)
* Used DTO Pattern for data transfer
* Implemented custom mapping layer
* Developing Global Exception Handling
* Applying Request Validation using annotations

---

## Project Structure

```text
src/main/java/com.yourapp.ecommerce
 ├── configuration        # Security & application config
 ├── exceptionhandle      # Global exception handling
 ├── security             # JWT authentication & authorization
 ├── module.user
 │    ├── controller      # REST APIs
 │    ├── service         # Business logic
 │    ├── repository      # Data access layer
 │    ├── dto             # Request/Response objects
 │    ├── entity          # Database entities
 │    ├── mapping         # DTO mapping logic
```

---

## Database Design (In Progress)

Main entities:

* Users
* Products
* Orders
* Order Items
* Cart

Relationships:

* One User → Many Orders
* One Order → Many Order Items
* One Product → Many Order Items

---

## Getting Started

### Clone repository

```bash
git clone https://github.com/your-username/ecommerce.git
cd ecommerce
```

### Run application

```bash
mvn clean install
mvn spring-boot:run
```

---

## API Testing

* Tested using Postman
* Swagger documentation will be added in future versions

---

## Future Improvements

* Implement Refresh Token
* Add Pagination & Sorting
* Integrate Redis for caching
* Add Logging & Monitoring
* Dockerize the application
* Deploy to AWS
* Refactor towards Clean Architecture

---

## Author

Nguyễn Khắc Toàn
Java Backend Developer (Spring Boot)
