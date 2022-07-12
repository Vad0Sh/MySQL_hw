package homework1.task6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String url = "jdbc:mysql://localhost:3306/MyTestDB";
        String login = "root";
        String password = "root1User";

        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, login, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS AUTHOR (id MEDIUMINT NOT NULL AUTO_INCREMENT, name CHAR(30) NOT NULL, PRIMARY KEY (id))");
            statement.executeUpdate("INSERT INTO AUTHOR (NAME) VALUES ('Vitaliy')");
            statement.executeUpdate("INSERT INTO AUTHOR (NAME) VALUES ('Vasiliy')");
            statement.executeUpdate("INSERT INTO AUTHOR (NAME) VALUES ('Ievgeniy')");
        }
    }
}
