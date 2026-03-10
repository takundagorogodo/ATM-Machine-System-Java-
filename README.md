# 🏧 ATM Machine System (Java)

A simple **ATM Machine Simulation** built using **Java (OOP concepts)**.
The program allows a user to log in using an ATM number and PIN, then perform common banking operations such as **checking balance, withdrawing money, depositing money, and viewing a mini statement**.

This project demonstrates **Java fundamentals, interfaces, classes, exception handling, and collections**.

---

# 🚀 Features

* 🔐 ATM number and PIN authentication
* 🔁 Maximum **3 login attempts**
* 💰 View account balance
* 💸 Withdraw money
* 💵 Deposit money
* 🧾 View mini statement (transaction history)
* ❌ Input validation using **Exception Handling**
* 📋 Menu-driven console interface

---

# 🛠️ Technologies Used

* Java
* OOP Concepts
* Interfaces
* ArrayList (Collections)
* Exception Handling
* Scanner (User Input)

---

# 📂 Project Structure

```
ATM-System/
│
├── MainClass.java
├── AtmOperationsInterface.java
├── AtmOperationImpl.java
└── ATM.java
```

### File Description

**MainClass.java**

* Handles program execution
* Manages user authentication
* Displays ATM menu

**AtmOperationsInterface.java**

* Defines ATM operations

```
viewBalance()
withdrawAmount()
depositAmount()
viewMiniStatement()
```

**AtmOperationImpl.java**

* Implements ATM operations
* Stores transaction history
* Updates account balance

**ATM.java**

* Stores account data
* Uses getter and setter methods

---

# ⚙️ How the Program Works

### 1️⃣ User Login

The user must enter:

* ATM Number
* 4-digit PIN

Example:

```
Enter ATM Number:
1234

Enter Pin:
1234
```

If incorrect, the user gets **3 attempts**.

---

### 2️⃣ ATM Menu

After successful login, the menu appears:

```
1. View Balance
2. Withdraw Amount
3. Deposit Amount
4. View MiniStatement
5. Exit
```

---

### 3️⃣ Withdraw Money

Conditions:

* Amount must be a **multiple of 100**
* Must not exceed account balance

Example:

```
Enter Amount to Withdraw:
500
Collect the Cash 500
Available balance is: 4500
```

---

### 4️⃣ Deposit Money

User can deposit any amount.

Example:

```
Enter Amount to Deposit:
1000
1000 Deposited Successfully !!
Available balance is: 6000
```

---

### 5️⃣ Mini Statement

Displays transaction history.

Example:

```
Withdrawn: 500
Deposited: 1000
Withdrawn: 200
```

---

# ▶️ How to Run the Project

### Step 1 — Compile

```
javac *.java
```

### Step 2 — Run

```
java MainClass
```

---

# 🧪 Sample Output

```
Enter ATM Number:
1234

Enter Pin:
1234

Validation Done

1. View Balance
2. Withdraw Amount
3. Deposit Amount
4. View MiniStatement
5. Exit

Enter choice:
1

Available balance is :5000
```

---

# 📚 Concepts Practiced

This project demonstrates:

* Java Classes and Objects
* Interfaces
* Encapsulation (Getter / Setter)
* Exception Handling
* Collections (ArrayList)
* Menu Driven Programs
* Console Applications

---

# 📌 Future Improvements

Possible upgrades:

* Multiple user accounts
* File or database storage
* GUI interface (Java Swing / JavaFX)
* ATM card validation
* Transaction timestamps
* PIN encryption

---

# 👨‍💻 Author

Takundah Gorogodo

Computer Science Student | Java Developer

---

# 📄 License

This project is created for **learning and educational purposes**.
