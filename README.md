# Grocery Store API

A full-featured RESTful API for managing a grocery store, built with Java, Spring Boot, JPA, and H2 (in-memory database). This project demonstrates entity relationships, CRUD operations, and RESTful design, making it a great portfolio or resume project.

## Features
- Manage Products, Categories, Customers, Orders, and Order Items
- Full CRUD operations for all entities
- Entity relationships (One-to-Many, Many-to-One)
- In-memory H2 database for easy setup (can be switched to MySQL/PostgreSQL)
- Clean, professional code structure

## Tech Stack
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database (in-memory)
- Maven

## Getting Started

### Prerequisites
- Java 17+
- Maven

### Running the Application
```bash
./mvnw spring-boot:run
```
The API will be available at `http://localhost:8080`.

### H2 Database Console
Visit `http://localhost:8080/h2-console`  
JDBC URL: `jdbc:h2:mem:testdb`

## API Endpoints

### Products
- `GET    /api/products`         - List all products
- `GET    /api/products/{id}`    - Get product by ID
- `POST   /api/products`         - Create a new product
- `PUT    /api/products/{id}`    - Update a product
- `DELETE /api/products/{id}`    - Delete a product

### Categories
- `GET    /api/categories`
- `GET    /api/categories/{id}`
- `POST   /api/categories`
- `PUT    /api/categories/{id}`
- `DELETE /api/categories/{id}`

### Customers
- `GET    /api/customers`
- `GET    /api/customers/{id}`
- `POST   /api/customers`
- `PUT    /api/customers/{id}`
- `DELETE /api/customers/{id}`

### Orders
- `GET    /api/orders`
- `GET    /api/orders/{id}`
- `POST   /api/orders`
- `PUT    /api/orders/{id}`
- `DELETE /api/orders/{id}`

### Order Items
- `GET    /api/order-items`
- `GET    /api/order-items/{id}`
- `POST   /api/order-items`
- `PUT    /api/order-items/{id}`
- `DELETE /api/order-items/{id}`

## Example: Create a Product
```bash
curl -X POST http://localhost:8080/api/products \
  -H 'Content-Type: application/json' \
  -d '{"name": "Milk", "price": 2.49}'
```

## Example: List All Products
```bash
curl http://localhost:8080/api/products
```

## License
MIT 