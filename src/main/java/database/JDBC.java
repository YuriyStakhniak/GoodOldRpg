package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static final String URL = "jdbc:postgresql://localhost/postgres";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "postgres";

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement =
                    connection.createStatement();
            statement.execute("CREATE TABLE hero(id INT PRIMARY KEY NOT NULL," +
                    "name TEXT NOT NULL, raceName TEXT NOT NULL, professionName " +
                    "TEXT NOT NULL, health DOUBLE PRECISION NOT NULL, " +
                    "manaPoint DOUBLE PRECISION NOT NULL, " +
                    "ragePoint DOUBLE PRECISION NOT NULL);");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
