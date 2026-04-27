# campUStrade - Development Repository 

This repository contains the initial prototype of **campUStrade**, a circular economy platform for university students to exchange services. The project is currently a **work-in-progress**, developed strictly following the **Test-Driven Development (TDD)** methodology.

##  Project Status
The software currently focuses on core business logic: user authentication and the creation of activities. It is not a finished product but a robust engine where every implemented feature is guaranteed by a comprehensive suite of unit tests.

##  Methodology: Ping-Pong TDD
We adopted the **Ping-Pong Pair Programming** approach as per the Lab requirements:
1. **Student A (RED):** Writes a failing test in `StudentTest.java`.
2. **Student B (GREEN):** Writes the minimal code in the main classes to make the test pass.
3. **Student B (REFACTOR):** Cleans the code, then writes the next failing test.
4. **Student A (GREEN):** Makes it pass, and the cycle continues.

### Features Verified by Tests:
According to our `StudentTest` suite, the system currently handles:
- **Secure Authentication:** The `checkPassword` method correctly validates credentials, handling edge cases like wrong passwords, empty strings, and **Case Sensitivity**.
- **Activity Creation:** A student can generate an `Activity` by providing a name, price, description, and an existing `Category`.
- **Data Integrity:** When an activity is created, the system automatically synchronizes lists, ensuring the activity is stored in both the `Student`'s personal list and the `Category`'s global list.

##  Current Architecture
The project structure is organized to support automated testing:
- **Logic (`src/main/java/org/example/`):**
    - `Student`: Handles credit balance, profile data, and acts as a factory for activities.
    - `Activity`: Data holder for the service being offered.
    - `Category`: Logical aggregator for different types of activities.
- **Tests (`src/test/java/org/example/`):**
    - `StudentTest`: The source of truth for the system's behavior using **JUnit 5**.


##  Developers
- **Daniele Conte**
- **Kalliopi Kydonaki**

---
*Developed for the Software Engineering Lab - Lodz University of Technology (IFE).*
