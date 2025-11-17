# 📐 REST API - Operações Matemáticas

Este projeto é uma **REST API** desenvolvida em **Java 17** com **Spring Boot 3.2.3**.  
A API fornece operações matemáticas básicas via endpoints HTTP e possui documentação interativa via **Swagger UI**.

---

## Tecnologias utilizadas:
- Java 17
- Spring Boot 3.2.3
- Maven
- SLF4J + Logback (para logs)
- JUnit 5 + Spring Boot Test (para testes)
- Springdoc OpenAPI (Swagger UI)

---

## ⚙️ Como executar:

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/api-gateway.git
   ```
2. Entre na pasta do projeto:
   ```bash
  cd api-gateway
   ```
3. Compile e rode:
   ```bash
  mvn clean install
  mvn spring-boot:run
  ```
4. A aplicação estará disponível em:
   ```bash
  http://localhost:8080
  ```
## Endpoints disponíveis

| Operação       | Método | Endpoint                       | Exemplo de uso     | Resultado |
|----------------|--------|--------------------------------|---------------------|-----------|
| Soma           | GET    | `/sum/{numberOne}/{numberTwo}` | `/sum/10/5`         | `15.0`    |
| Subtração      | GET    | `/sub/{numberOne}/{numberTwo}` | `/sub/10/5`         | `5.0`     |
| Multiplicação  | GET    | `/mult/{numberOne}/{numberTwo}`| `/mult/10/5`        | `50.0`    |
| Divisão        | GET    | `/div/{numberOne}/{numberTwo}` | `/div/10/5`         | `2.0`     |
| Média          | GET    | `/mean/{numberOne}/{numberTwo}`| `/mean/10/5`        | `7.5`     |
| Quadrado       | GET    | `/square/{number}`             | `/square/4`         | `16.0`    |


## Documentação Swagger
http://localhost:8080/swagger-ui/index.html


   


   
