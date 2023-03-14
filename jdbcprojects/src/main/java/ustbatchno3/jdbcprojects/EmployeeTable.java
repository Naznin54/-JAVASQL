package ustbatchno3.jdbcprojects;

import java.sql.*;

public class EmployeeTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sonoo";
        String username = "root";
        String password = "pass@word1";
        
        try {
            // 1. Establishing the database connection
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // 2. Creating a SQL statement
            String sql = "INSERT INTO employ (id, name, age, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            
            // 3. Setting the values of the parameters
            statement.setInt(1, 101);
            statement.setString(2, "John Smith");
            statement.setInt(3, 30);
            statement.setDouble(4, 50000.0);
            
            // 4. Executing the SQL statement
            int rowsInserted = statement.executeUpdate();
            
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }
            
            // 5. Closing the database connection
            conn.close();
        } catch (SQLException ex9) {
            ex.printStackTrace();
        }
    }
}
