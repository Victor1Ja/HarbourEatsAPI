# Request For Comment (RFC) - Quests System for HarbourEats

## Context and Scope

HarbourEats is a food delivery company aiming to enhance courier engagement by introducing the Quests feature. This feature allows administrators to create and manage quests for couriers, providing them with opportunities to earn rewards based on the number of delivered orders.

### Goals
- Enhance courier engagement and performance.
- Provide a mechanism for rewarding couriers based on their delivery achievements.
- Improve overall user experience for both couriers and administrators.

### Non-Goals
- Implementing advanced features beyond the core functionality of the Quests feature.
- Addressing all potential use cases and scenarios in the initial version.

## Design

### Quest Management
- Admins can create and launch quests through the administrative interface.
- Quests have flexible durations and multiple tiers with defined goals and rewards.

### Courier Interface
- Couriers can view ongoing quest details, track progress, and access quest participation history.
- Progress updates in real-time.

### Performance Metrics
- Low response times for quest updates.
- Horizontal scalability to handle increased load.

### Assumptions
- Targeting 0.1% of Barcelona's population within 1 year (1.6M people), translating to 1.6K active users.
- 1 courier for every 5-10 users, estimating 160 couriers.
- Assuming 3 quests per courier per day


### API

- ADMIN:
  - CRUD Quest All the endpoints for creating, reading, updating, and deleting quests.
  - CRUD Quest Tiers All the endpoints for creating, reading, updating, and deleting quest tiers.
  - View Quest Participation History  filter by courier, quest, date, and outcome.
- COURIER:
  - Track Quest Progress for Couriers.
  - View Quest Participation History  filter by quest, date, and outcome.
  - Claim Rewards
- SYSTEM:
  - Courier completed orders, update the courier quest progress.


### Data Model:
## Quests quests
- **id:** (Primary Key) Unique identifier for the quest.
- **name:** Name of the quest.
- **duration:** Duration of the quest.
- **created_by:** ID of the admin who created the quest.
- **created_at:** Timestamp indicating when the quest was created.

## Quest Tiers quest_tiers
- **id:** (Primary Key) Unique identifier for the quest tier.
- **quest_id:** (Foreign Key) ID of the quest to which this tier belongs.
- **tier_number:** Number representing the tier level.
- **order_goal:** Number of orders required to achieve this tier.
- **reward:** Reward associated with achieving this tier.

## Couriers couriers
- **id:** (Primary Key) Unique identifier for the courier.
- **name:** Name of the courier.
- **email:** Email address of the courier.
- **phone_number:** Phone number of the courier.
- **active:** Boolean indicating whether the courier is active or not.
- **created_at:** Timestamp indicating when the courier was registered.

## Courier Quest Progress courier_quest_progress
- **id:** (Primary Key) Unique identifier for the courier quest progress.
- **courier_id:** (Foreign Key) ID of the courier.
- **quest_id:** (Foreign Key) ID of the quest.
- **current_tier:** Number representing the current tier the courier is at.
- **orders_delivered:** Number of orders delivered by the courier for this quest.

## Quest Participation History quest_participation_history
- **id:** (Primary Key) Unique identifier for the quest participation history.
- **courier_id:** (Foreign Key) ID of the courier.
- **quest_id:** (Foreign Key) ID of the quest.
- **participation_date:** Date when the courier participated in the quest.
- **outcome:** Outcome of the quest participation (e.g., completed, not completed).
- **tier_reached:** Number representing the tier reached by the courier. if not completed, this field will be null. And if completed, this field will be the tier number.

### OpenAPI Specification

[OpenAPI Specification](openapi.yaml)

## Conclusion

The Quests feature is designed to enhance courier engagement and performance by providing a mechanism for rewarding couriers based on their delivery achievements. The feature includes quest management, courier interface, performance metrics, and API endpoints to support the core functionality. The data model outlines the necessary tables and relationships to store quest, courier, and participation data. The feature is expected to support the initial user base and scale horizontally to handle increased load.