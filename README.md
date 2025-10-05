# JDBC MySQL Connection Example

This project demonstrates how to connect to a MySQL database using JDBC in Java.

## Prerequisites
- Java Development Kit (JDK)
- MySQL server running locally (default port 3306)
- MySQL Connector/J (JAR file added to your classpath)

## Setup
1. Clone this repository.
2. Add the MySQL Connector/J JAR to your project's classpath.
3. Update the database URL, username, and password in `Main.java` as needed.

## Example Code
The main logic is in `src/com/jdbc/Main.java`:
```java
String url = "jdbc:mysql://localhost:3306/student";
String user = "root";
String password = "Mysql@12";
Connection conn = DriverManager.getConnection(url, user, password);
```

## Running
Compile and run the `Main` class:
```
javac src/com/jdbc/Main.java
java -cp src;path/to/mysql-connector-java-9.4.0.jar com.jdbc.a1_Main
```

## Notes
- Ensure your MySQL server is running and the database `student` exists.
- Update credentials as needed.
- The `.gitignore` file excludes build artifacts and the connector JAR.

## License
This project is for educational purposes.
