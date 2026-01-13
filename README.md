# Inventory Management System

A Java-based Inventory Management System developed using NetBeans IDE, following
industry-standard practices such as DAO–POJO architecture, role-based access,
and database-driven operations.

---

## 📌 Overview

This application is designed to manage inventory, employees, receptionists,
and billing operations for a small to medium-scale business.
The system starts with a splash screen and provides secure login access for
Admin and Receptionist roles. Billing functionality is handled exclusively
by the Receptionist module.

---

## 🛠 Technology Stack

- Java
- Swing / AWT
- MySQL
- JDBC
- DAO – POJO Architecture
- NetBeans IDE

---

## ✨ Features

- Splash screen on application startup
- Secure login for Admin and Receptionist
- Employee management (Add / Update / Delete)
- Receptionist management
- Product and inventory management
- Stock quantity tracking
- Billing screen for product sales (Receptionist module only)
- Automatic bill calculation
- Database-backed record storage

---

## 🧱 System Architecture (DAO–POJO)

The project follows the DAO–POJO design pattern to maintain a clean separation
of concerns.

- POJO classes represent data entities such as Employee, Product, and Bill
- DAO classes handle all database operations using JDBC
- UI layer interacts with DAO classes through POJO objects

This architecture improves maintainability, scalability, and code readability.

---

## 📂 Project Structure

src/  
├── dao/        → Database access classes  
├── pojo/       → Plain Old Java Objects  
├── util/       → Database connection utilities  
└── ui/         → Swing/AWT screens  

database/  
└── inventory.sql  

nbproject/

---

## 🗄 Database Setup

1. Create a MySQL database named `inventory_db`
2. Import `database/inventory.sql`
3. Update database credentials in `DBConnection.java`

---

## ▶ Application Flow

1. Splash Screen
2. Login Screen
3. Role-based access (Admin / Receptionist)
4. Admin manages data
5. Receptionist performs billing

---

## ▶ How to Run

1. Open the project in NetBeans IDE
2. Configure MySQL database connection
3. Run `SplashScreen.java`
4. Login as Admin or Receptionist

---

## 🎓 Academic & Industry Note

This project was initially developed for academic submission and later refined
to follow industry-level coding practices including DAO–POJO architecture and
role-based access control.

---

## 📌 Use Cases

- Retail inventory management
- Billing system for small businesses
- Java + JDBC academic and internship projects
