package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) {
		
		
	
	    
	    try {
	    	// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish the connection
			Connection conn = DriverManager.getConnection("com.mysql.cj.jdbc.Driver", "user", "password");

			// creating a statement
			Statement stmt = conn.createStatement();
					
					
			// Execute a query
		    ResultSet rs = stmt.executeQuery("SELECT * FROM your_table");

            // Process the result set
            while (rs.next()) {
                System.out.println("Column1: " + rs.getString("column_name"));
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
