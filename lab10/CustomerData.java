//Q.6  Write a program to show  JDBC connection with MYSQL and perform the following operations
package lab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CustomerData {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// Load the MySQL JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			// Establish a connection to the MySQL database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudipjava","root","AnishDB24");
			System.out.println(con);
			System.out.println("connection establish");
			System.out.println("Record inserting....");
			
			// Create a statement object to execute SQL queries
			Statement st = con.createStatement();
			
			 // SQL query to insert multiple records into the Customer table
			String sql = ("insert into Customer values"
					+ "(001,'Anish','goregaon','8282647591','Mumbai','400063','India'),"
					+ "(002,'praful','Dhaisar','8245655631','Mumbai','400063','India'),"
					+ "(003,'Abhishek','Miraroad','4569873574','Mumbai','400063','India'),"
					+ "(004,'Pratik','Dhaisar','9517536482','Mumbai','400063','India'),"
					+ "(005,'Kuldeep','goregaon','6547896547','Mumbai','400063','India'),"
					+ "(006,'Nasir','goregaon','1478963218','Mumbai','400063','India'),"
					+ "(007,'nick','Poplar St','9012345678','San Diego','400063','USA'),"
					+ "(008,'James','Spruce','0123456789','San Antonio','400063','USA'),"
					+ "(009,'Robert','Cedar','6789012345','Philadelphia','400063','USA'),"
					+ "(010,'Jane','Oak','2345678901','Los Angeles','400063','USA')");
			
			// Execute the SQL query to insert data
			st.executeUpdate(sql);
			System.out.println("Inserted data into table....");
			
			// SQL query to select all records from the Customer table
			sql = "SELECT CustNo, CustName, CustAddress, PhoneNo, City, Pincode, County FROM Customer";
			ResultSet rs = st.executeQuery(sql);
			
			// Process the result set to display data
			while (rs.next()) {
				int custNo = rs.getInt("CustNo");	// Retrieve customer data by mention it's attribute
				String custName = rs.getString("CustName");
				String custAddress = rs.getString("CustAddress");
				String phoneNo = rs.getString("PhoneNo");
				String city = rs.getString("City");
				String pincode = rs.getString("Pincode");
				String country = rs.getString("County");

//				Display values
				System.out.println("Customer Number: " +custNo);
				System.out.println("Customer Name: " +custName);
				System.out.println("Customer Address: " +custAddress);
				System.out.println("Customer Phone Number: " +phoneNo);
				System.out.println("Customer City: " +city);
				System.out.println("Customer Pincode: " +pincode);
				System.out.println("Customer Country: " +country);
				System.out.println("\n");
			}
//			Clean environment
			rs.close();
			st.close();
			con.close();
			
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
	}

}

