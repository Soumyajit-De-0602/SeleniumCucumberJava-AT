package glue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import util.variables;

public class SQLStatements {
	
	

	public static void orderDetails() {
 
		try {
            // Example: Query to fetch data from a table
            String sql = "SELECT t.order_id, o.product_name ,m.unit_price FROM demo_orders t, demo_order_items m, demo_product_info o "
            		+"where t.order_id = m.order_id "
            		+"and m.product_id = o.product_id "
            		+"and m.unit_price >=? "
            		+"and m.quantity <=?";
            		// Replace 'employees' with your table name

            // Create a statement object to perform a query
            variables.preparedStatement = variables.connection.prepareStatement(sql);
            
            variables.preparedStatement.setInt(1, 100); //First Parameter UnitPrice
            variables.preparedStatement.setDouble(2, 3); //Second Parameter Quantity
            
 
            // Execute the query
            variables.resultSet = variables.preparedStatement.executeQuery();
 
            // Process the result set
            System.out.println("Product Data:");
            while (variables.resultSet.next()) {
                // Assuming the 'employees' table has columns 'id', 'name', and 'salary'
                int id = variables.resultSet.getInt("order_id");
                String product_name = variables.resultSet.getString("product_name");
                double unit_price = variables.resultSet.getInt("unit_price");
 
                // Display the results
                System.out.println("ID: " + id + ", Name: " + product_name + ", Price: " + unit_price);
            }
		}
		catch (SQLException e) {
            e.printStackTrace();
 	}
		
		
    }
	
	
	
	public static void productDetails() {
		 
		try {
            // Example: Query to fetch data from a table
			String sql = "SELECT o.product_name ,m.unit_price FROM demo_orders t, demo_order_items m, demo_product_info o "
            		+"where t.order_id = m.order_id "
            		+"and m.product_id = o.product_id "
            		+"and m.unit_price >=125 ";
            		// Replace 'employees' with your table name
      
			variables.statement = variables.connection.createStatement();
            // Execute the query
			variables.resultSet = variables.statement.executeQuery(sql);
 
            // Process the result set
            System.out.println("Product Data:");
            while (variables.resultSet.next()) {
                // Assuming the 'employees' table has columns 'id', 'name', and 'salary'
                String product_name = variables.resultSet.getString("product_name");
                double unit_price = variables.resultSet.getInt("unit_price");
 
                // Display the results
                System.out.println("Name: " + product_name + ", Price: " + unit_price);
            }
		}
		catch (SQLException e) {
            e.printStackTrace();
 	}
		
		
    }
}
