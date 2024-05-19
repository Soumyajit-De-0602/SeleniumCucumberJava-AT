package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  


public class Gluecode_Screenshot {
	
	WebDriver driver;
	
	 @Given("^Login for screenshot$")
	 public void user_already_on_alert_page(){
		 
		 System.setProperty( 
		            "webdriver.chrome.driver", 
		            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\chromedriver.exe"); 
		  
		         driver = new ChromeDriver(); 
		  
		        // Maximize the browser 
		        // using maximize() method 
		        driver.manage().window().maximize(); 
		  
		        // Launching website 
		        driver.get("https://letcode.in/table");
		 
	 }
	 
	 
	 
	 @When("^Take screenshot$")
	 public void checkalerts() throws Exception{
		 
		 this.takeSnapShot(driver,"Tables");
	 }
	 
	 public static void takeSnapShot(WebDriver webdriver,String Filename) throws Exception{
		 
		 
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("F:\\MyWorkspaces\\Selenium_Own\\Screenshots\\"+java.time.LocalDate.now()+"\\"+Filename+".jpeg");
//		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
}
