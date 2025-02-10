package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (  
		
     features = "C:\\Users\\sandeep\\PageObjectModel\\src\\test\\resource\\Features",
     
      glue = "stepDefination",
      
      tags = "@smoke",
      
      plugin = { "pretty", "html:target/OrangeHrm_Cucumber-reports" }
     
     
		
		                  )   
		

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
	

}
