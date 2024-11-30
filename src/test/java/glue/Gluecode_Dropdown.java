package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.junit.CucumberOptions;
import util.variables;
import glue.CommonMethods;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gluecode_Dropdown {
	
	CommonMethods commonMethods = new CommonMethods();
	
//	WebDriver driver = commonMethods.driver;
//	WebDriver driver;
	
	 @Given("^I want to write a step with precondition$")
	 public void user_already_on_login_page(){
		 
		commonMethods.checkbrowser();
		
		variables.driver.get("https://letcode.in/dropdowns");
		 
//		 System.setProperty( 
//		            "webdriver.chrome.driver", 
//		            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\chromedriver.exe"); 
		 
//		 System.setProperty( 
//		            "webdriver.gecko.driver", 
//		            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\geckodriver.exe"); 
//		  
//		         driver = new FirefoxDriver(); 
		  
		        // Maximize the browser 
		        // using maximize() method 
//		 		driver.manage().window().maximize(); 
		  
		        // Launching website 
//		 		driver.get("https://letcode.in/dropdowns");
		 
	 }
	 
	 
	 
	 @When("^some other precondition$")
	 public void title_of_login_page_is_free_CRM(){
		 
		 new Select(variables.driver.findElement(By.id("fruits"))).selectByValue("2");

	        new Select(variables.driver.findElement(By.id("superheros"))).selectByVisibleText("Aquaman");
	        
	        List<WebElement> wb1 = new Select(variables.driver.findElement(By.id("lang"))).getOptions();
	         
	        for(int i=0; i<wb1.size(); i++)
	        {
	        	System.out.println(wb1.get(i).getText().toString().trim());
	        }
	        
	        String str1 = new Select(variables.driver.findElement(By.id("country"))).getFirstSelectedOption().getText().toString().trim();
	        System.out.println(str1);
		 
	 }
}
