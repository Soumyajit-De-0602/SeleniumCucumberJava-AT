package util;

import java.util.Properties;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

public class variables {
	
	public static Properties property;
	private static String propPath = "src\\main\\resources\\application.properties";
	
	public static void initializePropertyFile()
	{
		 property = new Properties();
		  try {
		   InputStream instm = new FileInputStream(propPath);
		   property.load(instm);
		  } catch (FileNotFoundException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
	}
	
	public static WebDriver driver ;
	public static Connection connection = null;
	public static PreparedStatement preparedStatement = null;
	public static ResultSet resultSet = null;
	public static Statement statement = null;
	public static String jdbcUrl = null;
	public static String oracleUsername = null;
	public static String oraclePassword = null;

}
