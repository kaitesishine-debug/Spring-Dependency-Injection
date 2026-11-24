# Spring Dependency Injection

## Project Overview
This project demonstrates Dependency Injection (DI) using the Spring Framework in Java.

## Technologies Used
- Java 21
- Spring Framework 6.2.7
- Maven
- IntelliJ IDEA

## Project Features
- MessageService interface
- EmailService implementation
- NotificationService using constructor injection
- Spring configuration using annotations
- Automatic component scanning

## How It Works
Spring automatically detects the application components and creates the required objects.

The NotificationService receives the MessageService dependency through constructor injection.

When the application runs, it sends a sample email notification.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Allow Maven to load the dependencies.
3. Open MainApplication.java.
4. Run the main method.

## Expected Output
- Spring container started!
- Beans found: [...]
- Testing Spring Dependency Injection...
- Sending Email: Welcome to Spring Dependency Injection!