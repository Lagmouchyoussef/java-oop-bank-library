# 🏦 Java OOP: Bank & Library Management System

<p align="left">
  <img src="https://img.shields.io/badge/Java-17%2B-blue" alt="Java">
  <img src="https://img.shields.io/badge/License-MIT-green" alt="License">
  <img src="https://img.shields.io/github/stars/Lagmouchyoussef/java-oop-bank-library" alt="Stars">
  <img src="https://img.shields.io/github/forks/Lagmouchyoussef/java-oop-bank-library" alt="Forks">
</p>

---

## 📋 Table of Contents

| Section | Description |
|---------|-------------|
| [1. Overview](#1-overview) | Project introduction |
| [2. Objectives](#2-objectives) | Learning goals |
| [3. Prerequisites](#3-prerequisites) | System requirements |
| [4. Structure](#4-structure) | File organization |
| [5. Methodology](#5-methodology) | Learning approach |
| [6. Bank System](#6-bank-system) | Banking application details |
| [7. Library System](#7-library-system) | Library application details |
| [8. Running Code](#8-running-code) | Execution guide |
| [9. Features](#9-features) | Key features |
| [10. FAQ](#10-faq) | Help section |
| [11. License](#11-license) | License info |

---

## 1. Overview

This Java project demonstrates **Object-Oriented Programming (OOP)** concepts through two practical management systems:

- 🏦 **Bank Management System**: Account management with deposits, withdrawals, and transfers
- 📚 **Library Management System**: Book and borrower management with borrowing/returning functionality

---

## 2. Objectives

| Skill Level | Topic | Focus |
|-------------|-------|-------|
| ⭐ Beginner | Encapsulation | Data protection, private attributes |
| ⭐⭐ Intermediate | Class Design | Object creation, constructors |
| ⭐⭐ Intermediate | Arrays | Managing collections of objects |
| ⭐⭐⭐ Advanced | CRUD Operations | Create, Read, Update, Delete |

---

## 3. Prerequisites

| Component | Minimum | Recommended |
|-----------|---------|-------------|
| Java | 17+ | 17+ |
| RAM | 4 GB | 8 GB |
| Disk | 100 MB | 500 MB |
| OS | Win/Mac/Linux | Win 11/Mac/Ubuntu |

### Installation Guide

**Windows:**
```bash
# Download Java from https://www.oracle.com/java/technologies/downloads/
# Verify installation
java --version
```

**macOS:**
```bash
# Using Homebrew
brew install openjdk@17

# Verify
java --version
```

**Linux (Ubuntu/Debian):**
```bash
sudo apt update && sudo apt install openjdk-17-jdk
java --version
```

---

## 4. Structure

```
📦 java-oop-bank-library
├── 📂 src
│   ├── 📂 bank
│   │   ├── Bank.java          # Bank management class
│   │   ├── BankAccount.java   # Bank account class
│   │   └── Main.java          # Bank demo
│   │
│   └── 📂 library
│       ├── Book.java          # Book class
│       ├── Borrower.java      # Borrower class
│       ├── Library.java       # Library management class
│       └── Main.java          # Library demo
│
├── README.md
└── LICENSE
```

---

## 5. Methodology

### Learning Strategy

1. **Understand the Problem** - Read requirements carefully
2. **Design Classes** - Identify attributes and methods
3. **Implement Code** - Write Java classes
4. **Test & Debug** - Run and fix errors
5. **Refactor** - Improve code quality

---

## 6. Bank System

### Class: BankAccount

| Attribute | Type | Description |
|-----------|------|-------------|
| accountId | int | Unique account identifier |
| holderName | String | Account holder name |
| balance | double | Available balance |

**Methods:**
- `deposit(double amount)` - Add money
- `withdraw(double amount)` - Remove money (if sufficient balance)
- `displayDetails()` - Show account info
- Getters and Setters

### Class: Bank

| Attribute | Type | Description |
|-----------|------|-------------|
| accounts | BankAccount[] | Array of accounts |

**Methods:**
- `addAccount(BankAccount)` - Add new account
- `findAccountByNumber(int id)` - Search account
- `displayAllAccounts()` - Show all accounts

### Example Output

```
🏦 Bank Account Created
Account ID: 1001
Holder: John Doe
Balance: 5000.0 MAD

💰 Deposit of 2000 MAD completed
💰 Withdrawal of 1000 MAD completed
📊 Current Balance: 6000.0 MAD
```

---

## 7. Library System

### Class: Book

| Attribute | Type | Description |
|-----------|------|-------------|
| title | String | Book title |
| author | String | Book author |
| yearPublication | int | Publication year |
| available | boolean | Availability status |

**Methods:**
- `displayInfo()` - Show book details
- `borrowBook()` - Mark as borrowed
- `returnBook()` - Mark as available

### Class: Borrower

| Attribute | Type | Description |
|-----------|------|-------------|
| name | String | Last name |
| firstName | String | First name |
| borrowerId | int | Unique ID |

**Methods:**
- `borrowBook(Book)` - Borrow a book
- `returnBook(Book)` - Return a book

### Class: Library

| Attribute | Type | Description |
|-----------|------|-------------|
| books | Book[] | Array of books |
| borrowers | Borrower[] | Array of borrowers |

**Methods:**
- `addBook(Book)` - Add book
- `addBorrower(Borrower)` - Add borrower
- `displayBooks()` - Show all books
- `displayBorrowers()` - Show all borrowers

### Example Output

```
📚 Book Added: The Great Gatsby by F. Scott Fitzgerald (1925)
👤 Borrower Added: Ahmed Benali (ID: 1)
📖 Book Borrowed: The Great Gatsby
✅ Book is now available: false
```

---

## 8. Running Code

```bash
# Navigate to project
cd java-oop-bank-library

# Compile the project
javac -d out src/bank/*.java src/library/*.java

# Run Bank System
java -cp out bank.Main

# Run Library System
java -cp out library.Main
```

---

## 9. Features

### Bank Management

| Feature | Status |
|---------|--------|
| Create bank accounts | ✅ |
| Deposit money | ✅ |
| Withdraw money | ✅ |
| Search by account ID | ✅ |
| Display all accounts | ✅ |

### Library Management

| Feature | Status |
|---------|--------|
| Add books | ✅ |
| Add borrowers | ✅ |
| Borrow books | ✅ |
| Return books | ✅ |
| Display information | ✅ |

---

## 10. FAQ

**Q: What is this project about?**
A: A Java OOP project demonstrating classes, objects, encapsulation, and CRUD operations.

**Q: What Java version is required?**
A: Java 17 or higher.

**Q: Can I modify this code?**
A: Yes, licensed under MIT.

**Q: How do I run individual modules?**
A: Use `java -cp out bank.Main` or `java -cp out library.Main`

---

## 11. License

MIT License

Copyright (c) 2026 Youssef Lagmouch

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

---

<div align="center">

⭐ **Star this repository if you found it helpful!**

🚀 Happy Coding! Build Something Amazing! 🚀

</div>
