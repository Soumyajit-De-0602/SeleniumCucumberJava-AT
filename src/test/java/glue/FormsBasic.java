package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

public class FormsBasic {
	public static void main(String args[]) throws InterruptedException 
    {
	System.setProperty( 
            "webdriver.chrome.driver", 
            "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\lib\\chromedriver.exe"); 
  
        ChromeDriver driver = new ChromeDriver(); 
  
        // Maximize the browser 
        // using maximize() method 
        driver.manage().window().maximize(); 
  
        // Launching website 
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        // Set Lastname
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Wood");
        // Select Gender
        for(int i=0;i<2;i++)
        {
        	driver.findElement(By.id("sex-"+i)).click();
        	TimeUnit.SECONDS.sleep(10);
        }
        // Select Experience
        for(int i=0;i<7;i++)
        {
        	driver.findElement(By.id("exp-"+i)).click();
        	TimeUnit.SECONDS.sleep(10);
        }
        // Enter Date
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
        // Select Profession
        driver.findElement(By.id("profession-1")).click();
        // Select Automation Tool
        driver.findElement(By.id("tool-2")).click();

        // Select Continent
//        driver.findElement(By.id("continents")).click();
//        WebElement dropdown = driver.findElement(By.id("continents"));
//        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
        new Select(driver.findElement(By.id("continents"))).selectByValue("Europe");

        // Select Command
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[. = 'Wait Commands']")).click();

        // Scroll Vertical
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,675.5555419921875)");

        // Click Submit
        driver.findElement(By.id("submit")).click();
  
        

    }
}
