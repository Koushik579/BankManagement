# 🏦 Bank Management System (JSP & PostgreSQL)

A Java-based **Bank Management Web Application** built using **JSP, Servlets, HTML, CSS, JavaScript**, and **PostgreSQL**.  
The project focuses on user authentication, secure signup/login, and basic dashboard functionality using a structured MVC-style approach.

---

## 🚧 Project Status
**Work in Progress**

Core authentication and database connectivity are implemented.  
Additional banking features and UI enhancements are planned.

---

## ✨ Current Features
- 🔐 User signup and login system
- 🔑 Secure password handling (BCrypt)
- 📄 JSP-based frontend pages
- 🧠 Servlet-based authentication logic
- 🗄️ PostgreSQL database integration via JDBC
- 🧩 Client-side form validation using JavaScript
- 🎨 Basic UI styling with CSS
- 📊 User dashboard page

---

## 🛠 Tech Stack

### Frontend
- JSP
- HTML5
- CSS3
- JavaScript

### Backend
- Java
- Servlets
- JDBC

### Database
- PostgreSQL

### Security
- BCrypt (password hashing)

### Tools
- NetBeans IDE
- Apache Tomcat
- Git & GitHub

---

## 🚀 How to Run the Project

### Prerequisites
- Java JDK 8+
- Apache Tomcat
- PostgreSQL
- NetBeans IDE (recommended)

### Steps
1. Clone the repository
2. Open the project in **NetBeans**
3. Configure database credentials in:

src/java/com/bank/util/DbConnector.java

4. Ensure PostgreSQL is running
5. Run the project using NetBeans (Tomcat)
6. Open in browser:

http://localhost:8080/BankManagement/


---

## 📁 Project Structure

BankManagement/
├─ src/java/
│ └─ com/bank/
│ ├─ authenticator/
│ │ ├─ loginconf.java
│ │ └─ signupconf.java
│ └─ util/
│ └─ DbConnector.java
├─ web/
│ ├─ index.jsp
│ ├─ signup.jsp
│ ├─ dashboard.jsp
│ ├─ css/
│ │ └─ style.css
│ ├─ js/
│ │ └─ validation.js
│ ├─ webauthentication/
│ │ └─ signupconf.jsp
│ └─ WEB-INF/
│ └─ web.xml
├─ build/
├─ nbproject/
├─ README.md
└─ build.xml


---

## 🎯 Learning Objectives
- Build Java web applications using JSP & Servlets
- Implement secure authentication systems
- Integrate PostgreSQL using JDBC
- Apply MVC-style separation
- Handle form validation and user sessions
- Practice full-stack Java development

---

## 🔮 Planned Enhancements
- 💳 Account balance management
- 🧾 Transaction history
- 🔁 Fund transfer functionality
- 🛡️ Improved session management
- 📱 UI/UX improvements
- ⚠️ Better exception handling & logging

---

## 👤 Author
**Koushik Karmakar**  
B.Tech Civil Engineering Student  
Learning **Java Backend Development**, Databases & Full-Stack Web Applications

---

## 📌 Notes
This project is part of my learning journey in Java web development.  
The codebase and features will continue to evolve as new concepts are explored.
