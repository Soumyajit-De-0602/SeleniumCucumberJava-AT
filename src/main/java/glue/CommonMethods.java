package glue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.variables;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CommonMethods {
	
//	public static WebDriver driver ;
//	public static variables variables = new variables();

	
	public static void checkbrowser(){
			
	 variables.initializePropertyFile();
	 
	 String Browser = variables.property.getProperty("BrowserType").toString().trim();
	 System.out.println("Opening Browser: "+variables.property.getProperty("BrowserType"));
	 
	 if(Browser.equalsIgnoreCase("firefox"))
	  {
		 System.setProperty( 
		            "webdriver.gecko.driver", 
		            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\geckodriver.exe"); 
		  
		         variables.driver = new FirefoxDriver();
		         variables.driver.manage().window().maximize();
		         
	  }
	  else if(Browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty( 
		            "webdriver.chrome.driver", 
		            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\chromedriver.exe");  
		  		variables.driver =  new ChromeDriver(); 
		  		
		  		variables.driver.manage().window().maximize();
	  }
	 
//	  else {
//		  System.setProperty( 
//		            "webdriver.gecko.driver", 
//		            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\geckodriver.exe"); 
//		  
//		         variables.driver = new FirefoxDriver();
//		         variables.driver.manage().window().maximize();
//		  
//	  }
	 
	 System.out.println("Browser opened successfully");
	 	 	 
	}
	
//	public static WebDriver checkbrowserwithlocalWebdriver(){
//		
//		 variables.initializePropertyFile();
//		 
//		 String Browser = variables.property.getProperty("BrowserType").toString().trim();
//		 System.out.println("BrowserType is: "+variables.property.getProperty("BrowserType"));
//		 
//		 if(Browser.equalsIgnoreCase("firefox"))
//		  {
//			 System.setProperty( 
//			            "webdriver.gecko.driver", 
//			            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\geckodriver.exe"); 
//			  
//			         driver = new FirefoxDriver();
//			         driver.manage().window().maximize();
//			         
//		  }
//		  else if(Browser.equalsIgnoreCase("chrome"))
//		  {
//			  System.setProperty( 
//			            "webdriver.chrome.driver", 
//			            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\chromedriver.exe");  
//			  		driver =  new ChromeDriver(); 
//			  		
//			  		driver.manage().window().maximize();
//		  }
//		 
////		  else {
////			  System.setProperty( 
////			            "webdriver.gecko.driver", 
////			            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\geckodriver.exe"); 
////			  
////			         driver = new FirefoxDriver();
////			         driver.manage().window().maximize();
////			  
////		  }
//		 
//		 
//		 return(driver);
//		 	 
//		}
	
	public void openURL(String URL) {
		
		variables.initializePropertyFile();
		String AppURL = variables.property.getProperty(URL).toString().trim();
		
		System.out.println("Opening URL: "+AppURL);
		
		variables.driver.get(AppURL);
		
		System.out.println("URL Opened Successfully");
		
	}
	
	public void openDBConnection() {
		
		variables.initializePropertyFile();
		variables.jdbcUrl = variables.property.getProperty("jdbcUrl").toString().trim();
		variables.oracleUsername = variables.property.getProperty("oracleUsername").toString().trim();
		variables.oraclePassword = variables.property.getProperty("oraclePassword").toString().trim();
		
		try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
 
            // Establish connection
            variables.connection = DriverManager.getConnection(variables.jdbcUrl, variables.oracleUsername, variables.oraclePassword);
            System.out.println("Connected to the Oracle database successfully!");
            
		}
		
		catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
 
 
        }
			
	}

	
	public void closeDBConnection() {
		
		try {
            if (variables.resultSet != null) 
            	variables.resultSet.close();
            if (variables.preparedStatement != null) 
            	variables.preparedStatement.close();
            if (variables.connection != null) 
            	variables.connection.close();
            
            System.out.println("Closed Oracle database connection successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
	
	}
	
	public void runSQLQuery(String Query) {
		
	
	}
	
	public void closeDriverConnection() {
		
		variables.driver.close();
//		variables.driver.quit();
		
		System.out.println("Closed browser successfully!");
	}
	
}
