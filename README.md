# University Management REST API

Фінальний проєкт: RESTful API системи управління університетом на Spring Boot 3.

## Стек
- Java 21
- Spring Boot 3
- Spring Web
- Spring Data JPA
- PostgreSQL
- Swagger / OpenAPI
- JUnit, Mockito, Spring Test

## Модулі
- Students CRUD
- Teachers CRUD
- Courses CRUD
- Enrollments CRUD
- Оплата курсів
- Виставлення оцінок
- GPA / average grade
- Фільтрація і пошук
- Глобальна обробка помилок
- DTO для API

## Запуск PostgreSQL
```bash
docker compose up -d
```

## Запуск застосунку
```bash
mvn spring-boot:run
```

Swagger UI:

```text
http://localhost:8080/swagger-ui.html
```

## Основні endpoints

### Students
- `POST /api/students`
- `GET /api/students`
- `GET /api/students/{id}`
- `PUT /api/students/{id}`
- `DELETE /api/students/{id}`
- `GET /api/students?status=ACTIVE`
- `GET /api/students?year=2`
- `GET /api/students?search=ivan`
- `GET /api/students/unpaid`
- `GET /api/students/top?limit=5`

### Teachers
- `POST /api/teachers`
- `GET /api/teachers`
- `GET /api/teachers/{id}`
- `PUT /api/teachers/{id}`
- `DELETE /api/teachers/{id}`

### Courses
- `POST /api/courses`
- `GET /api/courses`
- `GET /api/courses/{id}`
- `PUT /api/courses/{id}`
- `DELETE /api/courses/{id}`
- `GET /api/courses?teacherId=1`
- `GET /api/courses?credits=5`

### Enrollments
- `POST /api/enrollments`
- `GET /api/enrollments`
- `GET /api/enrollments/{id}`
- `PUT /api/enrollments/{id}`
- `PATCH /api/enrollments/{id}/payment`
- `PATCH /api/enrollments/{id}/grade`
- `GET /api/enrollments/average/course/{courseId}`
- `GET /api/enrollments/average/semester/{semester}`
- `DELETE /api/enrollments/{id}`

## Тести
```bash
mvn test
```
