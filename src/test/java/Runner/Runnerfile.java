package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "F:\\MyWorkspaces\\Selenium_Own\\SeleniumJava\\src\\test\\resources\\features\\", //the path of the feature files
		glue={"glue"}, //the path of the step definition files
		plugin= {"pretty","html:target/cucumber-reports-html.html", "json:target/cucumber-reports-json.json", "junit:target/cucumber-reports-xml.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
//		dryRun = false, //to check the mapping is proper between feature file and step def file
		tags = "@loginnew"			
		)


public class Runnerfile {

}

//Change the RunAs configuration to run with JUnit4. Else the program will nor run. 
