package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class LetCodeDropdown {
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
        driver.get("https://letcode.in/dropdowns");
        
        
        new Select(driver.findElement(By.id("fruits"))).selectByValue("2");

        new Select(driver.findElement(By.id("superheros"))).selectByVisibleText("Aquaman");
        
        List<WebElement> wb1 = new Select(driver.findElement(By.id("lang"))).getOptions();
         
        for(int i=0; i<wb1.size(); i++)
        {
        	System.out.println(wb1.get(i).getText().toString().trim());
        }
        
        String str1 = new Select(driver.findElement(By.id("country"))).getFirstSelectedOption().getText().toString().trim();
        System.out.println(str1);
//        TimeUnit.SECONDS.sleep(15);
        
//        driver.close();
//        driver.quit();
        
        

    }
}
