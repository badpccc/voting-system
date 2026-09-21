This project aims to create a voting system using Java, Spring Boot, and MySQL. It allows users to register voters and candidates and manage voting information through a simple and organized system.

## How to Run

1. Clone this repository.
2. Open the project in your preferred Java IDE.
3. Make sure Java and MySQL are installed.
4. Create a MySQL database named `voting_system`.
5. Open `src/main/resources/application.properties`.
6. Update the database username and password with your own credentials:

```properties
spring.datasource.username=YOUR_DB_USER
spring.datasource.password=YOUR_DB_PASSWORD
```

7. Start the application by running `VotingSystemApplication.java`.

The application will start on:

```text
http://localhost:8080
```
