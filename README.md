# 🚀 Java OOP: Complete Bank & Library Management System

[![Java](https://img.shields.io/badge/Java-17%2B-blue?style=for-the-badge&logo=java)](https://www.java.com/)
[![OOP](https://img.shields.io/badge/Paradigm-Object--Oriented-green?style=for-the-badge)](https://en.wikipedia.org/wiki/Object-oriented_programming)
[![License](https://img.shields.io/github/license/Lagmouchyoussef/java-oop-bank-library)](LICENSE)

---

## 📋 Table of Contents

| Section | Description | Icon |
|---------|-------------|------|
| [📖 Overview](#overview) | Project introduction | 🏠 |
| [🎯 Objectives](#objectives) | Learning goals | 🎯 |
| [💻 Technologies](#technologies) | Tools and requirements | 💻 |
| [📁 Structure](#structure) | File organization | 📂 |
| [🔧 Installation](#installation) | Setup guide | 💻 |
| [🚀 Usage](#usage) | How to run | ▶️ |
| [📊 Features](#features) | Key features | 📊 |
| [❓ FAQ](#faq) | Help section | ❓ |
| [📝 License](#license) | License info | 📝 |

---

## 📖 Overview <a name="overview"></a>

A Java project demonstrating **Object-Oriented Programming (OOP)** through two practical management systems:

### 🏦 Exercise 1: Bank Management System
A banking application for managing accounts with deposits, withdrawals, and transfers.

### 📚 Exercise 2: Library Management System  
A library application for managing books and borrowers.

---

## 🎯 Objectives <a name="objectives"></a>

| Objective | Description |
|-----------|-------------|
| 🎓 | Master **classes** and **objects** concepts |
| 🔒 | Understand **encapsulation** and **data hiding** |
| 🏗️ | Learn **class design** and **object relationships** |
| ⚙️ | Implement **CRUD operations** |
| 🧪 | Practice **testing** and **debugging** OOP code |
| 📈 | Apply **real-world** problem solving |

---

## 💻 Technologies Used <a name="technologies"></a>

| Technology | Version | Purpose |
|------------|---------|---------|
| ☕ Java | 17+ | Programming Language |
| 💡 IntelliJ IDEA | Latest | IDE |
| 📝 VS Code | Latest | Code Editor |
| 📦 Git | Latest | Version Control |

---

## 📁 Project Structure <a name="structure"></a>

```
📦 java-oop-bank-library
├── 📂 src
│   ├── 📂 bank
│   │   ├── Bank.java          # Bank management class
│   │   ├── BankAccount.java   # Bank account class
│   │   └── Main.java          # Bank demo
│   │
│   ├── 📂 library
│   │   ├── Book.java          # Book class
│   │   ├── Borrower.java      # Borrower class
│   │   ├── Library.java       # Library management class
│   │   └── Main.java          # Library demo
│
├── README.md
└── LICENSE
```

---

## 🔧 Installation <a name="installation"></a>

### Prerequisites

| Requirement | Minimum |
|-------------|---------|
| ☕ JDK | 17 or higher |
| 💾 RAM | 4GB |
| 💿 Disk | 100MB |

### Steps

```bash
# Clone the repository
git clone https://github.com/Lagmouchyoussef/java-oop-bank-library.git

# Navigate to project
cd java-oop-bank-library

# Compile
javac -d out src/**/*.java

# Run Bank System
java -cp out bank.Main

# Run Library System  
java -cp out library.Main
```

---

## 🚀 Usage <a name="usage"></a>

### 🏦 Bank System Example

```java
// Create a bank
Bank bank = new Bank();

// Add accounts
bank.addAccount(new BankAccount(1001, "John Doe", 5000.00));
bank.addAccount(new BankAccount(1002, "Jane Smith", 10000.00));

// Perform operations
bank.findAccountByNumber(1001).deposit(1000);
bank.findAccountByNumber(1001).withdraw(500);

// Display all accounts
bank.displayAllAccounts();
```

### 📚 Library System Example

```java
// Create a library
Library library = new Library();

// Add books
library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
library.addBook(new Book("1984", "George Orwell", 1949));

// Add borrowers
library.addBorrower(new Borrower("Ahmed", "Benali", 1));

// Borrow a book
library.borrowers[0].borrowBook(library.books[0]);

// Display all
library.displayBooks();
library.displayBorrowers();
```

---

## 📊 Features <a name="features"></a>

### 🏦 Bank Management

| Feature | Description |
|---------|-------------|
| ✅ | Create bank accounts with unique IDs |
| ✅ | Deposit money into accounts |
| ✅ | Withdraw money (with balance validation) |
| ✅ | Search accounts by account number |
| ✅ | Display all account details |

### 📚 Library Management

| Feature | Description |
|---------|-------------|
| ✅ | Add and manage books |
| ✅ | Add and manage borrowers |
| ✅ | Borrow books (availability check) |
| ✅ | Return books |
| ✅ | Display book and borrower information |

---

## ❓ FAQ <a name="faq"></a>

**Q: What is this project about?**
A: A Java project demonstrating OOP concepts through Bank and Library systems.

**Q: What Java version is required?**
A: Java 17 or higher.

**Q: Can I use this code for my own projects?**
A: Yes! Licensed under MIT License.

---

## 📝 License <a name="license"></a>

This project is licensed under the **MIT License**.

```
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

## 👤 Author

| | |
|:---|:---|
| 👨‍💻 | **Youssef Lagmouch** |
| 🎓 | Computer Science Student |
| 🏫 | EMSI (École Marocaine des Sciences de l'Ingénieur) |
| 📧 | yousseflagmouxch@gmail.com |
| 🌍 | Morocco |

### Connect With Me

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Lagmouchyoussef)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/yousseflagmouch)

---

<div align="center">

⭐ **Star this repository if you found it helpful!**

🚀 Happy Coding! Build Something Amazing! 🚀

</div>
