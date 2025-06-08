# Grocery Store API

A full-featured RESTful API for managing a grocery store, built with Java, Spring Boot, JPA, and MySQL. This project demonstrates entity relationships, CRUD operations, and RESTful design, making it a great portfolio or resume project.

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

## Example: Create a Product
```bash
curl -X POST http://localhost:8080/products \
  -H 'Content-Type: application/json' \
  -d '{"name": "Milk", "price": 2.49, "description": "Fresh milk", "category": {"id": 1}, "stockQuantity": 100}'
```

## Example: List All Products
```bash
curl http://localhost:8080/products
```

## License
MIT

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