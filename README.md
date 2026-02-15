Expense Tracker API

A RESTful backend application built using Spring Boot that allows users to manage daily expenses.
This project demonstrates core backend development concepts like CRUD operations, layered architecture, validation, and global exception handling.

 Project Objective
The goal of this project is to understand and implement:
REST API development
Controller → Service → Repository architecture
Database integration using JPA
Exception handling using @ControllerAdvice
Proper HTTP status codes
Clean and maintainable backend structure

Tech Stack
Java 2
Spring Boot
Spring Web
Spring Data JP
H2 / MySQL Database
Maven
Git & GitHub

Project Architecture
Controller  →  Service  →  Repository  →  Database

Package Structure
com.example.expensetracker

├── controller
│   └── ExpenseController.java

├── service
│   └── ExpenseService.java

├── repository
│   └── ExpenseRepository.java

├── model
│   └── Expense.java

├── exception
│   └── GlobalExceptionHandler.java

API Endpoints
 1. Create Expense
POST /api/expenses
Request Body:
{
  "title": "Groceries",
  "amount": 1500,
  "category": "Food",
  "date": "2026-02-15"
}
Response:
201 CREATED
2. Get All Expenses
GET /api/expenses
Response:
200 OK
3. Get Expense By ID
GET /api/expenses/{id}
Response:
200 OK
404 NOT FOUND (if ID does not exist)
4. Update Expense
PUT /api/expenses/{id}
Response
200 OK
5. Delete Expense
DELETE /api/expenses/{id}
Response
204 NO CONTENT

Exception Handling
This project includes a Global Exception Handler to:
Handle invalid inpu
Handle resource not found errors
Return meaningful error messages
Maintain clean controller code

Key Concepts Learned
RESTful API design
HTTP methods (GET, POST, PUT, DELETE)
HTTP status codes (200, 201, 204, 404)
Dependency Injection
JPA & Database interaction
Global exception handling
Clean code structure
