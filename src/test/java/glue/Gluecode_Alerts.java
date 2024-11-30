package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.junit.CucumberOptions;
import util.variables;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Gluecode_Alerts {
	
//	WebDriver driver;
	CommonMethods commonMethods = new CommonMethods();
//	public static variables variables = new variables();
	
	 @Given("^Login for alerts$")
	 public void user_already_on_alert_page(){
		 commonMethods.checkbrowser();
//		 System.setProperty( 
//		            "webdriver.chrome.driver", 
//		            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\chromedriver.exe"); 
//		  
//		         driver = new ChromeDriver(); 
//		  
//		        // Maximize the browser 
//		        // using maximize() method 
//		        driver.manage().window().maximize(); 
		  
		        // Launching website 
		 variables.driver.get("https://letcode.in/alert");
		 
	 }
	 
	 
	 
	 @When("^Check various alerts$")
	 public void checkalerts() throws InterruptedException{
		 
		 variables.driver.findElement(By.id("confirm")).click();
		 Thread.sleep(2000);
		 
		 variables.driver.switchTo().alert().accept();
		 Thread.sleep(2000);

		 variables.driver.findElement(By.id("prompt")).click();
		 Thread.sleep(2000);
		 
		 variables.driver.switchTo().alert().sendKeys("Soumya");
		 variables.driver.switchTo().alert().accept();
		 
	 }
}
