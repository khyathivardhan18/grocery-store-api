# Grocery Store API

[![Build](https://img.shields.io/badge/build-passing-brightgreen)]()
[![License](https://img.shields.io/badge/license-MIT-blue.svg)]()

A modern, scalable REST API for managing a grocery store, built with Java Spring Boot and MySQL.

---

## 🚀 Features
- Product, category, customer, and order management
- Secure RESTful endpoints
- Admin and customer modules
- MySQL database integration
- Extensible service layer for business logic
- Ready for payment and email integrations

## 🏗️ Architecture

The following diagram illustrates the high-level architecture of the Grocery Store API MVP:

<p align="center">
  <img src="docs/IMG_4486.jpeg" alt="System Architecture Diagram" width="600"/>
</p>

**Key Components:**
- **Frontend Web/Mobile:** User interfaces for customers and admins.
- **API Gateway:** Routes REST API requests to the backend.
- **Spring Boot App:** Core backend logic, split into controllers, services, and repositories.
- **Admin Dashboard & Customer App:** Separate modules for different user roles.
- **Services:** Business logic, data access, and external integrations (payment, email).
- **MySQL Database:** Persistent storage for all entities.

## 🛠️ Tech Stack
- Java 17, Spring Boot 3
- MySQL, JPA/Hibernate
- Maven

## 📦 Setup

1. Clone the repo
2. Configure your database in `src/main/resources/application.properties`
3. Build and run:
   ```sh
   mvn spring-boot:run
   ```

## 📚 Usage

- Access API endpoints at `http://localhost:8080/api/...`
- See the [API documentation](docs/api.md) for details


## 🧑‍💻 Example Request

**See all products:**  
[http://localhost:8080/products](http://localhost:8080/products)

**Add a new product (using curl):**
```bash
curl -X POST http://localhost:8080/products \
  -H 'Content-Type: application/json' \
  -d '{"name": "Milk", "price": 2.49, "description": "Fresh milk", "category": {"id": 1}, "stockQuantity": 100}'
```

**Sample response:**
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

## 🗂️ Project Structure

| Path/Folder                          | What it is / What it does                                                                 |
|-------------------------------------- |------------------------------------------------------------------------------------------|
| `src/main/java/com/grocerystore/`     | Main Java source code for your application                                               |
| ├── `controller/`                     | Handles incoming requests (like "show me all products") and sends responses              |
| ├── `model/`                          | Defines what a Product, Category, Customer, etc. look like (the "shapes" of your data)   |
| ├── `repository/`                     | Talks to the database to save, update, or get information                                |
| ├── `config/`                         | Configuration and code that runs when the app starts (like adding sample data)           |
| `src/main/resources/`                 | Configuration files and database setup scripts                                           |
| ├── `application.properties`          | Where you put your database username, password, and other settings                      |
| ├── `schema.sql`                      | SQL script that creates the database tables                                              |
| `pom.xml`                             | The "recipe" for building your project (lists dependencies and plugins)                  |
| `README.md`                           | This documentation file                                                                 |
| `docs/IMG_4486.jpeg`                  | Your architecture diagram image                                                          |

## 📝 License

MIT

For questions or support, open an issue or contact khyathivardhan18@gmail.com.

---

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
