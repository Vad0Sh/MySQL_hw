package homework1.task5;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        String url = "jdbc:mysql://localhost:3306/MyJoinsDB";
        String login = "root";
        String password = "root1User";

        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, login, password);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(" SELECT Workers.WorkerID, Workers.Name, Workers.Phone, " +
                    " Personals.Address  FROM Workers JOIN Personals ON Workers.WorkerID = Personals.WorkerID;");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("WorkerID"));
                System.out.println(resultSet.getString("Name"));
                System.out.println(resultSet.getString("Phone"));
                System.out.println(resultSet.getString("Address"));
                System.out.println("++++++++++++++++++++++++++++++");
            }
            ResultSet resultSet1 = statement.executeQuery("SELECT Workers.WorkerID, Workers.Name, Workers.Phone," +
                    " Personals.BirthDate FROM Workers JOIN Personals ON Workers.WorkerID = Personals.WorkerID " +
                    " WHERE Personals.MaritalStatus = 'Не одружений';");
            while (resultSet1.next()) {
                System.out.println(resultSet1.getInt("WorkerID"));
                System.out.println(resultSet1.getString("Name"));
                System.out.println(resultSet1.getString("Phone"));
                System.out.println(resultSet1.getString("BirthDate"));
                System.out.println("==========================");
            }
            ResultSet resultSet2 = statement.executeQuery("SELECT Workers.WorkerID, Workers.Name, Workers.Phone, " +
                    "Personals.BirthDate FROM Workers JOIN Positions ON Workers.WorkerID = Positions.WorkerID " +
                    "JOIN Personals ON Workers.WorkerID = Personals.WorkerID WHERE Positions.Position = 'Менеджер';");
            while (resultSet2.next()) {
                System.out.println(resultSet2.getInt("WorkerID"));
                System.out.println(resultSet2.getString("Name"));
                System.out.println(resultSet2.getString("Phone"));
                System.out.println(resultSet2.getString("BirthDate"));
                System.out.println("-----------------------");
            }

        }
    }
}
