# Coupon Service

A Spring Boot microservice for managing coupons.
Built using Spring Boot, JPA, MySQL, and Maven.

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## 📂 Project Structure
couponservice
├── src/main/java
├── src/main/resources
├── pom.xml
└── README.md

## How to Run Locally
mvn clean spring-boot:run

## API Endpoints
Create Coupon:
1. POST /coupons
{
  "code": "DISC10",
  "discount": 10,
  "expDate" : "dd/mm/yyyy"
}
2.Get Coupon by Code
GET /coupons/{code}
Example:
GET /coupons/DISC10


