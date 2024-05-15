package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Gluecode_Alerts {
	
	WebDriver driver;
	
	 @Given("^Login for alerts$")
	 public void user_already_on_alert_page(){
		 
		 System.setProperty( 
		            "webdriver.chrome.driver", 
		            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\chromedriver.exe"); 
		  
		         driver = new ChromeDriver(); 
		  
		        // Maximize the browser 
		        // using maximize() method 
		        driver.manage().window().maximize(); 
		  
		        // Launching website 
		        driver.get("https://letcode.in/alert");
		 
	 }
	 
	 
	 
	 @When("^Check various alerts$")
	 public void checkalerts() throws InterruptedException{
		 
		 driver.findElement(By.id("confirm")).click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);

		 driver.findElement(By.id("prompt")).click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().sendKeys("Soumya");
		 driver.switchTo().alert().accept();
		 
	 }
}
