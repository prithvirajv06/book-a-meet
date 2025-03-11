# Book-A-Meet Application

## Overview
**Book-A-Meet** is a microservices-based meeting scheduling application built using **Spring Boot**, **Eureka**, and **Kafka**. This system allows users to schedule, manage, and join meetings efficiently in a distributed architecture.

## Architecture
The application follows a **microservices architecture** with the following key components:

1. **Eureka Server** - Service discovery for managing microservices.
2. **Meeting Service** - Handles meeting creation, updates, and deletions.
3. **User Service** - Manages user authentication and profiles.
4. **Notification Service** - Sends notifications using Kafka.
5. **Kafka Broker** - Facilitates event-driven communication between services.

## Tech Stack
- **Spring Boot** (Microservices framework)
- **Spring Cloud Eureka** (Service discovery)
- **Apache Kafka** (Event streaming)
- **Spring Boot Kafka** (Integration with Kafka)
- **Spring Data JPA** (Database persistence)
- **Docker** (Containerization)

## Features
- User authentication and role management
- Meeting scheduling and notifications
- Real-time updates using Kafka
- Microservices scalability using Eureka

## Setup Instructions
### Prerequisites
Ensure you have the following installed:
- Java 17+
- Maven
- Docker
- Apache Kafka

### Running the Application
1. **Clone the repository**
   ```sh
   git clone https://github.com/prithvirajv06/book-a-meet.git
   cd book-a-meet
   ```

2. **Start Eureka Server**
   ```sh
   cd eureka-server
   mvn spring-boot:run
   ```

3. **Start Kafka** (Using Docker Compose) TODO
   ```sh
   docker-compose up -d kafka zookeeper
   ```

4. **Start Microservices**
   ```sh
   cd meeting-service
   mvn spring-boot:run

   cd ../user-service
   mvn spring-boot:run
   ```

5. **Start Notification Service**
   ```sh
   cd notification-service
   mvn spring-boot:run
   ```

## API Endpoints
TODO

### Notification Service (Kafka-Driven)
- Listens to Kafka events and sends notifications

## Contributing
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License.

---
For any issues or feature requests, please open an issue in the repository.

