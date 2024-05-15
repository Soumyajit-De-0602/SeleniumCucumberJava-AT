package glue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LetCodeWindowHandles {
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
        driver.get("https://letcode.in/windows");
        
        driver.findElement(By.id("multi")).click();
        
        String mainWindow = driver.getWindowHandle();
        
        Set<String> handles = driver.getWindowHandles();
        
        for(String Handle:handles)
        {
        	driver.switchTo().window(Handle);
        	System.out.println(driver.getCurrentUrl());
        	System.out.println(driver.getTitle());
        	if(driver.getCurrentUrl().contains("alerts"))
        	{
        		driver.close();
        		break;
        	}

        }
        
        driver.switchTo().window(mainWindow);
        
//        TimeUnit.SECONDS.sleep(15);
        
//        driver.close();
//        driver.quit();
        
        

    }
}
