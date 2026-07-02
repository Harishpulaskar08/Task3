# Task3
# Library Management System

A simple Command Line Interface (CLI) based Library Management System developed using Java. This project demonstrates the core concepts of Object-Oriented Programming (OOP) including Abstraction, Inheritance, Polymorphism, and Encapsulation.

## Objective

To develop a mini Library Management System that allows users to manage books and perform book issue and return operations using Java and OOP concepts.

## Features

- Add New Book
- View All Books
- Search Book by ID
- Issue Book to a User
- Return Issued Book
- Duplicate Book ID Validation
- Book Availability Status
- Exception Handling for Invalid Input

## Technologies Used

- Java
- ArrayList
- Object-Oriented Programming (OOP)

## OOP Concepts Used

### Encapsulation
- Private data members in `Book` and `User` classes.
- Data is accessed using getters and setters.

### Abstraction
- `LibraryOperations` is implemented as an abstract class containing abstract methods.

### Inheritance
- `Library` class extends `LibraryOperations`.

### Polymorphism
- Runtime polymorphism is achieved using:
  ```java
  LibraryOperations library = new Library();
  ```
- Method overriding is used to provide implementations of abstract methods.

## Project Structure

```
LibraryManagementSystem/
│── Book.java
│── User.java
│── LibraryOperations.java
│── Library.java
│── Main.java
```

## Concepts Covered

- Classes and Objects
- Constructors
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism
- Method Overriding
- ArrayList
- Exception Handling
- Menu-Driven Programming

## How to Run

1. Clone this repository.
2. Open the project in VS Code or IntelliJ IDEA.
3. Compile all Java files.
4. Run `Main.java`.
5. Use the menu to perform library operations.

## Sample Menu

```
====================================
     Library Management System
====================================
1. Add Book
2. View Books
3. Search Book
4. Issue Book
5. Return Book
6. Exit
```

## Future Improvements

- Add Delete Book feature
- Store records in a file or database
- Track which user has borrowed a book
- Add book categories
- Display issue and return history

## Author

**Harish Pulaskar**
