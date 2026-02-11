# Explore With Me Plus — Event Management & Stats (Multi‑Module)

*Developed as a team-based learning project focused on REST API design,
persistence, and service-to-service integration.*

**Explore With Me Plus** is a backend system for an event discovery platform.
It provides role-based REST APIs that allow users to create, browse, search, and comment on events,
manage participation requests, and enables administrators to moderate users and content.
The system integrates a dedicated statistics service to collect endpoint hits
and provide aggregated view data for analytics and popularity-based features.


Links to the original group project and its copy in my repository:

https://github.com/Maxim2777/java-explore-with-me-plus

https://github.com/griatva/groupProject_java-explore-with-me-plus

Project contributors:
- https://github.com/Maxim2777
- https://github.com/Akmula
- https://github.com/griatva (me)
- https://github.com/ChakNikolay87

**Explore With Me (EWM)** is a multi-module backend consisting of:
- **Main Service** — event management platform (events, categories, compilations, participation requests, comments).
- **Stats Service** — collects endpoint hits and provides aggregated view statistics.

> **Java 21 · Spring Boot · Spring Data JPA · QueryDSL · PostgreSQL · Validation · Maven · Docker Compose**

---

## Highlights
- **Two-service architecture:** main REST API + dedicated statistics service.
- **Clean layering:** controller → service → repository with DTOs and mappers.
- **Persistence:** PostgreSQL schemas initialized via `schema.sql` (per service).
- **Advanced querying:** QueryDSL for building dynamic filters/searches.
- **Observability-ready:** Spring Boot Actuator included.

---

## Skills Practiced
- Designing **REST APIs** with clear separation of **public / private / admin** endpoints.
- Modeling relational data and maintaining integrity with **foreign keys**.
- Implementing service integration via a dedicated **stats client** module.
- Building dynamic queries (filters, search) with **QueryDSL**.
- Containerized local environment using **Docker Compose**.

---

## My Contributions

- Extracted incoming request parameters in `UserController` into dedicated classes
- Refactored categories and request/user logic for correctness and consistency
- Standardized all messages to English and removed unnecessary comments
- Added application logs and unified exception messages
- Integrated teammate changes into `StatsRepository`
- Cleaned up and improved the overall codebase for readability and maintainability

---

## Tech Stack
- **Language:** Java 21
- **Frameworks:** Spring Boot (Web, Validation, Actuator), Spring Data JPA
- **Database:** PostgreSQL (DDL in `schema.sql`)
- **Query:** QueryDSL
- **Build/Tools:** Maven (multi-module), Lombok, Checkstyle

---
## API & Database
- API details are provided via OpenAPI specifications (JSON):
  - ewm-main-service-spec.json 
  - ewm-stats-service-spec.json
- Database schemas are defined in `schema.sql` for each service.
---

## Project Structure

```text
java-explore-with-me-plus/
├── pom.xml                                  # Parent Maven POM (multi-module)
├── README.md                                # Project documentation
├── docker-compose.yml                       # Local run (services & databases)
├── ewm-main-service-spec.json               # OpenAPI spec (main service)
├── ewm-stats-service-spec.json              # OpenAPI spec (stats service)
├── checkstyle.xml                           # Code style rules
├── suppressions.xml                         # Checkstyle suppressions
├── lombok.config                            # Lombok configuration
├── postman/                                 # Postman collections
│
├── main-service/                            # Main application service
│   ├── pom.xml                              # Module POM
│   ├── Dockerfile                           # Container image
│   └── src/                                 # Application sources
│       └── main/                            # Production code
│          ├── java/                         # Java packages (controllers, services, JPA, etc.)
│          └── resources/                    # Configuration & DB schema
│       
│
└── stat/                                    # Statistics subsystem
    ├── pom.xml                              # Parent POM (stats)
    ├── stat-dto/                            # Shared statistics DTOs
    ├── stat-client/                         # HTTP client for stats service
    └── stat-server/                         # Statistics REST service
```
---

## How to Run Locally
```bash
mvn clean package
docker-compose up
```
---

## About
This repository demonstrates hands-on practice with **Spring Boot**, **JPA**, **QueryDSL**, 
and a simple **two-service architecture** (main API + stats service), including database design and containerized local setup.
