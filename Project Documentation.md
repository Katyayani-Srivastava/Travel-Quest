## **Project Documentation for Travel Quest**

---

### **1. Project Overview**
**Travel Quest** is a web application designed for managing user registrations and displaying profiles. It utilizes Java Servlets, JSP, and MySQL for backend operations and adheres to the Model-View-Controller (MVC) architecture. The project showcases dynamic web development techniques and database integration.

---

### **2. Objectives**
- To create a user-friendly platform for managing user registrations.
- To implement dynamic data display using JSP and JSTL.
- To practice integrating Servlets, JSP, and JDBC.
- To demonstrate MVC architecture and database handling.

---

### **3. Features**
1. **User Registration**:
   - Users can register with their name and email address.
   - Validation is performed both client-side and server-side.

2. **Dynamic User List**:
   - Displays registered users with details like name, email, and registration time.
   - Data is dynamically fetched from the database.

3. **Database Integration**:
   - User data is stored securely in a MySQL database.
   - Implements JDBC for database interactions.

4. **Use of JSTL and EL**:
   - Enhances JSP pages with clean and readable syntax.

5. **Scalable Design**:
   - Modular codebase for easy feature expansion.

---

### **4. Tools and Technologies**
- **Backend**: Java Servlets, JSP, JDBC
- **Frontend**: HTML, CSS, JSTL
- **Database**: MySQL
- **Build Tool**: Maven
- **Server**: Apache Tomcat

---

### **5. System Requirements**
#### Software Requirements
- **Java Development Kit (JDK)**: Version 11 or higher
- **Apache Tomcat**: Version 9 or higher
- **MySQL**: Version 8 or higher
- **IDE**: IntelliJ IDEA, Eclipse, or equivalent
- **Build Tool**: Maven

#### Hardware Requirements
- Processor: Intel i3 or higher
- RAM: 4GB or more
- Disk Space: 200 MB for project files

---

### **6. Architecture**
The project follows the **Model-View-Controller (MVC)** architecture:
- **Model**: Data classes (`User`) and DAO classes for database operations.
- **View**: JSP pages for user interaction.
- **Controller**: Servlets for handling requests and managing application logic.

---

### **7. Database Design**
#### Database Name: `travel_website`

**Table Name**: `newsletter_subscribers`
| Column Name  | Data Type      | Constraints                |
|--------------|----------------|----------------------------|
| `id`         | INT            | Primary Key, Auto Increment |
| `name`       | VARCHAR(255)   | Not Null                  |
| `email`      | VARCHAR(255)   | Not Null, Unique          |
| `created_at` | TIMESTAMP      | Default: Current Timestamp |

---

### **8. Implementation**
#### Key Components
1. **Servlets**:
   - `UserRegistrationServlet`: Handles form submission (`doPost`) and forwards to JSP pages.
   - `UserListServlet`: Fetches user data from the database and forwards it to the `user-list.jsp`.

2. **DAO**:
   - `UserDAO`: Manages database interactions like inserting and retrieving users.
   - `DatabaseUtil`: Provides the database connection.

3. **JSP Pages**:
   - `register.jsp`: User registration form.
   - `user-list.jsp`: Displays a list of registered users dynamically.

4. **JSTL and EL**:
   - JSTL loops for displaying data.
   - EL for accessing scoped variables in JSP.

#### Project Structure
```
Travel-Quest/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.travel/
│   │   │       ├── dao/         # DAO classes
│   │   │       ├── model/       # User data model
│   │   │       ├── servlets/    # Business logic in Servlets
│   │   │       └── util/        # Database utilities
│   │   ├── webapp/
│   │       ├── jsp/             # Frontend JSP pages
│   │       │   ├── register.jsp
│   │       │   └── user-list.jsp
│   │       ├── WEB-INF/         # web.xml deployment descriptor
│   └── test/                    # JUnit test cases for DAO layer
├── pom.xml                      # Maven configuration
```

---

### **9. Testing**
#### Unit Testing
- DAO methods tested using JUnit.
- Verifies database interactions (e.g., data insertion and retrieval).

---
