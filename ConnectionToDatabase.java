package Cpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDatabase {

    private static Connection con;
    public static Connection getConnection()
    {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/traindb","root","Hanuman@123");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
