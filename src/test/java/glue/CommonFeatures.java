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

public class CommonFeatures {
	
	CommonMethods commonMethods = new CommonMethods();
	
	@Given("^Open URL for \"(.*)\"$")
	 public void user_login_to_mentioned_URL(String URL){
		 
		commonMethods.checkbrowser();
		
		System.out.println("Opening URL for: "+URL);
		
		commonMethods.openURL(URL);
//		System.out.println("URL Opened successfully");
		
		commonMethods.openDBConnection();
		
	}
	
	@Given("^Close Browser and DB Connection$")
	 public void closeDBConnection()
	 {
			 
		commonMethods.closeDBConnection();
		commonMethods.closeDriverConnection();
		
	 }
}
