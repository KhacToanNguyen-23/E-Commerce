# E-Commerce Backend System (Modular Monolith Architecture)

## Overview

This is a robust, production-ready backend project for an e-commerce platform built with **Spring Boot 3 & Java 17+**. 
The project focuses on building a highly scalable backend architecture, applying best practices for enterprise applications such as **Package-by-Feature**, custom exception handling, and robust data persistence.

---

## Objectives

* Build an enterprise-grade backend architecture from scratch.
* Practice advanced RESTful API development.
* Demonstrate a deep understanding of software design patterns (DTO, Repository, MVC) and Modular Architecture.
* Prepare for professional Java Backend Software Engineer roles.

---

## Tech Stack

* **Core Framework:** Spring Boot (Web, Data JPA, Security)
* **Database:** MySQL
* **Boilerplate Reduction:** Lombok
* **Security:** Spring Security + JWT (JSON Web Tokens)
* **Build Tool:** Maven
* **Architecture:** Modular Monolith (Package by Feature)

---

## Core Modules & Features

The system is split into distinct, self-contained business modules:

* **User Module:** Registration, Login, JWT Authentication, Role-based Access Control (ADMIN/USER).
* **Category Module:** Category hierarchy, management (CRUD).
* **Product Module:** Product listings, stock management, linked with categories.
* **Cart Module:** Personal shopping carts (One-to-One mapping with Users) and Cart Items.
* **Order Module:** Order processing, status tracking (PENDING, PROCESSING, SHIPPED, DELIVERED), and Order Details tracking.

---

## Key Architectural Highlights

* **Package by Feature:** Instead of a traditional layered approach (all controllers in one folder), the project encapsulates all layers (Controller, Service, Repository, DTO) within specific business modules, ensuring high cohesion and low coupling.
* **DTO Pattern & Mapping:** Entities are never exposed directly to external APIs. Custom mapping layers handle transformations between Entities and Request/Response DTOs.
* **Global Exception Handling:** Centralized `@ControllerAdvice` to catch and format all application exceptions into a standardized API response.
* **JPA Entity Optimization:** Heavy use of JPA lifecycle hooks (`@PrePersist`, `@PreUpdate`) for automated timestamp management, and optimized mappings (`FetchType.LAZY`) to prevent N+1 query problems.

---

## Project Structure

```text
src/main/java/com.Fptu.eCommerce
 ├── configuration        # Security configurations, CORS, and Bean setups
 ├── exceptionHandle      # Global exception handling (@ControllerAdvice)
 ├── module               # Business Modules
 │    ├── cart            # Shopping Cart logic
 │    ├── category        # Category logic
 │    ├── common          # Shared utilities and standard API Response classes
 │    ├── order           # Order processing logic
 │    ├── product         # Product catalog logic
 │    └── user            # User management & Authentication (includes security package)
 │         ├── controller # REST APIs
 │         ├── service    # Business logic
 │         ├── repository # Data access layer (Spring Data JPA)
 │         ├── dto        # Request/Response objects
 │         ├── entity     # Database entities
 │         └── mapping    # DTO mapping logic
```

---

## Database Design

**Main Entities:**
* `Users`
* `Categories`
* `Products`
* `Carts` & `CartItems`
* `Orders` & `OrderDetails`

**Entity Relationships:**
* `User` (1) ↔ (1) `Cart`
* `Cart` (1) ↔ (N) `CartItem` (N) ↔ (1) `Product`
* `Category` (1) ↔ (N) `Product`
* `User` (1) ↔ (N) `Order`
* `Order` (1) ↔ (N) `OrderDetail` (N) ↔ (1) `Product`

---

## Getting Started

### Prerequisites
- JDK 17 or higher
- Maven 3.6+
- MySQL 8.x

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ecommerce.git
   cd ecommerce/backend
   ```
2. Configure your MySQL database credentials in `src/main/resources/application.properties`.
3. Run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

---

## Future Improvements

* 🔄 Implement **Flyway/Liquibase** for database versioning and migrations.
* 📦 Standardize API Responses globally (`ApiResponse<T>`).
* 📄 Integrate **Swagger/OpenAPI 3.0** for API documentation.
* 🚀 Add **Pagination & Sorting** (`Pageable`) for product and order listings.
* 🐳 **Dockerize** the application for seamless deployment.

---

## Author

**Nguyễn Khắc Toàn**  
Java Backend Developer (Spring Boot)
