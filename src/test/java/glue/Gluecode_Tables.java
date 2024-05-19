package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.*;
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
import org.openqa.selenium.JavascriptExecutor;


public class Gluecode_Tables {
	
	WebDriver driver;
	
	 @Given("^Login for tables$")
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
	 
	 
	 
	 @When("^Check various tables$")
	 public void checkalerts() throws Exception{
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 List<WebElement> lwb = driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table/tbody/tr[1]/th"));
		 List<WebElement> lwb1 = driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table/tbody/tr/td[1]"));
//		 js.executeScript("arguments[0].scrollIntoView();", lwb1);
		 System.out.println("Table size:" + lwb1.size()+" rows &" + lwb.size()+" columns");
		 Thread.sleep(2000);
		 
		 for(int i=1;i<=lwb1.size();i++)
		 {
			 String name = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table/tbody/tr["+i+"]/td[2]")).getText().toString().trim();
			 if(name.equalsIgnoreCase("Raj"))
			 {
				 js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/label[2]")));
				 driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table/tbody/tr["+i+"]/td[4]/input")).click();
				 System.out.println("Clicked on row no "+i);
			 }
			 
		 }
		 
	 }
	 
}
