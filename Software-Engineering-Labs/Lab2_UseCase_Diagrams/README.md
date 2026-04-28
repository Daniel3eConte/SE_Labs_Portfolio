# Exercise 2: ATM System - Use Case Analysis

## Project Overview
This exercise focuses on identifying the functional requirements of an **ATM (Automated Teller Machine) System** using a Use Case Diagram. The goal is to define the system boundaries and how different actors interact with it.

## Analysis Details
- **Primary Actor**: The **Customer**, who initiates transactions to achieve specific goals.
- **Secondary Actor**: The **Bank Server**, an external entity required for data validation and transaction processing.

## Key Use Cases
- **Authenticate User**: A mandatory security step.
- **Check Balance**: Allows the user to view their account status.
- **Withdraw Cash**: The core functionality of the system.

## Relationships
- **<<include>>**: Both *Check Balance* and *Withdraw Cash* include the *Authenticate User* use case, as security verification is required for all operations.
- **<<extend>>**: *Print Receipt* and *Signal Insufficient Funds* are modeled as extensions of the withdrawal process, as they occur only under specific conditions or user choice.

## How to View
The diagram is modeled using **PlantUML**. You can render the `.puml` file by pasting its content into [PlantText.com](https://www.planttext.com).
