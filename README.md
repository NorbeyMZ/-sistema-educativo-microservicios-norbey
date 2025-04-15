# SpringMicroservicios

Proyecto de sistema educativo basado en microservicios desarrollado con Spring Boot y Spring Cloud. Permite la gestión de estudiantes, materias y matrículas.

## Microservicios

- `usuarios-servicio`: Gestión de usuarios (estudiantes y docentes segun el rol y proteccion con jwt y spring security)
- `microservicio-asignatura`: CRUD de materias
- `microservicio-estudiantes`: Registro de estudiantes en asignaturas
- `microservicio-config`: Centralización de configuración
- `microservicio-eureka`: Registro y descubrimiento de servicios
- `microservicio-gateway`: Enrutamiento

##Tecnologías

- Spring Boot 3.2.5
- Java 17
- Spring Cloud 2023.0.1
- MySQL / PostgreSQL
- Spring Security + JWT
- Maven

