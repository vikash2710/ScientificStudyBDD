package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = ".\\src\\main\\java\\Features",
				glue={"StepDefinition"},
				format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
				monochrome = true, //display the console output in a proper readable format
				strict = true, //it will check if any step is not defined in step definition file
				dryRun = false, //to check the mapping is proper between feature file and step def file
				tags = {"@CreateGrade"}
		
		)
public class Runner {

}




//@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and save it$")
//public void user_enter_and_and_save_it(String arg1, String arg2) throws Throwable {
//    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
//}
