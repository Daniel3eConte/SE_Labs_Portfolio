# Software Design & UML Modeling: Lab Exercises

## Project Overview
This repository contains the structural modeling and behavioral analysis for three different software systems: an **ATM**, a **Medical Clinic**, and a **Car Insurance** system. The project focuses on translating business requirements into formal UML representations, specifically **Use Case Diagrams** and **Class Diagrams**.

---

## 1. Automated Teller Machine (ATM) System
This system handles secure banking transactions.

### Functional Analysis (Use Case)
* **Primary Actor**: Customer [cite: 1].
* **Secondary Actor**: Bank Server (handles backend verification) [cite: 1].
* **Key Use Cases**: 
    - **Authenticate User**: A mandatory prerequisite (<<include>>) for all financial operations [cite: 1, 2].
    - **Withdraw Cash**: The main transactional flow [cite: 2].
    - **Check Balance**: Allows users to view account status [cite: 2].
* **Advanced Logic**: "Print Receipt" and "Signal Insufficient Funds" are modeled as **extensions** (<<extend>>) as they occur only under specific conditions [cite: 2].

### Structural Analysis (Class Diagram)
* **Entities**: `Bank`, `ATM`, `Customer`, `Account`, and `Transaction` [cite: 1, 2].
* **Key Relations**:
    - A `Bank` manages multiple `ATM` units and contains multiple `Accounts` [cite: 2].
    - An `Account` owns a history of `Transactions` [cite: 2].
    - The `ATM` is responsible for creating `Transaction` objects [cite: 2].

---

## 2. Medical Clinic System
A management system for healthcare providers and patient records.

### Structural Analysis (Class Diagram)
* **Hierarchies**: Uses an abstract `Person` class to define common traits for both `doctor` and `patient` [cite: 3].
* **Key Entities**: `Clinic`, `Appointment`, and `Medical_Record` [cite: 3, 4].
* **Logic**:
    - The `Clinic` employs multiple doctors [cite: 3].
    - A `patient` owns one or more `Medical_Records` [cite: 3].
    - `Appointments` serve as the link between doctors and patients [cite: 3, 4].
    - Doctors have the authority to read or update `Medical_Records` [cite: 4].

---

## 3. Car Insurance System
A system designed to manage policies and claims.

### Structural Analysis (Class Diagram)
* **Entities**: `Insurance_Company`, `Customer`, `Vehicle`, `Policy`, and `Claim` [cite: 5, 6].
* **Business Logic**:
    - A `Policy` acts as a linking entity between the `Customer` and the `Insurance_Company` [cite: 6].
    - Each `Policy` covers a specific `Vehicle` [cite: 6].
    - Customers can file multiple `Claims` [cite: 6].
    - The `Insurance_Company` evaluates the `Vehicle` to determine risk and policy terms [cite: 6].

---
