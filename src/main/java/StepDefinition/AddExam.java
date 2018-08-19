package StepDefinition;

import java.text.ParseException;

import com.pages.AcademicAddExamPage;
import com.util.TestBase;

import cucumber.api.java.en.Then;

public class AddExam extends TestBase{
	
	AcademicAddExamPage academicaddExampage;
	
	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and save it$")
	public void user_enter_and_and_and_save_it(String arg1, String arg2, String arg3) throws ParseException
	{
		
		academicaddExampage = new AcademicAddExamPage();
		academicaddExampage.addexam("test", "14/Sep/2018", "16/Sep/2018");
	    
	}

}
