package glue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.variables;

public class CommonMethods {
	
//	public static WebDriver driver ;
//	public static variables variables = new variables();

	
	public static void checkbrowser(){
			
	 variables.initializePropertyFile();
	 
	 String Browser = variables.property.getProperty("BrowserType").toString().trim();
	 System.out.println("BrowserType is: "+variables.property.getProperty("BrowserType"));
	 
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

}
