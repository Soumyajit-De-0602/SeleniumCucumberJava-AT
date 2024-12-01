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

public class ExecuteSQL {
	
	SQLStatements sqlStatements = new SQLStatements();
	
	@Given("^View Order details through SQL Statement$")
	 public void executeorderdetailsSQL()
	 {
		sqlStatements.orderDetails();
				
	 }
	
	@Given("^View Product details through SQL Statement$")
	 public void executeproductdetailsSQL()
	 {
		sqlStatements.productDetails();
				
	 }
}
