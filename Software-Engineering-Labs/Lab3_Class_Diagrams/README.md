# Exercise 3: Structural Modeling - Class Diagrams

## Project Overview
In this exercise, I developed the static structure for three different software domains: an **ATM**, a **Medical Clinic**, and a **Car Insurance** system. The focus is on defining classes, attributes, methods, and their relationships.

## Modeled Systems
1. **ATM System**: Focuses on the relationship between the `Bank`, `ATM` hardware, `Account`, and `Transaction` history.
2. **Medical Clinic**: Utilizes an abstract `Person` class to manage inheritance for `doctor` and `patient`. It covers `Appointments` and `Medical_Records` management.
3. **Car Insurance**: Models the interaction between the `Insurance_Company`, `Customer`, and `Vehicle` through a `Policy` association class, including `Claim` management.

## UML Concepts Applied
- **Generalization**: Used in the Clinic system (Doctor/Patient inheriting from Person).
- **Composition & Aggregation**: Used to define object life-cycles (e.g., an Account "contains" Transactions).
- **Associations**: Defining how different entities interact (e.g., a Customer "owns" a Vehicle).

## How to View
Each `.puml` file (ATM, Clinic, Insurance) contains the source code. Use a PlantUML viewer or [PlantText.com](https://www.planttext.com) to visualize the architecture.
