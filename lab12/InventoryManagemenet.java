package lab12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class InventoryManagemenet {

		private static final String URL = "jdbc:mysql://localhost:3306/anudipjava";
		private static final String USER = "root";
		private static final String PASSWORD = "AnishDB24";
		private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
		public static void main(String[] args) {
		
			Connection conn = null;
			
			try {
//				Load JDBC Driver 
				Class.forName(DRIVER);
				
//				Establish Database connection 
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				Statement stmt = conn.createStatement();
				 String insertSQL = "INSERT INTO Inventory (inventoryNo, name, qty, pricePerItem, stock) VALUES (?, ?, ?, ?, ?)";
		            PreparedStatement preparedStatement = conn.prepareStatement(insertSQL);

		            for (int i = 1; i <= 10; i++) {
		                preparedStatement.setInt(1, i);
		                preparedStatement.setString(2, "Item" + i);
		                preparedStatement.setInt(3, 100 + i);
		                preparedStatement.setInt(4, 10 * i);
		                preparedStatement.setBoolean(5, i % 2 == 0); // Alternate stock status
		                preparedStatement.executeUpdate();
		            }
		            System.out.println("10 records inserted successfully.");
				
				
				
//				fetch record 
				String fetchRecord = "SELECT * FROM inventory LIMIT 10";
				
				ResultSet rs = stmt.executeQuery(fetchRecord);	
				
				while (rs.next()) {
					System.out.println("Inventory No: " + rs.getInt("inventoryno"));
					System.out.println("Name: " + rs.getString("name"));
					System.out.println("Quality: " + rs.getInt("qty"));
					System.out.println("Price Per Item: ₹" + rs.getInt("pricePerItem"));
					System.out.println("Stock: " + rs.getBoolean("stock"));
					System.out.println();
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			} finally {
				try {
					
					if (conn != null && !conn.isClosed()) {
						conn.close();
						
					}
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
	}

}
