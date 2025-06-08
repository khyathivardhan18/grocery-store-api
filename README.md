# Grocery Store API

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

## Quick Start

1. Clone the repository:
   ```bash
   git clone https://github.com/khyathivardhan18/grocery-store-api.git
   cd grocery-store-api
   ```
2. Make sure MySQL is running and update your credentials in `src/main/resources/application.properties`.
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the API at [http://localhost:8080](http://localhost:8080)

## Architecture Diagram

```mermaid
graph TD
    A[Frontend (Web/Mobile)] -->|REST API| B(Spring Boot App)
    B --> C[MySQL Database]
    B --> D[Admin Dashboard]
    B --> E[Customer App]
```

A full-featured RESTful API for managing a grocery store, built with Java, Spring Boot, JPA, and MySQL. This project demonstrates entity relationships, CRUD operations, and RESTful design, making it a great portfolio or resume project.

## Table of Contents
- [Project Purpose](#project-purpose--what-is-this-api-for)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [API Response Examples](#api-response-examples)
- [Error Handling](#error-handling)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Project Purpose / What is this API for?
This API is the backend for a grocery store management system. It allows you to:
- Manage products, categories, customers, orders, and order items
- Organize products into categories
- Track inventory and stock
- Handle customer orders and order items
- Integrate with web or mobile frontends for both customer and admin use

## Features
- Manage Products, Categories, Customers, Orders, and Order Items
- Full CRUD operations for all entities
- Entity relationships (One-to-Many, Many-to-One)
- MySQL database for persistent storage
- Clean, professional code structure

## Tech Stack
- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- Maven

## Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL Server (running on localhost:3306)

### Database Setup
1. Create a database named `grocery_store` (or let the app create it for you).
2. Update your MySQL username and password in `src/main/resources/application.properties` if needed.
3. The schema and sample data will be initialized automatically from `src/main/resources/schema.sql` and the DataInitializer class.

### Running the Application
```bash
mvn spring-boot:run
```
The API will be available at `http://localhost:8080`.

## API Endpoints

### Products
- `GET    /products`         - List all products
- `GET    /products/{id}`    - Get product by ID
- `POST   /products`         - Create a new product
- `PUT    /products/{id}`    - Update a product
- `DELETE /products/{id}`    - Delete a product

### Categories
- `GET    /categories`         - List all categories
- `GET    /categories/{id}`    - Get category by ID
- `POST   /categories`         - Create a new category
- `PUT    /categories/{id}`    - Update a category
- `DELETE /categories/{id}`    - Delete a category

### Customers
- `GET    /customers`
- `GET    /customers/{id}`
- `POST   /customers`
- `PUT    /customers/{id}`
- `DELETE /customers/{id}`

### Orders
- `GET    /orders`
- `GET    /orders/{id}`
- `POST   /orders`
- `PUT    /orders/{id}`
- `DELETE /orders/{id}`

### Order Items
- `GET    /order-items`
- `GET    /order-items/{id}`
- `POST   /order-items`
- `PUT    /order-items/{id}`
- `DELETE /order-items/{id}`

## API Response Examples

### Example: Get All Products

**Request:**
```
GET /products
```

**Response:**
```json
[
  {
    "id": 1,
    "name": "Milk",
    "price": 2.49,
    "description": "Fresh milk",
    "category": {
      "id": 1,
      "name": "Dairy"
    },
    "stockQuantity": 100
  }
]
```

### Example: Error Response

**Request:**
```
GET /categories/999
```

**Response:**
```json
{
  "timestamp": "2025-06-08T03:03:58.679+00:00",
  "status": 404,
  "error": "Not Found",
  "path": "/categories/999"
}
```

## Error Handling

The API uses standard HTTP status codes to indicate success or failure.

- `200 OK` – Successful request
- `201 Created` – Resource created
- `400 Bad Request` – Invalid input
- `404 Not Found` – Resource not found
- `500 Internal Server Error` – Server error

## Project Structure

- `src/main/java/com/grocerystore/` – Main Java source code
  - `controller/` – REST controllers
  - `model/` – Entity classes
  - `repository/` – JPA repositories
  - `config/` – Configuration and data initialization
- `src/main/resources/`
  - `application.properties` – App configuration
  - `schema.sql` – Database schema
- `README.md` – Project documentation
- `pom.xml` – Maven build file

## Contributing

Contributions are welcome! Please open an issue or submit a pull request.

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit your changes
4. Push to your fork and submit a pull request

## License
MIT

## Contact

For questions or support, open an issue or contact vardhaninturi@gmail.com.

## Sample application.properties for MySQL
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/grocery_store?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=anilkumar123
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
``` 