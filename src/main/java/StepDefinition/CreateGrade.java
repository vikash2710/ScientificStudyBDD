package StepDefinition;

import com.pages.AcademicMastersGradingPage;
import com.util.TestBase;

import cucumber.api.java.en.Then;

public class CreateGrade extends TestBase {
	
	AcademicMastersGradingPage academicmastersgradingpage;
	
	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and save it$")
	public void user_enter_and_and_save_it(String ScaleName, String ScaleDescription)  {
		
		academicmastersgradingpage = new AcademicMastersGradingPage();
		academicmastersgradingpage.CreateGrade("Test", "Test123");
	    
	}

}
