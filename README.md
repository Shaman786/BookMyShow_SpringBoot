# BookMyShow

BookMyShow is a movie ticket booking application built using Spring Boot, Hibernate, and JPA. This project demonstrates a complete end-to-end implementation of a booking system, including user registration, movie and show management, seat booking, and payment processing.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features

- User Registration and Authentication
- Movie and Show Management
- Seat Booking and Availability Check
- Payment Processing
- Booking Management

## Technologies Used

- Java 17
- Spring Boot 3.3.1
- Hibernate ORM 6.5.2.Final
- Spring Data JPA
- MySQL Database
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- MySQL Database

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/Shaman786/BookMyShow_SpringBoot
    cd BookMyShow
    ```

2. Configure the database:
    - Create a MySQL database named `bookmyshow`.
    - Update the database configuration in `src/main/resources/application.properties`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/bookmyshow
      spring.datasource.username=yourusername
      spring.datasource.password=yourpassword
      ```

3. Build the project:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Project Structure

```plaintext
src
├── main
│   ├── java
│   │   └── com
│   │       └── learning
│   │           └── bookmyshow
│   │               ├── controllers
│   │               ├── dtos
│   │               ├── models
│   │               ├── repositories
│   │               ├── services
│   │               └── BookMyShowApplication.java
│   └── resources
│       ├── application.properties
│       └── static
└── test
    └── java
        └── com
            └── learning
                └── bookmyshow
