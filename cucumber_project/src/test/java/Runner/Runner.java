package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features"},
glue= {"step_defination"},
plugin= {"pretty", "html:target/Lokesh.html"})
		

		
		
public class Runner extends AbstractTestNGCucumberTests{

}