package DBMSlabs; 

import java.sql.Connection; // Import the Connection class for managing database connections
import java.sql.DriverManager; // Import the DriverManager class for obtaining database connections
import java.sql.PreparedStatement; // Import the PreparedStatement class for executing parameterized SQL queries
import java.sql.SQLException; // Import the SQLException class for handling SQL-related exceptions

public class InsertRecords { // Main class definition

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/anudipjava"; // URL for connecting to the MySQL database
    private static final String DB_USER = "root"; // Database username
    private static final String DB_PASSWORD = "AnishDB24"; // Database password
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver"; // Database Driver
    
    public static void main(String[] args) throws ClassNotFoundException { // Main method
        // Loading the database driver
        Class.forName(DB_Driver);
        try {
            // Establishing a connection to the database
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // Constructing the SQL insert statement for the Department table
            String departmentsql = "INSERT INTO Department VALUES (?, ?, ?, ?)";
            PreparedStatement departmentstmt = con.prepareStatement(departmentsql); // Creating a PreparedStatement for the Department table
            
            // Insert 10 records into the Department table
            for (int i = 1; i <= 10; i++) {
                departmentstmt.setInt(1, i); // Setting the Department_ID parameter
                departmentstmt.setString(2, "IT" + i); // Setting the Department_Name parameter
                departmentstmt.setString(3, "Michle jackson" + i); // Setting the Department_Head parameter
                departmentstmt.setString(4, "It's good IT professional." + i); // Setting the Department_Description parameter
                departmentstmt.executeUpdate(); // Executing the insert statement
            }
            
            // Constructing the SQL insert statement for the Employee table
            String employeeSQL = "INSERT INTO Employee VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement employeestmt = con.prepareStatement(employeeSQL); // Creating a PreparedStatement for the Employee table
            
            // Insert 10 records into the Employee table
            for (int i = 1; i <= 10; i++) {
                employeestmt.setInt(1, i); // Setting the Employee_Id parameter
                employeestmt.setString(2, "Anish" + i); // Setting the Employee_Name parameter
                employeestmt.setString(3, "Goregaon" + i); // Setting the Employee_Address parameter
                employeestmt.setBigDecimal(4, new java.math.BigDecimal("1000.00")); // Setting the Employee_Salary parameter
                employeestmt.setLong(5, 8828346512L + i); // Setting the Employee_Contact_No parameter
                employeestmt.setInt(6, i); // Setting the Department_Id parameter
                employeestmt.executeUpdate(); // Executing the insert statement
            }
            
            // Closing the PreparedStatement and Connection objects
            departmentstmt.close(); // Closing the PreparedStatement for the Department table
            employeestmt.close(); // Closing the PreparedStatement for the Employee table
            con.close(); // Closing the database connection
            
            System.out.println("Record Inserted Successfully....."); // Printing a success message
            
        } catch (SQLException se) { // Catching and handling SQL exceptions
            se.printStackTrace(); // Printing the stack trace of the exception for debugging purposes
        }
    }
}
