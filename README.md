# University Management API

RESTful API для управління університетом: студенти, викладачі, курси, зарахування, оплати, оцінки, GPA та фільтрація.

## Stack
Java 21, Spring Boot 3, Spring Web, Spring Data JPA, PostgreSQL, Flyway, Swagger/OpenAPI, JUnit.

## Run
```bash
docker compose up -d
mvn spring-boot:run
```

Swagger UI: `http://localhost:8080/swagger-ui.html`

## Main endpoints
- `GET/POST /api/students`
- `GET/PUT/DELETE /api/students/{id}`
- `GET /api/students?status=ACTIVE`
- `GET /api/students?year=2`
- `GET /api/students?search=name-or-email`
- `GET /api/students/unpaid`
- `GET /api/students/top?limit=5`
- `GET/POST /api/teachers`
- `GET/POST /api/courses`
- `GET /api/courses?teacherId=1`
- `GET /api/courses?credits=5`
- `GET/POST /api/enrollments`
- `PATCH /api/enrollments/{id}/payment`
- `PATCH /api/enrollments/{id}/grade`
- `GET /api/enrollments/average/course/{courseId}`
- `GET /api/enrollments/average/semester/{semester}`

## Tests
```bash
mvn test
```
