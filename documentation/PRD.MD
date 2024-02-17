# HarbourEats PRD (Product Requirements Document)

## Introduction

HarbourEats is a food delivery company aiming to enhance courier engagement through the introduction of a new feature called Quests. This feature will allow administrators to create and manage quests for couriers, providing them with opportunities to earn rewards based on the number of delivered orders.

### Features

#### 1. Quest Management

- **Launch Quests by Admins:**
  - Admins should have the ability to create and launch quests through the administrative interface.

- **Flexible Duration:**
  - Quests should have flexible durations, allowing administrators to set specific timeframes for each quest.

- **Quest Tiers:**
  - Quests should consist of multiple tiers, with each tier having a defined goal (e.g., 10 orders, 20 orders) and corresponding rewards (e.g., 5 euros for 10 orders, 10 euros for 20 orders). 
  - Couriers can only claim rewards after reaching the goal for each tier.
  - Couriers can only be in one quest at a time.

#### 2. Courier Interface

- **View Ongoing Quest Details:**
  - Couriers should be able to view the details of ongoing quests, including quest name, duration, and tier information.

- **Track Progress:**
  - Couriers should be able to see their current tier and the number of orders remaining to reach the next tier. This information should be updated in real-time.

- **View Quest History:**
  - Couriers should have access to a history log displaying the quests they have participated in and their respective outcomes.

### Technical Details

#### 1. Technology Stack

- **Spring Boot:**
  - The backend microservice should be implemented using the Spring Boot framework.

- **Java or Kotlin:**
  - The programming language for development should be either Java or Kotlin.

- **RESTful API:**
  - Expose a RESTful API with JSON serialization for communication between microservices.

#### 2. Microservice Architecture

- **Service Communication:**
  - Utilize HTTP calls for communication between microservices in the HarbourEats microservices architecture.

#### 3. Data Storage

- **Database:**
  - PostgreSQL should be used as the primary database for storing quest and courier information.

### Non-Functional Requirements

- **Scalability:**
  - The Quests feature should be designed to handle a large number of concurrent users and quests.

- **Performance:**
- The feature should be optimized for performance, ensuring that quest details are updated in real-time and that the system can handle a high volume of requests.

- **Security:**
  - The feature should be designed with security best practices in mind, including proper authentication and authorization mechanisms.

## User Stories

### Admin User Stories

1. **As an admin, I want to be able to create and launch quests:**
   - *Acceptance Criteria:*
     - There should be a set of API endpoints for creating quests with fields for quest name, duration, and tier details.
     - I should be able to set flexible durations for quests.

2. **As an admin, I want to view a list of ongoing quests:**
   - *Acceptance Criteria:*
     - I should have an endpoint for displaying all active quests.
     - Each quest entry should show relevant details such as name, duration, and current progress.

3. **As an admin, I want to define quest tiers and associated rewards:**
   - *Acceptance Criteria:*
     - I should be able to set different tiers for each quest with specific order goals and corresponding rewards.
     - Rewards should be customizable and support different currencies.

### Courier User Stories

1. **As a courier, I want to see details of ongoing quests:**
   - *Acceptance Criteria:*
     - I should have a endpoint for displaying active quests.
     - Each quest entry should provide information on the quest name, duration, and current tier details.

2. **As a courier, I want to track my progress in real-time:**
   - *Acceptance Criteria:*
     - The courier should access and update the current tier and the number of orders left to reach the next tier.
     - Progress information should be accurate and reflect the courier's real-time performance.

3. **As a courier, I want to view my quest participation history:**
   - *Acceptance Criteria:*
     - There should be a dedicated section displaying the courier's participation history.
     - The history log should include details on quests participated in and their outcomes.

### General User Stories

1. **As a user, I want the system to prioritize data security:**
   - *Acceptance Criteria:*
     - User authentication and authorization should be robust and ensure only authorized access to quest and courier data.
     - Sensitive information, such as personal details and rewards, should be securely stored and encrypted.

## Performance Metrics
Ideally, the Quests feature should be designed to handle a large number of concurrent users and quests. The following performance metrics should be considered:
- **Response Time:**
  - The system should be optimized for low response times, ensuring that quest details are updated in real-time and that the system can handle a high volume of requests.

- **Scalability:**
- The feature should be designed to scale horizontally, allowing for the addition of more resources to handle increased load.

## Assumptions
Amount of users and couriers is assuming to reach in 1 year to the 0.1% of Barcelona which is 1.6M people, so 1.6K active users 1 courier for every 5 - 10 users, so 160 couriers and 3 quest per courier per day.

## Conclusion

HarbourEats aims to boost courier engagement and performance through the implementation of the Quests feature. This feature will not only provide a mechanism for rewarding couriers based on their delivery achievements but also enhance the overall experience for both couriers and administrators within the company's microservices architecture.
