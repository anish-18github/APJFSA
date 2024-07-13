package DBMSlabs; 

import java.sql.Connection; // Import the Connection class for managing database connections
import java.sql.DriverManager; // Import the DriverManager class for obtaining database connections
import java.sql.ResultSet; // Import the ResultSet class for holding data retrieved from a database query
import java.sql.SQLException; // Import the SQLException class for handling SQL-related exceptions
import java.sql.Statement; // Import the Statement class for executing SQL statements

public class FetchData { // Main class definition

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/anudipjava"; // URL for connecting to the MySQL database
    private static final String DB_USER = "root"; // Database username
    private static final String DB_PASS = "AnishDB24"; // Database password
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver"; // Database driver

    public static void main(String[] args) throws ClassNotFoundException { // Main method
        // Loading the database driver
        Class.forName(DB_Driver);
        Connection con = null; // Declare Connection object
        Statement st = null; // Declare Statement object

        try {
            // Establishing a connection to the database
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            // Creating a Statement object for executing SQL queries
            st = con.createStatement();

            System.out.println("Fetching data.....\n"); // Informing the user that data fetching has started

            // SQL query for selecting all records from the Employee table
            String sql = "SELECT * FROM Employee";

            // Executing the SQL query and storing the result in a ResultSet object
            ResultSet rs = st.executeQuery(sql);

            // Iterating over the ResultSet to fetch and print each record
            while (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("Employee_ID")); // Printing Employee_ID
                System.out.println("Employee Name: " + rs.getString("Employee_Name")); // Printing Employee_Name
                System.out.println("Employee Address: " + rs.getString("Employee_Address")); // Printing Employee_Address
                System.out.println("Employee Salary: " + rs.getBigDecimal("Employee_Salary")); // Printing Employee_Salary
                System.out.println("Employee Contact Number: " + rs.getLong("Employee_Contact_No")); // Printing Employee_Contact_No
                System.out.println("Department ID: " + rs.getInt("Department_Id")); // Printing Department_Id
                System.out.println(); // Adding a blank line for better readability
            }

            // Closing the ResultSet, Statement, and Connection objects
            rs.close(); // Closing the ResultSet
            st.close(); // Closing the Statement
            con.close(); // Closing the Connection

        } catch (SQLException se) { // Catching and handling SQL exceptions
            se.printStackTrace(); // Printing the stack trace of the exception for debugging purposes
        } catch (Exception e) { // Catching and handling general exceptions
            e.printStackTrace(); // Printing the stack trace of the exception for debugging purposes
        }
    }
}
