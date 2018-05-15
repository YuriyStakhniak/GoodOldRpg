package database;


import java.sql.*;

public class JDBC {

    public static final String URL = "jdbc:postgresql://localhost/postgres";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "postgres";

    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Statement statement =
                null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.execute("CREATE TABLE hero(id INT PRIMARY KEY NOT NULL," +
                    "name TEXT NOT NULL, raceName TEXT NOT NULL, professionName " +
                    "TEXT NOT NULL, health DOUBLE PRECISION NOT NULL, " +
                    "manaPoint DOUBLE PRECISION NOT NULL, " +
                    "ragePoint DOUBLE PRECISION NOT NULL);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
