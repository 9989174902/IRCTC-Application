package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  
 
@RunWith(Cucumber.class)
@CucumberOptions( 
		features = ".\\feature",
		glue = "stepdefinitions",
		plugin= {"pretty","html:target/HTMLReports.html",
				  "json:target/JSONReports/json_report.json",
				  "junit:target/JUnitReports/junit_report.xml", }       
	//	tags = "@SmokeTesting"  
		
)
				  
		
public class TestRunner1 {
	

}
