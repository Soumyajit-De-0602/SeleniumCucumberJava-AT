package glue;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*; 
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SauceDemoBasic {
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
        driver.get("https://www.saucedemo.com/"); 
        WebElement a = driver.findElement(By.id("user-name"));
        a.sendKeys("standard_user");
        
        WebElement b = driver.findElement(By.id("password"));
        b.sendKeys("secret_sauce");
        
        WebElement c = driver.findElement(By.id("login-button"));
        c.click();
        
        TimeUnit.SECONDS.sleep(10);
        
        String d = driver.findElement(By.className("title")).getText().toString().trim();
        
        System.out.println("Name is: "+d);
        Assert.assertEquals(d, "Products");
        
        
    }
        
}
