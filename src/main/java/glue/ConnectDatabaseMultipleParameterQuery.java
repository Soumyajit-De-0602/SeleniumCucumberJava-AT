package glue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ConnectDatabaseMultipleParameterQuery {

	public static void main(String[] args) {
        // JDBC URL, username and password of Oracle database
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE"; // Change 'XE' to your database service name
        String username = "saheb"; // Oracle DB username
        String password = "password"; // Oracle DB password
 
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
 
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
 
            // Establish connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the Oracle database successfully!");
 
 
            // Example: Query to fetch data from a table
            String sql = "SELECT t.order_id, o.product_name ,m.unit_price FROM demo_orders t, demo_order_items m, demo_product_info o "
            		+"where t.order_id = m.order_id "
            		+"and m.product_id = o.product_id "
            		+"and m.unit_price >=? "
            		+"and m.quantity <=?";
            		// Replace 'employees' with your table name

            // Create a statement object to perform a query
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, 100); //First Parameter UnitPrice
            preparedStatement.setDouble(2, 3); //Second Parameter Quantity
            
 
            // Execute the query
            resultSet = preparedStatement.executeQuery();
 
            // Process the result set
            System.out.println("Product Data:");
            while (resultSet.next()) {
                // Assuming the 'employees' table has columns 'id', 'name', and 'salary'
                int id = resultSet.getInt("order_id");
                String product_name = resultSet.getString("product_name");
                double unit_price = resultSet.getInt("unit_price");
 
                // Display the results
                System.out.println("ID: " + id + ", Name: " + product_name + ", Price: " + unit_price);
            }
 
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the resources in the reverse order of their creation
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
