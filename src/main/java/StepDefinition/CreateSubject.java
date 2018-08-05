package StepDefinition;


import com.pages.AcademicMastersPage;
import com.util.TestBase;
import cucumber.api.java.en.Then;


public class CreateSubject extends TestBase {
	
	String sheetName = "CreateSubject";
	AcademicMastersPage academicmasterspage;

	

	@Then("^user enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and save it$")
	public void user_enter_and_save_it(String SubjectName, String PracticalPaper, String CoScholastic) throws Throwable {
		
		academicmasterspage = new AcademicMastersPage();
		academicmasterspage.CreateSubject("test", "Yes", "No");
		
	}
}
