package Exceptionhandling;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Empjdbc {	
	  public static void main(String[] args) {
	    // Set up database connection parameters
	    String url = "jdbc:mysql://localhost:3306/sona";
	    String username = "root";
	    String password = "pass@word1";

	    try {
	      // Create a connection to the database
	      Connection conn = DriverManager.getConnection(url, username, password);

	      // Create a statement object
	      Statement stmt = conn.createStatement();

	      
	      String sql = "CREATE TABLE details ("
	                 + "id INT NOT NULL,"
	                 + "name VARCHAR(255),"
	                 + "phone VARCHAR(20),"
	                 + "email VARCHAR(200),"
	                 + "address VARCHAR(255),"
	                 + "location VARCHAR(255),"
	                 + "salary  decimal(10,2),"
	                 + "PRIMARY KEY (id)"
	                 + ")";
	      
	      String sql1 = "INSERT INTO details(id,name,phone,email,address,location,salary) VALUES (?,?,?,?,?,?,?)";
	      PreparedStatement stmt1 = conn.prepareStatement(sql1);
	      stmt1.setInt(1, 1);// set first parameter value 
  	      stmt1.setString(2, "sona");// set second parameter value 
  	      stmt1.setString(3, "5674936501"); 
	      stmt1.setString(4, "naz@gmail.com");
	      stmt1.setString(5, "nishaf");
	      stmt1.setString(6, "TVM");
	      stmt1.setDouble(7, 40000.0);
	      
	      stmt1.executeUpdate(); // execute the statement
	      stmt1.executeUpdate(sql1);

	      // Close the statement and connection objects
	     
	      
	      conn.close();
	      
	      
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	


}


