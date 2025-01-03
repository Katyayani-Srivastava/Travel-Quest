# Travel-Quest

**Explore the beauty of the world with Travel Quest!**

## Description
Travel Quest is a visually stunning website designed for travel enthusiasts who want to explore the best destinations around the world. The website showcases beautiful images of various destinations, with sections dedicated to popular places.

## Features
- **Landing Page:** Introduction with high-quality images of travel destinations.
- **Destinations:** A gallery of popular locations including Italy, Croatia, Iceland, and more.
- **Newsletter Signup:** Users can subscribe to receive travel news and updates.
- **User Registration**: 
  - Users can register by filling out a form with their name and email address.
  - Input validation is performed both client-side (JavaScript) and server-side (Java Servlets).
- **Database Integration**:
  - All registered user data is stored in a MySQL database.
  - JDBC (Java Database Connectivity) is used to manage data interaction with the database.
- **Dynamic User Data Display**:
  - A JSP page dynamically displays all registered users fetched from the database.
  - The data is presented in a structured format, including their registration time.
- **JSP Integration**:
  - JSP pages are integrated with Servlets to handle user interactions and display user data.
  - The `user-list.jsp` page displays registered user information in a table.
- **JSTL (JavaServer Pages Standard Tag Library) and EL (Expression Language)**:
  - JSTL and EL are used in the `user-list.jsp` page to loop through user data and render it dynamically, making the code cleaner and more readable.
- **Servlets for Data Handling**:
  - The application utilizes Java Servlets for processing form submissions (`doPost`) and retrieving user data (`doGet`).
  - Servlets act as the controller in the MVC architecture, ensuring a clean separation of concerns.
- **Unit Testing for DAO Layer**:
  - The DAO (Data Access Object) classes responsible for interacting with the database are thoroughly tested using JUnit.
  - Tests ensure the correctness of database operations, such as inserting and retrieving user data.
---

## Technologies Used
- HTML5
- CSS3(Bootstrap)
- JavaScript
- Java and Java Servlets
- JSP
- JSTL
- EL
- JDBC
- MySQL
- Responsive Design (Mobile and Desktop view)

## Repository Structure
This repository is organized as follows:
```

Travel-Quest/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── travel/
│   │   │           ├── dao/
│   │   │           ├── model/
│   │   │           ├── servlets/
│   │   │           └── util/
│   │   |
│   │   ├── webapp/
│   │       ├── WEB-INF/
│   │       │   ├── web.xml
│   │       ├── js/
│   │       ├── css/
│   │       ├── images/
│   │       └── jsp/
│   │           ├── register.jsp
│   │           └── user-list.jsp
│   ├── test/
│       └── java/
│           └── com/
│               └── travel/
│                   ├── dao/
│                   
└── pom.xml


```

## Requirements
- **Java Development Kit (JDK) 8 or later**   
- **Maven 3.6 or later**  
- **MySQL 8.0 or later**

![preview](https://github.com/user-attachments/assets/d52d2bf2-a88b-4938-b1e0-06aef1cbfc3f)
