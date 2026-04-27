# ATM System - Use Case Analysis & Modeling

## Project Overview
This project focuses on the requirements analysis and functional modeling of a **Simplified ATM (Automated Teller Machine) System**. The goal was to identify how different users (actors) interact with the system and define the boundaries and dependencies of the system's core functionalities.

## Work Performed

### 1. System Selection & Boundary Definition
I chose an **ATM System** due to its clear distinction between user-facing operations and backend verifications. I defined the **System Boundary** to include all logic handled by the physical terminal, separating it from the human user and the remote banking infrastructure.

### 2. Actor Identification
I identified two distinct types of actors:
* **Primary Actor (The Customer):** The user who triggers the system to achieve a specific goal (checking balance or withdrawing money).
* **Secondary Actor (The Bank Server):** An external system required by the ATM to validate data and authorize financial transactions.

### 3. Use Case Development & Logic
I mapped out 5 key use cases, focusing on the logical flow of a typical session:
* **Mandatory Dependencies (`<<include>>`):** I implemented an "Authentication" use case. Since security is paramount, both *Check Balance* and *Withdraw Cash* were designed to strictly **include** this step; the system cannot perform these actions without prior verification.
* **Optional/Conditional Flows (`<<extend>>`):** I identified "Print Receipt" as an optional extension, as it only occurs upon user request. I also modeled "Signal Insufficient Funds" as an extension that only triggers if the withdrawal logic detects a balance error.
