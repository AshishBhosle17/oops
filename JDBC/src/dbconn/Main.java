package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/your_database_name",  // ✅ Correct JDBC URL
                    "user",                                            // ✅ Your DB username
                    "password"                                         // ✅ Your DB password
            );

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM your_table");

            // Process the result set
            while (rs.next()) {
                System.out.println("Column1: " + rs.getString("column_name")); // Replace with actual column name
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
